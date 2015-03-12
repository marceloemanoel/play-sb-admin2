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
}
