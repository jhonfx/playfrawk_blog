
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Blog demo")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	
  """),format.raw/*5.3*/("""<div class="container">
      <div class="jumbotron">
          <h3><i class="glyphicon glyphicon-fire"></i> BLOG DEMO</h3>
          <button data-toggle="modal" data-target="#modaluser" class="btn btn-primary"> User</button>
          <button data-toggle="modal" data-target="#modalcategory" class="btn btn-success">Category</button>
          <button data-toggle="modal" data-target="#modalpost" class="btn btn-info"> Post</button>
          
          <button id="logout" class="btn btn-danger pull-right" onclick="location.href='"""),_display_(/*12.90*/controllers/*12.101*/.routes.UserController.logout),format.raw/*12.130*/("""';">Logout</button>
      </div>
   
      <div id="ungrid">
      </div>  
  </div>
 <div class="container">
 	<div class="row">   
		<div id="div_post"></div>
  	</div>
  </div>
      
    """),format.raw/*24.23*/("""
    """),format.raw/*25.5*/("""<div class="modal fade" id="modalcategory" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add Category</h3>

                    <form method="POST" action=""""),_display_(/*33.50*/routes/*33.56*/.CategoryController.addCategory()),format.raw/*33.89*/("""" id="formCategory" enctype="multipart/form-data">
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
    
    
    
    """),format.raw/*64.19*/("""
    """),format.raw/*65.5*/("""<div class="modal fade" id="modalpost" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add new Post</h3>

                    <form method="POST" action=""""),_display_(/*73.50*/routes/*73.56*/.PostController.addPost()),format.raw/*73.81*/("""" id="formPost" enctype="multipart/form-data">

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
	
""")))}),format.raw/*168.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jan 29 01:56:38 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/index.scala.html
                  HASH: 4d57f98fbbc3967ed6807ff6de30b43c8c465d9e
                  MATRIX: 738->1|834->3|862->6|887->23|926->25|957->30|1518->564|1539->575|1590->604|1809->813|1841->818|2417->1367|2432->1373|2486->1406|3972->2878|4004->2883|4576->3428|4591->3434|4637->3459|7157->5964|7190->5969|7759->6510|7775->6516|7822->6541|10168->8856
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|43->12|43->12|43->12|55->24|56->25|64->33|64->33|64->33|95->64|96->65|104->73|104->73|104->73|151->120|152->121|160->129|160->129|160->129|199->168
                  -- GENERATED --
              */
          