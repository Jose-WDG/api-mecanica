package com.br.mecanica.app.controller

import com.br.mecanica.app.entity.Orcamento
import com.br.mecanica.app.repository.OrcamentoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["orcamento"])
class OrcarmentoController {

    @Autowired
    private lateinit var orcamentoDao: OrcamentoRepository

    @RequestMapping(value = ["orcamentos"], method = [RequestMethod.GET])
    fun getAll(): List<Orcamento> = orcamentoDao.findAll()

    @RequestMapping(value = ["novo"], method = [RequestMethod.POST])
    fun createOrcamento(@RequestBody orcamento: Orcamento) = orcamentoDao.save(orcamento)
}