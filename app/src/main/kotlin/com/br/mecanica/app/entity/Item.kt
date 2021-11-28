package com.br.mecanica.app.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Item(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var codigo: Int = 0,
        var nome: String = "",
        var quantidade: Int = 0,
        var valor: Double = 0.0
)