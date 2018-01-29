
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newpost_Scope0 {
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

class newpost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("new post template")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
"""),format.raw/*4.1*/("""<form method="POST" action=""""),_display_(/*4.30*/routes/*4.36*/.PostController.addPost()),format.raw/*4.61*/("""" id="formedit" enctype="multipart/form-data">

<div class="modal-body">
        <!-- content goes here -->
        <input type="hidden" name="id" id="id">

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
object newpost extends newpost_Scope0.newpost
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 02:48:15 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/newpost.scala.html
                  HASH: 67c67f382ce76dfa674a2ba43f38bb35caddc695
                  MATRIX: 742->1|838->3|866->6|899->31|938->33|965->34|1020->63|1034->69|1079->94
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4
                  -- GENERATED --
              */
          