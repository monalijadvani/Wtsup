package com.example.wtsup.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wtsup.Adapter.StatusAdapter
import com.example.wtsup.Modelclass.StatusModelclass
import com.example.wtsup.R
import com.example.wtsup.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {
    var listst = ArrayList<StatusModelclass>()
    var namest = arrayOf("Aashvi","Vishva","Kidaaa","Shweta","Dhuli","Anne","Bhumi mam'm","Mishti","Sanju","Nemu","Yashvii","Vamika")
    var imgst = arrayOf(
        R.drawable.img10,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.original,
        R.drawable.natural,
        R.drawable.img
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentStatusBinding.inflate(layoutInflater)

        for (x in 0..imgst.size - 1) {
            var stdata = StatusModelclass(namest.get(x), imgst.get(x))
            listst.add(stdata)
        }

        binding.statusrecycleview.layoutManager = LinearLayoutManager(context)
        binding.statusrecycleview.adapter = StatusAdapter(listst)

        return binding.root
    }
}