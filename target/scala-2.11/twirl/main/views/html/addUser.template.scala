
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addUser_Scope0 {
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

class addUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/main("add user")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

	"""),format.raw/*5.2*/("""<form method="POST" action=""""),_display_(/*5.31*/routes/*5.37*/.UserController.addUser()),format.raw/*5.62*/("""" id="formedit" enctype="multipart/form-data">
	   <div class="modal-body">
	           <!-- content goes here -->
	        <input type="hidden" name="id" id="id">
	
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
	                <button type="submit" id="saveImage" class="btn btn-default btn-hover-green" data-action="save" role="button">
	                    Submit</button>
	            </div>
	        </div>
	    </div>
	</form>
""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object addUser extends addUser_Scope0.addUser
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 02:48:15 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/addUser.scala.html
                  HASH: 1634d8c40d25fb98c0dccf669855b8a631dfdfbe
                  MATRIX: 747->1|854->13|882->16|906->32|945->34|974->37|1029->66|1043->72|1088->97
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5
                  -- GENERATED --
              */
          