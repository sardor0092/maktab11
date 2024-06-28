package maktab.uz.demo.service.Impl;


import maktab.uz.demo.entity.Uqituvchi;
import maktab.uz.demo.entity.Uquvchi;
import maktab.uz.demo.repository.UquvchiRepository;
import maktab.uz.demo.service.UquvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UquvchiServiceImpl implements UquvchiService {



    @Autowired
    UquvchiRepository uquvchiRepository;


    @Override
    public Page<Uquvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrId(String ism, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Uquvchi> getAll(Pageable pageable) {
        return uquvchiRepository.findAll(pageable);
    }

    @Override
    public Uquvchi create(Uquvchi data) {
        return uquvchiRepository.save(data);
    }

    @Override
    public Uquvchi update(Uquvchi data) {
        return uquvchiRepository.save(data);
    }

    @Override
    public void delete(Uquvchi data) {
        uquvchiRepository.delete(data);

    }

    @Override
    public void deleteById(Long id) {
        uquvchiRepository.deleteById(id);

    }
}
