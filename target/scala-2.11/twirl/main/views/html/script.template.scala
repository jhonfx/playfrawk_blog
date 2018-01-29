
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object script_Scope0 {
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

class script extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),_display_(/*2.2*/{
    var additionalScripts = ctx().args.get("additionalScripts").asInstanceOf[List[Html]];
    if(additionalScripts == null) {
        additionalScripts = new ArrayList[Html]();
        ctx().args.put("additionalScripts", additionalScripts)
    }

    val added = additionalScripts.add(content);
}))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object script extends script_Scope0.script
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 03:11:15 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/script.scala.html
                  HASH: 5ec2d52d16a61535b79911c47af37e593a679f3c
                  MATRIX: 745->1|855->16|882->18
                  LINES: 27->1|32->1|33->2
                  -- GENERATED --
              */
          