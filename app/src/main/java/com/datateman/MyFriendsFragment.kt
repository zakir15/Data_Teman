package com.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment()  {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Dief Arian", "laki-laki", "muhammad_20520008@stimata.ac.id", "085815450549", "blimbing")
        )
        listTeman.add(
            MyFriend("zakir", "laki-laki", "dif2759@gmail.com", "087589765789", "malang"))

        listTeman.add(
            MyFriend("Indah Kurniani", "Perempuan", "Indah78@gmail.com", "089765654543", "singosari"))

        listTeman.add(
            MyFriend("Veti Ningrum", "Perempuan", "Veti34@gmail.com", "087657654432", "Blimbing"))

        listTeman.add(
            MyFriend("Yaya Comel", "perempuan", "yaya45@gmail.com", "087654653532", "Plaosan"))

        listTeman.add(
            MyFriend("faisal", "laki-laki", "faisal90@gmail.com", "087654908456", "surabaya"))

        listTeman.add(
            MyFriend("zulkaria", "laki-laki", "zulkaria23@gmail.com", "082456650986", "sidoarjo"))

        listTeman.add(
            MyFriend("Lindasari", "perempuan", "sari65@gmail.com", "089533146567", "Blitar"))

        listTeman.add(
            MyFriend("Putri Ramadani", "Perempuan", "putri45@gmail.com", "087589763444", "Lumanjang"))

        listTeman.add(
            MyFriend("Budi", "laki-laki", "BudiAnduk@gmail.com", "081234567809", "Jakarta"))




    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)

    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
