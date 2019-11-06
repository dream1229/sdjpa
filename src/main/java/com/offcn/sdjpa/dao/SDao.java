package com.offcn.sdjpa.dao;

        import com.offcn.sdjpa.entity.Student;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface SDao extends JpaRepository<Student,Integer> {
}
