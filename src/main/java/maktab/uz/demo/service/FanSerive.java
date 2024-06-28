package maktab.uz.demo.service;

import maktab.uz.demo.entity.Fan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FanSerive extends GeneralService<Fan , Number> {
    Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key  , Pageable pageable);


}
