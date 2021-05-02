package com.example.oficios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MostrarResultados : AppCompatActivity() {

    var values = arrayOf("one", "two" , "three", "four", "five" , "six", "seven", "eight", "nine", "ten")

    private lateinit var recyclerView: RecyclerView
    private lateinit var manager: RecyclerView.LayoutManager
    private lateinit var myAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_resultados)

        manager = LinearLayoutManager(this)
        myAdapter = MyAdapter(values)

        recyclerView = findViewById<RecyclerView>(R.id.results_list).apply {
            layoutManager = manager
            adapter =  myAdapter
        }

    }
}

class MyAdapter(private val myDataSet : Array<String>):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        fun bind(text: String){
            // Get reference of 'provider name' from result item view
            val tv = view.findViewById<TextView>(R.id.result_item_name)
            // Set 'provider name' to view
            tv.text = text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vh = LayoutInflater.from(parent.context).inflate(R.layout.list_result_item, parent,false)
        return ViewHolder(vh)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(myDataSet[position])
    }

    override fun getItemCount(): Int {
        return myDataSet.size
    }

}