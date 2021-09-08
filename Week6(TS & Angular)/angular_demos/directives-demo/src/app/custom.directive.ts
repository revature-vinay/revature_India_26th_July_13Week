import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appCustom]'
})
export class CustomDirective {

  constructor(element: ElementRef) {
    element.nativeElement.style.color = 'yellow'
  }

}
