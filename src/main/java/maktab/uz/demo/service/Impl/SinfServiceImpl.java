package maktab.uz.demo.service.Impl;


import maktab.uz.demo.entity.Sinf;
import maktab.uz.demo.repository.SinfRepository;
import maktab.uz.demo.service.SinfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SinfServiceImpl implements SinfService {


    @Autowired
    SinfRepository sinfRepository;



    @Override
    public Page<Sinf> findAllByNomContainsIgnoreCaseOrId(String key, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Sinf> getAll(Pageable pageable) {
        return sinfRepository.findAll(pageable);
    }

    @Override
    public Sinf create(Sinf data) {
        return sinfRepository.save(data);
    }

    @Override
    public Sinf update(Sinf data) {
        return  sinfRepository.save(data);
    }

    @Override
    public void delete(Sinf data) {
        sinfRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        sinfRepository.deleteById(id);

    }
}
