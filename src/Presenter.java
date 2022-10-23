import Model.*;
import UI.IView;

public class Presenter {
    IModel m;
    IView v;

    Presenter(IModel m, IView v) {
        this.m = m;
        this.v = v;
    }

    /**
     * Создаём компанию с сотрудниками
     */
    public void clickBtn1() {

        m.setCompanyStaff(v.getEmployeeData());
    }
    /**
     * Выводим компанию в терминал
     */
    public void clickBtn2() {

        System.out.println(v.viewAllEmployees(m.getEmployeeList()));

    }
}
