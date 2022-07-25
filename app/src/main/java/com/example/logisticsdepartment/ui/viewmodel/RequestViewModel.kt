package com.example.logisticsdepartment.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.logisticsdepartment.db.RepositoryRequest
import com.example.logisticsdepartment.db.Request
import kotlinx.coroutines.launch

class RequestViewModel(private val repositoryRequest: RepositoryRequest) : ViewModel() {

    val getAllRequest = repositoryRequest.getAllRequests.asLiveData()
    fun insert(request: Request) = viewModelScope.launch { repositoryRequest.insert(request) }
    fun update(request: Request) = viewModelScope.launch { repositoryRequest.update(request) }
    fun delete(request: Request) = viewModelScope.launch { repositoryRequest.delete(request) }
    fun getRequestByGroupName(orderName:String) = viewModelScope.launch { repositoryRequest.getGroupRequestName(orderName) }

    val itemsMenuEquipment = listOf<String>("Оборудование","Материалы")


}