export class Car {
    private name: string;
    constructor(name: string) {
        this.name = name;
    }

    getCar(): string {
        return "Car is " + this.name;
    }

    static iAmStatic(): void {
        console.log("Hello I am static..............")
    }
}