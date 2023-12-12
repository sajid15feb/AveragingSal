package com.empl.avrge

import java.util.stream.Collectors

internal class FindAverageSalaryApp {
        fun findAverageSalary(employees: List<Employee?>) {
            val result: Map<String, Map<String, Double>> = employees.parallelStream()
                .collect(
                    Collectors.groupingByConcurrent(
                        { obj: Employee -> obj.officeLocation } as ((Employee?) -> String)?,
                        Collectors.groupingByConcurrent({ obj: Employee -> obj.designation } as ((Employee?) -> String)?,
                            Collectors.averagingDouble { obj: Employee -> obj.salary })
                    )
                )
            result.forEach { (officeLocation, designationMap) ->
                designationMap.forEach { (designation, averageSalary) ->
                    System.out.printf(
                        "%s --> %s --> %.2f\n",
                        officeLocation,
                        designation,
                        averageSalary
                    )
                }
            }
        }
    }

internal class Employee(val name:String,val grade:String,department:String, val officeLocation: String, val designation: String, val salary: Double) {

}