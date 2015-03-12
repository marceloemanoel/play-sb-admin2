package controllers

import play.api.mvc._

object UiElements extends Controller {

  def panelsAndWells() = Action {
    Ok(views.html.uielements.panelsAndWells())
  }

  def buttons() = Action {
    Ok(views.html.uielements.buttons())
  }

  def notifications() = Action {
    Ok(views.html.uielements.notifications())
  }

  def typography() = Action {
    Ok(views.html.uielements.typography())
  }

  def icons() = Action {
    Ok(views.html.uielements.icons())
  }

  def grid() = Action {
    Ok(views.html.uielements.grid())
  }

}
