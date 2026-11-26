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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultServerCertInfo extends AbstractModel {

    /**
    * Server certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Certificate remark name.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Certificate type. Valid values:
<li>`default`: Default certificate;</li>
<li>`upload`: External certificate;</li>
<li>`managed`: Tencent Cloud managed certificate.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Certificate expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Certificate Validation Time.
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * Certificate common name.
    */
    @SerializedName("CommonName")
    @Expose
    private String CommonName;

    /**
    * SAN domain of the certificate.
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * Deployment status. Valid values:
<li>processing: under deployment;</li>
<li>deployed: deployed;</li>
<li>failed: Deployment failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * If the Status is failed, this field returns the failure reason.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Certificate algorithm.
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
     * Get Server certificate ID. 
     * @return CertId Server certificate ID.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Server certificate ID.
     * @param CertId Server certificate ID.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Certificate remark name. 
     * @return Alias Certificate remark name.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Certificate remark name.
     * @param Alias Certificate remark name.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Certificate type. Valid values:
<li>`default`: Default certificate;</li>
<li>`upload`: External certificate;</li>
<li>`managed`: Tencent Cloud managed certificate.</li> 
     * @return Type Certificate type. Valid values:
<li>`default`: Default certificate;</li>
<li>`upload`: External certificate;</li>
<li>`managed`: Tencent Cloud managed certificate.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Certificate type. Valid values:
<li>`default`: Default certificate;</li>
<li>`upload`: External certificate;</li>
<li>`managed`: Tencent Cloud managed certificate.</li>
     * @param Type Certificate type. Valid values:
<li>`default`: Default certificate;</li>
<li>`upload`: External certificate;</li>
<li>`managed`: Tencent Cloud managed certificate.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Certificate expiration time. 
     * @return ExpireTime Certificate expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Certificate expiration time.
     * @param ExpireTime Certificate expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Certificate Validation Time. 
     * @return EffectiveTime Certificate Validation Time.
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Certificate Validation Time.
     * @param EffectiveTime Certificate Validation Time.
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get Certificate common name. 
     * @return CommonName Certificate common name.
     */
    public String getCommonName() {
        return this.CommonName;
    }

    /**
     * Set Certificate common name.
     * @param CommonName Certificate common name.
     */
    public void setCommonName(String CommonName) {
        this.CommonName = CommonName;
    }

    /**
     * Get SAN domain of the certificate. 
     * @return SubjectAltName SAN domain of the certificate.
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set SAN domain of the certificate.
     * @param SubjectAltName SAN domain of the certificate.
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get Deployment status. Valid values:
<li>processing: under deployment;</li>
<li>deployed: deployed;</li>
<li>failed: Deployment failed.</li> 
     * @return Status Deployment status. Valid values:
<li>processing: under deployment;</li>
<li>deployed: deployed;</li>
<li>failed: Deployment failed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Deployment status. Valid values:
<li>processing: under deployment;</li>
<li>deployed: deployed;</li>
<li>failed: Deployment failed.</li>
     * @param Status Deployment status. Valid values:
<li>processing: under deployment;</li>
<li>deployed: deployed;</li>
<li>failed: Deployment failed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get If the Status is failed, this field returns the failure reason. 
     * @return Message If the Status is failed, this field returns the failure reason.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set If the Status is failed, this field returns the failure reason.
     * @param Message If the Status is failed, this field returns the failure reason.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Certificate algorithm. 
     * @return SignAlgo Certificate algorithm.
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set Certificate algorithm.
     * @param SignAlgo Certificate algorithm.
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

