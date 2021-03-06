package net.kolotyluk.pubsub.adapter.kinesis

import net.kolotyluk.pubsub.adapter.Producer

class KinesisProducer(channel: String)
extends Producer(channel) {
  
  override def receive: Receive = {
    
    case any: Any =>
      super.receive(any)
    
  }
  
}