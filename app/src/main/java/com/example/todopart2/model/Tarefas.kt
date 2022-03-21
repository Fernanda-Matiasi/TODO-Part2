package com.example.todopart2.model

data class Tarefas (
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: String
){}