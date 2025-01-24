package com.example.eventsAndListenersGradleProj

import org.springframework.context.ApplicationEvent


class HelloEvent(source: Any?, val message: String) : ApplicationEvent(source!!)