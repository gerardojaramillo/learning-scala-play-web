package controllers

import play.api.mvc.AbstractController
import play.api.mvc.BaseController
import play.api.mvc.ControllerComponents

import javax.inject.Inject
import javax.inject.Singleton
import play.api.mvc.Request
import play.api.mvc.AnyContent

@Singleton
class PersonController @Inject() (
    cc: ControllerComponents
) extends AbstractController(cc) {

  def list = Action { implicit request: Request[AnyContent] =>
    NotImplemented
  }

}