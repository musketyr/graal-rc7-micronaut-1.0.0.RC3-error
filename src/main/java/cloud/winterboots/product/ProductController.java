package cloud.winterboots.product;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

@Controller("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Get("/")
    public Flowable<Product> index() {
        return Flowable.fromIterable(productService.getAll());
    }
}