package bai_thi_thuc_hanh_c1121g1.models.services;

import bai_thi_thuc_hanh_c1121g1.utils.NotFoundMedicalRecordException;

public interface IBenhAnService {
    void add(int number);
    void display();
    void delete() throws NotFoundMedicalRecordException;
}
