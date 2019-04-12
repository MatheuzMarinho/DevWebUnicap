import { Disciplina } from "./disciplina";

export class Professor{

    nome:String;
    matricula:String;
    email:String;
    disciplinas:Array<Disciplina> = new Array();

}