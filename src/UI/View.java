package UI;
import Core.Company;
import Core.Employee;
import Model.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class View implements IView{
    Scanner in;
    public View() {
        in = new Scanner(System.in);
    }
    @Override
    public String getEmployeeData(){
        System.out.print("Введите количество сотрудников для добавления: ");
        int quantity = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < quantity; i++)
        {
            System.out.print("Введите имя: ");
            sb.append(in.nextLine()).append(";");
            System.out.print("Введите фамилию: ");
            sb.append(in.nextLine()).append(";");
            System.out.print("Введите телефон: ");
            sb.append(in.nextLine()).append(";");
            System.out.print("Введите зарплату: ");
            sb.append(in.nextLine()).append(";");
        }
        return sb.toString();
    }

    @Override
    public String viewAllEmployees(ArrayList<Employee> employees){
        StringBuilder sb = new StringBuilder();
        for (Employee e: employees
        ) {
            sb.append(e).append("\n");
        }
        return sb.toString();
    }


}
