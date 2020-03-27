let customer = {
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
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }
    toString() {
        return `(x: ${this.x}, y: ${this.y})`;
    }
}
class Rect extends Shape {
    constructor(x, y, width, height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    area() {
        return this.width * this.height;
    }
}
const rect = new Rect(5, 5, 10, 20);
console.log(rect.toString());
console.log(rect.area());
class User {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}
const list = [];
let customer1 = {
    name: 'Vu',
    age: 30
};
let customer2 = {
    name: 'BatMan',
    age: 30
};
let customer3 = {
    name: 'SpiderMan',
    age: 30
};
list.push(customer1);
list.push(customer2);
list.push(customer3);
console.log("loop list object");
console.log(list);
for (const user in list) {
    console.log(`${user}: ${list[user]}`);
}
