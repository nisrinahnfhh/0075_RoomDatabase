package com.example.pertemuan9.viewmodel

class DetailViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa) : ViewModel(){

    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])

