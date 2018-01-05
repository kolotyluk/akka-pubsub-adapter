package net.kolotyluk.pubsub

import akka.actor.ActorRef

import java.util.UUID

package object adapter {
  
  def produce(message: Message) = ???
  
  
}

package adapter {
  
  case class Acknowledge(id: UUID)
  
  case class ConsumerDescriptor(name: String, deligate: ActorRef)
  
  case class Produce(message: Message)
  
  case class Rsvp(id: UUID, message: Message)

  class Message extends Serializable
  
}