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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateL7RuleCertRequest extends AbstractModel{

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * The resource instance ID, such as the ID of an Anti-DDoS Advanced instance or the ID of an Anti-DDoS Ultimate instance.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Certificate type, which is required if the protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID.
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * [Disused] If the certificate is an external certificate, this field must be entered with the certificate content. 
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * [Disused] If the certificate is an external certificate, this field must be entered with the certificate key. 
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get The resource instance ID, such as the ID of an Anti-DDoS Advanced instance or the ID of an Anti-DDoS Ultimate instance. 
     * @return Id The resource instance ID, such as the ID of an Anti-DDoS Advanced instance or the ID of an Anti-DDoS Ultimate instance.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The resource instance ID, such as the ID of an Anti-DDoS Advanced instance or the ID of an Anti-DDoS Ultimate instance.
     * @param Id The resource instance ID, such as the ID of an Anti-DDoS Advanced instance or the ID of an Anti-DDoS Ultimate instance.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Certificate type, which is required if the protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)] 
     * @return CertType Certificate type, which is required if the protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type, which is required if the protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]
     * @param CertType Certificate type, which is required if the protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID. 
     * @return SSLId If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID.
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID.
     * @param SSLId If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID.
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get [Disused] If the certificate is an external certificate, this field must be entered with the certificate content.  
     * @return Cert [Disused] If the certificate is an external certificate, this field must be entered with the certificate content. 
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set [Disused] If the certificate is an external certificate, this field must be entered with the certificate content. 
     * @param Cert [Disused] If the certificate is an external certificate, this field must be entered with the certificate content. 
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get [Disused] If the certificate is an external certificate, this field must be entered with the certificate key.  
     * @return PrivateKey [Disused] If the certificate is an external certificate, this field must be entered with the certificate key. 
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set [Disused] If the certificate is an external certificate, this field must be entered with the certificate key. 
     * @param PrivateKey [Disused] If the certificate is an external certificate, this field must be entered with the certificate key. 
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);

    }
}

