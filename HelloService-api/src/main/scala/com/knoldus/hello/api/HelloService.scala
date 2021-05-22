package com.knoldus.hello.api

import com.lightbend.lagom.scaladsl.api.transport.Method.GET
import com.lightbend.lagom.scaladsl.api.{Descriptor, Service, ServiceCall}


trait HelloService extends Service{

  def sayHello() : ServiceCall[String,String]

  override def descriptor: Descriptor = {
    import Service._
    named("HelloService")
      .withCalls(
        restCall(GET,"/api/hello", sayHello _)
      )
      .withAutoAcl(true)
  }
}
