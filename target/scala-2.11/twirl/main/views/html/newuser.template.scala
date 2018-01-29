
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newuser_Scope0 {
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

class newuser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("new user")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
	"""),format.raw/*4.2*/("""<h1>New user here</h1>
	
	<form method="POST" action=""""),_display_(/*6.31*/routes/*6.37*/.UserController.addUser()),format.raw/*6.62*/("""" id="formedit" enctype="multipart/form-data">
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object newuser extends newuser_Scope0.newuser
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 02:48:16 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/newuser.scala.html
                  HASH: 4c7f6e2a5bc29dcbe78638a0a9206b87012a105f
                  MATRIX: 742->1|838->3|866->6|890->22|929->24|957->26|1038->81|1052->87|1097->112
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6
                  -- GENERATED --
              */
          