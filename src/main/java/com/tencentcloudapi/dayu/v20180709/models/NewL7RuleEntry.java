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

public class NewL7RuleEntry extends AbstractModel{

    /**
    * Forwarding protocol. Valid values: `http` and `https`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Forwarding domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding method. Valid values: `1` (by domain name); `2` (by IP).
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Session persistence duration, in seconds.
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * List of sources
    */
    @SerializedName("SourceList")
    @Expose
    private L4RuleSource [] SourceList;

    /**
    * Load balancing method. Valid value: `1` (weighed polling).
    */
    @SerializedName("LbType")
    @Expose
    private Long LbType;

    /**
    * Whether session persistence is enabled. Valid values: `0` (disabled) and `1` (enabled).
    */
    @SerializedName("KeepEnable")
    @Expose
    private Long KeepEnable;

    /**
    * Rule ID. This field is not required for adding a rule, but is required for modifying or deleting a rule.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Certificate source. When the forwarding protocol is HTTPS, this field must be set to `2` (Tencent Cloud managed certificate), and for HTTP protocol, it can be set to `0`.
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * When the certificate source is Tencent Cloud managed certificate, this field must be set to the ID of the managed certificate.
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * [Disused] When the certificate is an external certificate, the certificate content should be provided here. 
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * [Disused] When the certificate is an external certificate, the certificate key should be provided here. 
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * Rule description.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule status. Valid values: `0` (the rule was successfully configured), `1` (configuring the rule), `2` (rule configuration failed), `3` (deleting the rule), `5` (failed to delete rule), `6` (rule awaiting configuration), `7` (rule awaiting deletion), and `8` (rule awaiting certificate configuration).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CC protection status. Valid values: `0` (disabled) and `1` (enabled).
    */
    @SerializedName("CCStatus")
    @Expose
    private Long CCStatus;

    /**
    * CC protection status based on HTTPS. Valid values: `0` (disabled) and `1` (enabled).
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * CC protection threshold based on HTTPS.
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
    * CC protection level based on HTTPS.
    */
    @SerializedName("CCLevel")
    @Expose
    private String CCLevel;

    /**
    * Region code.
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * Anti-DDoS instance ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Anti-DDoS instance IP address.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

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
     * Get Forwarding protocol. Valid values: `http` and `https`. 
     * @return Protocol Forwarding protocol. Valid values: `http` and `https`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding protocol. Valid values: `http` and `https`.
     * @param Protocol Forwarding protocol. Valid values: `http` and `https`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Forwarding domain name. 
     * @return Domain Forwarding domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Forwarding domain name.
     * @param Domain Forwarding domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding method. Valid values: `1` (by domain name); `2` (by IP). 
     * @return SourceType Forwarding method. Valid values: `1` (by domain name); `2` (by IP).
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Forwarding method. Valid values: `1` (by domain name); `2` (by IP).
     * @param SourceType Forwarding method. Valid values: `1` (by domain name); `2` (by IP).
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Session persistence duration, in seconds. 
     * @return KeepTime Session persistence duration, in seconds.
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set Session persistence duration, in seconds.
     * @param KeepTime Session persistence duration, in seconds.
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * Get List of sources 
     * @return SourceList List of sources
     */
    public L4RuleSource [] getSourceList() {
        return this.SourceList;
    }

    /**
     * Set List of sources
     * @param SourceList List of sources
     */
    public void setSourceList(L4RuleSource [] SourceList) {
        this.SourceList = SourceList;
    }

    /**
     * Get Load balancing method. Valid value: `1` (weighed polling). 
     * @return LbType Load balancing method. Valid value: `1` (weighed polling).
     */
    public Long getLbType() {
        return this.LbType;
    }

    /**
     * Set Load balancing method. Valid value: `1` (weighed polling).
     * @param LbType Load balancing method. Valid value: `1` (weighed polling).
     */
    public void setLbType(Long LbType) {
        this.LbType = LbType;
    }

    /**
     * Get Whether session persistence is enabled. Valid values: `0` (disabled) and `1` (enabled). 
     * @return KeepEnable Whether session persistence is enabled. Valid values: `0` (disabled) and `1` (enabled).
     */
    public Long getKeepEnable() {
        return this.KeepEnable;
    }

    /**
     * Set Whether session persistence is enabled. Valid values: `0` (disabled) and `1` (enabled).
     * @param KeepEnable Whether session persistence is enabled. Valid values: `0` (disabled) and `1` (enabled).
     */
    public void setKeepEnable(Long KeepEnable) {
        this.KeepEnable = KeepEnable;
    }

    /**
     * Get Rule ID. This field is not required for adding a rule, but is required for modifying or deleting a rule. 
     * @return RuleId Rule ID. This field is not required for adding a rule, but is required for modifying or deleting a rule.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID. This field is not required for adding a rule, but is required for modifying or deleting a rule.
     * @param RuleId Rule ID. This field is not required for adding a rule, but is required for modifying or deleting a rule.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Certificate source. When the forwarding protocol is HTTPS, this field must be set to `2` (Tencent Cloud managed certificate), and for HTTP protocol, it can be set to `0`. 
     * @return CertType Certificate source. When the forwarding protocol is HTTPS, this field must be set to `2` (Tencent Cloud managed certificate), and for HTTP protocol, it can be set to `0`.
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate source. When the forwarding protocol is HTTPS, this field must be set to `2` (Tencent Cloud managed certificate), and for HTTP protocol, it can be set to `0`.
     * @param CertType Certificate source. When the forwarding protocol is HTTPS, this field must be set to `2` (Tencent Cloud managed certificate), and for HTTP protocol, it can be set to `0`.
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get When the certificate source is Tencent Cloud managed certificate, this field must be set to the ID of the managed certificate. 
     * @return SSLId When the certificate source is Tencent Cloud managed certificate, this field must be set to the ID of the managed certificate.
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set When the certificate source is Tencent Cloud managed certificate, this field must be set to the ID of the managed certificate.
     * @param SSLId When the certificate source is Tencent Cloud managed certificate, this field must be set to the ID of the managed certificate.
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get [Disused] When the certificate is an external certificate, the certificate content should be provided here.  
     * @return Cert [Disused] When the certificate is an external certificate, the certificate content should be provided here. 
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set [Disused] When the certificate is an external certificate, the certificate content should be provided here. 
     * @param Cert [Disused] When the certificate is an external certificate, the certificate content should be provided here. 
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get [Disused] When the certificate is an external certificate, the certificate key should be provided here.  
     * @return PrivateKey [Disused] When the certificate is an external certificate, the certificate key should be provided here. 
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set [Disused] When the certificate is an external certificate, the certificate key should be provided here. 
     * @param PrivateKey [Disused] When the certificate is an external certificate, the certificate key should be provided here. 
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get Rule description. 
     * @return RuleName Rule description.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule description.
     * @param RuleName Rule description.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule status. Valid values: `0` (the rule was successfully configured), `1` (configuring the rule), `2` (rule configuration failed), `3` (deleting the rule), `5` (failed to delete rule), `6` (rule awaiting configuration), `7` (rule awaiting deletion), and `8` (rule awaiting certificate configuration). 
     * @return Status Rule status. Valid values: `0` (the rule was successfully configured), `1` (configuring the rule), `2` (rule configuration failed), `3` (deleting the rule), `5` (failed to delete rule), `6` (rule awaiting configuration), `7` (rule awaiting deletion), and `8` (rule awaiting certificate configuration).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Valid values: `0` (the rule was successfully configured), `1` (configuring the rule), `2` (rule configuration failed), `3` (deleting the rule), `5` (failed to delete rule), `6` (rule awaiting configuration), `7` (rule awaiting deletion), and `8` (rule awaiting certificate configuration).
     * @param Status Rule status. Valid values: `0` (the rule was successfully configured), `1` (configuring the rule), `2` (rule configuration failed), `3` (deleting the rule), `5` (failed to delete rule), `6` (rule awaiting configuration), `7` (rule awaiting deletion), and `8` (rule awaiting certificate configuration).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CC protection status. Valid values: `0` (disabled) and `1` (enabled). 
     * @return CCStatus CC protection status. Valid values: `0` (disabled) and `1` (enabled).
     */
    public Long getCCStatus() {
        return this.CCStatus;
    }

    /**
     * Set CC protection status. Valid values: `0` (disabled) and `1` (enabled).
     * @param CCStatus CC protection status. Valid values: `0` (disabled) and `1` (enabled).
     */
    public void setCCStatus(Long CCStatus) {
        this.CCStatus = CCStatus;
    }

    /**
     * Get CC protection status based on HTTPS. Valid values: `0` (disabled) and `1` (enabled). 
     * @return CCEnable CC protection status based on HTTPS. Valid values: `0` (disabled) and `1` (enabled).
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set CC protection status based on HTTPS. Valid values: `0` (disabled) and `1` (enabled).
     * @param CCEnable CC protection status based on HTTPS. Valid values: `0` (disabled) and `1` (enabled).
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get CC protection threshold based on HTTPS. 
     * @return CCThreshold CC protection threshold based on HTTPS.
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set CC protection threshold based on HTTPS.
     * @param CCThreshold CC protection threshold based on HTTPS.
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    /**
     * Get CC protection level based on HTTPS. 
     * @return CCLevel CC protection level based on HTTPS.
     */
    public String getCCLevel() {
        return this.CCLevel;
    }

    /**
     * Set CC protection level based on HTTPS.
     * @param CCLevel CC protection level based on HTTPS.
     */
    public void setCCLevel(String CCLevel) {
        this.CCLevel = CCLevel;
    }

    /**
     * Get Region code. 
     * @return Region Region code.
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set Region code.
     * @param Region Region code.
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get Anti-DDoS instance ID. 
     * @return Id Anti-DDoS instance ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID.
     * @param Id Anti-DDoS instance ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Anti-DDoS instance IP address. 
     * @return Ip Anti-DDoS instance IP address.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Anti-DDoS instance IP address.
     * @param Ip Anti-DDoS instance IP address.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Modification time. 
     * @return ModifyTime Modification time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time.
     * @param ModifyTime Modification time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "HttpsToHttpEnable", this.HttpsToHttpEnable);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);

    }
}

