package com.br.mecanica.app.entity

import javax.persistence.Entity

@Entity
data class Moto(
        var temCarenagem: Boolean = false,
        var ehModificada: Boolean = false,
        var cilindradas: Int = 0
): Veiculo()