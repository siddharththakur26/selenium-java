package tests;

import common.BaseCase;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import steps.MyFirstSteps;

public class YourFirstTest extends BaseCase {
    @Steps
    MyFirstSteps myFirstStepsObj;

    @Test
    public void VerifyCricketPage()
    {
        /*Write your test method here*/
    }
}
