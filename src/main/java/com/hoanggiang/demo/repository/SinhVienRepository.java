package com.hoanggiang.demo.repository;

import com.hoanggiang.demo.entity.SinhVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SinhVienRepository implements ISinhVien{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void createStudent(SinhVien sinhVien) {
        entityManager.persist(sinhVien);
    }

    @Override
    public SinhVien getSVById(int id) {
        return entityManager.find(SinhVien.class,id);
    }

    @Transactional
    @Override
    public void deleteStudent(int id) {
//        entityManager.remove(getSVById(id));
        String sql = "delete from SinhVien s where s.id = :id ";
        Query query = entityManager.createQuery(sql);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public List<SinhVien> getSV() {
        String sql = "from SinhVien";
        TypedQuery<SinhVien> query = entityManager.createQuery(sql,SinhVien.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateStudent(SinhVien sinhvien) {
        entityManager.merge(sinhvien);
    }

    @Override
    @Transactional
    public void updateAllName() {
        String sql = "update SinhVien s set s.ten = :ten";
        Query query = entityManager.createQuery(sql);
        query.setParameter("ten", "Hoang Giang");
        query.executeUpdate();
    }
}
