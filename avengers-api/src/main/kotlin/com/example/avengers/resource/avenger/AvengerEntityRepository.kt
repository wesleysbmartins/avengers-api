package com.example.avengers.resource.avenger

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AvengerEntityRepository : JpaRepository<AvengerEntity, Long>