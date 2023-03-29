package com.latihan.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.latihan.recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val lisStudentData = arrayListOf(
            ListStudent("Farid", 19, R.drawable.ic_launcher_foreground),
            ListStudent("Ayu", 19, R.drawable.ic_launcher_foreground),
            ListStudent("Dimas", 19, R.drawable.ic_launcher_foreground),
            ListStudent("Ahmad", 19, R.drawable.ic_launcher_foreground),
            ListStudent("Fadlhur", 19, R.drawable.ic_launcher_foreground),
            ListStudent("Rahman", 19, R.drawable.ic_launcher_foreground),
            ListStudent("Fatur", 19, R.drawable.ic_launcher_foreground),

        )

        val adapterStudent = StudentAdapter(lisStudentData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val gl = GridLayoutManager(2)
        binding.rvStudent.layoutManager = lm
        binding.rvStudent.adapter = adapterStudent
        }

}
