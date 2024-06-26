package maktab.uz.demo.repository;


import maktab.uz.demo.entity.Uqituvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UqituvchiRepository extends JpaRepository<Uqituvchi , Long> {
    Page<Uqituvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrId(String ism , String familiya , Long id , Pageable  pageable);


}
