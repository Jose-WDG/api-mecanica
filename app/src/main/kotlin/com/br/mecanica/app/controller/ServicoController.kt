package com.br.mecanica.app.controller

import com.br.mecanica.app.repository.ServicoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["servico"])
class ServicoController {
    @Autowired
    private lateinit var servicoDao: ServicoRepository

    @RequestMapping(value = ["servicos"],method = [RequestMethod.GET])
    fun getAll() = servicoDao.findAll()
}