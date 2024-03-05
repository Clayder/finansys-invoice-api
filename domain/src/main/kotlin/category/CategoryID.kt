package br.clayder.finansys.invoice.domain.category

import br.clayder.finansys.invoice.domain.Identifier
import java.util.UUID

class CategoryID private constructor(
    val value: String
): Identifier() {

    companion object {

        fun unique(): CategoryID = run {
            CategoryID.from(UUID.randomUUID())
        }

        fun from(anId: String): CategoryID = run {
            CategoryID(anId)
        }

        fun from(anId: UUID): CategoryID = run {
            CategoryID(anId.toString().lowercase())
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CategoryID

        return value == other.value
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}