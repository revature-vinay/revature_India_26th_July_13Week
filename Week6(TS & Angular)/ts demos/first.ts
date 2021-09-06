import { Car } from "./car";
import { MyServiceImpl } from "./serviceimpl";

console.log("Hello and welcome to TS");

let x: number;
x = 100;
console.log("x = " + x);

function helloFunction() {
    console.log("Hello from TS function");
}

helloFunction();


export class Myclass {

    constructor() {
        console.log("Heelo from constructor")
    }
    helloMethod(): void {
        console.log("heyy");
    }
}

let c = new Myclass();
c.helloMethod();

let car = new Car("BMW");
console.log(car.getCar());

Car.iAmStatic();

let service = new MyServiceImpl();
service.hello1();
console.log(service.hello2());