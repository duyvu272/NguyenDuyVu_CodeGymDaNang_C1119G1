let btnAddCustomer = document.getElementById("addC");
let btnShowCustomer = document.getElementById("showC");

let btnAddEmployee = document.getElementById("addE");
let btnShowEmployee = document.getElementById("showE");

let getNameCustomer = document.getElementById("name");
let getAddressCustomer = document.getElementById("address");

let getSalaryEmployee = (document.getElementById("salary"));
let getWorkDayEmployee = (document.getElementById("workDay"));

let divCustomer = document.getElementById("customer");
divCustomer.style.display = 'none';
let divEmployee = document.getElementById("employee");
divEmployee.style.display = 'none';
let divDisplayCustomer = document.getElementById("displayCus");
divDisplayCustomer.style.display = 'none';
let divDisplayEmployee = document.getElementById("displayEm");
divDisplayEmployee.style.display = 'none';
let arrListCustomer = [];
let arrListEmployee = [];



function displayInputCustomer() {
    divCustomer.style.display = 'block';
    divEmployee.style.display = 'none';
}

function displayInputEmployee() {
    divCustomer.style.display = 'none';
    divEmployee.style.display = 'block';
}

function addCustomer() {
    let customer = new Customer();
    customer.setNameCustomer(getNameCustomer.value);
    customer.setAddressCustomer(getAddressCustomer.value);
    arrListCustomer.push(customer);
    getNameCustomer.value= "";
    getAddressCustomer.value = "";

}

function addEmployee() {
    let employee = new Employee();
    employee.setWorkDay(parseInt(getWorkDayEmployee.value));
    employee.setSalary(parseInt(getSalaryEmployee.value));
    arrListEmployee.push(employee);
    alert("Add Employee success!!!");
    getWorkDayEmployee.value = "";
    getSalaryEmployee.value = "";
}
function showCustomer() {
    divDisplayCustomer.style.display = 'block';
    divDisplayEmployee.style.display = 'none';
    let str = " <table class=\"table\">\n" +
        "        <thead>\n" +
        "        <tr>\n" +
        "            <th>Name</th>\n" +
        "            <th>Address</th>\n" +
        "            <th>Action</th>\n" +
        "        </tr>\n" +
        "        </thead>"
    for (let i = 0; i < arrListCustomer.length; i++) {
        str += "       <tbody>\n" +
            "        <tr class=\"danger\">\n" +
            "            <td>" + arrListCustomer[i].getNameCustomer() + "</td>\n" +
            "            <td>" + arrListCustomer[i].getAddressCustomer() + "</td>\n" +
            "            <td><button>Remove</button></td>\n" +
            "        </tr>\n" +
            "        </tbody>"
    }
    str += " </table>";
    divDisplayCustomer.innerHTML = str;
}


function showEmployee() {
        divDisplayCustomer.style.display = 'none';
        divDisplayEmployee.style.display = 'block';

        let str = " <table class=\"table\">\n" +
            "        <thead>\n" +
            "        <tr>\n" +
            "            <th>Salary</th>\n" +
            "            <th>WorkDay</th>\n" +
            "            <th>Action</th>\n" +
            "        </tr>\n" +
            "        </thead>"
        for (let i = 0; i < arrListEmployee.length; i++) {
            str += "       <tbody>\n" +
                "        <tr class=\"danger\">\n" +
                "            <td>" + arrListEmployee[i].getSalary() + "</td>\n" +
                "            <td>" + arrListEmployee[i].getWorkDay() + "</td>\n" +
                "            <td><button>Remove</button></td>\n" +
                "        </tr>\n" +
                "        </tbody>"
        }
        str += " </table>";
        divDisplayEmployee.innerHTML = str;

}
