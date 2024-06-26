package maktab.uz.demo.repository;


import maktab.uz.demo.entity.Tugarak;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TugarakRepository extends JpaRepository<Tugarak , Long> {

   Page<Tugarak> findAllByFanContainsIgnoreCaseOrUqituvchiContainsIgnoreCaseOrId(String key , String key1 , Long id, Pageable  pageable);

}
