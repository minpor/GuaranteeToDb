package ru.minpor.guarantee.service;

import ru.minpor.guarantee.entity.Guarantee;

/**
 * Created by Daniil on 23.04.2016.
 */
public interface GuaranteeService {

    Guarantee addGuarantee();
    Guarantee getByName(String name);
    void truncate();
}
