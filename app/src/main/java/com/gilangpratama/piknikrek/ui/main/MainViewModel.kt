package com.gilangpratama.piknikrek.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.gilangpratama.piknikrek.data.local.WisataEntity
import com.gilangpratama.piknikrek.data.remote.Result
import com.gilangpratama.piknikrek.data.remote.response.wisata.Wisata
import com.gilangpratama.piknikrek.data.repository.wisata.WisataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val wisataRepository: WisataRepository
): ViewModel() {

    val listWisata: LiveData<Result<List<WisataEntity?>>> =
        wisataRepository.getListWisata()
}