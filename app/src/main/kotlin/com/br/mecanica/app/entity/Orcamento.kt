package com.br.mecanica.app.data.model

import java.util.*

data class Orcamento(
        val codigo: Int,
        val valorTotal: Double = 0.0,
        val data: Date,
        val Cliente: Cliente,
        val observacoes: String
)