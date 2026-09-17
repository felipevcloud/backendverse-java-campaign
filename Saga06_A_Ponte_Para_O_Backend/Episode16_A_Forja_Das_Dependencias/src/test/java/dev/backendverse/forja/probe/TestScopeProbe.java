package dev.backendverse.forja.probe;

import org.apache.commons.codec.digest.DigestUtils;

public class TestScopeProbe {

    public static String gerarHash(String texto) {
        return DigestUtils.sha256Hex(texto);
    }
}