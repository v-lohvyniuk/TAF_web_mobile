package support;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestBase {

    protected Injector injector = Guice.createInjector(new AbstractModule() {
        @Override
        protected void configure() {

        }
    });

    @BeforeAll
    public void createInjector(){
        injector.injectMembers(this);
    }
}
