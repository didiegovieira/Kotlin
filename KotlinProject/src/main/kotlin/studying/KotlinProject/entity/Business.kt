package studying.KotlinProject.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import studying.KotlinProject.dto.Address

class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int? = null;

    private var address: Address? = null;


}