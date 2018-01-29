package controllers;

import models.Category;
import static play.libs.Json.toJson;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.*;

public class CategoryController extends Controller {

    private final FormFactory formFactory;
    private final JPAApi jpaApi;

    @Inject
    public CategoryController(FormFactory formFactory, JPAApi jpaApi) {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    @Transactional
    public Result addCategory() {
        Category category = formFactory.form(Category.class).bindFromRequest().get();
        jpaApi.em().persist(category);
        return redirect(routes.CategoryController.showCategory());
    }

    public Result listCategories() {
        List<Category> category = (List<Category>) jpaApi.em().createQuery("select p from Category p").getResultList();
        return ok(toJson(category));
    }

    public Result showCategory() {
        return ok(views.html.showcategories.render());
    }

}
