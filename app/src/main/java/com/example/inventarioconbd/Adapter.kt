package com.example.inventarioconbd

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class Adapter (var lista: ArrayList<Fila>):RecyclerView.Adapter<Adapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.fragment_articulo,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(p0: Adapter.ViewHolder, p1: Int) {
        p0.bindItem(lista[p1])
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bindItem(data:Fila){
            val nombre: TextView = itemView.findViewById(R.id.nomProducto)
            val cant: TextView = itemView.findViewById(R.id.cantidad)
            nombre.text = data.producto.nombre
            //cant.text = data.cant.toString()
            val mas: Button = itemView.findViewById(R.id.mas)
            val menos: Button = itemView.findViewById(R.id.menos)
            /*
            Sumar al contador 1, independiente para cada cardview
             */
            mas.setOnClickListener(){
               /* var num = data.cant+1
                data.cant = num
                cant.text=num.toString()*/
            }
            
            /*menos.setOnClickListener(){
                if(data.cant!=0){
                    var num = data.cant-1
                    data.cant = num
                    cant.text=num.toString()
                }
            }*/
        }
    }
}