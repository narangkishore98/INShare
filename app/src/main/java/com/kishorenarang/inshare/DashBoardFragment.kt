package com.kishorenarang.inshare

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kishorenarang.inshare.Adapter.NewsFeedAdapter
import com.kishorenarang.inshare.Adapter.NewsItem

class DashBoardFragment : Fragment() {
    private lateinit var newsFeedRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_dash_board, container, false)
        val dummyList = generateDummyList(50)
        newsFeedRecyclerView = rootView.findViewById(R.id.recyclerViewNewsFeed)
        newsFeedRecyclerView.layoutManager = LinearLayoutManager(context)
        newsFeedRecyclerView.adapter = NewsFeedAdapter(dummyList)
        //newsFeedRecyclerView.setHasFixedSize(true)


        return rootView
    }

    private fun generateDummyList(size: Int): List<NewsItem> {
        val list = ArrayList<NewsItem>()
        for (i in 0 until size) {
            val item = NewsItem("News $i", "Sub Heading $i")
            list += item
        }
        return list
    }
}