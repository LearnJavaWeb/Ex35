package thinhluffy.com.ex35.service;

import thinhluffy.com.ex35.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
