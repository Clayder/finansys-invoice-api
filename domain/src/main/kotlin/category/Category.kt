package br.clayder.finansys.invoice.domain.category

import java.time.Instant
import java.util.UUID

class Category private constructor(
    val name: String,
    val description: String,
    val isActive: Boolean
) {

    val id: String = UUID.randomUUID().toString()
    val createdAt: Instant
    val updatedAt: Instant
    val deletedAt: Instant? = null

    init {
        val now = Instant.now()
        this.createdAt = now
        this.updatedAt = now
    }

    companion object {
        fun newCategory(
            name: String,
            description: String,
            isActive: Boolean = true
        ): Category {

            return Category(
                description = description,
                name = name,
                isActive = isActive
            )
        }
    }
}
