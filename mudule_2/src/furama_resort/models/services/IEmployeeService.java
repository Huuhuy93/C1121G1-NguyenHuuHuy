package furama_resort.models.services;

public interface IEmployeeService extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
