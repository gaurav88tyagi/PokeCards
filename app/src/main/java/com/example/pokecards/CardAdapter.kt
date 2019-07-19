package com.example.pokecards

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_card.view.*

class CardAdapter (
    val cardList: ArrayList<Card>
): RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val li = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = li.inflate(R.layout.list_item_card, parent, false)
        return CardViewHolder(itemView)
    }

    override fun getItemCount(): Int = cardList.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val card = cardList[position]
        holder.itemView.iv.setImageResource(card.image)
        holder.itemView.tvName.text = card.name
        holder.itemView.tvHp.text = card.hp
    }

    class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

}