package com.tencentcloudapi.integration.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.provider.ProfileCredentialsProvider;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class ProfileCredentialsProviderTest {

    @Test
    public void testGetCredentials() throws Exception {
        Path tempHomeDir = Files.createTempDirectory("tencentcloud-test-home");
        Path credentialsDir = tempHomeDir.resolve(".tencentcloud");
        Files.createDirectories(credentialsDir);
        Path credentialsFile = credentialsDir.resolve("credentials");

        String originalUserHome = System.getProperty("user.home");

        try {
            System.setProperty("user.home", tempHomeDir.toString());

            String configContent = "[default]\n" +
                    "secret_id = secret_id_test\n" +
                    "secret_key = secret_key_test";
            Files.write(credentialsFile, configContent.getBytes());

            ProfileCredentialsProvider provider = new ProfileCredentialsProvider();
            Credential cred = provider.getCredentials().getSnapshot();

            assertEquals("secret_id_test", cred.getSecretId());
            assertEquals("secret_key_test", cred.getSecretKey());

        } finally {
            if (originalUserHome != null) {
                System.setProperty("user.home", originalUserHome);
            }

            Files.deleteIfExists(credentialsFile);
            Files.deleteIfExists(credentialsDir);
            Files.deleteIfExists(tempHomeDir);
        }
    }
}
