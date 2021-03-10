package com.spring.codeblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Postagem {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO) //gera automaticamente o id
   private Long id;

   @NotNull
   private String titulo;

   @NotNull
   private String autor;

   @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
   private LocalDate data;

   @NotNull
   @Lob //permite valores longos e trabalha eles
   private String texto;
}
