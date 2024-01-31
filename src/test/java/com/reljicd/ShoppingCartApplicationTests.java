//package com.reljicd;

//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ShoppingCartApplicationTests {

//	@Test
//	public void contextLoads() {
//	}

//}

//change the above file with the below file for checking
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingCartApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void contextLoads() {
        // Test if the Spring application context loads successfully
    }

    @Test
    public void productServiceNotNull() {
        assertNotNull(productService);
    }

    @Test
    public void getAllProducts() {
        List<Product> products = productService.getAllProducts();
        assertNotNull(products);
        assertTrue(products.size() > 0);
    }

    // Add more test methods as needed to cover various functionalities of your application
}
