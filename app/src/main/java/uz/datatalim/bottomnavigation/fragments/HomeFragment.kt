package uz.datatalim.bottomnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.datatalim.bottomnavigation.R
import uz.datatalim.bottomnavigation.adapter.SearchAdapter
import uz.datatalim.bottomnavigation.model.SearchModel

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        val etSearch:EditText=view.findViewById(R.id.etSearch)
        etSearch.addTextChangedListener {



        }
        val rvSearch:RecyclerView=view.findViewById(R.id.rvSearchable)
        val list:ArrayList<SearchModel> = ArrayList()
        rvSearch.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        rvSearch.adapter=SearchAdapter(list,requireContext())
        list.add(SearchModel(R.mipmap.ic_launcher,"Behzod","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Zohir","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Davron aka","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Abdusamad","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Qalandar","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Qosim","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Abdulla","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Dilmurod","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Javohir","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Mustafo","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Bogibek","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Azizbek","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Alibek","qalay"))
        list.add(SearchModel(R.mipmap.ic_launcher,"Hasan","qalay"))
        return view

    }

}