package com.example.todopart2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todopart2.adapter.TarefasAdapter
import com.example.todopart2.model.Tarefas

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val listTarefas = mutableListOf(
            Tarefas(
                "Limpar a casa",
                "Iniciar na parte da manhã",
                "Fernanda",
                "2022-25-03",
                false,
                "Final da Semana"
            ),
            Tarefas(
                "Lavar roupas",
                "Inicicar no período da manhã",
                "Fernanda",
                "2022-26-03",
                false,
                "Fim de semana"
            ),
            Tarefas(
                "Ir ao cinema",
                "Encontrar os amigos no shopping",
                "Fernanda",
                "2022-27-03",
                false,
                "Lazer"
            )
        )
        val recyclerTarefas = view.findViewById<RecyclerView>(R.id.recyclerTarefa)

        val adapter = TarefasAdapter()

        recyclerTarefas.layoutManager = LinearLayoutManager(context)

        recyclerTarefas.adapter = adapter

        recyclerTarefas.setHasFixedSize(true)

        adapter.setLista(listTarefas)

        return view
    }
}


