package com.laboratory.labratjunie.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
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
    val createdDate: LocalDateTime = LocalDateTime.now(),

    @Column(name = "update_date", nullable = false)
    val updateDate: LocalDateTime = LocalDateTime.now()
)