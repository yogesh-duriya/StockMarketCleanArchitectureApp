package com.ydcoding.stockmarket.di

import com.ydcoding.stockmarket.data.csv.CSVParser
import com.ydcoding.stockmarket.data.csv.CompanyListingsParser
import com.ydcoding.stockmarket.data.csv.IntradayInfoParser
import com.ydcoding.stockmarket.data.repository.StockRepositoryImpl
import com.ydcoding.stockmarket.domain.model.CompanyListing
import com.ydcoding.stockmarket.domain.model.IntradayInfo
import com.ydcoding.stockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}