import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAboutUsPage.class,
        TestContactPage.class,
        TestFirstPage.class,
        TestHomePage.class,
        TestLoginLogout.class,
        TestSignUp.class
})

public class AllTests {
}
