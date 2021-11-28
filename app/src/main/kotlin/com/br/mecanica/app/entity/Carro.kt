package com.br.mecanica.app.entity

import javax.persistence.Entity

@Entity
data class Carro(
        var qtdPortas:Int = 0,
        var assentos: Int = 0,
        var chassi: String = "",
        var temEstepe: Boolean = false
): Veiculo()