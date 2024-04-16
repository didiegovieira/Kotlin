package studying.KotlinProject.repository

import org.springframework.data.jpa.repository.JpaRepository
import studying.KotlinProject.entity.Business

interface BusinessRepository : JpaRepository<Business, Int> {
}