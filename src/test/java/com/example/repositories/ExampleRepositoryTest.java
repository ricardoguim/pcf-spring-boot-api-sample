package com.example.repositories;

import com.example.models.ExampleModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ExampleRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ExampleRepository exampleRepository;

    // @Test
    // public void whenFindByName_thenReturnExampleModel() {
    //     // given
    //     ExampleModel exampleModel = new ExampleModel();
    //     exampleModel.setName("test");
    //     entityManager.persist(exampleModel);
    //     entityManager.flush();

    //     // when
    //     ExampleModel found = exampleRepository.findByName(exampleModel.getName());

    //     // then
    //     assertThat(found.getName())
    //       .isEqualTo(exampleModel.getName());
    // }
}