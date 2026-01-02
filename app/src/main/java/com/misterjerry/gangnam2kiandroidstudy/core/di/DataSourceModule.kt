package com.misterjerry.gangnam2kiandroidstudy.core.di

import androidx.credentials.CredentialManager
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.misterjerry.gangnam2kiandroidstudy.data.data_source.procedure.ProcedureDataSource
import com.misterjerry.gangnam2kiandroidstudy.data.data_source.procedure.ProcedureDataSourceImpl
import com.misterjerry.gangnam2kiandroidstudy.data.data_source.savedRecipes.RecipesDataSource
import com.misterjerry.gangnam2kiandroidstudy.data.data_source.savedRecipes.RecipesDataSourceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataSourceModule = module {
    single<ProcedureDataSource> { ProcedureDataSourceImpl() }
    single<RecipesDataSource> { RecipesDataSourceImpl() }

    single<FirebaseAuth> { Firebase.auth }
    single<CredentialManager> { CredentialManager.create(androidContext()) }

}