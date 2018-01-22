package uk.co.grahamcox.cors.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

/**
 * The main entry point to the application
 */
@EnableAutoConfiguration
@Configuration
@ImportResource("classpath:uk/co/grahamcox/cors/spring/context.xml")
internal class Application

/**
 * Run the application
 * @param args The command line arguments
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

