package Model;

import Core.Company;
import Core.Employee;
import Core.IDCreator;
import UI.View;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Model implements IModel {
    Company company;
    IDCreator idCreator ;

    public Model() {

        company = new Company();
        idCreator = new IDCreator();
    }

    @Override
    public Company setCompanyStaff(String data) {
        String[] s = data.split(";");
//        System.out.println(s.length);
//        for (String ss: s) {
//            System.out.println(ss);
//        }
        for (int i = 0; i < s.length; i += 4) {
            Employee emp = new Employee(idCreator.getId(), s[i], s[i + 1], s[i + 2], s[i + 3]);
            company.listOfEmployees.add(emp);
        }
        return company;
    }

    @Override
    public String getCompanyStaff(Employee employee) {

        return null;
    }

    @Override
    public ArrayList<Employee> getEmployeeList() {
        return company.listOfEmployees;
    }

    @Override
    public void myImport() throws IOException, ParseException {

    }

    @Override
    public void myExport() throws IOException {

    }
}
