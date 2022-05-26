package com.example.xquareinterviewassignment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

internal const val BASE_PACKAGE = "com.example.xquareinterviewassignment"

@SpringBootApplication
class XquareInterviewAssignmentApplication

fun main(args: Array<String>) {
    runApplication<XquareInterviewAssignmentApplication>(*args)
}
