package furama_resort.models.services;

public interface ICustomerService extends IService{
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
