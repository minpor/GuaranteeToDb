package ru.minpor.guarantee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.minpor.guarantee.entity.Guarantee;
import ru.minpor.guarantee.repository.GuaranteeRepository;
import ru.minpor.guarantee.service.GuaranteeService;
import ru.minpor.guarantee.utils.GuaranteeUtil;
import ru.minpor.jaxb.NotificationOKType;


@Service
public class GuaranteeServiceImpl implements GuaranteeService {

    @Autowired
    private GuaranteeRepository guaranteeRepository;

    @Override
    public Guarantee addGuarantee() {

        Guarantee saveGuarantee = guaranteeRepository.saveAndFlush(GuaranteeUtil.createGuarantee());

        return saveGuarantee;
    }

    @Override
    public Guarantee getByName(String name) {
        return guaranteeRepository.findByName(name);
    }

    @Override
    public void truncate() {
        guaranteeRepository.deleteAllInBatch();
    }


}
