package com.hoanggiang.demo.controllers;

import com.hoanggiang.demo.entity.SinhVien;
import com.hoanggiang.demo.services.SinhVienService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private final SinhVienService sinhVienService;

    public StudentController(SinhVienService sinhVienService) {
        this.sinhVienService = sinhVienService;
    }

    @PostMapping("/createStudent")
    public void createStudent(@RequestBody SinhVien sinhVien){
        sinhVienService.createStudent(sinhVien);
    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        return ResponseEntity.ok().body(sinhVienService.getStudentById(id));
    }
    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        sinhVienService.deleteStudent(id);
        return ResponseEntity.ok().body("Delete Successfully");
    }

    @GetMapping("/getStudent")
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok().body(sinhVienService.getSV());
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<?> updateStudent(@RequestBody SinhVien sinhVien){
        sinhVienService.updateStudent(sinhVien);
        return ResponseEntity.ok().body("update successfully");
    }

    @PutMapping("/updateName")
    public ResponseEntity<?> updateName(){
        sinhVienService.updateName();
        return ResponseEntity.ok().body("update successfully");
    }
}
