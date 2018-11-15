package org.ballerina;

import org.apache.commons.lang3.Validate;
import spiffe.api.svid.Fetcher;
import spiffe.api.svid.Workload;
import spiffe.api.svid.X509SvidFetcher;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello World!");
        System.setProperty("spiffe.endpoint.socket", "/tmp/agent.sock");
        SpiffeSVIDManager spiffeSVIDManager = SpiffeSVIDManager.getInstance();
    }
}
