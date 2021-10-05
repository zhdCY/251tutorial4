package mavenproject.tut4._251tut4;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import junit.framework.Assert;
import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalc extends TestCase {

    public void testadd(){
        Clac clac = new Clac();
        int result = clac.add(2,3);
        Assert.assertEquals(5,result);
    }

}