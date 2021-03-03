package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

	int a, b;
    @Before
    public void before() {
        // TODO Add initializations
    	a = 3;
    	b = 5;
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
    	Assert.assertEquals(3, a);
    	Assert.assertEquals(5, b);
    }
}
