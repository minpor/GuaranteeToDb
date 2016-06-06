package ru.minpor.guarantee.utils;

import ru.minpor.guarantee.entity.Guarantee;
import ru.minpor.jaxb.Export;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class GuaranteeUtil {

    public static Guarantee createGuarantee() {

        Guarantee guarantee = new Guarantee();
        File file = new File("src/main/resources/fcsGaranteeInfo_0470111300000114000504_44545.xml") ;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Export.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Export bankGuaranteeType = (Export) jaxbUnmarshaller.unmarshal(file);

            guarantee.setId(bankGuaranteeType.getBankGuarantee().getId());
            guarantee.setDocNumber(bankGuaranteeType.getBankGuarantee().getDocNumber());
            guarantee.setRegNumber(bankGuaranteeType.getBankGuarantee().getRegNumber());


        }catch (JAXBException e) {
            e.printStackTrace();
        }

        return guarantee;
    }

}
