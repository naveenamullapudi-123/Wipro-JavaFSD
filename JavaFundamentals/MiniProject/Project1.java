// Employee Information - Input & Display
class Project1
{
    public static void main(String args[])
    {
        // Check whether employee id is entered
        if(args.length != 1)
        {
            System.out.println("Please enter an employee id");
            return;
        }

        // Convert employee id from String to Integer
        int empId = Integer.parseInt(args[0]);

        // Employee IDs
        int empNo[] = {1001,1002,1003,1004,1005,1006,1007};

        // Employee Names
        String empName[] = {
            "Ashish",
            "Sushma",
            "Rahul",
            "Chahat",
            "Ranjan",
            "Suman",
            "Tanmay"
        };

        // Join Dates
        String joinDate[] = {
            "01/04/2009",
            "23/08/2012",
            "12/11/2008",
            "29/01/2013",
            "16/07/2005",
            "01/01/2000",
            "12/06/2006"
        };

        // Designation Codes
        char desCode[] = {'e','c','k','r','m','e','c'};

        // Departments
        String department[] = {
            "R&D",
            "PM",
            "Acct",
            "Front Desk",
            "Engg",
            "Manufacturing",
            "PM"
        };

        // Basic Salary
        int basic[] = {20000,30000,10000,12000,50000,23000,29000};

        // House Rent Allowance (HRA)
        int hra[] = {8000,12000,8000,6000,20000,9000,12000};

        // Income Tax (IT)
        int it[] = {3000,9000,1000,2000,20000,4400,10000};

        // Variable to store employee position
        int index = -1;

        // Search employee using employee id
        for(int i = 0; i < empNo.length; i++)
        {
            if(empNo[i] == empId)
            {
                index = i;
                break;
            }
        }

        // If employee is not found
        if(index == -1)
        {
            System.out.println("There is no employee with empid : " + empId);
            return;
        }

        // Variables for designation and DA
        String designation = "";
        int da = 0;

        // Find designation and DA using switch-case
        switch(desCode[index])
        {
            case 'e':
                designation = "Engineer";
                da = 20000;
                break;

            case 'c':
                designation = "Consultant";
                da = 32000;
                break;

            case 'k':
                designation = "Clerk";
                da = 12000;
                break;

            case 'r':
                designation = "Receptionist";
                da = 15000;
                break;

            case 'm':
                designation = "Manager";
                da = 40000;
                break;
        }

        // Calculate salary
        int salary = basic[index] + hra[index] + da - it[index];

        // Print heading
        System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\tSalary");

        // Print employee details
        System.out.println(empNo[index] + "\t" +
                           empName[index] + "\t\t" +
                           department[index] + "\t\t" +
                           designation + "\t\t" +
                           salary);
    }
}

/*Output:
java Project1 1003
Emp No	Emp Name	Department	Designation	Salary
1003	Rahul		Acct		Clerk		19000

java Project1 123
There is no employee with empid : 123
*/