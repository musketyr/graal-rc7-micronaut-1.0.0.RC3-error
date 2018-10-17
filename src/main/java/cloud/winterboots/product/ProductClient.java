package cloud.winterboots.product;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

import java.util.Set;

@Client("/product")
public interface ProductClient {

    @Get("/")
    public Flowable<Product> index();

}