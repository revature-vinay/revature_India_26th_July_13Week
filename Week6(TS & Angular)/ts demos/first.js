"use strict";
exports.__esModule = true;
exports.Myclass = void 0;
var car_1 = require("./car");
var serviceimpl_1 = require("./serviceimpl");
console.log("Hello and welcome to TS");
var x;
x = 100;
console.log("x = " + x);
function helloFunction() {
    console.log("Hello from TS function");
}
helloFunction();
var Myclass = /** @class */ (function () {
    function Myclass() {
        console.log("Heelo from constructor");
    }
    Myclass.prototype.helloMethod = function () {
        console.log("heyy");
    };
    return Myclass;
}());
exports.Myclass = Myclass;
var c = new Myclass();
c.helloMethod();
var car = new car_1.Car("BMW");
console.log(car.getCar());
car_1.Car.iAmStatic();
var service = new serviceimpl_1.MyServiceImpl();
service.hello1();
console.log(service.hello2());
