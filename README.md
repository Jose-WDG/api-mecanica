# api-mecanica
api de mecanica para PI do naga

# Documentação
Api-rest usando Spring data jpa e sqLite
## **Rotas** 

> Listar orçamentos[GET]: http://localhost:8080/orcamento/orcamentos
	*exemplo:
>
>> [
    {
        "codigo": 0,
        "valorTotal": 100.0,
        "data": "1998-11-28T00:00:00.000+00:00",
        "observacoes": "teste"
    },
    {
        "codigo": 1,
        "valorTotal": 250.03,
        "data": "1998-11-28T00:00:00.000+00:00",
        "observacoes": "teste"
    },
    {
        "codigo": 2,
        "valorTotal": 250.03,
        "data": "1998-11-27T00:00:00.000+00:00",
        "observacoes": "Zé roela"
    }
]

> Criar orçamentos[BodyParam-JSON][POST]: http://localhost:8080/orcamento/novo
	*exemplo:
>
>> {
   "valorTotal": 250.03,
   "data": "1998-11-27",
   "observacoes": "Zé roela"
}