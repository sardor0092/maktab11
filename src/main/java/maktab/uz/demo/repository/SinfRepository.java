package maktab.uz.demo.repository;


import maktab.uz.demo.entity.Fan;
import maktab.uz.demo.entity.Sinf;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinfRepository extends JpaRepository<Sinf , Long> {

    Page<Sinf> findAllByNomContainsIgnoreCaseOrId(String key , Long id , Pageable pageable);



}
