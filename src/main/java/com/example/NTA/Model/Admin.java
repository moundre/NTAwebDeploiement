package com.example.NTA.Model;

import com.example.NTA.Enumeration.Etat;
import com.example.NTA.Enumeration.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String nom_complet;
    private  String email;
    private  String password;
    private  String login;
    private  Long tel;
    private  String photo;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Enumerated(EnumType.STRING)
    private Etat etat;
}
