/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerCert extends AbstractModel {

    /**
    * Server certificate ID, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Server certificate name, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Server certificate information, which is required when uploading your own certificate and must contain complete certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * Server key information, which is required when uploading your own certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * Certificate expiration time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Certificate issuance time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * Certificate remarks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Server certificate ID, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertId Server certificate ID, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Server certificate ID, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertId Server certificate ID, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Server certificate name, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertName Server certificate name, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Server certificate name, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertName Server certificate name, which is required if the certificate is a Tencent Cloud-hosted certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Server certificate information, which is required when uploading your own certificate and must contain complete certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Certificate Server certificate information, which is required when uploading your own certificate and must contain complete certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Server certificate information, which is required when uploading your own certificate and must contain complete certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Certificate Server certificate information, which is required when uploading your own certificate and must contain complete certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Server key information, which is required when uploading your own certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateKey Server key information, which is required when uploading your own certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Server key information, which is required when uploading your own certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateKey Server key information, which is required when uploading your own certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get Certificate expiration time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Certificate expiration time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Certificate expiration time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Certificate expiration time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Certificate issuance time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeployTime Certificate issuance time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set Certificate issuance time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeployTime Certificate issuance time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get Certificate remarks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Message Certificate remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Certificate remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Message Certificate remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ServerCert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerCert(ServerCert source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.Certificate != null) {
            this.Certificate = new String(source.Certificate);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.DeployTime != null) {
            this.DeployTime = new String(source.DeployTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

