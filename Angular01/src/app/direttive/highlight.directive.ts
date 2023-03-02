import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {
  @Input() appHighlight = ''
  @Input() defaultColor=''

  constructor(private element: ElementRef) {

  }

  @HostListener('mouseenter') onMouseEnter(){
    this.cambiaColore(this.appHighlight || this.defaultColor || 'purple')
  }

  @HostListener('museleave') onMouseLeave(){
   this.cambiaColore('transparent')
  }

  cambiaColore(colore: string) {
      this.element.nativeElement.style.backgroundColor = colore
  }

}
