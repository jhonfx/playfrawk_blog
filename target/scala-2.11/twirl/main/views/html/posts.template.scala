
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object posts_Scope0 {
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

class posts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""



"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>Post del Blog</title>
        
        <!-- Latest compiled and minified CSS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
		
    </head>
    <body>
    <script>
    	$(document).ready( function() """),format.raw/*19.36*/("""{"""),format.raw/*19.37*/("""
    		"""),format.raw/*20.7*/("""var url = "/posts";
    		$.get(url, function(data) """),format.raw/*21.33*/("""{"""),format.raw/*21.34*/("""
    			"""),format.raw/*22.8*/("""console.log(data[0]);
    			var div_post = $('#div_post');
    			var contenido = "";
    			for (var i = 0; i < data.length; i++) """),format.raw/*25.46*/("""{"""),format.raw/*25.47*/("""
	    			"""),format.raw/*26.9*/("""contenido += "<span class='card-title'>" + data[i].title + "</span>"+
	    							"<p>" + data[i].comment + "</p>" +
	    							"<div class='card-action'>" + data[i].author + "</div>";
    			"""),format.raw/*29.8*/("""}"""),format.raw/*29.9*/("""
    			"""),format.raw/*30.8*/("""div_post.html(contenido);
    				
    		"""),format.raw/*32.7*/("""}"""),format.raw/*32.8*/(""");
    	"""),format.raw/*33.6*/("""}"""),format.raw/*33.7*/(""")
    </script>
    
        
        
        
        <div class="row">
        <div class="col s12 m6">
          <div class="card blue-grey darken-1">
            <div class="card-content white-text">
            <div id="div_post">
        		</div>
            </div>
          </div>
        </div>
      </div>
        
    </body>
</html>
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
object posts extends posts_Scope0.posts
              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 02:48:15 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/posts.scala.html
                  HASH: c8a2393d191fc37cad2e902c33ac4bbd75e2c78d
                  MATRIX: 738->1|834->3|864->7|943->112|978->121|1493->608|1522->609|1556->616|1636->668|1665->669|1700->677|1860->809|1889->810|1925->819|2145->1012|2173->1013|2208->1021|2276->1062|2304->1063|2339->1071|2367->1072
                  LINES: 27->1|32->1|36->5|39->8|40->9|50->19|50->19|51->20|52->21|52->21|53->22|56->25|56->25|57->26|60->29|60->29|61->30|63->32|63->32|64->33|64->33
                  -- GENERATED --
              */
          