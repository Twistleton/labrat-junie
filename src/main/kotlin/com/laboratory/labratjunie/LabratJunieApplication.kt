package com.laboratory.labratjunie

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan(basePackages = ["com.laboratory.labratjunie", "com.labratjunie.domain"])
class LabratJunieApplication

fun main(args: Array<String>) {
    runApplication<LabratJunieApplication>(*args)
}
