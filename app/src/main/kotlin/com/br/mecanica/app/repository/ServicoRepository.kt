package com.br.mecanica.app.repository

import com.br.mecanica.app.entity.Servico
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ServicoRepository: JpaRepository<Servico,Int>