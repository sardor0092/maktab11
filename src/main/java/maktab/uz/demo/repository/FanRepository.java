package maktab.uz.demo.repository;

import maktab.uz.demo.entity.Fan;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FanRepository extends JpaRepository<Fan , Long> {

    Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key , Long id , Pageable pageable);



}
