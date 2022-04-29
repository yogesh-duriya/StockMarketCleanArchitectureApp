package com.ydcoding.stockmarket.domain.repository

import com.ydcoding.stockmarket.domain.model.CompanyInfo
import com.ydcoding.stockmarket.domain.model.CompanyListing
import com.ydcoding.stockmarket.domain.model.IntradayInfo
import com.ydcoding.stockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ) : Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}