package dev.backendverse.forja.miniboss;

import org.apache.commons.codec.digest.DigestUtils;

public class MiniBossProbe {

    public static void main(String[] args) {
        String hash = DigestUtils.sha256Hex("backendverse");

        System.out.println("Hash disponível no código de teste: " + !hash.isBlank());
    }
}