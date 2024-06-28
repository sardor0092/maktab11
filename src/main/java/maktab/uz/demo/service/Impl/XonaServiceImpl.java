package maktab.uz.demo.service.Impl;


import maktab.uz.demo.entity.Xona;
import maktab.uz.demo.repository.XonaRepository;
import maktab.uz.demo.service.XonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class XonaServiceImpl implements XonaService {


    @Autowired
    XonaRepository xonaRepository;


    @Override
    public Page<Xona> findAllByNomContainsIgnoreCaseOrId(String key, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Xona> getAll(Pageable pageable) {
        return xonaRepository.findAll(pageable);
    }

    @Override
    public Xona create(Xona data) {
        return xonaRepository.save(data);
    }

    @Override
    public Xona update(Xona data) {
        return xonaRepository.save(data);
    }

    @Override
    public void delete(Xona data) {
        xonaRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        xonaRepository.deleteById(id);

    }
}
