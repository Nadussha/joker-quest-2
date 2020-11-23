package com.infobip.jokerquest2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

public class KeyProviderTest {

    private static Map<String, String> KEY_RESULTS = Map.ofEntries(
            Map.entry("NqZaMGIpM7VgAGInAH99M7UnOGsnAqBgNGt6BnMsLGQnN7B4", "20354d7a-e4fe-47af-8ff6-187bca92f3f9"),
            Map.entry("B7UsLTR8MTVgADR8AH99NGN9OGssAGRgBGN4MWAsMWR5ADN6", "caa8b54a-eb5e-4134-8ae2-a3946a428ec7"),
            Map.entry("BnJbB7QsAWVgMnMqAr99LTFaODQrLGRgBnN4LGBcBnNdNGUo", "bd2cbad1-6ccf-48e3-bb92-bc9961bc011e"),
            Map.entry("BqEoNnMnNWVgLTQrMr99AnMpODUpLWtgNTEnBqBcNGV4MDIs", "b5e2cf01-8bb6-4fcd-ad88-0efb611195da")
    );

    public static Stream<String> encryptedKeySamples() {
        return KEY_RESULTS.keySet().stream();
    }

    @ParameterizedTest
    @MethodSource("encryptedKeySamples")
    public void testKeyProvider(String encryptedKey) {
        Assertions.assertEquals(KEY_RESULTS.get(encryptedKey), new KeyProvider(encryptedKey).getChatKey());
    }


}
