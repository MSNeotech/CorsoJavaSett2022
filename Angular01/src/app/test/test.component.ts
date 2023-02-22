import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() { }

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
  }

  img = ""
  img1 = "https://th.bing.com/th/id/OIP.F_sEEszqnPbz-rX8JzO0bwHaEo?w=289&h=180&c=7&r=0&o=5&pid=1.7"
  img2 = "https://th.bing.com/th/id/OIP.MzUNz51AHvusRfCT9xk6cAHaEK?w=284&h=180&c=7&r=0&o=5"
  title = "Scrivi qualcosa"

  isDisabled = true
  isVisible = true
  number = 3
  color = 'red'

  cane = [
    {
      nome: "Ronzo",
      cognome: "Bellino",
      eta: "2"

    }
  ]

  persone = [
    {nome:"Maria", cognome: "DeFilippo", eta: "200", isDead: true},
    {nome:"Mario", cognome: "Dario", eta: "156", isDead: false},
    {nome:"Marco", cognome: "Libro", eta: "500", isDead: true},
  ]

  onClick() {
    console.log("Ho cliccato")
  }

  onInput(event: Event) {
    console.log((<HTMLInputElement>event.target).value)
    this.title = (<HTMLInputElement>event.target).value
  }
}
