"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(name) {
        this.name = name;
    }
    Car.prototype.getCar = function () {
        return "Car is " + this.name;
    };
    Car.iAmStatic = function () {
        console.log("Hello I am static..............");
    };
    return Car;
}());
exports.Car = Car;
