package net.kolotyluk.pubsub.adapter.kinesis

import net.kolotyluk.pubsub.adapter.Producer

class KafkaProducer(channel: String)
extends Producer(channel) {
  
  override def receive: Receive = {
    
    case any: Any =>
      super.receive(any)
    
  }
  
}