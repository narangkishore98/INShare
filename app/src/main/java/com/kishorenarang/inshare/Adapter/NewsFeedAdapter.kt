package com.kishorenarang.inshare.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kishorenarang.inshare.R
import kotlinx.android.synthetic.main.item_news_card.view.*

class NewsFeedAdapter(private val newsList:List<NewsItem>) : RecyclerView.Adapter<NewsFeedAdapter.NewsviewHolder>(){

    class NewsviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val txtnewsHeading: TextView = itemView.findViewById(R.id.txtnewsHeading)
        //val txtnewsSubHeading: TextView = itemView.findViewById(R.id.txtnewsSubHeading)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsviewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_news_card,parent,false)
        return NewsviewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewsviewHolder, position: Int) {
        val currentNewsItem = newsList[position]
        holder.txtnewsHeading.text = currentNewsItem.NewsHeading
        //holder.txtnewsSubHeading.text = currentNewsItem.NewsSubHeading
    }

}
