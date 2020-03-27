interface IUser {
    name: string;
    age: number
}

let customer: IUser = {
    name: 'Bob',
    age: 50
};

console.log(customer);

/* customer = {
  name: 'Anna'
}; */
/*
* Error: Type '{ name: string; }' is not assignable to type 'IUser'.
* Property 'age' is missing in type '{ name: string; }'.
*/

class Shape {
    public x: number;
    public y: number;
    constructor(x: number, y: number) {
        this.x = x;
        this.y = y;
    }
    toString(): string {
        return `(x: ${this.x}, y: ${this.y})`;
    }
}

interface IArea {
    area(): number;
}

class Rect extends Shape implements IArea {
    constructor(x: number, y: number, public width: number, public height: number) {
        super(x, y);
    }
    area(): number {
        return this.width * this.height;
    }
}

const rect = new Rect(5, 5, 10, 20);
console.log(rect.toString());
console.log(rect.area());

class User {
    public name:string;
    public age:number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }

}
const list : Array<User> = [];

let customer1 :User={
    name:'Vu',
    age:30
};
let customer2 :User={
    name:'BatMan',
    age:30
};
let customer3 :User={
    name:'SpiderMan',
    age:30
};
list.push(customer1);
list.push(customer2);
list.push(customer3);


console.log("loop list object")

console.log(list);

for(const user in list){
    console.log(`${user}: ${list[user]}`);
}