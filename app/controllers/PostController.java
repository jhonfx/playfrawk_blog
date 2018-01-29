package controllers;

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

import models.Post;
import models.User;


public class PostController extends Controller {
	
	private final FormFactory formFactory;
    private final JPAApi jpaApi;

    @Inject
    public PostController(FormFactory formFactory, JPAApi jpaApi) {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }
    
    public Result newPost() {
    		return ok(views.html.newpost.render());
    }
    
    @Transactional
    public Result addPost() {
    	
    		String fileName = null;
        String path = null;

        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");
        if (picture != null) {
            fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            
            UUID fileNameId = UUID.randomUUID();
            String fileExtension = getFileExtension(picture.getFilename());
            path = fileNameId + "." + fileExtension;
            file.renameTo(new File("public/images/" + path));

            OutputStream out = null;
            InputStream filecontent = null;

        } else {
            flash("error", "Missing file");
        }
        
		Post post = formFactory.form(Post.class).bindFromRequest().get();
        System.out.println(post.toString());
        Date today = new Date(System.currentTimeMillis());
        post.image = path;
        Date td = new Date();
        post.publicDate = td;
        jpaApi.em().persist(post);
        return redirect("/home");
	}
    
    @Transactional(readOnly=true)
	public Result getPosts() {
        List<Post> posts = (List<Post>) jpaApi.em().createQuery("select p from Post p").getResultList();
        return ok(toJson(posts));
	}
    
    public Result showPosts() {
    		return redirect("/home");
    }
    
    private String getFileExtension(String file) {

        try {
            return file.substring(file.lastIndexOf(".") + 1);
        } catch (Exception e) {
            return ".jpg";
        }
    }

}
