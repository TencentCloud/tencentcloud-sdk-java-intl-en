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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewL7RuleEntry extends AbstractModel {

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
    * Session persistence duration, in seconds.
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * Forwarding method. Valid values: `1` (by domain name); `2` (by IP).
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * List of origins
    */
    @SerializedName("SourceList")
    @Expose
    private L4RuleSource [] SourceList;

    /**
    * Region code.
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * Resource ID.
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
    * Rule ID. This field is not required for adding a rule, but is required for modifying or deleting a rule.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule description.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Certificate source. When the forwarding protocol is HTTPS, this field must be set to `2` (Tencent Cloud managed certificate), and for HTTP protocol, it can be set to `0`.
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * When the certificate is managed by Tencent Cloud, this field must be set to the ID of the managed certificate.
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
    * Modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). It defaults to `0`.
    */
    @SerializedName("HttpsToHttpEnable")
    @Expose
    private Long HttpsToHttpEnable;

    /**
    * Access port number.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VirtualPort")
    @Expose
    private Long VirtualPort;

    /**
    * Specifies whether to forcibly redirect HTTP to HTTPS. `1`: Enable. `0`: Disable.
    */
    @SerializedName("RewriteHttps")
    @Expose
    private Long RewriteHttps;

    /**
    * Returns an error code when the rule configuration fails (only valid when `Status=2`). `1001`: The certificate does not exist. `1002`: Failed to obtain the certificate. `1003`: Failed to upload the certificate. `1004`: The certificate has expired.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

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
     * Get List of origins 
     * @return SourceList List of origins
     */
    public L4RuleSource [] getSourceList() {
        return this.SourceList;
    }

    /**
     * Set List of origins
     * @param SourceList List of origins
     */
    public void setSourceList(L4RuleSource [] SourceList) {
        this.SourceList = SourceList;
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
     * Get Resource ID. 
     * @return Id Resource ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource ID.
     * @param Id Resource ID.
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
     * Get When the certificate is managed by Tencent Cloud, this field must be set to the ID of the managed certificate. 
     * @return SSLId When the certificate is managed by Tencent Cloud, this field must be set to the ID of the managed certificate.
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set When the certificate is managed by Tencent Cloud, this field must be set to the ID of the managed certificate.
     * @param SSLId When the certificate is managed by Tencent Cloud, this field must be set to the ID of the managed certificate.
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
     * Get Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). It defaults to `0`. 
     * @return HttpsToHttpEnable Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). It defaults to `0`.
     */
    public Long getHttpsToHttpEnable() {
        return this.HttpsToHttpEnable;
    }

    /**
     * Set Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). It defaults to `0`.
     * @param HttpsToHttpEnable Whether to enable **Forward HTTPS requests via HTTP**. Valid values: `0` (disabled) and `1` (enabled). It defaults to `0`.
     */
    public void setHttpsToHttpEnable(Long HttpsToHttpEnable) {
        this.HttpsToHttpEnable = HttpsToHttpEnable;
    }

    /**
     * Get Access port number.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VirtualPort Access port number.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set Access port number.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VirtualPort Access port number.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVirtualPort(Long VirtualPort) {
        this.VirtualPort = VirtualPort;
    }

    /**
     * Get Specifies whether to forcibly redirect HTTP to HTTPS. `1`: Enable. `0`: Disable. 
     * @return RewriteHttps Specifies whether to forcibly redirect HTTP to HTTPS. `1`: Enable. `0`: Disable.
     */
    public Long getRewriteHttps() {
        return this.RewriteHttps;
    }

    /**
     * Set Specifies whether to forcibly redirect HTTP to HTTPS. `1`: Enable. `0`: Disable.
     * @param RewriteHttps Specifies whether to forcibly redirect HTTP to HTTPS. `1`: Enable. `0`: Disable.
     */
    public void setRewriteHttps(Long RewriteHttps) {
        this.RewriteHttps = RewriteHttps;
    }

    /**
     * Get Returns an error code when the rule configuration fails (only valid when `Status=2`). `1001`: The certificate does not exist. `1002`: Failed to obtain the certificate. `1003`: Failed to upload the certificate. `1004`: The certificate has expired. 
     * @return ErrCode Returns an error code when the rule configuration fails (only valid when `Status=2`). `1001`: The certificate does not exist. `1002`: Failed to obtain the certificate. `1003`: Failed to upload the certificate. `1004`: The certificate has expired.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Returns an error code when the rule configuration fails (only valid when `Status=2`). `1001`: The certificate does not exist. `1002`: Failed to obtain the certificate. `1003`: Failed to upload the certificate. `1004`: The certificate has expired.
     * @param ErrCode Returns an error code when the rule configuration fails (only valid when `Status=2`). `1001`: The certificate does not exist. `1002`: Failed to obtain the certificate. `1003`: Failed to upload the certificate. `1004`: The certificate has expired.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set Version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    public NewL7RuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewL7RuleEntry(NewL7RuleEntry source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LbType != null) {
            this.LbType = new Long(source.LbType);
        }
        if (source.KeepEnable != null) {
            this.KeepEnable = new Long(source.KeepEnable);
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.SourceList != null) {
            this.SourceList = new L4RuleSource[source.SourceList.length];
            for (int i = 0; i < source.SourceList.length; i++) {
                this.SourceList[i] = new L4RuleSource(source.SourceList[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
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
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.HttpsToHttpEnable != null) {
            this.HttpsToHttpEnable = new Long(source.HttpsToHttpEnable);
        }
        if (source.VirtualPort != null) {
            this.VirtualPort = new Long(source.VirtualPort);
        }
        if (source.RewriteHttps != null) {
            this.RewriteHttps = new Long(source.RewriteHttps);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LbType", this.LbType);
        this.setParamSimple(map, prefix + "KeepEnable", this.KeepEnable);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArrayObj(map, prefix + "SourceList.", this.SourceList);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CCStatus", this.CCStatus);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);
        this.setParamSimple(map, prefix + "CCLevel", this.CCLevel);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "HttpsToHttpEnable", this.HttpsToHttpEnable);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);
        this.setParamSimple(map, prefix + "RewriteHttps", this.RewriteHttps);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

