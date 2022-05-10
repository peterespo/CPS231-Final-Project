public class Faculty extends Employee {
    String subjectName;

    public Faculty(String firstName, String lastName, String idNum, String email, double balance, String employeeType, String phoneNumber, int cashAppWallet, String subjectName) {
        super(firstName, lastName, idNum, email, balance, employeeType /*phoneNumber, cashAppWallet*/);
        this.subjectName = subjectName;
    }

    public void setSubject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubject() {
        return subjectName;
    }

}