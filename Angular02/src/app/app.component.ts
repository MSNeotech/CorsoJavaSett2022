import { Component, ViewChild, ElementRef, OnInit, AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, AfterViewInit {

  title = 'Angular02';

  cani = [
    { nome: "Fido", eta: 10, colore: 'red' },
    { nome: "Alex", eta: 5, colore: 'yellow' },
    { nome: "Max", eta: 2, colore: 'black' },
    { nome: "Milo", eta: 14, colore: 'green' },
  ]

  @ViewChild('inputSaluti') valoreInput!: ElementRef<HTMLInputElement>

  riceviDatiEvent(value: any) {
    console.log(value)

  }

  ngOnInit(): void {
    console.log('ngOnInit')
    console.log(this.valoreInput)
  }
  ngAfterViewInit(): void {
    console.log('ngAfterViewInit')
    console.log(this.valoreInput)
  }

  onClick(){
    console.log(this.valoreInput.nativeElement.value)
  }
}
