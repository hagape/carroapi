package br.com.marli.carroapi.entity
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.awt.Image

@Document
data class Carro(@Id var id: String?,
                 var marca: String,
                 var modelo: String,
                 var ano: Int,
                 var placa: String,
                 var urlImagem: String?){
/*
    constructor(): this(id: "",
     marca:"",
    modelo:"",
    ano:0,
    placa:"")*/
}

