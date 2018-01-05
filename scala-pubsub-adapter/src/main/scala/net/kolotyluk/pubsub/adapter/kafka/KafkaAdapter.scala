package net.kolotyluk.pubsub.adapter.kinesis

import net.kolotyluk.pubsub.adapter.Adapter
import net.kolotyluk.pubsub.adapter.ConsumerDescriptor

class KafkaAdapter(channel: String, consumerDescriptors: Seq[ConsumerDescriptor])
extends Adapter(channel, consumerDescriptors) {
  
  override def receive: Receive = {
    
    case any: Any =>
      super.receive(any)
    
  }
  
}