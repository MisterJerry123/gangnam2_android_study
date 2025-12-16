package com.survivalcoding.gangnam2kiandroidstudy.data.repository

import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.procedure.ProcedureDataSource
import com.survivalcoding.gangnam2kiandroidstudy.domain.model.Procedure
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.ProcedureRepository

class ProcedureRepositoryImpl(
    private val procedureDataSource: ProcedureDataSource
) : ProcedureRepository {
    override fun getProcedureByRecipeId(id: Int): List<Procedure> {
        return procedureDataSource.getAllProcedure().procedures.filter { it.recipeId == id }
    }
}