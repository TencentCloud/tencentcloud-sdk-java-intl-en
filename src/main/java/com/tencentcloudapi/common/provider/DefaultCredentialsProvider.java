package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public class DefaultCredentialsProvider implements CredentialsProvider {
    @Override
    public Credential getCredentials() throws TencentCloudSDKException {
        Credential cred;
        try {
            cred = new EnvironmentVariableCredentialsProvider().getCredentials();
            return cred;
        } catch (TencentCloudSDKException e) {

        }
        try {
            cred = new ProfileCredentialsProvider().getCredentials();
            return cred;
        } catch (TencentCloudSDKException e) {

        }
        cred = new CvmRoleCredential();
        if (cred.getSecretId() != null && cred.getSecretKey() != null && cred.getToken() != null) {
            return cred;
        }

        cred = new OIDCRoleArnProvider().getCredentials();
        return cred;
    }
}
