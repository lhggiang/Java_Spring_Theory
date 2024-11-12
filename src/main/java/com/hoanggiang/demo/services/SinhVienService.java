package com.hoanggiang.demo.services;

import com.hoanggiang.demo.entity.SinhVien;
import com.hoanggiang.demo.repository.ISinhVien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienService {
    private final ISinhVien iSinhVien;

    public SinhVienService(ISinhVien iSinhVien){
        this.iSinhVien = iSinhVien;
    }

    public void createStudent(SinhVien sinhVien){
        iSinhVien.createStudent(sinhVien);
    }

    public SinhVien getStudentById(int id){
        return iSinhVien.getSVById(id);
    }
    public void deleteStudent(int id){
        iSinhVien.deleteStudent(id);
    }

    public List<SinhVien> getSV(){
        return iSinhVien.getSV();
    }

    public void updateStudent(SinhVien sinhVien){
        iSinhVien.updateStudent(sinhVien);
    }

    public void updateName(){
        iSinhVien.updateAllName();
    }
}
