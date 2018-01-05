package unit

import akka.actor.ActorSystem
import akka.testkit.{ ImplicitSender, TestActors, TestKit }

import net.kolotyluk.pubsub.adapter.internal.InternalProducer

import org.scalatest.{ BeforeAndAfterAll, GivenWhenThen, Matchers, WordSpecLike }


class IntermalProducerTest()
  extends TestKit(ActorSystem("MySpec"))
    with ImplicitSender
    with WordSpecLike
    with Matchers
    with BeforeAndAfterAll
    with GivenWhenThen {

  override def afterAll {
    TestKit.shutdownActorSystem(system)
  }

  "The InternalProducer actor" must {

    "respond to ping messages" in {
      Given("No actor")
      Then("Start the InternalProducer actor")
      val internalProducer = system.actorOf(InternalProducer.props("test"), "test")
      
      When("sending a \"ping\" message")
      internalProducer ! "ping"
      
      Then("we should expect a \"pong\" response")
      expectMsg("pong")
    }

  }
}