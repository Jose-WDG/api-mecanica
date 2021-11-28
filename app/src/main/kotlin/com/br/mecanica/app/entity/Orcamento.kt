package com.br.mecanica.app.entity

import java.util.*
import javax.persistence.*

@Entity
data class Orcamento(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var codigo: Int = 0,
        var valorTotal: Double = 0.0,
        var data: Date? = null,
        @OneToOne(cascade=[CascadeType.PERSIST]) var cliente: Cliente? = null,// remover de PERSIST(cadastra o objeto) PARA MERGE, Para vincular com clientes já cadastrado
        @OneToMany(cascade=[CascadeType.PERSIST]) var veiculoCarro: List<Carro?>? = null,
        @OneToMany(cascade=[CascadeType.PERSIST]) var veiculoMoto: List<Moto?>? = null,
        @OneToMany(cascade=[CascadeType.PERSIST]) var servicos: List<Servico?>? = null,
        @OneToMany(cascade=[CascadeType.PERSIST]) var item: List<Item?>? = null,
        var observacoes: String = ""
)