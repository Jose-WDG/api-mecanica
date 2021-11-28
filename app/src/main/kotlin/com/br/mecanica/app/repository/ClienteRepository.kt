package com.br.mecanica.app.repository

import com.br.mecanica.app.entity.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository : JpaRepository<Cliente,Int>