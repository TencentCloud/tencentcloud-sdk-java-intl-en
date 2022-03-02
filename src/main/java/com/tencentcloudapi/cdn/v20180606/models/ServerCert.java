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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerCert extends AbstractModel{

    /**
    * Server certificate ID, which is auto-generated when the certificate is added to Tencent Cloud SSL Certificates
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Server certificate name
This is auto-generated when the certificate is being hosted by the SSL Certificate Service
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Server certificate information
This is required when uploading an external certificate, which should contain the complete certificate chain.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * Server key information
This is required when uploading an external certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * Certificate expiration time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Certificate issuance time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * Certificate remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Certificate source
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get Server certificate ID, which is auto-generated when the certificate is added to Tencent Cloud SSL Certificates
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CertId Server certificate ID, which is auto-generated when the certificate is added to Tencent Cloud SSL Certificates
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Server certificate ID, which is auto-generated when the certificate is added to Tencent Cloud SSL Certificates
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CertId Server certificate ID, which is auto-generated when the certificate is added to Tencent Cloud SSL Certificates
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Server certificate name
This is auto-generated when the certificate is being hosted by the SSL Certificate Service
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertName Server certificate name
This is auto-generated when the certificate is being hosted by the SSL Certificate Service
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Server certificate name
This is auto-generated when the certificate is being hosted by the SSL Certificate Service
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertName Server certificate name
This is auto-generated when the certificate is being hosted by the SSL Certificate Service
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Server certificate information
This is required when uploading an external certificate, which should contain the complete certificate chain.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Certificate Server certificate information
This is required when uploading an external certificate, which should contain the complete certificate chain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Server certificate information
This is required when uploading an external certificate, which should contain the complete certificate chain.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Certificate Server certificate information
This is required when uploading an external certificate, which should contain the complete certificate chain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Server key information
This is required when uploading an external certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateKey Server key information
This is required when uploading an external certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Server key information
This is required when uploading an external certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateKey Server key information
This is required when uploading an external certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get Certificate expiration time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Certificate expiration time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Certificate expiration time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Certificate expiration time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Certificate issuance time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeployTime Certificate issuance time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set Certificate issuance time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeployTime Certificate issuance time
Can be left blank when used as an input parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get Certificate remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Message Certificate remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Certificate remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Message Certificate remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Certificate source
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return From Certificate source
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Certificate source
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param From Certificate source
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFrom(String From) {
        this.From = From;
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
        if (source.From != null) {
            this.From = new String(source.From);
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
        this.setParamSimple(map, prefix + "From", this.From);

    }
}

