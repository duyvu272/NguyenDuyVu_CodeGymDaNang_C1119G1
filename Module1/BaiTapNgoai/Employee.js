function Employee() {
    this.getWorkDay = function () {
       return this.workdays;
    };
    this.getSalary = function () {
        return this.salary*this.workdays;
    };
    this.setWorkDay = function (workDay) {
        this.workdays = workDay;
    }
    this.setSalary = function (salary) {
        this.salary = salary;
    }


}