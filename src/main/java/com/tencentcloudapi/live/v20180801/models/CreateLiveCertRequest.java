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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveCertRequest extends AbstractModel{

    /**
    * Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
Note: if the certificate type is 0, `HttpsCrt` and `HttpsKey` are required;
If the certificate type is 1, the certificate corresponding to `CloudCertId` will be used first. If `CloudCertId` is empty, `HttpsCrt` and `HttpsKey` will be used.
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * Certificate name.
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Certificate content, i.e., public key.
    */
    @SerializedName("HttpsCrt")
    @Expose
    private String HttpsCrt;

    /**
    * Private key.
    */
    @SerializedName("HttpsKey")
    @Expose
    private String HttpsKey;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Tencent Cloud-hosted certificate ID.
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
     * Get Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
Note: if the certificate type is 0, `HttpsCrt` and `HttpsKey` are required;
If the certificate type is 1, the certificate corresponding to `CloudCertId` will be used first. If `CloudCertId` is empty, `HttpsCrt` and `HttpsKey` will be used. 
     * @return CertType Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
Note: if the certificate type is 0, `HttpsCrt` and `HttpsKey` are required;
If the certificate type is 1, the certificate corresponding to `CloudCertId` will be used first. If `CloudCertId` is empty, `HttpsCrt` and `HttpsKey` will be used.
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
Note: if the certificate type is 0, `HttpsCrt` and `HttpsKey` are required;
If the certificate type is 1, the certificate corresponding to `CloudCertId` will be used first. If `CloudCertId` is empty, `HttpsCrt` and `HttpsKey` will be used.
     * @param CertType Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
Note: if the certificate type is 0, `HttpsCrt` and `HttpsKey` are required;
If the certificate type is 1, the certificate corresponding to `CloudCertId` will be used first. If `CloudCertId` is empty, `HttpsCrt` and `HttpsKey` will be used.
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get Certificate name. 
     * @return CertName Certificate name.
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Certificate name.
     * @param CertName Certificate name.
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Certificate content, i.e., public key. 
     * @return HttpsCrt Certificate content, i.e., public key.
     */
    public String getHttpsCrt() {
        return this.HttpsCrt;
    }

    /**
     * Set Certificate content, i.e., public key.
     * @param HttpsCrt Certificate content, i.e., public key.
     */
    public void setHttpsCrt(String HttpsCrt) {
        this.HttpsCrt = HttpsCrt;
    }

    /**
     * Get Private key. 
     * @return HttpsKey Private key.
     */
    public String getHttpsKey() {
        return this.HttpsKey;
    }

    /**
     * Set Private key.
     * @param HttpsKey Private key.
     */
    public void setHttpsKey(String HttpsKey) {
        this.HttpsKey = HttpsKey;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Tencent Cloud-hosted certificate ID. 
     * @return CloudCertId Tencent Cloud-hosted certificate ID.
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set Tencent Cloud-hosted certificate ID.
     * @param CloudCertId Tencent Cloud-hosted certificate ID.
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
    }

    public CreateLiveCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveCertRequest(CreateLiveCertRequest source) {
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.HttpsCrt != null) {
            this.HttpsCrt = new String(source.HttpsCrt);
        }
        if (source.HttpsKey != null) {
            this.HttpsKey = new String(source.HttpsKey);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CloudCertId != null) {
            this.CloudCertId = new String(source.CloudCertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "HttpsCrt", this.HttpsCrt);
        this.setParamSimple(map, prefix + "HttpsKey", this.HttpsKey);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);

    }
}

