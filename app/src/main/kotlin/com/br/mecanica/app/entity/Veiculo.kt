package com.br.mecanica.app.entity

import javax.persistence.*

@MappedSuperclass
abstract class Veiculo(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 0,
        var modelo: String = "",
        var cor: String = "",
        var ano: String = "",
        var tipoCombustivel: String = "",
        var placa: String = ""
)