package com.example.android_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_recyclerview.adapter.MyAdapter
import com.example.android_recyclerview.model.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.basicRecycler)

        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = gridLayoutManager

        recyclerView.setHasFixedSize(true) //ensures the recylcer does not expand on resize


        //setting data for the adapter
        arrayList = setUpData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter


    }


    //load these items into the array list to be used by the recycler
    private fun setUpData(): ArrayList<MyModel>{

        var items:ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.big_oven, "Big Oven Yeahhhhhhh"))
        items.add(MyModel(R.drawable.blender, "Blender"))
        items.add(MyModel(R.drawable.commentout, "Comment out for stream deck"))
        items.add(MyModel(R.drawable.cool_image, "Neural Network"))
        items.add(MyModel(R.drawable.davinchi, "Davinchi resolve"))
        items.add(MyModel(R.drawable.trelloicon, "trello"))
        items.add(MyModel(R.drawable.figmaprofileicon, "Figma"))
        items.add(MyModel(R.drawable.file_copy, "File copy!"))
        items.add(MyModel(R.drawable.firebase, "Firebase"))
        items.add(MyModel(R.drawable.frame_4, "large bowl"))
        items.add(MyModel(R.drawable.frame_5, "Large Toaster"))
        items.add(MyModel(R.drawable.images_3, "Another Cool nural Net"))
        items.add(MyModel(R.drawable.just_large_bowl, "large bowl"))
        items.add(MyModel(R.drawable.just_toaster, "improved Toaster"))
        items.add(MyModel(R.drawable.largemixingbowl, "large mixing bowl"))
        items.add(MyModel(R.drawable.new_bowl, "another bowl?"))
        items.add(MyModel(R.drawable.openfigma, "Open the figmatic editor"))
        items.add(MyModel(R.drawable.play_arrow, "Playable arrow"))
        items.add(MyModel(R.drawable.streamdeck_key, "Easy Eats Icon"))
        items.add(MyModel(R.drawable.swift_background, "swift .background method"))
        items.add(MyModel(R.drawable.swift_fold, "swift fold"))


        return items


    }
}