package uz.datatalim.bottomnavigation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.datatalim.bottomnavigation.R
import uz.datatalim.bottomnavigation.model.SearchModel

class SearchAdapter(val list: ArrayList<SearchModel>, requireContext: Context):RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    class SearchViewHolder(view: View):RecyclerView.ViewHolder(view){

        val ivProfile:ImageView=view.findViewById(R.id.iv_profile)
        val tvUsername:TextView=view.findViewById(R.id.tv_fullname)
        val tvMessage:TextView=view.findViewById(R.id.tv_message)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_search,parent,false)
        return SearchViewHolder(view)

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {

        val l=list[position]
        holder.apply {

            ivProfile.setImageResource(l.icon)
            tvUsername.text=l.username
            tvMessage.text=l.message

        }

    }

}