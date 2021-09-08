import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'fullname'
})
export class FullnamePipe implements PipeTransform {

  transform(value1: string, value2: string): string {
    return value1 + " " + value2;
  }

}
