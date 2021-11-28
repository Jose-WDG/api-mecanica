package com.br.mecanica.app.repository

import com.br.mecanica.app.entity.Orcamento
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrcamentoRepository: JpaRepository<Orcamento,Int> {

}