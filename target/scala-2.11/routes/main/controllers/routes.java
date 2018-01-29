
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Juan/Projects/play/testLynxCompliance/conf/routes
// @DATE:Mon Jan 29 01:57:35 CST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePostController PostController = new controllers.ReversePostController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCategoryController CategoryController = new controllers.ReverseCategoryController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePostController PostController = new controllers.javascript.ReversePostController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCategoryController CategoryController = new controllers.javascript.ReverseCategoryController(RoutesPrefix.byNamePrefix());
  }

}
