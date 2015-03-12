package controllers

import play.api.mvc._

object Application extends Controller {

  def dashboard() = Action { request =>
    Ok(views.html.dashboard())
  }

  def tables() = Action {
    Ok(views.html.tables())
  }

  def forms() = Action {
    Ok(views.html.forms())
  }
}
