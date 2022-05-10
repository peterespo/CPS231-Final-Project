class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getFirstName() {
        return firstName;
    }
 
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getLastName() {
        return lastName;
    }
}