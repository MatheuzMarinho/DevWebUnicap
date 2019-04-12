import { Component, OnInit } from '@angular/core';
import { slideToRight } from 'src/app/router.animations';
import { ProfessorService } from 'src/app/services/professor-service';
import { Professor } from 'src/app/models/professor';
@Component({
  selector: 'app-listagem-professor',
  templateUrl: './listagem-professor.component.html',
  styleUrls: ['./listagem-professor.component.scss'],
  animations: [slideToRight()],
  providers:[ProfessorService]
})
export class ListagemProfessorComponent implements OnInit {
  professores:Array<Professor> = new Array();
  constructor(private professorService:ProfessorService) {
    this.professores = professorService.getAllUsers()
   }

  ngOnInit() {
  }

}
