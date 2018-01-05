package net.kolotyluk.pubsub.adapter

import akka.actor.Actor

abstract class Producer(channel: String) extends Actor {
  
    override def receive: Receive = {
    
    case any: Any =>
      // super.receive(any)
    
  }
  
}