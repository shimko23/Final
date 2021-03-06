package com.company;
/* Classame : FinalTest
 *
 * Date: 23.06.2020
 * @author: Vitaliy
 * @version: 1.1
 * */

import java.util.Objects;

public class Company {

        // parent for this company nullable, when there is no parent for this company
        private int id;
        private Company parent;
        private int employeesCount;


        public Company(int id, Company parent, int employeesCount) {
            this.parent = parent;
            this.employeesCount = employeesCount;
            this.id = id;
        }

        public Company getParent() {
            return parent;
        }

        public void setParent(Company parent) {
            this.parent = parent;
        }

        public int getEmployeesCount() {
            return employeesCount;
        }

        public void setEmployeesCount(int employeesCount) {
            this.employeesCount = employeesCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "parent=" + parent +
                    ", employeesCount=" + employeesCount +
                    ", id=" + id +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

