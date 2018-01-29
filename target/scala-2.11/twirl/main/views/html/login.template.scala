
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
	"""),format.raw/*4.2*/("""<div class="container center-block">
		<div class="col-md-6 col-md-offset-3" style="margin-top: 20%;">
		<form id="login_blog" method="POST" action=""""),_display_(/*6.48*/routes/*6.54*/.UserController.doLogin()),format.raw/*6.79*/("""" id="loginForm" enctype="multipart/form-data">
			<div class="form-group">
                   <label for="nameCategory">User</label>
                   <input type="text" class="form-control" name="username" id="username" required>
               </div>
               <div class="form-group">
                   <label for="nameCategory">Password</label>
                   <input type="password" class="form-control" name="password" id="password" required>
               </div>
			<div class="btn-group" role="group">
				<button type="submit" id="dologin" class="btn btn-default btn-hover-green" data-action="login" role="button">
                                       Login</button>
                                    </div>
		</form>
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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 22:41:16 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/login.scala.html
                  HASH: 701ddc753b78fef824b39fcbcc98378b6f8aa3f0
                  MATRIX: 738->1|834->3|862->6|883->19|922->21|950->23|1126->173|1140->179|1185->204
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6
                  -- GENERATED --
              */
          