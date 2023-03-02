import { ServizioProvaService } from './../../servizio-prova.service';
import { Component, Input, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-prova',
  templateUrl: './prova.component.html',
  styleUrls: ['./prova.component.css']
})
export class ProvaComponent implements OnInit {
  constructor(private servizioProva: ServizioProvaService) { }

  title = ''

  persone = this.servizioProva.getPersone()

  offline = true

  @Input() data: any

  @Output() mandaDati = new EventEmitter<any>()



oggi = Date.now()
number = 5

onInput(e: Event){
console.log(this.title =(<HTMLInputElement>e.target).value)
}

onClick(e:Event){
  this.title = 'Ho cliccato'
}
  ngOnInit(): void {

  }

  mandaDatiEvent(){

    this.mandaDati.emit(this.servizioProva.getPersone())

  }

}
