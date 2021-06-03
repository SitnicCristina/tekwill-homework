package md.tekwill.homework2505;

public class ProductionWorker extends Employee{
    int shift;//day shift=1, night shift=2
    double payHourRate;

    public ProductionWorker(){
        name = "Matvei";
        employeeID = "123-B";
        hireDate = "24/05/2021";
        shift = 1;
        payHourRate= 0.5;
    }
}
