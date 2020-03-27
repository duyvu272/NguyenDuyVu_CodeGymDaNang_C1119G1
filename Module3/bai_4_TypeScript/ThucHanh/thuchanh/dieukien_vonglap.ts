// let count = 50;
// if (count > 0) {
//     count--;
// } else {
//     count = 0;
// }
// console.log(count);

// loop
// console.log("for loop");
//
// const keys = "abcdef";
// for (let idx = 0; idx < keys.length; ++idx) {
//     console.log(keys[idx]);
// }

const keys = "abcdef";
console.log("while loop");
let idx = 0;
while (idx < keys.length) {
    console.log(keys[idx]);
    ++idx;
}

console.log("do-while loop");

idx = 0;
do {
    console.log(keys[idx]);
    ++idx;
} while (idx < keys.length);

console.log("for-of loop");
for (const item of keys) {
    console.log(item);
}

console.log("for-in loop");
const user = {
    name: 'Bob',
    age: 55
};
for (const key in user) {
    console.log(`${key}: ${user[key]}`);
}


class User1 {
    public name:string;
    public age:number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }

}
const list : Array<User1> = [];
list.push(new User1('Vu',30));
list.push(new User1('BatMan',30));
list.push(new User1('SpiderMan',30));
list.push(new User1('Thor',30));


console.log("loop list object")



 for(const user1 in list){
     console.log(`${user1}: ${list[user1].name}`
     +" "+ "age : " + `${list[user1].age}`);
 }