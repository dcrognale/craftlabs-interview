package configuration;

import com.example.craftLabstest.repository.IProductRepository;
import com.example.craftLabstest.repository.impl.ProductRepositoryMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CraftLabsTestConfiguration {

  @Bean
  public IProductRepository ProductRepositoryMockBean(){
    return new ProductRepositoryMock();
  }
}
