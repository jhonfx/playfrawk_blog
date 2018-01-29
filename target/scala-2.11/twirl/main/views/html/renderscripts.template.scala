
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object renderscripts_Scope0 {
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

class renderscripts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/additionalScripts/*1.19*/ = {{ctx().args.get("additionalScripts").asInstanceOf[List[Html]]}};
Seq[Any](format.raw/*1.85*/("""
"""),_display_(/*2.2*/if(additionalScripts != null)/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/for(additionalScript <- additionalScripts) yield /*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
        """),_display_(/*4.10*/additionalScript),format.raw/*4.26*/("""
    """)))}),format.raw/*5.6*/("""
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
object renderscripts extends renderscripts_Scope0.renderscripts
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 03:11:15 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/renderscripts.scala.html
                  HASH: 8b02074d8c19f2b1d04221ae0daa7b6cf93652bd
                  MATRIX: 827->1|852->18|948->84|975->86|1012->115|1051->117|1082->123|1139->165|1178->167|1214->177|1250->193|1285->199
                  LINES: 31->1|31->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4|35->4|36->5
                  -- GENERATED --
              */
          