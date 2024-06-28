package maktab.uz.demo.service.Impl;


import maktab.uz.demo.entity.Tugarak;
import maktab.uz.demo.repository.TugarakRepository;
import maktab.uz.demo.service.TugarakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TugarakServiceImpl implements TugarakService {

    @Autowired
    TugarakRepository tugarakRepository;




    @Override
    public Page<Tugarak> findAllByFanContainsIgnoreCaseOrUqituvchiContainsIgnoreCaseOrId(String key, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Tugarak> getAll(Pageable pageable) {
        return tugarakRepository.findAll(pageable);
    }

    @Override
    public Tugarak create(Tugarak data) {
        return tugarakRepository.save(data);
    }

    @Override
    public Tugarak update(Tugarak data) {
        return tugarakRepository.save(data);
    }

    @Override
    public void delete(Tugarak data) {
   tugarakRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        tugarakRepository.deleteById(id);

    }
}
