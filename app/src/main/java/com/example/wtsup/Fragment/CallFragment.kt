package com.example.wtsup.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wtsup.Adapter.CallAdapter
import com.example.wtsup.Modelclass.CallModelclass
import com.example.wtsup.Modelclass.Chatmodelclass
import com.example.wtsup.R
import com.example.wtsup.databinding.FragmentCallBinding

class CallFragment : Fragment() {

    var list1 = ArrayList<CallModelclass>()
    var name = arrayOf("Aashvi","Vishva","Kidaaa","Shweta","Dhuli")
    var img = arrayOf(
        R.drawable.img10,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img,

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var   binding = FragmentCallBinding.inflate(layoutInflater)

       for (x in 0 ..img.size-1 )
       {
           var caldata = CallModelclass(name.get(x),img.get(x))
           list1.add(caldata)
       }

        binding.Callrecycleview.layoutManager = LinearLayoutManager(context)
        binding.Callrecycleview.adapter=CallAdapter (list1)

        return binding.root
    }
}


