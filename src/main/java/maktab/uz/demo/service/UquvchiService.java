package maktab.uz.demo.service;

import maktab.uz.demo.entity.Uqituvchi;
import maktab.uz.demo.entity.Uquvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UquvchiService extends GeneralService<Uquvchi ,Number> {


    Page<Uquvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrId(String ism,Pageable pageable);



}
