package com.br.mecanica.app.entity

import javax.persistence.*

@Entity
data class Cliente(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,
        var nome: String = "",
        var cpf: String = "",
        var telefone: String = "",
        var email: String = ""
)
