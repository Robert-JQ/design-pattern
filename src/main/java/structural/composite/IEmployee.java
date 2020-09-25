package structural.composite;

public interface IEmployee {

    void add(IEmployee employee);

    void remove(IEmployee employee);

    IEmployee getChild(int i);

    String getName();

    double getSalary();

    void print();

}
