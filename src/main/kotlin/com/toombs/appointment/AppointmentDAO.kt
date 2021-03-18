package com.toombs.appointment

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.inject.Singleton

@Singleton
class AppointmentDAO : PanacheRepository<Appointment> {

}

