package net.kolotyluk.pubsub.adapter.internal

import akka.actor.Props

import net.kolotyluk.pubsub.adapter.Producer

object InternalProducer {
  def props(channel: String) = Props(new InternalProducer(channel))
}

class InternalProducer(channel: String)
extends Producer(channel) {
  
  override def receive: Receive = {
    
    case "ping" =>
      sender ! "pong"
    
    case any: Any =>
      super.receive(any)
    
  }
  
}