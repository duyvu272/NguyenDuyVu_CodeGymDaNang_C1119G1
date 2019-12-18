function Customer() {

    this.getNameCustomer = function () {
        return this.nameCustomer;
    };
    this.setNameCustomer = function (name) {
        this.nameCustomer = name;
    };
    this.getAddressCustomer = function () {
        return this.addressCustomer;
    }
    this.setAddressCustomer = function (address) {
        this.addressCustomer = address;
    }

}