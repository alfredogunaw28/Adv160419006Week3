package com.jitusolution.adv160419006week4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jitusolution.adv160419006week4.model.Student

class DetailViewModel: ViewModel()  {
    val studentLD = MutableLiveData<Student>()
    fun fetch() {
        val student1 = Student("07-6347576","Sibley","2001/06/22","2635475556","http://dummyimage.com/201x100.png/cc0000/ffffff")
        studentLD.value = student1
    }
}