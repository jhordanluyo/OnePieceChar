package com.creartec.onepiecechar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.creartec.onepiecechar.model.OpChar

class OpCharAdapter(val opCharAd:List<OpChar>): RecyclerView.Adapter<OpCharAdapter.OpViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.item_op_char,parent,false)
        return OpViewHolder(view)
    }

    override fun onBindViewHolder(holder: OpViewHolder, position: Int) {
        val opCharPos=opCharAd[position]
        holder.bind(opCharPos)
    }

    override fun getItemCount(): Int = opCharAd.size
    inner class OpViewHolder(val view:View):RecyclerView.ViewHolder(view){
        private val name=view.findViewById<TextView>(R.id.name)
        private val age=view.findViewById<TextView>(R.id.age)
        private val description=view.findViewById<TextView>(R.id.description)
        private val photo=view.findViewById<ImageView>(R.id.char_image)

        fun bind(opChar:OpChar){
            name.text=opChar.name
            age.text="edad: ${opChar.age}"
            description.text=opChar.description
            Glide.with(photo.context).load(opChar.photo).into(photo)

        }
    }
}