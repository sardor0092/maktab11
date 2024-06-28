package maktab.uz.demo.service;

import maktab.uz.demo.entity.Uqituvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UqituvchiService extends GeneralService<Uqituvchi ,Number>{

    Page<Uqituvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrId(String key, Pageable pageable);

}
