package com.viasverdes.viasverdesespana

const val USER_TYPE__WALK = "1"
const val USER_TYPE__BICYCLE = "2"
const val USER_TYPE__WHEELCHAIR = "3"
const val USER_TYPE__ROLLER = "4"

fun autocompleteSearchValues(): Array<String> = arrayOf(
      "Alicante", "Cádiz", "Sevilla", "Guipúzcoa", "Córdoba", "Jaén", "Vizcaya", "Murcia", "Santander"
)