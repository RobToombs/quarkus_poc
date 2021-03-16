package com.toombs

data class Appointment(
    val id : Int,
    val lastName : String,
    val firstName : String,
    val dob : String,
    val mrn : String,
    val date : String,
    val time : String,
    val clinician : String,
    val lastSaved : String,
    val medications : List<Medication>
)
