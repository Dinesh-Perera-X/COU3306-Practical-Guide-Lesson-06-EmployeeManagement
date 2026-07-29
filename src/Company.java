class Company {
    private Employee[] empArray;
    private int empNum;

    public Company(int max) {
        empArray = new Employee[max];
        empNum = 0;
    }

    public void insert(String employeeName, int age, double salary) {
        empArray[empNum] = new Employee(employeeName, age, salary);
        empNum++;
    }

    public void search(String searchName) {
        int i;
        for (i = 0; i < empNum; i++) {
            if (empArray[i].employeeName.equals(searchName)) {
                break;
            }
        }
        if (i == empNum) {
            System.out.println("Employee " + searchName + " not found.");
        } else {
            System.out.println("Employee " + searchName + " found.");
        }
    }

    public void remove(String searchName) {
        int i;
        for (i = 0; i < empNum; i++) {
            if (empArray[i].employeeName.equals(searchName)) {
                break;
            }
        }
        if (i == empNum) {
            System.out.println("Cannot delete. Employee " + searchName + " not found.");
        } else {
            for (int k = i; k < empNum - 1; k++) {
                empArray[k] = empArray[k + 1];
            }
            empNum--;
            System.out.println("Employee " + searchName + " removed successfully.");
        }
    }

    public void display() {
        System.out.println("--- Employee List ---");
        for (int i = 0; i < empNum; i++) {
            System.out.println("Name: " + empArray[i].employeeName + ", Salary: " + empArray[i].salary);
        }
    }
}
