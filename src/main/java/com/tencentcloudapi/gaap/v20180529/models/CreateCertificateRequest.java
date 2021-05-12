/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCertificateRequest extends AbstractModel{

    /**
    * Certificate type. Where:
0: basic authentication configuration;
1: indicates client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
    */
    @SerializedName("CertificateType")
    @Expose
    private Long CertificateType;

    /**
    * Certificate content. URL encoding. Where:
If the certificate type is basic authentication, enter username/password pair for this parameter. Format: 'username:password', for example, root:FSGdT. The password is `htpasswd` or `openssl`, for example, openssl passwd -crypt 123456.
When the certificate type is CA/SSL certificate, enter the certificate content for this parameter in the format of `pem`.
    */
    @SerializedName("CertificateContent")
    @Expose
    private String CertificateContent;

    /**
    * Certificate name
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * Key content. URL encoding. This parameter is required only when the certificate type is SSL certificate. The format is `pem`.
    */
    @SerializedName("CertificateKey")
    @Expose
    private String CertificateKey;

    /**
     * Get Certificate type. Where:
0: basic authentication configuration;
1: indicates client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate. 
     * @return CertificateType Certificate type. Where:
0: basic authentication configuration;
1: indicates client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
     */
    public Long getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. Where:
0: basic authentication configuration;
1: indicates client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
     * @param CertificateType Certificate type. Where:
0: basic authentication configuration;
1: indicates client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
     */
    public void setCertificateType(Long CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Certificate content. URL encoding. Where:
If the certificate type is basic authentication, enter username/password pair for this parameter. Format: 'username:password', for example, root:FSGdT. The password is `htpasswd` or `openssl`, for example, openssl passwd -crypt 123456.
When the certificate type is CA/SSL certificate, enter the certificate content for this parameter in the format of `pem`. 
     * @return CertificateContent Certificate content. URL encoding. Where:
If the certificate type is basic authentication, enter username/password pair for this parameter. Format: 'username:password', for example, root:FSGdT. The password is `htpasswd` or `openssl`, for example, openssl passwd -crypt 123456.
When the certificate type is CA/SSL certificate, enter the certificate content for this parameter in the format of `pem`.
     */
    public String getCertificateContent() {
        return this.CertificateContent;
    }

    /**
     * Set Certificate content. URL encoding. Where:
If the certificate type is basic authentication, enter username/password pair for this parameter. Format: 'username:password', for example, root:FSGdT. The password is `htpasswd` or `openssl`, for example, openssl passwd -crypt 123456.
When the certificate type is CA/SSL certificate, enter the certificate content for this parameter in the format of `pem`.
     * @param CertificateContent Certificate content. URL encoding. Where:
If the certificate type is basic authentication, enter username/password pair for this parameter. Format: 'username:password', for example, root:FSGdT. The password is `htpasswd` or `openssl`, for example, openssl passwd -crypt 123456.
When the certificate type is CA/SSL certificate, enter the certificate content for this parameter in the format of `pem`.
     */
    public void setCertificateContent(String CertificateContent) {
        this.CertificateContent = CertificateContent;
    }

    /**
     * Get Certificate name 
     * @return CertificateAlias Certificate name
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set Certificate name
     * @param CertificateAlias Certificate name
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get Key content. URL encoding. This parameter is required only when the certificate type is SSL certificate. The format is `pem`. 
     * @return CertificateKey Key content. URL encoding. This parameter is required only when the certificate type is SSL certificate. The format is `pem`.
     */
    public String getCertificateKey() {
        return this.CertificateKey;
    }

    /**
     * Set Key content. URL encoding. This parameter is required only when the certificate type is SSL certificate. The format is `pem`.
     * @param CertificateKey Key content. URL encoding. This parameter is required only when the certificate type is SSL certificate. The format is `pem`.
     */
    public void setCertificateKey(String CertificateKey) {
        this.CertificateKey = CertificateKey;
    }

    public CreateCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCertificateRequest(CreateCertificateRequest source) {
        if (source.CertificateType != null) {
            this.CertificateType = new Long(source.CertificateType);
        }
        if (source.CertificateContent != null) {
            this.CertificateContent = new String(source.CertificateContent);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
        if (source.CertificateKey != null) {
            this.CertificateKey = new String(source.CertificateKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "CertificateContent", this.CertificateContent);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "CertificateKey", this.CertificateKey);

    }
}

