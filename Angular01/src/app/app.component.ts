import { ServizioTestService } from './servizio/servizio-test.service';
import { Component, ElementRef, ViewChild, OnInit, AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, AfterViewInit {

  title = 'Angular01';
  colore= ""
  oggi = Date.now()
  numero = 5

  constructor(private service: ServizioTestService){}

  @ViewChild('inputSaluti') valoreInput!: ElementRef
  person = [
    {nome:"Luca", cognome: "DeFilippo", eta: "200", isDead: true, color:'blue'},
    {nome:"Davide", cognome: "Dario", eta: "156", isDead: false, color:'red'},
    {nome:"Giulio", cognome: "Libro", eta: "500", isDead: true, color:'yellow'},
  ]
onClick(){
  this.person = [
    {nome:"Forse", cognome: "Mrario", eta: "200", isDead: true, color:'white'},
    {nome:"Basta", cognome: "Dgao", eta: "156", isDead: false, color:'red'},
    {nome:"Ciao", cognome: "Lafa", eta: "500", isDead: true, color:'black'},
  ]
}

onClick2(){
  console.log(this.valoreInput.nativeElement.value)
}
onRiceviDati(value: String){
  console.log(value)
}

  ngOnInit(): void {
    console.log("OnInit")
  console.log(this.valoreInput)

  console.log(this.service.persone)
  }
  ngAfterViewInit(): void {
    console.log("AfterViewInit")
    console.log(this.valoreInput)
  }

  cambiaColore(colore:string){
  this.colore = colore
  }
}
