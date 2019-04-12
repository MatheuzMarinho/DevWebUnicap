import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders, HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Professor } from "../models/professor";
import { Disciplina } from "../models/disciplina";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";
@Injectable({
    providedIn: 'root',
  })
export class ProfessorService{

    professores:Professor[] = [];

    urlProfessor = environment.baseUrl + '/professor/';

    constructor(private http: HttpClient){
        this.mockProfessores();
        for(let p of this.professores){
            this.mockDisciplinas(p);
        }
    }


    getAllUsers(){
        
        return this.professores
        
    }

    getProfessor(matricula:String){       
        
        return this.http.get<Professor>(this.urlProfessor+matricula );

    }

    mockProfessores(){
        return this.http.get<Professor[]>(this.urlProfessor);
    }

    // mockProfessores(){
    //     let p1 = new Professor();
    //     p1.email = "professor1@gmail.com"
    //     p1.matricula= "1111111111"
    //     p1.nome = "Professor 1"
    //     let p2 = new Professor();
    //     p2.email = "professor2@gmail.com"
    //     p2.matricula= "2222222222"
    //     p2.nome = "Professor 2"
    //     let p3 = new Professor();
    //     p3.email = "professor3@gmail.com"
    //     p3.matricula= "3333333333"
    //     p3.nome = "Professor 3"
    //     let p4 = new Professor();
    //     p4.email = "professor4@gmail.com"
    //     p4.matricula= "444444444"
    //     p4.nome = "Professor 4"

    //     this.professores.push(p1)
    //     this.professores.push(p2)
    //     this.professores.push(p3)
    //     this.professores.push(p4)
    // }

    mockDisciplinas(professor:Professor){

        let disciplinas:Array<Disciplina> = [new Disciplina(1,40,"Compiladores"), new Disciplina(2,40,"PLP"),
            new Disciplina(3,45,"Inteligencia Artificial"), new Disciplina(4,45,"Sociologia"),
            new Disciplina(5,40,"Introdução a Ciência da Computação")]



        for(let i=0; i<2; i++){
            let j = this.randomInt(0, 4);
            professor.disciplinas.push(disciplinas[j])
        }
    }


    randomInt(min, max){
        return Math.floor(Math.random() * (max - min + 1)) + min;
     }

   

}