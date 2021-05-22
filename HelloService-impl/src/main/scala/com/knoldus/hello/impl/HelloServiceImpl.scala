package com.knoldus.hello.impl

import com.knoldus.hello.api.HelloService
import com.lightbend.lagom.scaladsl.api.ServiceCall

import scala.concurrent.{ExecutionContext, Future}

class HelloServiceImpl()(implicit ec: ExecutionContext)
  extends HelloService {
  override def sayHello(): ServiceCall[String, String] = ServiceCall{
    user =>
      Future.successful{
        s"Hello! $user from Lagom service"
      }
  }
}

