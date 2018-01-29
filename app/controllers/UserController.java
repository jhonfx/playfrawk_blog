package controllers;

import org.h2.store.fs.FileUtils;
import org.h2.util.IOUtils;
import play.Logger;
import play.api.Play;
import play.api.data.Form;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.Query;


import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

import static play.libs.Json.toJson;

import java.io.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import models.User;

public class UserController extends Controller {
	
	private final FormFactory formFactory;
    private final JPAApi jpaApi;
	
    @Inject
	public UserController(FormFactory formFactory, JPAApi jpaApi) {
		this.formFactory = formFactory;
		this.jpaApi = jpaApi;
	}
    
    public Result login() {
    		return ok (views.html.login.render());
    }
    
    public Result index() {
    		return ok(views.html.index.render()); 
    }
	
    public Result newUser() {
    		return ok(views.html.newuser.render());
    }
    
    public Result logout() {
    		return redirect("/");
    }
    
	@Transactional
	public Result addUser() {
		User user = formFactory.form(User.class).bindFromRequest().get();
        System.out.println(user.toString());
        Date today = new Date(System.currentTimeMillis());
        user.postDate = today;
        jpaApi.em().persist(user);
        return ok(views.html.index.render());
	}
	
	@Transactional(readOnly=true)
	public Result getUsers() {
		List<User> users = (List<User>) jpaApi.em().createQuery("select p from User p").getResultList();
        return ok(toJson(users));
	}
	
	@Transactional
	public Result doLogin() {
		User user = formFactory.form(User.class).bindFromRequest().get();
		Logger.info(user.toString());
		Logger.info(user.username);
		Query q = jpaApi.em().createQuery("select u from User u where u.username=?1", User.class);
        q.setParameter(1, user.username);
        Logger.debug("Aqui termina de hacer la consulta");
        Logger.debug(q.toString());
        User result = null;
        try {
        		result = (User) q.getSingleResult();
        		Logger.debug(result.toString());
        		Logger.debug("Si esta");
        		return ok(views.html.index.render());
        } catch(NoResultException ex) {
        		Logger.debug(ex.toString());
        		Logger.debug("no esta");
        		return ok(views.html.login.render());
        }
	}
		/*Form<User> userform = form(User.class).bindFromRequest().get();
		Query q = jpaApi.em().createQuery("select f from Friend f where f.username="+ form.username , User.class);
		
		
		
		return ok(views.html.submit.render(result));
		//Form<User> formData = Form.form(User.class);
		//return ok(Login.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
	}
	
	
	/*public static Result postLogin() {

	    // Get the submitted form data from the request object, and run validation.
	    Form<User> formData = Form.form(User.class).bindFromRequest();
	
	    if (formData.hasErrors()) {
	      flash("error", "Login credentials not valid.");
	      return badRequest(User.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
	    }
	    else {
	      // email/password OK, so now we set the session variable and only go to authenticated pages.
	      session().clear();
	      session("username", formData.get().username);
	      return redirect(views.html.home.render());
	    }
	  }*/
	
	/*@Security.Authenticated(Secured.class)
	  public static Result logout() {
	    session().clear();
	    return redirect(routes.BookController.index());
	  }
	
	@Security.Authenticated(Secured.class)
	  public static Result profile() {
	    return ok(Profile.render("Profile", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
	  }*/
}
