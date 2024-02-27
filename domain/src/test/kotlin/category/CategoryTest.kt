package category

import br.clayder.finansys.invoice.domain.category.Category
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.time.Instant
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class CategoryTest {

    @Test
    fun `Given a valid params when call new category then instantiate a category`() {

        val expectedName = "UBER"
        val expectedDescription = "Purchases made at Uber"

        val actualCategoryTest = Category.newCategory(
            expectedName,
            expectedDescription
        )

        assertNotNull(actualCategoryTest)
        assertNotNull(actualCategoryTest.id)
        assertEquals(expectedName, actualCategoryTest.name)
        assertEquals(expectedDescription, actualCategoryTest.description)
        assertTrue(actualCategoryTest.isActive)
        assertNotNull(actualCategoryTest.createdAt)
        assertNotNull(actualCategoryTest.updatedAt)
        assertNull(actualCategoryTest.deletedAt)
    }

}