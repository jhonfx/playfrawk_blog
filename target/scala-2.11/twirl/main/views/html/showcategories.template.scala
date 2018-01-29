
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showcategories_Scope0 {
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

class showcategories extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("categories")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*4.1*/("""<h1>aqui van las categorias</h1>
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
object showcategories extends showcategories_Scope0.showcategories
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 02:48:16 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/showcategories.scala.html
                  HASH: f29056f72d3a500e77aa77d9a0860f51fe2e7c9b
                  MATRIX: 756->1|852->3|880->6|906->24|945->26|972->27
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          