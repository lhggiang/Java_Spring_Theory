package com.hoanggiang.demo.repository;

import com.hoanggiang.demo.entity.SinhVien;

import java.util.List;

public interface ISinhVien {
     void createStudent(SinhVien sinhVien);
     SinhVien getSVById(int id);
     void deleteStudent(int id);
     List<SinhVien> getSV();
     void updateStudent(SinhVien sinhvien);
     void updateAllName();
}
