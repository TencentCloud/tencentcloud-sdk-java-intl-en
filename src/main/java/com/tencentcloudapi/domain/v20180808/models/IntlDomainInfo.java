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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntlDomainInfo extends AbstractModel{

    /**
    * The auto-renewal flag. Valid values: `0` (disabled by default), `1` (enabled), `2` (disabled).
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * The registration time.
    */
    @SerializedName("CreationDate")
    @Expose
    private String CreationDate;

    /**
    * The domain ID.
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * The DNS status. Valid values: `1` (DNSPod), `2` (others), `3` (unknown).
    */
    @SerializedName("DnsStatus")
    @Expose
    private Long DnsStatus;

    /**
    * The domains.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The domain status.
    */
    @SerializedName("DomainStatus")
    @Expose
    private String [] DomainStatus;

    /**
    * The purchase status of the domain. Valid values:
`ok`: Normal.
`RegisterPending`: Pending registration.
`RegisterDoing`: Registration in progress.
`RegisterFailed`: Registration failed.
`RenewPending`: Renewal grace period.
`RenewDoing`: Renewing.
`RedemptionPending`: Redemption period.
`AboutToExpire`: About to expire.
`TransferPending`: Pending transfer.
`TransferTransing`: Transfer in progress.
`TransferFailed`: Transfer failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The expiration date.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * The auto-renewal flag. Valid values: `1` (enabled), `2` (disabled), `3` (disabled by default).
    */
    @SerializedName("ExpireMessage")
    @Expose
    private Long ExpireMessage;

    /**
    * Whether the domain is a premium one.
    */
    @SerializedName("IsPremium")
    @Expose
    private Boolean IsPremium;

    /**
    * The DNS server of the domain.
    */
    @SerializedName("Dns")
    @Expose
    private String [] Dns;

    /**
    * The contact information.
    */
    @SerializedName("ContactInfo")
    @Expose
    private IntlContactInfo ContactInfo;

    /**
    * The number of years available for renewal. The value `0` indicates that the domain has reached its maximum validity period (10 years) and cannot be renewed.
    */
    @SerializedName("CanRenewYears")
    @Expose
    private Long CanRenewYears;

    /**
    * The registrar type. If the value is `epp`, the registration time on the page is followed by (UTC). Otherwise, it is followed by (UTC+8).
    */
    @SerializedName("RegistrarType")
    @Expose
    private String RegistrarType;

    /**
    * The account to which the domain belongs.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * The profile ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Whether DNSSEC is supported.
    */
    @SerializedName("SupportDnssec")
    @Expose
    private Boolean SupportDnssec;

    /**
    * WHOIS privacy service status. Valid values: `1` (enabled), `2` (disabled), `3` (enabling), `4` (disabling).
    */
    @SerializedName("WhoisPrivacy")
    @Expose
    private Long WhoisPrivacy;

    /**
    * Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify)
    */
    @SerializedName("ModifyStatus")
    @Expose
    private String ModifyStatus;

    /**
    * Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify)
    */
    @SerializedName("DnsModifyStatus")
    @Expose
    private String DnsModifyStatus;

    /**
     * Get The auto-renewal flag. Valid values: `0` (disabled by default), `1` (enabled), `2` (disabled). 
     * @return AutoRenew The auto-renewal flag. Valid values: `0` (disabled by default), `1` (enabled), `2` (disabled).
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set The auto-renewal flag. Valid values: `0` (disabled by default), `1` (enabled), `2` (disabled).
     * @param AutoRenew The auto-renewal flag. Valid values: `0` (disabled by default), `1` (enabled), `2` (disabled).
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get The registration time. 
     * @return CreationDate The registration time.
     */
    public String getCreationDate() {
        return this.CreationDate;
    }

    /**
     * Set The registration time.
     * @param CreationDate The registration time.
     */
    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * Get The domain ID. 
     * @return DomainId The domain ID.
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set The domain ID.
     * @param DomainId The domain ID.
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get The DNS status. Valid values: `1` (DNSPod), `2` (others), `3` (unknown). 
     * @return DnsStatus The DNS status. Valid values: `1` (DNSPod), `2` (others), `3` (unknown).
     */
    public Long getDnsStatus() {
        return this.DnsStatus;
    }

    /**
     * Set The DNS status. Valid values: `1` (DNSPod), `2` (others), `3` (unknown).
     * @param DnsStatus The DNS status. Valid values: `1` (DNSPod), `2` (others), `3` (unknown).
     */
    public void setDnsStatus(Long DnsStatus) {
        this.DnsStatus = DnsStatus;
    }

    /**
     * Get The domains. 
     * @return DomainName The domains.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The domains.
     * @param DomainName The domains.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The domain status. 
     * @return DomainStatus The domain status.
     */
    public String [] getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set The domain status.
     * @param DomainStatus The domain status.
     */
    public void setDomainStatus(String [] DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get The purchase status of the domain. Valid values:
`ok`: Normal.
`RegisterPending`: Pending registration.
`RegisterDoing`: Registration in progress.
`RegisterFailed`: Registration failed.
`RenewPending`: Renewal grace period.
`RenewDoing`: Renewing.
`RedemptionPending`: Redemption period.
`AboutToExpire`: About to expire.
`TransferPending`: Pending transfer.
`TransferTransing`: Transfer in progress.
`TransferFailed`: Transfer failed. 
     * @return Status The purchase status of the domain. Valid values:
`ok`: Normal.
`RegisterPending`: Pending registration.
`RegisterDoing`: Registration in progress.
`RegisterFailed`: Registration failed.
`RenewPending`: Renewal grace period.
`RenewDoing`: Renewing.
`RedemptionPending`: Redemption period.
`AboutToExpire`: About to expire.
`TransferPending`: Pending transfer.
`TransferTransing`: Transfer in progress.
`TransferFailed`: Transfer failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The purchase status of the domain. Valid values:
`ok`: Normal.
`RegisterPending`: Pending registration.
`RegisterDoing`: Registration in progress.
`RegisterFailed`: Registration failed.
`RenewPending`: Renewal grace period.
`RenewDoing`: Renewing.
`RedemptionPending`: Redemption period.
`AboutToExpire`: About to expire.
`TransferPending`: Pending transfer.
`TransferTransing`: Transfer in progress.
`TransferFailed`: Transfer failed.
     * @param Status The purchase status of the domain. Valid values:
`ok`: Normal.
`RegisterPending`: Pending registration.
`RegisterDoing`: Registration in progress.
`RegisterFailed`: Registration failed.
`RenewPending`: Renewal grace period.
`RenewDoing`: Renewing.
`RedemptionPending`: Redemption period.
`AboutToExpire`: About to expire.
`TransferPending`: Pending transfer.
`TransferTransing`: Transfer in progress.
`TransferFailed`: Transfer failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The expiration date. 
     * @return ExpirationDate The expiration date.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set The expiration date.
     * @param ExpirationDate The expiration date.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get The auto-renewal flag. Valid values: `1` (enabled), `2` (disabled), `3` (disabled by default). 
     * @return ExpireMessage The auto-renewal flag. Valid values: `1` (enabled), `2` (disabled), `3` (disabled by default).
     */
    public Long getExpireMessage() {
        return this.ExpireMessage;
    }

    /**
     * Set The auto-renewal flag. Valid values: `1` (enabled), `2` (disabled), `3` (disabled by default).
     * @param ExpireMessage The auto-renewal flag. Valid values: `1` (enabled), `2` (disabled), `3` (disabled by default).
     */
    public void setExpireMessage(Long ExpireMessage) {
        this.ExpireMessage = ExpireMessage;
    }

    /**
     * Get Whether the domain is a premium one. 
     * @return IsPremium Whether the domain is a premium one.
     */
    public Boolean getIsPremium() {
        return this.IsPremium;
    }

    /**
     * Set Whether the domain is a premium one.
     * @param IsPremium Whether the domain is a premium one.
     */
    public void setIsPremium(Boolean IsPremium) {
        this.IsPremium = IsPremium;
    }

    /**
     * Get The DNS server of the domain. 
     * @return Dns The DNS server of the domain.
     */
    public String [] getDns() {
        return this.Dns;
    }

    /**
     * Set The DNS server of the domain.
     * @param Dns The DNS server of the domain.
     */
    public void setDns(String [] Dns) {
        this.Dns = Dns;
    }

    /**
     * Get The contact information. 
     * @return ContactInfo The contact information.
     */
    public IntlContactInfo getContactInfo() {
        return this.ContactInfo;
    }

    /**
     * Set The contact information.
     * @param ContactInfo The contact information.
     */
    public void setContactInfo(IntlContactInfo ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    /**
     * Get The number of years available for renewal. The value `0` indicates that the domain has reached its maximum validity period (10 years) and cannot be renewed. 
     * @return CanRenewYears The number of years available for renewal. The value `0` indicates that the domain has reached its maximum validity period (10 years) and cannot be renewed.
     */
    public Long getCanRenewYears() {
        return this.CanRenewYears;
    }

    /**
     * Set The number of years available for renewal. The value `0` indicates that the domain has reached its maximum validity period (10 years) and cannot be renewed.
     * @param CanRenewYears The number of years available for renewal. The value `0` indicates that the domain has reached its maximum validity period (10 years) and cannot be renewed.
     */
    public void setCanRenewYears(Long CanRenewYears) {
        this.CanRenewYears = CanRenewYears;
    }

    /**
     * Get The registrar type. If the value is `epp`, the registration time on the page is followed by (UTC). Otherwise, it is followed by (UTC+8). 
     * @return RegistrarType The registrar type. If the value is `epp`, the registration time on the page is followed by (UTC). Otherwise, it is followed by (UTC+8).
     */
    public String getRegistrarType() {
        return this.RegistrarType;
    }

    /**
     * Set The registrar type. If the value is `epp`, the registration time on the page is followed by (UTC). Otherwise, it is followed by (UTC+8).
     * @param RegistrarType The registrar type. If the value is `epp`, the registration time on the page is followed by (UTC). Otherwise, it is followed by (UTC+8).
     */
    public void setRegistrarType(String RegistrarType) {
        this.RegistrarType = RegistrarType;
    }

    /**
     * Get The account to which the domain belongs. 
     * @return Uin The account to which the domain belongs.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set The account to which the domain belongs.
     * @param Uin The account to which the domain belongs.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get The profile ID. 
     * @return TemplateId The profile ID.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The profile ID.
     * @param TemplateId The profile ID.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Whether DNSSEC is supported. 
     * @return SupportDnssec Whether DNSSEC is supported.
     */
    public Boolean getSupportDnssec() {
        return this.SupportDnssec;
    }

    /**
     * Set Whether DNSSEC is supported.
     * @param SupportDnssec Whether DNSSEC is supported.
     */
    public void setSupportDnssec(Boolean SupportDnssec) {
        this.SupportDnssec = SupportDnssec;
    }

    /**
     * Get WHOIS privacy service status. Valid values: `1` (enabled), `2` (disabled), `3` (enabling), `4` (disabling). 
     * @return WhoisPrivacy WHOIS privacy service status. Valid values: `1` (enabled), `2` (disabled), `3` (enabling), `4` (disabling).
     */
    public Long getWhoisPrivacy() {
        return this.WhoisPrivacy;
    }

    /**
     * Set WHOIS privacy service status. Valid values: `1` (enabled), `2` (disabled), `3` (enabling), `4` (disabling).
     * @param WhoisPrivacy WHOIS privacy service status. Valid values: `1` (enabled), `2` (disabled), `3` (enabling), `4` (disabling).
     */
    public void setWhoisPrivacy(Long WhoisPrivacy) {
        this.WhoisPrivacy = WhoisPrivacy;
    }

    /**
     * Get Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify) 
     * @return ModifyStatus Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify)
     */
    public String getModifyStatus() {
        return this.ModifyStatus;
    }

    /**
     * Set Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify)
     * @param ModifyStatus Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify)
     */
    public void setModifyStatus(String ModifyStatus) {
        this.ModifyStatus = ModifyStatus;
    }

    /**
     * Get Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify) 
     * @return DnsModifyStatus Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify)
     */
    public String getDnsModifyStatus() {
        return this.DnsModifyStatus;
    }

    /**
     * Set Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify)
     * @param DnsModifyStatus Valid values: `NotModify` (not modified), `Modifying`, `Failed` (failed to modify)
     */
    public void setDnsModifyStatus(String DnsModifyStatus) {
        this.DnsModifyStatus = DnsModifyStatus;
    }

    public IntlDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntlDomainInfo(IntlDomainInfo source) {
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.CreationDate != null) {
            this.CreationDate = new String(source.CreationDate);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.DnsStatus != null) {
            this.DnsStatus = new Long(source.DnsStatus);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new String[source.DomainStatus.length];
            for (int i = 0; i < source.DomainStatus.length; i++) {
                this.DomainStatus[i] = new String(source.DomainStatus[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.ExpireMessage != null) {
            this.ExpireMessage = new Long(source.ExpireMessage);
        }
        if (source.IsPremium != null) {
            this.IsPremium = new Boolean(source.IsPremium);
        }
        if (source.Dns != null) {
            this.Dns = new String[source.Dns.length];
            for (int i = 0; i < source.Dns.length; i++) {
                this.Dns[i] = new String(source.Dns[i]);
            }
        }
        if (source.ContactInfo != null) {
            this.ContactInfo = new IntlContactInfo(source.ContactInfo);
        }
        if (source.CanRenewYears != null) {
            this.CanRenewYears = new Long(source.CanRenewYears);
        }
        if (source.RegistrarType != null) {
            this.RegistrarType = new String(source.RegistrarType);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.SupportDnssec != null) {
            this.SupportDnssec = new Boolean(source.SupportDnssec);
        }
        if (source.WhoisPrivacy != null) {
            this.WhoisPrivacy = new Long(source.WhoisPrivacy);
        }
        if (source.ModifyStatus != null) {
            this.ModifyStatus = new String(source.ModifyStatus);
        }
        if (source.DnsModifyStatus != null) {
            this.DnsModifyStatus = new String(source.DnsModifyStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "CreationDate", this.CreationDate);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DnsStatus", this.DnsStatus);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamArraySimple(map, prefix + "DomainStatus.", this.DomainStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "ExpireMessage", this.ExpireMessage);
        this.setParamSimple(map, prefix + "IsPremium", this.IsPremium);
        this.setParamArraySimple(map, prefix + "Dns.", this.Dns);
        this.setParamObj(map, prefix + "ContactInfo.", this.ContactInfo);
        this.setParamSimple(map, prefix + "CanRenewYears", this.CanRenewYears);
        this.setParamSimple(map, prefix + "RegistrarType", this.RegistrarType);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "SupportDnssec", this.SupportDnssec);
        this.setParamSimple(map, prefix + "WhoisPrivacy", this.WhoisPrivacy);
        this.setParamSimple(map, prefix + "ModifyStatus", this.ModifyStatus);
        this.setParamSimple(map, prefix + "DnsModifyStatus", this.DnsModifyStatus);

    }
}

