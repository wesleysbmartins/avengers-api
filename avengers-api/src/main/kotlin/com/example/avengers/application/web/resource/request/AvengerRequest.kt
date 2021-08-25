package com.example.avengers.application.web.resource.request

import com.example.avengers.domain.avenger.Avenger
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class AvengerRequest(
    @field:NotNull
    @field:NotEmpty
    @field:NotBlank
    val nick : String,
    @field:NotNull
    @field:NotEmpty
    @field:NotBlank
    val person : String,
    val description : String? = null,
    val history : String? = null
){
    fun toAvenger() = Avenger(
        nick = nick,
        person = person,
        description = description,
        history = history
    )

    companion object{
        fun to(id : Long? , request : AvengerRequest) = Avenger(
            id = id,
            person = request.person,
            nick = request.nick,
            description = request.description,
            history = request.history
        )
    }
}
