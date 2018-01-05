package net.kolotyluk.pubsub.adapter.internal

import akka.actor.ActorRef

import net.kolotyluk.pubsub.adapter.Consumer

class InternalConsumer(channel: String, deligate: ActorRef)
extends Consumer(channel, deligate) {
  
  override def receive: Receive = {
    
    case any: Any =>
      super.receive(any)
    
  }
  
}