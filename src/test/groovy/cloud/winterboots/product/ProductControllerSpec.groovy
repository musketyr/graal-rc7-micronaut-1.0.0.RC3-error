package cloud.winterboots.product

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class ProductControllerSpec extends Specification {

    @Shared @AutoCleanup EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)


    void "test index"() {
        given:
            ProductClient client = embeddedServer.applicationContext.getBean(ProductClient)
            List<Product> products = client.index().toList().blockingGet()

        expect:
            products
            products.size() == 2

    }
}
