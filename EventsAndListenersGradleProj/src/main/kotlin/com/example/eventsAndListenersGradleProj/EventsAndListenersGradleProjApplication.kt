package com.example.eventsAndListenersGradleProj

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component


@SpringBootApplication
class EventsAndListenersGradleProjApplication

fun main(args: Array<String>) {
	runApplication<EventsAndListenersGradleProjApplication>(*args)
}

@Component
internal class Runner(private val eventPublisher: ApplicationEventPublisher) : CommandLineRunner {
	override fun run(vararg args: String) {
		val event = HelloEvent(this, "Hello World!")
		eventPublisher.publishEvent(event)
	}
}