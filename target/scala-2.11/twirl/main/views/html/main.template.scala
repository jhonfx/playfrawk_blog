
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*11.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery.dataTables.min.js")),format.raw/*12.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/dataTables.bootstrap.min.js")),format.raw/*13.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/dropzone.js")),format.raw/*14.66*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/jsgrid.js")),format.raw/*15.64*/("""" type="text/javascript"></script>
		
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*19.55*/routes/*19.61*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*19.104*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*20.55*/routes/*20.61*/.Assets.at("stylesheets/dataTables.bootstrap.min.css")),format.raw/*20.115*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*21.55*/routes/*21.61*/.Assets.at("stylesheets/myModal.css")),format.raw/*21.98*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*22.55*/routes/*22.61*/.Assets.at("stylesheets/dropzone.css")),format.raw/*22.99*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*23.55*/routes/*23.61*/.Assets.at("stylesheets/jsgrid-theme.css")),format.raw/*23.103*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*24.55*/routes/*24.61*/.Assets.at("stylesheets/jsgrid.css")),format.raw/*24.97*/("""'>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
        <script src="https://unpkg.com/ag-grid/dist/ag-grid.min.js"></script>
        <script type='text/javascript' src='"""),_display_(/*27.46*/routes/*27.52*/.Assets.at("javascripts/index.js")),format.raw/*27.86*/("""'></script>
    </head>
    <body>
		"""),_display_(/*30.4*/content),format.raw/*30.11*/(""" 		
    """),format.raw/*31.5*/("""</body>
    
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Jan 29 01:49:01 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/main.scala.html
                  HASH: 5aa58f4fea0e534189937407d040a40e1c5529f1
                  MATRIX: 748->1|873->31|901->33|978->84|1003->89|1096->156|1110->162|1162->194|1321->326|1336->332|1399->374|1483->431|1498->437|1569->487|1653->544|1668->550|1742->603|1826->660|1841->666|1899->703|1983->760|1998->766|2054->801|2378->1098|2393->1104|2458->1147|2542->1204|2557->1210|2633->1264|2717->1321|2732->1327|2790->1364|2874->1421|2889->1427|2948->1465|3032->1522|3047->1528|3111->1570|3195->1627|3210->1633|3267->1669|3533->1908|3548->1914|3603->1948|3667->1986|3695->1993|3730->2001
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|58->27|61->30|61->30|62->31
                  -- GENERATED --
              */
          