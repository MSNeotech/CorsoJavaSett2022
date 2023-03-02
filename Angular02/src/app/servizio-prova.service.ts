import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServizioProvaService {

  constructor() { }

  private persone = [{nome:"Luca" ,cognome: "Luca", eta: 50, colore:'red', isBlack:true },
  {nome:"Maria" , cognome: "Lepre", eta: 20, colore:'black',  isBlack:false},
  {nome:"Cara" , cognome: "Mora", eta: 20, colore:'red',  isBlack:true},
  {nome:"Sera" , cognome: "Alba", eta: 20, colore:'black',  isBlack:false}
]

getPersone(){
  return this.persone
}
}
