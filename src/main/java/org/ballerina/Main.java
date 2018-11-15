package org.ballerina;

import org.apache.commons.lang3.Validate;
import spiffe.api.svid.Fetcher;
import spiffe.api.svid.Workload;
import spiffe.api.svid.X509SvidFetcher;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.setProperty("spiffe.endpoint.socket", "127.0.0");
        Consumer<List<Workload.X509SVID>> certificateUpdater = certs -> {
            System.out.println("=========");
            Validate.isTrue(certs.size() == 1, "Multiple identities is not supported");
            Workload.X509SVID svid  = certs.get(0);
            System.out.printf(svid.toString());
        };
        Fetcher<List<Workload.X509SVID>> svidFetcher = new X509SvidFetcher();
        System.out.println("===================");
        svidFetcher.registerListener(certificateUpdater);
        System.out.println("something");
    }
}
