
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addcategory_Scope0 {
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

class addcategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("add category")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<form method="POST" action=""""),_display_(/*4.34*/routes/*4.40*/.CategoryController.addCategory()),format.raw/*4.73*/("""" id="formedit" enctype="multipart/form-data">
        <div class="modal-body">
                <!-- content goes here -->
            <input type="hidden" name="id" id="id">

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
object addcategory extends addcategory_Scope0.addcategory
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 02:48:15 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/addcategory.scala.html
                  HASH: 66337b07b7be446c1d57d21700b8f275b135f108
                  MATRIX: 750->1|846->3|874->6|902->26|941->28|972->33|1027->62|1041->68|1094->101
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4
                  -- GENERATED --
              */
          