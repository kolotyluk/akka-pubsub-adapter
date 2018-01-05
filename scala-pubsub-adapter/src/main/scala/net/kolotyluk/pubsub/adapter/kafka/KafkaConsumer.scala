package net.kolotyluk.pubsub.adapter.kinesis

import akka.actor.ActorRef

import net.kolotyluk.pubsub.adapter.Consumer

class KafkaConsumer(channel: String, deligate: ActorRef)
extends Consumer(channel, deligate) {
  
  override def receive: Receive = {
    
    case any: Any =>
      super.receive(any)
    
  }
  
}