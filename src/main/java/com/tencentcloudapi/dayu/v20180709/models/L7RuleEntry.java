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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7RuleEntry extends AbstractModel {

    /**
    * Forwarding protocol. Valid values: [http, https]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Forwarding domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)]
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Session persistence duration in seconds
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * Forward list
    */
    @SerializedName("SourceList")
    @Expose
    private L4RuleSource [] SourceList;

    /**
    * Load balancing method. Valid value: [1 (weighted round robin)]
    */
    @SerializedName("LbType")
    @Expose
    private Long LbType;

    /**
    * Session persistence status. Valid values: [0 (disabled), 1 (enabled)]
    */
    @SerializedName("KeepEnable")
    @Expose
    private Long KeepEnable;

    /**
    * Rule ID, which is optional when adding a new rule but required when modifying or deleting a rule;
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Certificate source, which is required if the forwarding protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]. If the forwarding protocol is HTTP, 0 can be entered for this field
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * If the certificate is an external certificate, this field must be entered with the certificate content. (As external certificates are no longer supported, this field has been disused and does not need to be entered)
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * If the certificate is an external certificate, this field must be entered with the certificate key. (As external certificates are no longer supported, this field has been disused and does not need to be entered)
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * Rule description
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule status. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CC protection status. Valid values: [0 (disabled), 1 (enabled)]
    */
    @SerializedName("CCStatus")
    @Expose
    private Long CCStatus;

    /**
    * HTTPS CC protection status. Valid values: [0 (disabled), 1 (enabled)]
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * HTTPS CC protection threshold
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
    * HTTPS CC protection level
    */
    @SerializedName("CCLevel")
    @Expose
    private String CCLevel;

    /**
    * Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). The default value is disabled.
    */
    @SerializedName("HttpsToHttpEnable")
    @Expose
    private Long HttpsToHttpEnable;

    /**
    * Access port number.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirtualPort")
    @Expose
    private Long VirtualPort;

    /**
     * Get Forwarding protocol. Valid values: [http, https] 
     * @return Protocol Forwarding protocol. Valid values: [http, https]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding protocol. Valid values: [http, https]
     * @param Protocol Forwarding protocol. Valid values: [http, https]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Forwarding domain name 
     * @return Domain Forwarding domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Forwarding domain name
     * @param Domain Forwarding domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)] 
     * @return SourceType Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)]
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)]
     * @param SourceType Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)]
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Session persistence duration in seconds 
     * @return KeepTime Session persistence duration in seconds
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set Session persistence duration in seconds
     * @param KeepTime Session persistence duration in seconds
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * Get Forward list 
     * @return SourceList Forward list
     */
    public L4RuleSource [] getSourceList() {
        return this.SourceList;
    }

    /**
     * Set Forward list
     * @param SourceList Forward list
     */
    public void setSourceList(L4RuleSource [] SourceList) {
        this.SourceList = SourceList;
    }

    /**
     * Get Load balancing method. Valid value: [1 (weighted round robin)] 
     * @return LbType Load balancing method. Valid value: [1 (weighted round robin)]
     */
    public Long getLbType() {
        return this.LbType;
    }

    /**
     * Set Load balancing method. Valid value: [1 (weighted round robin)]
     * @param LbType Load balancing method. Valid value: [1 (weighted round robin)]
     */
    public void setLbType(Long LbType) {
        this.LbType = LbType;
    }

    /**
     * Get Session persistence status. Valid values: [0 (disabled), 1 (enabled)] 
     * @return KeepEnable Session persistence status. Valid values: [0 (disabled), 1 (enabled)]
     */
    public Long getKeepEnable() {
        return this.KeepEnable;
    }

    /**
     * Set Session persistence status. Valid values: [0 (disabled), 1 (enabled)]
     * @param KeepEnable Session persistence status. Valid values: [0 (disabled), 1 (enabled)]
     */
    public void setKeepEnable(Long KeepEnable) {
        this.KeepEnable = KeepEnable;
    }

    /**
     * Get Rule ID, which is optional when adding a new rule but required when modifying or deleting a rule; 
     * @return RuleId Rule ID, which is optional when adding a new rule but required when modifying or deleting a rule;
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID, which is optional when adding a new rule but required when modifying or deleting a rule;
     * @param RuleId Rule ID, which is optional when adding a new rule but required when modifying or deleting a rule;
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Certificate source, which is required if the forwarding protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]. If the forwarding protocol is HTTP, 0 can be entered for this field 
     * @return CertType Certificate source, which is required if the forwarding protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]. If the forwarding protocol is HTTP, 0 can be entered for this field
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate source, which is required if the forwarding protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]. If the forwarding protocol is HTTP, 0 can be entered for this field
     * @param CertType Certificate source, which is required if the forwarding protocol is HTTPS. Valid value: [2 (Tencent Cloud-hosted certificate)]. If the forwarding protocol is HTTP, 0 can be entered for this field
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID 
     * @return SSLId If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID
     * @param SSLId If the certificate is a Tencent Cloud-hosted certificate, this field must be entered with the hosted certificate ID
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get If the certificate is an external certificate, this field must be entered with the certificate content. (As external certificates are no longer supported, this field has been disused and does not need to be entered) 
     * @return Cert If the certificate is an external certificate, this field must be entered with the certificate content. (As external certificates are no longer supported, this field has been disused and does not need to be entered)
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set If the certificate is an external certificate, this field must be entered with the certificate content. (As external certificates are no longer supported, this field has been disused and does not need to be entered)
     * @param Cert If the certificate is an external certificate, this field must be entered with the certificate content. (As external certificates are no longer supported, this field has been disused and does not need to be entered)
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get If the certificate is an external certificate, this field must be entered with the certificate key. (As external certificates are no longer supported, this field has been disused and does not need to be entered) 
     * @return PrivateKey If the certificate is an external certificate, this field must be entered with the certificate key. (As external certificates are no longer supported, this field has been disused and does not need to be entered)
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set If the certificate is an external certificate, this field must be entered with the certificate key. (As external certificates are no longer supported, this field has been disused and does not need to be entered)
     * @param PrivateKey If the certificate is an external certificate, this field must be entered with the certificate key. (As external certificates are no longer supported, this field has been disused and does not need to be entered)
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get Rule description 
     * @return RuleName Rule description
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule description
     * @param RuleName Rule description
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule status. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)] 
     * @return Status Rule status. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)]
     * @param Status Rule status. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CC protection status. Valid values: [0 (disabled), 1 (enabled)] 
     * @return CCStatus CC protection status. Valid values: [0 (disabled), 1 (enabled)]
     */
    public Long getCCStatus() {
        return this.CCStatus;
    }

    /**
     * Set CC protection status. Valid values: [0 (disabled), 1 (enabled)]
     * @param CCStatus CC protection status. Valid values: [0 (disabled), 1 (enabled)]
     */
    public void setCCStatus(Long CCStatus) {
        this.CCStatus = CCStatus;
    }

    /**
     * Get HTTPS CC protection status. Valid values: [0 (disabled), 1 (enabled)] 
     * @return CCEnable HTTPS CC protection status. Valid values: [0 (disabled), 1 (enabled)]
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set HTTPS CC protection status. Valid values: [0 (disabled), 1 (enabled)]
     * @param CCEnable HTTPS CC protection status. Valid values: [0 (disabled), 1 (enabled)]
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get HTTPS CC protection threshold 
     * @return CCThreshold HTTPS CC protection threshold
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set HTTPS CC protection threshold
     * @param CCThreshold HTTPS CC protection threshold
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    /**
     * Get HTTPS CC protection level 
     * @return CCLevel HTTPS CC protection level
     */
    public String getCCLevel() {
        return this.CCLevel;
    }

    /**
     * Set HTTPS CC protection level
     * @param CCLevel HTTPS CC protection level
     */
    public void setCCLevel(String CCLevel) {
        this.CCLevel = CCLevel;
    }

    /**
     * Get Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). The default value is disabled. 
     * @return HttpsToHttpEnable Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). The default value is disabled.
     */
    public Long getHttpsToHttpEnable() {
        return this.HttpsToHttpEnable;
    }

    /**
     * Set Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). The default value is disabled.
     * @param HttpsToHttpEnable Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). The default value is disabled.
     */
    public void setHttpsToHttpEnable(Long HttpsToHttpEnable) {
        this.HttpsToHttpEnable = HttpsToHttpEnable;
    }

    /**
     * Get Access port number.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VirtualPort Access port number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set Access port number.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VirtualPort Access port number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVirtualPort(Long VirtualPort) {
        this.VirtualPort = VirtualPort;
    }

    public L7RuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7RuleEntry(L7RuleEntry source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
        if (source.SourceList != null) {
            this.SourceList = new L4RuleSource[source.SourceList.length];
            for (int i = 0; i < source.SourceList.length; i++) {
                this.SourceList[i] = new L4RuleSource(source.SourceList[i]);
            }
        }
        if (source.LbType != null) {
            this.LbType = new Long(source.LbType);
        }
        if (source.KeepEnable != null) {
            this.KeepEnable = new Long(source.KeepEnable);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CCStatus != null) {
            this.CCStatus = new Long(source.CCStatus);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
        }
        if (source.CCThreshold != null) {
            this.CCThreshold = new Long(source.CCThreshold);
        }
        if (source.CCLevel != null) {
            this.CCLevel = new String(source.CCLevel);
        }
        if (source.HttpsToHttpEnable != null) {
            this.HttpsToHttpEnable = new Long(source.HttpsToHttpEnable);
        }
        if (source.VirtualPort != null) {
            this.VirtualPort = new Long(source.VirtualPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);
        this.setParamArrayObj(map, prefix + "SourceList.", this.SourceList);
        this.setParamSimple(map, prefix + "LbType", this.LbType);
        this.setParamSimple(map, prefix + "KeepEnable", this.KeepEnable);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CCStatus", this.CCStatus);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);
        this.setParamSimple(map, prefix + "CCLevel", this.CCLevel);
        this.setParamSimple(map, prefix + "HttpsToHttpEnable", this.HttpsToHttpEnable);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);

    }
}

