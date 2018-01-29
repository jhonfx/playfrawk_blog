
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Juan/Projects/play/testLynxCompliance/conf/routes
// @DATE:Mon Jan 29 01:57:35 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  UserController_0: controllers.UserController,
  // @LINE:10
  PostController_3: controllers.PostController,
  // @LINE:17
  CategoryController_2: controllers.CategoryController,
  // @LINE:26
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    UserController_0: controllers.UserController,
    // @LINE:10
    PostController_3: controllers.PostController,
    // @LINE:17
    CategoryController_2: controllers.CategoryController,
    // @LINE:26
    Assets_1: controllers.Assets
  ) = this(errorHandler, UserController_0, PostController_3, CategoryController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_0, PostController_3, CategoryController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.UserController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.UserController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.addUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """controllers.PostController.addPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newuser""", """controllers.UserController.newUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newpost""", """controllers.PostController.newPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts""", """controllers.PostController.getPosts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showposts""", """controllers.PostController.showPosts()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category""", """controllers.CategoryController.addCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showcategories""", """controllers.CategoryController.showCategory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.CategoryController.listCategories()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UserController.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_UserController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UserController_login0_invoker = createInvoker(
    UserController_0.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_UserController_index1_invoker = createInvoker(
    UserController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_addUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_addUser2_invoker = createInvoker(
    UserController_0.addUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PostController_addPost3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val controllers_PostController_addPost3_invoker = createInvoker(
    PostController_3.addPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "addPost",
      Nil,
      "POST",
      """""",
      this.prefix + """post"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_newUser4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newuser")))
  )
  private[this] lazy val controllers_UserController_newUser4_invoker = createInvoker(
    UserController_0.newUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "newUser",
      Nil,
      "GET",
      """""",
      this.prefix + """newuser"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PostController_newPost5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newpost")))
  )
  private[this] lazy val controllers_PostController_newPost5_invoker = createInvoker(
    PostController_3.newPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "newPost",
      Nil,
      "GET",
      """""",
      this.prefix + """newpost"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PostController_getPosts6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_PostController_getPosts6_invoker = createInvoker(
    PostController_3.getPosts(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPosts",
      Nil,
      "GET",
      """""",
      this.prefix + """posts"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_getUsers7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getUsers7_invoker = createInvoker(
    UserController_0.getUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PostController_showPosts8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showposts")))
  )
  private[this] lazy val controllers_PostController_showPosts8_invoker = createInvoker(
    PostController_3.showPosts(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "showPosts",
      Nil,
      "GET",
      """""",
      this.prefix + """showposts"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CategoryController_addCategory9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category")))
  )
  private[this] lazy val controllers_CategoryController_addCategory9_invoker = createInvoker(
    CategoryController_2.addCategory(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      """""",
      this.prefix + """category"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CategoryController_showCategory10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showcategories")))
  )
  private[this] lazy val controllers_CategoryController_showCategory10_invoker = createInvoker(
    CategoryController_2.showCategory(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "showCategory",
      Nil,
      "GET",
      """""",
      this.prefix + """showcategories"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CategoryController_listCategories11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_CategoryController_listCategories11_invoker = createInvoker(
    CategoryController_2.listCategories(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "listCategories",
      Nil,
      "GET",
      """""",
      this.prefix + """categories"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UserController_doLogin12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_doLogin12_invoker = createInvoker(
    UserController_0.doLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doLogin",
      Nil,
      "POST",
      """login""",
      this.prefix + """login"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_UserController_logout13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UserController_logout13_invoker = createInvoker(
    UserController_0.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_at15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_UserController_login0_route(params) =>
      call { 
        controllers_UserController_login0_invoker.call(UserController_0.login())
      }
  
    // @LINE:7
    case controllers_UserController_index1_route(params) =>
      call { 
        controllers_UserController_index1_invoker.call(UserController_0.index())
      }
  
    // @LINE:9
    case controllers_UserController_addUser2_route(params) =>
      call { 
        controllers_UserController_addUser2_invoker.call(UserController_0.addUser())
      }
  
    // @LINE:10
    case controllers_PostController_addPost3_route(params) =>
      call { 
        controllers_PostController_addPost3_invoker.call(PostController_3.addPost())
      }
  
    // @LINE:11
    case controllers_UserController_newUser4_route(params) =>
      call { 
        controllers_UserController_newUser4_invoker.call(UserController_0.newUser())
      }
  
    // @LINE:12
    case controllers_PostController_newPost5_route(params) =>
      call { 
        controllers_PostController_newPost5_invoker.call(PostController_3.newPost())
      }
  
    // @LINE:14
    case controllers_PostController_getPosts6_route(params) =>
      call { 
        controllers_PostController_getPosts6_invoker.call(PostController_3.getPosts())
      }
  
    // @LINE:15
    case controllers_UserController_getUsers7_route(params) =>
      call { 
        controllers_UserController_getUsers7_invoker.call(UserController_0.getUsers())
      }
  
    // @LINE:16
    case controllers_PostController_showPosts8_route(params) =>
      call { 
        controllers_PostController_showPosts8_invoker.call(PostController_3.showPosts())
      }
  
    // @LINE:17
    case controllers_CategoryController_addCategory9_route(params) =>
      call { 
        controllers_CategoryController_addCategory9_invoker.call(CategoryController_2.addCategory())
      }
  
    // @LINE:18
    case controllers_CategoryController_showCategory10_route(params) =>
      call { 
        controllers_CategoryController_showCategory10_invoker.call(CategoryController_2.showCategory())
      }
  
    // @LINE:19
    case controllers_CategoryController_listCategories11_route(params) =>
      call { 
        controllers_CategoryController_listCategories11_invoker.call(CategoryController_2.listCategories())
      }
  
    // @LINE:22
    case controllers_UserController_doLogin12_route(params) =>
      call { 
        controllers_UserController_doLogin12_invoker.call(UserController_0.doLogin())
      }
  
    // @LINE:23
    case controllers_UserController_logout13_route(params) =>
      call { 
        controllers_UserController_logout13_invoker.call(UserController_0.logout())
      }
  
    // @LINE:26
    case controllers_Assets_at14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:27
    case controllers_Assets_at15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromQuery[String]("file", None)) { (path, file) =>
        controllers_Assets_at15_invoker.call(Assets_1.at(path, file))
      }
  }
}
