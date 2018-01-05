package net.kolotyluk.pubsub.adapter

import akka.actor.Actor
import akka.actor.ActorRef

abstract class Consumer(channel: String, deligate: ActorRef)
extends Actor {
  
  override def preStart() = {
    
  }
  
  override def receive: Receive = {
    
    case any: Any =>
      // super.receive(any)
    
  }
  
}