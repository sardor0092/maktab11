package maktab.uz.demo.service;

import maktab.uz.demo.entity.Tugarak;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TugarakService extends GeneralService<Tugarak , Number> {

    Page<Tugarak> findAllByFanContainsIgnoreCaseOrUqituvchiContainsIgnoreCaseOrId(String key, Pageable pageable);

}
