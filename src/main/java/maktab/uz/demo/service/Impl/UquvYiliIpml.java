package maktab.uz.demo.service.Impl;


import maktab.uz.demo.entity.UquvYili;
import maktab.uz.demo.repository.UquvYiliRepository;
import maktab.uz.demo.service.UquvYiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UquvYiliIpml implements UquvYiliService {

    @Autowired
    UquvYiliRepository  uquvYiliRepository;





    @Override
    public Page<UquvYili> getAll(Pageable pageable) {
        return uquvYiliRepository.findAll(pageable);
    }

    @Override
    public UquvYili create(UquvYili data) {
        return uquvYiliRepository.save(data);
    }

    @Override
    public UquvYili update(UquvYili data) {
        return uquvYiliRepository.save(data);
    }

    @Override
    public void delete(UquvYili data) {
        uquvYiliRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        uquvYiliRepository.deleteById(id);

    }
}
