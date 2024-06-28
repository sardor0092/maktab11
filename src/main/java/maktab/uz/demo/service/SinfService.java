package maktab.uz.demo.service;

import maktab.uz.demo.entity.Sinf;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SinfService extends GeneralService<Sinf , Number> {

    Page<Sinf> findAllByNomContainsIgnoreCaseOrId(String key , Pageable pageable);


}
