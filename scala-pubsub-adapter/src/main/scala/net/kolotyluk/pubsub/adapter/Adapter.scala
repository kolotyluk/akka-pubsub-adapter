package net.kolotyluk.pubsub.adapter

import akka.actor.Actor
import akka.actor.Props
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Future
import scala.concurrent.duration._


/** =Abstract PubSub Adapter=
  * 
  * @param channel channel name to produce and consumer from
  * @param consumerDescriptors describing each consumer to run
  */
abstract class Adapter(channel: String, consumerDescriptors: Seq[ConsumerDescriptor])
extends Actor {
  
  override def preStart() = {
    
  }
  
  override def receive: Receive = {
    
    case Produce(message) =>
      
    case any: Any =>
      // super.receive(any)
    
  }
  
  implicit val timeout = Timeout(5 seconds)
      
  def produce(message: Message): Future[Any] = {
    self ? Produce(message)
  }
  
}