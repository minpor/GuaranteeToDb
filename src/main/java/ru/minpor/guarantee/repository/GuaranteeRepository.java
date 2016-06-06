package ru.minpor.guarantee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.minpor.guarantee.entity.Guarantee;

/**
 * Created by Daniil on 23.04.2016.
 */
public interface GuaranteeRepository extends JpaRepository<Guarantee, Long> {

    @Query("select g from Guarantee g where g.docNumber = :docNumber")
    Guarantee findByName(@Param("docNumber") String docNumber);

}
