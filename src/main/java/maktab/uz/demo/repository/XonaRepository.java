package maktab.uz.demo.repository;

import maktab.uz.demo.entity.Xona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XonaRepository extends JpaRepository<Xona , Long> {
    Page<Xona> findAllByNomContainsIgnoreCaseOrId(String key  , Long id , Pageable pageable);
}
