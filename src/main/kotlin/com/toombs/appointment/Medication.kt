package com.toombs.appointment

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.*

@Entity
class Medication : PanacheEntity() {
    @ManyToOne(fetch = FetchType.LAZY)
    var appointment: Appointment? = null
    var name: String = ""
    var firstFill: LocalDate? = null
    var copay: BigDecimal = BigDecimal.ZERO
    var days_supply: Int = 0
}
