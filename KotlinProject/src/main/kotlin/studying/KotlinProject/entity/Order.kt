package studying.KotlinProject.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: String? = null;


    fun getId(): String? {
        return this.id
    }


}