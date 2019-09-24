package com.didi.aoe.extensions.parcel.kryo;

import org.junit.Before;
import org.junit.Test;

/**
 * @author noctis
 * @since 1.1.0
 */
public class KryoParcelImplTest {
    private KryoParcelImpl kryoParceler;

    @Before
    public void setUp() throws Exception {
        kryoParceler = new KryoParcelImpl();
    }

    @Test
    public void obj2Byte() {
        byte[] result = kryoParceler.obj2Byte(new Integer(123456));
        System.out.println(result.length);
    }

    @Test
    public void byte2Obj() {
        byte[] result = kryoParceler.obj2Byte(new Integer(123456));
        int origin = (int) kryoParceler.byte2Obj(result);
        System.out.println(origin);
    }


}