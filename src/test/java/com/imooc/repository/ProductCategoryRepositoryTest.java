package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
  @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void saveOneTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategory_name("aaa");
        productCategory.setCategory_type(111);
        repository.save(productCategory);
    }

  @Test
  public void findOneTest(){
      ProductCategory productCategory = repository.getOne(1);
      System.out.println(productCategory);
  }
}