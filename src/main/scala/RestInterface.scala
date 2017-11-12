import scala.concurrent.ExecutionContext

import akka.http.scaladsl.server.Route

import resources.QuestionResource
import services.QuestionService

trait RestInterface extends Resources {

  implicit def executionContext: ExecutionContext

  override lazy val questionService = new QuestionService()

  val routes: Route = questionRoutes

}

trait Resources extends QuestionResource