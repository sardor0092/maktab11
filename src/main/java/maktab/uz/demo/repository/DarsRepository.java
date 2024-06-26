package maktab.uz.demo.repository;


import maktab.uz.demo.entity.Dars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DarsRepository extends JpaRepository<Dars , Long> {



}
