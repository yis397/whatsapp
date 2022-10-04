package com.example.whatsapp.ui.components

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R
import com.example.whatsapp.data.models.Contacto

class ContactList(val lista:List<Contacto>):RecyclerView.Adapter<CardHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
       val view=LayoutInflater.from(parent.context)
        return  CardHolder(view.inflate(R.layout.card_contact,parent,false))
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.render(lista[position],position)
    }

    override fun getItemCount(): Int =lista.size
}
class CardHolder(val view: View):RecyclerView.ViewHolder(view){
    fun render(item:Contacto,i:Int){
        view.findViewById<TextView>(R.id.cont_name).text=item.username
        view.findViewById<TextView>(R.id.cont_msg).text=item.msg
    }
}