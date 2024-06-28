package maktab.uz.demo.service.Impl;


import maktab.uz.demo.entity.Fan;
import maktab.uz.demo.repository.FanRepository;
import maktab.uz.demo.service.FanSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FanServiceImpl implements FanSerive {

    @Autowired
    FanRepository fanRepository;

    @Override
    public Page<Fan> findAllByNomContainsIgnoreCaseOrId(String key, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Fan> getAll(Pageable pageable) {
        return fanRepository.findAll(pageable);
    }

    @Override
    public Fan create(Fan data) {
        return fanRepository.save(data);
    }

    @Override
    public Fan update(Fan data) {
        return fanRepository.save(data);
    }

    @Override
    public void delete(Fan data) {
    fanRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        fanRepository.deleteById(id);

    }
}
