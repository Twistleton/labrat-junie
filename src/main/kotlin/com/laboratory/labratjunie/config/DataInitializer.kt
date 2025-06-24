package com.laboratory.labratjunie.config

import com.laboratory.labratjunie.domain.Book
import com.laboratory.labratjunie.repository.BookRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DataInitializer {

    @Bean
    fun initDatabase(bookRepository: BookRepository): CommandLineRunner {
        return CommandLineRunner {
            // Check if database is already populated
            if (bookRepository.count() == 0L) {
                // Charles Dickens books
                bookRepository.save(Book(
                    title = "Oliver Twist",
                    writer = "Charles Dickens",
                    publisher = "Richard Bentley",
                    pageSize = 554,
                    price = 12.99
                ))
                
                bookRepository.save(Book(
                    title = "A Tale of Two Cities",
                    writer = "Charles Dickens",
                    publisher = "Chapman & Hall",
                    pageSize = 448,
                    price = 14.99
                ))
                
                bookRepository.save(Book(
                    title = "Great Expectations",
                    writer = "Charles Dickens",
                    publisher = "Chapman & Hall",
                    pageSize = 544,
                    price = 13.99
                ))
                
                // Jane Austen books
                bookRepository.save(Book(
                    title = "Pride and Prejudice",
                    writer = "Jane Austen",
                    publisher = "T. Egerton",
                    pageSize = 432,
                    price = 11.99
                ))
                
                bookRepository.save(Book(
                    title = "Sense and Sensibility",
                    writer = "Jane Austen",
                    publisher = "Thomas Egerton",
                    pageSize = 384,
                    price = 10.99
                ))
                
                bookRepository.save(Book(
                    title = "Emma",
                    writer = "Jane Austen",
                    publisher = "John Murray",
                    pageSize = 474,
                    price = 12.49
                ))
                
                // Fyodor Dostoevsky books
                bookRepository.save(Book(
                    title = "Crime and Punishment",
                    writer = "Fyodor Dostoevsky",
                    publisher = "The Russian Messenger",
                    pageSize = 671,
                    price = 15.99
                ))
                
                bookRepository.save(Book(
                    title = "The Brothers Karamazov",
                    writer = "Fyodor Dostoevsky",
                    publisher = "The Russian Messenger",
                    pageSize = 824,
                    price = 16.99
                ))
                
                bookRepository.save(Book(
                    title = "The Idiot",
                    writer = "Fyodor Dostoevsky",
                    publisher = "The Russian Messenger",
                    pageSize = 656,
                    price = 14.49
                ))
                
                bookRepository.save(Book(
                    title = "Notes from Underground",
                    writer = "Fyodor Dostoevsky",
                    publisher = "Epoch",
                    pageSize = 136,
                    price = 9.99
                ))
                
                println("Database has been initialized with 10 classic books.")
            }
        }
    }
}