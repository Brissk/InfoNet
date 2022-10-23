import Core.Company;
import Model.Model;
import UI.*;

public class Program {
    public static void main(String[] args) {

        Presenter p = new Presenter(new Model(), new AutoView()); // Добавление сотрудников автоматическое
        Presenter p1 = new Presenter(new Model(), new View()); // Добавление сотрудников через сканер
        p.clickBtn1();
        p.clickBtn1();
        p.clickBtn2();
//        p1.clickBtn1();
//        p1.clickBtn2();
    }
}
