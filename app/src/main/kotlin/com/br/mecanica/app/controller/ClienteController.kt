package com.br.mecanica.app.controller

import com.br.mecanica.app.entity.Cliente
import com.br.mecanica.app.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["cliente"])
class ClienteController {

    @Autowired
    private lateinit var clienteDao: ClienteRepository

    @RequestMapping(value = ["novo"], method = [RequestMethod.POST])
    fun createCliente(@RequestBody cliente: Cliente) = clienteDao.save(cliente)

    @RequestMapping(value = ["clientes"], method = [RequestMethod.GET])
    fun getAll() = clienteDao.findAll()
}