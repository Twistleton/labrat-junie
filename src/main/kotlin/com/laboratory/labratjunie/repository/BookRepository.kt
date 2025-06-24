package com.laboratory.labratjunie.repository

import com.laboratory.labratjunie.domain.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book, Long>