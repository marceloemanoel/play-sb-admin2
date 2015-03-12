package controllers

import play.api.mvc._

object Application extends Controller {

  def dashboard() = Action { request =>
    Ok(views.html.dashboard())
  }

  def flotCharts() = Action {
    Ok(views.html.charts.flot())
  }

  def morrisCharts() = Action {
    Ok(views.html.charts.morris())
  }

  def tables() = Action {
    Ok(views.html.tables())
  }

  def forms() = Action {
    Ok(views.html.forms())
  }

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

  def blank() = Action {
    Ok(views.html.blank())
  }
}
