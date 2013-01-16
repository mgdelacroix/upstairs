package es.ctrlz.upStairs

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Effort)
@Mock([
	Effort, Purpose
])
class EffortTests {

    void testConstraints() {
		def purpose = new Purpose(
			name: 'Test purpose',
			description: 'Description'
		)
		def effort = new Effort(
			purpose: purpose,
			description: 'Description'
		)

		/*
		 * Ahora mismo el esfuerzo no tiene fecha, de modo que
		 * no debería validar
		 */
		assert !effort.validate()

		/*
		 * El esfuerzo debería validar ahora que tiene fecha
		 */
		effort.date = new Date()
		assert effort.validate()

		/*
		 * Eliminamos la descripción y comprobamos que ahora la validación
		 * no pasa
		 */
		effort.description = null
		assert !effort.validate()
    }

}
