package maktab.uz.demo.service;

import maktab.uz.demo.entity.Xona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface XonaService extends GeneralService<Xona , Number>{

    Page<Xona> findAllByNomContainsIgnoreCaseOrId(String key , Pageable pageable);

}
