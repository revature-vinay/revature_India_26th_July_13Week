import { MyInterface } from "./service";

export class MyServiceImpl implements MyInterface {
    hello1() {
        console.log("heyyy from hello1")
    }
    hello2(): string {
        return "heyyyy from hello2"
    }

}