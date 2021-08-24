export class Gender {
    constructor(code, name) {
        this.code = code;
        this.name = name;
    }

    display() {
        console.log(this.code + " : " + this.name);
    }
}

export var age = 10;