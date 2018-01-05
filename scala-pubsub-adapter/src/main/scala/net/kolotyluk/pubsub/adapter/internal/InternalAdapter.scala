package net.kolotyluk.pubsub.adapter.internal

import akka.actor.Props

import net.kolotyluk.pubsub.adapter.Adapter
import net.kolotyluk.pubsub.adapter.ConsumerDescriptor

object InternalAdapter {
  def props(channel: String, consumerDescriptors: Seq[ConsumerDescriptor]) = 
    Props(new InternalAdapter(channel, consumerDescriptors))
}

class InternalAdapter(channel: String, consumerDescriptors: Seq[ConsumerDescriptor])
extends Adapter(channel, consumerDescriptors) {
  
  override def preStart() = {
    
    val producer = context.actorOf(InternalProducer.props(channel), s"$channel-producer")
    
  }
  
  override def receive: Receive = {
    
    case any: Any =>
      super.receive(any)
    
  }
  
}