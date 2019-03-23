import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { slideToRight } from 'src/app/router.animations';
import { ProfessorService } from 'src/app/services/professor-service';
import { Professor } from 'src/app/models/professor';

@Component({
  selector: 'app-detalhes-professor',
  templateUrl: './detalhes-professor.component.html',
  styleUrls: ['./detalhes-professor.component.scss'],
  animations: [slideToRight()],
  providers:[ProfessorService]
})
export class DetalhesProfessorComponent implements OnInit {
    professor:Professor;
  constructor(private route: ActivatedRoute, private professorService:ProfessorService) { 
    //console.log(this.route.snapshot.paramMap.get("id"))
    this.professor = this.professorService.getProfessor(this.route.snapshot.paramMap.get("id"));
  }

  ngOnInit() {
  }

}
