package cloud.winterboots.product;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Singleton
public class ProductService {

    private final Set<Product> products = new LinkedHashSet<>(Arrays.asList(
            new Product("Hucule"),
            new Product("Superboots")
    ));

    public Set<Product> getAll() {
        return Collections.unmodifiableSet(products);
    }

}