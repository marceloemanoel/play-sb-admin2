package controllers

import play.api.mvc._

object Pages extends Controller {

  def blank() = Action {
    Ok(views.html.pages.blank())
  }

  def login() = Action {
    Ok(views.html.pages.login())
  }

}
