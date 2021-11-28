package com.br.mecanica.app.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Servico(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 0,
        var descricao: String = "",
        var valorServico: Double = 0.0
)