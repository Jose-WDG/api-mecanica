package com.br.mecanica.app.service

import com.br.mecanica.app.entity.Orcamento
import com.br.mecanica.app.repository.OrcamentoRepository
import org.springframework.beans.factory.annotation.Autowired

class OrcamentoService(
        @Autowired private val orcamentoRepository: OrcamentoRepository
){

}