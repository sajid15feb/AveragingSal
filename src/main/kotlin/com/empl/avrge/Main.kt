package com.empl.avrge

fun main(args: Array<String>) {
    val employees = arrayListOf<Employee>()
    employees.add(Employee("Ashish", "A", "IT", "Pune", "Software Engineer", "10000".toDouble()))
    employees.add( Employee("Amit", "R", "HR", "Pune", "Recruiter",  "12000".toDouble()))
    employees.add( Employee("Ramesh", "D", "HR", "Pune", "Senior Recruiter",  "14000".toDouble()))
    employees.add( Employee("Jaya", "S", "IT", "Pune", "Tech Lead",  "15000".toDouble()))
    employees.add( Employee("Smita", "M", "IT", "Bangalore", "Recruiter",  "16000".toDouble()))
    employees.add( Employee("Umesh", "A", "IT", "Bangalore", "Software Engineer",  "12000".toDouble()))
    employees.add( Employee("Pooja", "R", "HR", "Bangalore", "Software Engineer",  "12000".toDouble()))
    employees.add( Employee("Ramesh", "D", "HR", "Pune", "Recruiter",  "16000".toDouble()))
    employees.add( Employee("Bobby", "S", "IT", "Bangalore", "Tech Lead",  "20000".toDouble()))
    employees.add( Employee("Vipul", "M", "IT", "Bangalore", "Software Engineer",  "14000".toDouble()))
    FindAverageSalaryApp().findAverageSalary(employees)
}