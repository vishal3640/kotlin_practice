package com.example.eventsAndListenersGradleProj

import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component


@Component
class HelloListenerOne : ApplicationListener<HelloEvent> {
    override fun onApplicationEvent(event: HelloEvent) {
        println("First listener handled the event, the message is " + event.message)
    }
}

@Component
class HelloListenerTwo : ApplicationListener<HelloEvent> {
    override fun onApplicationEvent(event: HelloEvent) {
        println("Second listener handled the event, the message is " + event.message)
    }
}