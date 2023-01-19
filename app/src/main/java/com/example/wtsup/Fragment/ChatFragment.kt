package com.example.wtsup.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wtsup.Adapter.CtAdapter
import com.example.wtsup.Modelclass.Chatmodelclass
import com.example.wtsup.R.drawable.*
import com.example.wtsup.databinding.FragmentChatBinding

class ChatFragment : Fragment() {
    var list= ArrayList<Chatmodelclass>()
    var names1 = arrayOf("Dhuli","Vishva","Kidaaa","Shweta","Janvi","Aashvi","Anne","Bhumi mam'm","Mishti","Sanju","Nemu","Yashvii","Vamika","Hasti")
    var imgs = arrayOf(img, img1, img2, img3, img4,img10, img5, img6, img7, img8, original, natural,img)
    var dates = arrayOf("Today","1/7/22","28/6/22","28/6/22","27/6/22","28/5/22","2/5/22","20/5/22","28/4/22","23/3/22","12/3/22","28/9/21","21/7/21","14/3/21")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var   binding = FragmentChatBinding.inflate(layoutInflater)
        for (x in  0 ..imgs.size-1)
        {
            var data = Chatmodelclass(names1.get(x),dates.get(x),imgs.get(x))
            list.add(data)
        }

        binding.Ctrecycleview.layoutManager  =  LinearLayoutManager(context)
        binding.Ctrecycleview.adapter = CtAdapter(list)
        return binding.root
    }



}