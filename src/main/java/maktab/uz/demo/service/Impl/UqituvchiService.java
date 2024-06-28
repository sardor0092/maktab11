package maktab.uz.demo.service.Impl;


import maktab.uz.demo.entity.Uqituvchi;
import maktab.uz.demo.entity.Uquvchi;
import maktab.uz.demo.repository.UqituvchiRepository;
import maktab.uz.demo.service.UquvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UqituvchiService implements maktab.uz.demo.service.UqituvchiService {



    @Autowired
    UqituvchiRepository  uqituvchiRepository;


    @Override
    public Page<Uqituvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrId(String key, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Uqituvchi> getAll(Pageable pageable) {
        return uqituvchiRepository.findAll(pageable);
    }

    @Override
    public Uqituvchi create(Uqituvchi data) {
        return uqituvchiRepository.save(data);
    }

    @Override
    public Uqituvchi update(Uqituvchi data) {
        return  uqituvchiRepository.save(data);
    }

    @Override
    public void delete(Uqituvchi data) {
        uqituvchiRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        uqituvchiRepository.deleteById(id);

    }
}
