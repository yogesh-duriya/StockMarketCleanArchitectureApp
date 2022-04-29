package com.ydcoding.stockmarket.data.mapper

import com.ydcoding.stockmarket.data.local.CompanyListingEntity
import com.ydcoding.stockmarket.data.remote.dto.CompanyInfoDto
import com.ydcoding.stockmarket.domain.model.CompanyInfo
import com.ydcoding.stockmarket.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol =  symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol =  symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}