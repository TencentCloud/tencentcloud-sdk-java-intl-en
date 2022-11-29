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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultServerCertInfo extends AbstractModel{

    /**
    * ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Type of the certificate. Values:
<li>`default`: Default certificate;</li>
<li>`upload`: Custom certificate;</li>
<li>`managed`: Tencent Cloud-managed certificate.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Time when the certificate takes effect.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * Common name of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CommonName")
    @Expose
    private String CommonName;

    /**
    * Domain names added to the SAN certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * Deployment status. Values:
<li>`processing`: Deployment in progress</li>
<li>`deployed`: Deployed</li>
<li>`failed`: Deployment failed</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Failure description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Certificate algorithm.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
     * Get ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertId ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertId ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Alias Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Alias Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Type of the certificate. Values:
<li>`default`: Default certificate;</li>
<li>`upload`: Custom certificate;</li>
<li>`managed`: Tencent Cloud-managed certificate.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type of the certificate. Values:
<li>`default`: Default certificate;</li>
<li>`upload`: Custom certificate;</li>
<li>`managed`: Tencent Cloud-managed certificate.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the certificate. Values:
<li>`default`: Default certificate;</li>
<li>`upload`: Custom certificate;</li>
<li>`managed`: Tencent Cloud-managed certificate.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type of the certificate. Values:
<li>`default`: Default certificate;</li>
<li>`upload`: Custom certificate;</li>
<li>`managed`: Tencent Cloud-managed certificate.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Time when the certificate takes effect.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectiveTime Time when the certificate takes effect.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Time when the certificate takes effect.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectiveTime Time when the certificate takes effect.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get Common name of the certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CommonName Common name of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCommonName() {
        return this.CommonName;
    }

    /**
     * Set Common name of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CommonName Common name of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCommonName(String CommonName) {
        this.CommonName = CommonName;
    }

    /**
     * Get Domain names added to the SAN certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubjectAltName Domain names added to the SAN certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set Domain names added to the SAN certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubjectAltName Domain names added to the SAN certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get Deployment status. Values:
<li>`processing`: Deployment in progress</li>
<li>`deployed`: Deployed</li>
<li>`failed`: Deployment failed</li>
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Status Deployment status. Values:
<li>`processing`: Deployment in progress</li>
<li>`deployed`: Deployed</li>
<li>`failed`: Deployment failed</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Deployment status. Values:
<li>`processing`: Deployment in progress</li>
<li>`deployed`: Deployed</li>
<li>`failed`: Deployment failed</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Status Deployment status. Values:
<li>`processing`: Deployment in progress</li>
<li>`deployed`: Deployed</li>
<li>`failed`: Deployment failed</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Failure description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Failure description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Failure description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Failure description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Certificate algorithm.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SignAlgo Certificate algorithm.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set Certificate algorithm.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SignAlgo Certificate algorithm.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSignAlgo(String SignAlgo) {
        this.SignAlgo = SignAlgo;
    }

    public DefaultServerCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultServerCertInfo(DefaultServerCertInfo source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.CommonName != null) {
            this.CommonName = new String(source.CommonName);
        }
        if (source.SubjectAltName != null) {
            this.SubjectAltName = new String[source.SubjectAltName.length];
            for (int i = 0; i < source.SubjectAltName.length; i++) {
                this.SubjectAltName[i] = new String(source.SubjectAltName[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.SignAlgo != null) {
            this.SignAlgo = new String(source.SignAlgo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "CommonName", this.CommonName);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "SignAlgo", this.SignAlgo);

    }
}

