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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertInfo extends AbstractModel {

    /**
    * Certificate name
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Hex sequence number of a certificate
    */
    @SerializedName("CertSN")
    @Expose
    private String CertSN;

    /**
    * Certificate issuer
    */
    @SerializedName("IssuerName")
    @Expose
    private String IssuerName;

    /**
    * Certificate subject
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Certificate creation time (timestamp in milliseconds)
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Certificate effective time (timestamp in milliseconds)
    */
    @SerializedName("EffectiveTime")
    @Expose
    private Long EffectiveTime;

    /**
    * Certificate expiration time (timestamp in milliseconds)
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * X.509 certificate content
    */
    @SerializedName("CertText")
    @Expose
    private String CertText;

    /**
     * Get Certificate name 
     * @return CertName Certificate name
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Certificate name
     * @param CertName Certificate name
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Hex sequence number of a certificate 
     * @return CertSN Hex sequence number of a certificate
     */
    public String getCertSN() {
        return this.CertSN;
    }

    /**
     * Set Hex sequence number of a certificate
     * @param CertSN Hex sequence number of a certificate
     */
    public void setCertSN(String CertSN) {
        this.CertSN = CertSN;
    }

    /**
     * Get Certificate issuer 
     * @return IssuerName Certificate issuer
     */
    public String getIssuerName() {
        return this.IssuerName;
    }

    /**
     * Set Certificate issuer
     * @param IssuerName Certificate issuer
     */
    public void setIssuerName(String IssuerName) {
        this.IssuerName = IssuerName;
    }

    /**
     * Get Certificate subject 
     * @return Subject Certificate subject
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Certificate subject
     * @param Subject Certificate subject
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get Certificate creation time (timestamp in milliseconds) 
     * @return CreateTime Certificate creation time (timestamp in milliseconds)
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Certificate creation time (timestamp in milliseconds)
     * @param CreateTime Certificate creation time (timestamp in milliseconds)
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Certificate effective time (timestamp in milliseconds) 
     * @return EffectiveTime Certificate effective time (timestamp in milliseconds)
     */
    public Long getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Certificate effective time (timestamp in milliseconds)
     * @param EffectiveTime Certificate effective time (timestamp in milliseconds)
     */
    public void setEffectiveTime(Long EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get Certificate expiration time (timestamp in milliseconds) 
     * @return ExpireTime Certificate expiration time (timestamp in milliseconds)
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Certificate expiration time (timestamp in milliseconds)
     * @param ExpireTime Certificate expiration time (timestamp in milliseconds)
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get X.509 certificate content 
     * @return CertText X.509 certificate content
     */
    public String getCertText() {
        return this.CertText;
    }

    /**
     * Set X.509 certificate content
     * @param CertText X.509 certificate content
     */
    public void setCertText(String CertText) {
        this.CertText = CertText;
    }

    public CertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertInfo(CertInfo source) {
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertSN != null) {
            this.CertSN = new String(source.CertSN);
        }
        if (source.IssuerName != null) {
            this.IssuerName = new String(source.IssuerName);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new Long(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.CertText != null) {
            this.CertText = new String(source.CertText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertSN", this.CertSN);
        this.setParamSimple(map, prefix + "IssuerName", this.IssuerName);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CertText", this.CertText);

    }
}

