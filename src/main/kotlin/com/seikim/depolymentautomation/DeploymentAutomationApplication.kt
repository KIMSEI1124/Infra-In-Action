package com.seikim.depolymentautomation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeploymentAutomationApplication

fun main(args: Array<String>) {
	runApplication<DeploymentAutomationApplication>(*args)
}
