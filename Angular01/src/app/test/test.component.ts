
import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';


@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit, OnChanges {

  @Input()  data: any;
  @Output() mandaDatiE = new EventEmitter<String>()
persone: any;

  constructor() {
  }

  ngOnInit(): void {
    let counter = 0
    setInterval(() => {
      this.isDisabled = !this.isDisabled
      if (counter % 2 == 0)
        this.img = this.img1
      else {
        this.img = this.img2
      }
      counter++
    }, 1000)

    console.log(this.data)
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log(changes)
  }

  img = ""
  img1 = "https://th.bing.com/th/id/OIP.F_sEEszqnPbz-rX8JzO0bwHaEo?w=289&h=180&c=7&r=0&o=5&pid=1.7"
  img2 = "https://th.bing.com/th/id/OIP.MzUNz51AHvusRfCT9xk6cAHaEK?w=284&h=180&c=7&r=0&o=5"
  title = "Scrivi qualcosa"

  isDisabled = true
  isVisible = true
  number = 3
  color = 'red'
  nome = "ProvaPassaggio"

  cane = [
    {
      nome: "Ronzo",
      cognome: "Bellino",
      eta: "2"

    }
  ]



  onClick() {
    console.log("Ho cliccato")
  }

  onInput(event: Event) {
    console.log((<HTMLInputElement>event.target).value)
    this.title = (<HTMLInputElement>event.target).value
  }

  mandaDati(){
    this.mandaDatiE.emit(this.nome)
  }
}
