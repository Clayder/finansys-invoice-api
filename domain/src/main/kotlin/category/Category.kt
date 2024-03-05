package br.clayder.finansys.invoice.domain.category

import br.clayder.finansys.invoice.domain.AggregateRoot
import java.time.Instant
import java.util.UUID

class Category private constructor(
    val name: String,
    val description: String,
    val isActive: Boolean,
    override val id: CategoryID = CategoryID.unique(),
) : AggregateRoot<CategoryID>(id){

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
        ): Category  = run {
            Category(
                description = description,
                name = name,
                isActive = isActive
            )
        }
    }
}
