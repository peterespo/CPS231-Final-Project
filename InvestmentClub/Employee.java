class Employee extends Person {
    String idNum;
    String email;
    double balance;
    String employeeType;

    public Employee(String firstName, String lastName, String idNum, String email, double balance, String employeeType) {
        super(firstName, lastName);
        this.idNum = idNum;
        this.email = email;
        this.balance = balance;
        this.employeeType = employeeType;
    }

    // Bank Account Methods

    public void deposit(double amount) {
        if (amount >= 0.0) {
            this.balance += amount;
        } else {
            System.err.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {

        if (amount >= 0.0 && amount <= balance)
            this.balance -= amount;
        else
            System.err.println("Withdrawal amount must be positive and cannot be greater than balance");
    }

    // Setters & Getters

    public void setidNumber(String idNum) {
        this.idNum = idNum;
    }

    public String getidNum() {
        return idNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    /*public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCashAppWallet(int cashAppWallet) {
        this.cashAppWallet = cashAppWallet;
    }

    public int getCashAppWallet() {
        return cashAppWallet;
    }
    
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

     public String print() {

        String Information = idNum + " : " + firstName + " " + lastName + " : " + email + " : " + balance + " : " + employeeType + " : " + phoneNumber + " : " + cashAppWallet;
        return Information;
    }

    public String getName() {
        return (firstName + " " + lastName);
    }*/
}