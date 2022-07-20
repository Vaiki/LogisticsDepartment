package com.example.logisticsdepartment.db

class RepositoryRequest(private val requestDao: RequestDao) {
    val getAllRequests = requestDao.getAllRequest()
    suspend fun insert(request: Request) = requestDao.insert(request)
    suspend fun delete(request: Request) = requestDao.delete(request)
    suspend fun update(request: Request) = requestDao.update(request)
    fun getGroupRequestName(orderName: String) = requestDao.getGroupByName(orderName)
}