package hello.proxy.pureporxy.porxy;

import hello.proxy.pureporxy.porxy.code.CacheProxy;
import hello.proxy.pureporxy.porxy.code.ProxyPatternClient;
import hello.proxy.pureporxy.porxy.code.RealSubject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {


    @Test
    void noPoxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);

        client.execute();
        client.execute();
        client.execute();
    }

    @Test
    void cacheProxyTest() {

        RealSubject realSubject = new RealSubject();
        CacheProxy cacheProxy = new CacheProxy(realSubject);
        ProxyPatternClient client = new ProxyPatternClient(cacheProxy);

        client.execute();
        client.execute();
        client.execute();
    }
}
