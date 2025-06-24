package com.laboratory.labratjunie.domain

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Entity
@Table(name = "books")
class Book(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val writer: String,

    @Column(nullable = false)
    val publisher: String,

    @Column(nullable = false)
    val pageSize: Int,

    @Column(nullable = false)
    val price: Double,

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    val createdDate: LocalDateTime = LocalDateTime.now(),

    @Column(name = "modified_date")
    @LastModifiedDate
    var modifiedDate: LocalDateTime? = null
)
