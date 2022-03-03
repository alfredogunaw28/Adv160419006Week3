package com.jitusolution.adv160419006week4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jitusolution.adv160419006week4.model.Student

class ListViewModel: ViewModel()  {
    val studentsLD = MutableLiveData<List<Student>>()
    val studentLoadErrorLD = MutableLiveData<Boolean>()
    val loadingLD = MutableLiveData<Boolean>()

    fun refresh() {
        val student1 = Student("08-7107794","Melva","2/20/2022","779-701-4100","http://dummyimage.com/175x100.png/dddddd/000000")
        val student2 = Student("27-1378539","Billy","6/2/2021","841-291-4577","http://dummyimage.com/198x100.png/cc0000/ffffff")
        val student3 = Student("66-1980602","Friedrich","6/12/2021","964-237-9311","http://dummyimage.com/220x100.png/ff4444/ffffff")

        val studentList:ArrayList<Student> = arrayListOf<Student>(student1, student2, student3)
        studentsLD.value = studentList
        studentLoadErrorLD.value = false
        loadingLD.value = true
    }
}