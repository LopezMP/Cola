import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class QueueTest {
    private QueueImpl q;
    @Before
    public void init () {
        q = new QueueImpl(10);;
    }

    @After
    public void tearDown () {

        q = null;

    }

    @Test
    public void testSize() throws Exception {
        int a = 0, b = 1, c = 2, d = 3;

        q.push(a);

        q.push(b);
        q.push(c);
        //Le decimos que lo que esperamos es que salga 3 y le ponemos la función que le devuelve el size.

        Assert.assertEquals(3,q.Size());

    }

}
