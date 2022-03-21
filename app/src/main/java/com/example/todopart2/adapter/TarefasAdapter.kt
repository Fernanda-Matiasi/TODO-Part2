package com.example.todopart2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todopart2.R
import com.example.todopart2.model.Tarefas

class TarefasAdapter : RecyclerView.Adapter<TarefasAdapter.TarefasViewHolder>() {

    private var listTarefas = emptyList<Tarefas>()

    class TarefasViewHolder (view: View ) : RecyclerView.ViewHolder(view){

        val textNome = view.findViewById<TextView>(R.id.textNome)
        val textDescricao = view.findViewById<TextView>(R.id.textDescricao)
        val textResponsavel = view.findViewById<TextView>(R.id.textResponsavel)
        val textData = view.findViewById<TextView>(R.id.textData)
        val switchCardAtivo = view.findViewById<Switch>(R.id.switchCardAtivo)
        val textCategoria = view.findViewById<TextView>(R.id.textCategoria)
        val buttonDeletar = view.findViewById<TextView>(R.id.buttonDeletar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefasViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout_tarefas, parent, false)

        return TarefasViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TarefasViewHolder, position: Int) {
        val tarefas = listTarefas[position]

        holder.textNome.text = tarefas.nome
        holder.textDescricao.text = tarefas.descricao
        holder.textResponsavel.text = tarefas.responsavel
        holder.textData.text = tarefas.data
        holder.switchCardAtivo.isChecked = tarefas.status
        holder.textCategoria.text = tarefas.categoria

    }

    override fun getItemCount(): Int {
        return listTarefas.size
    }

    fun setLista(lista: List<Tarefas>){
        listTarefas = lista
        notifyDataSetChanged()
    }

}