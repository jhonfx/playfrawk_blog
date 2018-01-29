
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main( "login in blog")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""


"""),format.raw/*6.1*/("""<div class="container">
   <div class="jumbotron">
       <h3><i class="glyphicon glyphicon-fire"></i> BLOG DEMO</h3>
       <button data-toggle="modal" data-target="#modaluser" class="btn btn-primary"> User</button>
       <button data-toggle="modal" data-target="#modalcategory" class="btn btn-success">Category</button>
       <button data-toggle="modal" data-target="#modalpost" class="btn btn-info"> Post</button>
   </div>
   
   <div id="ungrid">
   </div>
   
     
</div>
        <!-- line modal -->


    """),format.raw/*22.23*/("""
     		
            
            
    """),format.raw/*26.5*/("""<div class="modal fade" id="modalcategory" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add Category</h3>

                    <form method="POST" action=""""),_display_(/*34.50*/routes/*34.56*/.CategoryController.addCategory()),format.raw/*34.89*/("""" id="formCategory" enctype="multipart/form-data">
                        <div class="modal-body">
                                <!-- content goes here -->
                            <input type="hidden" name="id" id="id_category">

                            <div class="form-group">
                                <label for="nameCategory">Name</label>
                                <input type="text" class="form-control" name="name" placeholder="Enter the name category" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                                <div class="btn-group" role="group">
                                    <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                                </div>
                                <div class="btn-group" role="group">
                                    <button type="submit" id="saveCategory" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                        Submit</button>
                                </div>
                            </div>
                        </div>
                    </form>


                </div>
            </div>
        </div>
    </div>

    """),format.raw/*63.19*/("""
    """),format.raw/*64.5*/("""<div class="modal fade" id="modalpost" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add new Post</h3>

                    <form method="POST" action=""""),_display_(/*72.50*/routes/*72.56*/.PostController.addPost()),format.raw/*72.81*/("""" id="formPost" enctype="multipart/form-data">

                        <div class="modal-body">
                                <!-- content goes here -->
                            <input type="hidden" name="id" id="id_post">

                            <div class="form-group">
                                <label for="titlePost">Title</label>
                                <input type="text" class="form-control" name="title" placeholder="title here" required>
                            </div>
                            <div class="form-group">
                                <label for="commentPost">Comment</label>
                                <input type="text" class="form-control" name="comment" placeholder="comment here" required>
                            </div>
                            <div class="form-group">
                                <label for="authorPost">Author</label>
                                <input type="text" class="form-control" name="author" placeholder="author here">
                            </div>
                            <div class="form-group">
                                <label for="categoryPost">Category</label>
                                <input type="text" class="form-control" name="category" placeholder="category here" required>
                            </div>
                            <div class="form-group">
                                <label for="postFile">Image</label>
                            </div>
                            <input type="file" name="image">
                        </div>
                        <div class="modal-footer">
                            <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                                <div class="btn-group" role="group">
                                    <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                                </div>
                                <div class="btn-group" role="group">
                                    <button type="submit" id="savePost" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                        Submit</button>
                                </div>
                            </div>
                        </div>
                    </form>


                </div>
            </div>
        </div>
    </div>



    """),format.raw/*120.19*/("""
    """),format.raw/*121.5*/("""<div class="modal fade" id="modaluser" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add User</h3>

                    <form method="POST" action=""""),_display_(/*129.50*/routes/*129.56*/.UserController.addUser()),format.raw/*129.81*/("""" id="formUser" enctype="multipart/form-data">
                        <div class="modal-body">
                                <!-- content goes here -->
                            <input type="hidden" name="id" id="id_user">

                            <div class="form-group">
                                <label for="titleBook">Name</label>
                                <input type="text" class="form-control" name="name" placeholder="Enter the title" required>
                            </div>
                            <div class="form-group">
                                <label for="authorBook">Lastname</label>
                                <input type="text" class="form-control" name="lastname" placeholder="Enter the name of author" required>
                            </div>
                            <div class="form-group">
                                <label for="descriptionBook">Username</label>
                                <input type="text" class="form-control" name="username" placeholder="Enter the description" required>
                            </div>
                            <div class="form-group">
                                <label for="pageBook">Password</label>
                                <input type="password" class="form-control" name="password" placeholder="Enter the number of page" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                                <div class="btn-group" role="group">
                                    <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                                </div>
                                <div class="btn-group" role="group">
                                    <button type="submit" id="saveUser" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                        Submit</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    """),format.raw/*168.21*/("""
    """),format.raw/*169.5*/("""<div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                    <h4 class="modal-title custom_align" id="Heading">Delete this book</h4>
                </div>
                <form action="/deleteBook/" id="formdel">
                    <div class="modal-body">

                        <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span>
                            Are you sure you want to delete this Book?</div>

                    </div>
                    <div class="modal-footer ">
                        <button type="submit" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span>
                             Yes</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal" ><span class="glyphicon glyphicon-remove"></span>
                             No</button>
                    </div>
                </form>
            </div>

                <!-- /.modal-content -->
        </div>
            <!-- /.modal-dialog -->
    </div>
    """),format.raw/*196.27*/("""
    """),format.raw/*197.5*/("""<div id="modalAffich" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                    <img src="" class="img-responsive" id="coverid">
                </div>
            </div>
        </div>
    </div>
 """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 22:34:38 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/home.scala.html
                  HASH: 5605c2180679ab1e2d1ad5c00575cc62eae9b6f0
                  MATRIX: 736->1|832->3|860->6|890->28|929->30|958->33|1501->566|1567->605|2143->1154|2158->1160|2212->1193|3684->2651|3716->2656|4288->3201|4303->3207|4349->3232|6862->5730|6895->5735|7464->6276|7480->6282|7527->6307|9873->8640|9906->8645|11339->10071|11372->10076
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|53->22|57->26|65->34|65->34|65->34|94->63|95->64|103->72|103->72|103->72|151->120|152->121|160->129|160->129|160->129|199->168|200->169|227->196|228->197
                  -- GENERATED --
              */
          