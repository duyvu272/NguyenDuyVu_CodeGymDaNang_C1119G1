function Employee() {
    this.nameEmployee = "";
    this.email = "";
    this.id = "";
    this.birthday = "";
    this.phoneNumber = 0;
    this.education = "";
    this.position = 0;
    this.salary = 0;
    this.listEmpolyee = [];

    this.thisNameEmployee = function () {
        return this.nameEmployee;
    };
    this.setNameEmployee = function (name) {
        this.nameEmployee = name;
    };
    this.getEmail = function () {
        return this.email;
    };
    this.setEmail = function (email) {
        this.email = email;
    };
    this.getId = function () {
        return this.id;
    };
    this.setId = function (id) {
        this.id = id;
    };
    this.getPhoneNumber = function () {
        return this.phoneNumber;
    };
    this.setPhoneNumber = function (phoneNumber) {
        this.phoneNumber = phoneNumber;
    };
    this.getBirthDay = function () {
        return this.birthday;
    };
    this.setBirthDay = function (birthday) {
        this.birthday =birthday;
    };
    this.getEducation = function () {
        return this.education;
    };
    this.setEducation = function (education) {
        this.education = education;
    };
    this.getPosition =function () {
        return this.position;
    };
    this.setPosition = function (position) {
        this.position = position;
    };
    this.salaryTotal = function () {
        if(this.position==="Manager")
            this.setSalary(this.getSalary() * 500);
            else
                if(this.position ==="Sale")
                    this.setSalary(this.getSalary()*300);
                else if(this.position ==="Maketing")
                    this.setSalary(this.getSalary()*200);

    }
    this.addNewEmployee = function () {

    }

}