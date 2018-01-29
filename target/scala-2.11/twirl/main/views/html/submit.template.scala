
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object submit_Scope0 {
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

class submit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userLogin: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("the submit")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
	"""),_display_(/*4.3*/userLogin/*4.12*/.username),format.raw/*4.21*/("""
	"""),_display_(/*5.3*/userLogin/*5.12*/.password),format.raw/*5.21*/("""
""")))}))
      }
    }
  }

  def render(userLogin:User): play.twirl.api.HtmlFormat.Appendable = apply(userLogin)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (userLogin) => apply(userLogin)

  def ref: this.type = this

}


}

/**/
object submit extends submit_Scope0.submit
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 04:41:06 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/submit.scala.html
                  HASH: 0f4ad7f3f7bec57768865c885dfc1c9105317f9d
                  MATRIX: 745->1|857->18|885->21|911->39|950->41|978->44|995->53|1024->62|1052->65|1069->74|1098->83
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5
                  -- GENERATED --
              */
          