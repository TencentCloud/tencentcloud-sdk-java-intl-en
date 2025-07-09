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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateZone extends AbstractModel {

    /**
    * Private domain ID, which is in zone-xxxxxxxx format.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * UIN of the domain name owner.
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Private domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Creation time
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Modification time
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * Number of records.
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * List of bound VPCs.
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * Status of the VPC bound with the private domain. SUSPEND: The VPC is not associated; ENABLED: the VPC has been associated.
, FAILED: the VPC fails to be associated.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Recursive resolution status of the domain name. ENABLED: enabled; DISABLED: disabled.
    */
    @SerializedName("DnsForwardStatus")
    @Expose
    private String DnsForwardStatus;

    /**
    * Tag key-value pair collection.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * List of bound VPCs of the associated account.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountVpcSet")
    @Expose
    private AccountVpcInfoOutput [] AccountVpcSet;

    /**
    * Whether the TLD is a custom one.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCustomTld")
    @Expose
    private Boolean IsCustomTld;

    /**
    * CNAME acceleration status. ENABLED: enabled; DISABLED: disabled.
    */
    @SerializedName("CnameSpeedupStatus")
    @Expose
    private String CnameSpeedupStatus;

    /**
    * Forwarding rule name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForwardRuleName")
    @Expose
    private String ForwardRuleName;

    /**
    * Forwarding rule type. DOWN: from cloud to off-cloud; UP: from off-cloud to cloud. Currently, only DOWN is supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForwardRuleType")
    @Expose
    private String ForwardRuleType;

    /**
    * Forwarding address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForwardAddress")
    @Expose
    private String ForwardAddress;

    /**
    * Endpoint name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * Deleted VPC.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeletedVpcSet")
    @Expose
    private VpcInfo [] DeletedVpcSet;

    /**
     * Get Private domain ID, which is in zone-xxxxxxxx format. 
     * @return ZoneId Private domain ID, which is in zone-xxxxxxxx format.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Private domain ID, which is in zone-xxxxxxxx format.
     * @param ZoneId Private domain ID, which is in zone-xxxxxxxx format.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get UIN of the domain name owner. 
     * @return OwnerUin UIN of the domain name owner.
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set UIN of the domain name owner.
     * @param OwnerUin UIN of the domain name owner.
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Private domain name. 
     * @return Domain Private domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Private domain name.
     * @param Domain Private domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Creation time 
     * @return CreatedOn Creation time
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time
     * @param CreatedOn Creation time
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Modification time 
     * @return UpdatedOn Modification time
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set Modification time
     * @param UpdatedOn Modification time
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get Number of records. 
     * @return RecordCount Number of records.
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set Number of records.
     * @param RecordCount Number of records.
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get Remarks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get List of bound VPCs. 
     * @return VpcSet List of bound VPCs.
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set List of bound VPCs.
     * @param VpcSet List of bound VPCs.
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get Status of the VPC bound with the private domain. SUSPEND: The VPC is not associated; ENABLED: the VPC has been associated.
, FAILED: the VPC fails to be associated. 
     * @return Status Status of the VPC bound with the private domain. SUSPEND: The VPC is not associated; ENABLED: the VPC has been associated.
, FAILED: the VPC fails to be associated.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the VPC bound with the private domain. SUSPEND: The VPC is not associated; ENABLED: the VPC has been associated.
, FAILED: the VPC fails to be associated.
     * @param Status Status of the VPC bound with the private domain. SUSPEND: The VPC is not associated; ENABLED: the VPC has been associated.
, FAILED: the VPC fails to be associated.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Recursive resolution status of the domain name. ENABLED: enabled; DISABLED: disabled. 
     * @return DnsForwardStatus Recursive resolution status of the domain name. ENABLED: enabled; DISABLED: disabled.
     */
    public String getDnsForwardStatus() {
        return this.DnsForwardStatus;
    }

    /**
     * Set Recursive resolution status of the domain name. ENABLED: enabled; DISABLED: disabled.
     * @param DnsForwardStatus Recursive resolution status of the domain name. ENABLED: enabled; DISABLED: disabled.
     */
    public void setDnsForwardStatus(String DnsForwardStatus) {
        this.DnsForwardStatus = DnsForwardStatus;
    }

    /**
     * Get Tag key-value pair collection. 
     * @return Tags Tag key-value pair collection.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag key-value pair collection.
     * @param Tags Tag key-value pair collection.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get List of bound VPCs of the associated account.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountVpcSet List of bound VPCs of the associated account.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AccountVpcInfoOutput [] getAccountVpcSet() {
        return this.AccountVpcSet;
    }

    /**
     * Set List of bound VPCs of the associated account.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountVpcSet List of bound VPCs of the associated account.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountVpcSet(AccountVpcInfoOutput [] AccountVpcSet) {
        this.AccountVpcSet = AccountVpcSet;
    }

    /**
     * Get Whether the TLD is a custom one.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsCustomTld Whether the TLD is a custom one.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsCustomTld() {
        return this.IsCustomTld;
    }

    /**
     * Set Whether the TLD is a custom one.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsCustomTld Whether the TLD is a custom one.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsCustomTld(Boolean IsCustomTld) {
        this.IsCustomTld = IsCustomTld;
    }

    /**
     * Get CNAME acceleration status. ENABLED: enabled; DISABLED: disabled. 
     * @return CnameSpeedupStatus CNAME acceleration status. ENABLED: enabled; DISABLED: disabled.
     */
    public String getCnameSpeedupStatus() {
        return this.CnameSpeedupStatus;
    }

    /**
     * Set CNAME acceleration status. ENABLED: enabled; DISABLED: disabled.
     * @param CnameSpeedupStatus CNAME acceleration status. ENABLED: enabled; DISABLED: disabled.
     */
    public void setCnameSpeedupStatus(String CnameSpeedupStatus) {
        this.CnameSpeedupStatus = CnameSpeedupStatus;
    }

    /**
     * Get Forwarding rule name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForwardRuleName Forwarding rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getForwardRuleName() {
        return this.ForwardRuleName;
    }

    /**
     * Set Forwarding rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForwardRuleName Forwarding rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setForwardRuleName(String ForwardRuleName) {
        this.ForwardRuleName = ForwardRuleName;
    }

    /**
     * Get Forwarding rule type. DOWN: from cloud to off-cloud; UP: from off-cloud to cloud. Currently, only DOWN is supported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForwardRuleType Forwarding rule type. DOWN: from cloud to off-cloud; UP: from off-cloud to cloud. Currently, only DOWN is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getForwardRuleType() {
        return this.ForwardRuleType;
    }

    /**
     * Set Forwarding rule type. DOWN: from cloud to off-cloud; UP: from off-cloud to cloud. Currently, only DOWN is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForwardRuleType Forwarding rule type. DOWN: from cloud to off-cloud; UP: from off-cloud to cloud. Currently, only DOWN is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setForwardRuleType(String ForwardRuleType) {
        this.ForwardRuleType = ForwardRuleType;
    }

    /**
     * Get Forwarding address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForwardAddress Forwarding address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getForwardAddress() {
        return this.ForwardAddress;
    }

    /**
     * Set Forwarding address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForwardAddress Forwarding address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setForwardAddress(String ForwardAddress) {
        this.ForwardAddress = ForwardAddress;
    }

    /**
     * Get Endpoint name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndPointName Endpoint name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set Endpoint name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndPointName Endpoint name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get Deleted VPC.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeletedVpcSet Deleted VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VpcInfo [] getDeletedVpcSet() {
        return this.DeletedVpcSet;
    }

    /**
     * Set Deleted VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeletedVpcSet Deleted VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeletedVpcSet(VpcInfo [] DeletedVpcSet) {
        this.DeletedVpcSet = DeletedVpcSet;
    }

    public PrivateZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateZone(PrivateZone source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DnsForwardStatus != null) {
            this.DnsForwardStatus = new String(source.DnsForwardStatus);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.AccountVpcSet != null) {
            this.AccountVpcSet = new AccountVpcInfoOutput[source.AccountVpcSet.length];
            for (int i = 0; i < source.AccountVpcSet.length; i++) {
                this.AccountVpcSet[i] = new AccountVpcInfoOutput(source.AccountVpcSet[i]);
            }
        }
        if (source.IsCustomTld != null) {
            this.IsCustomTld = new Boolean(source.IsCustomTld);
        }
        if (source.CnameSpeedupStatus != null) {
            this.CnameSpeedupStatus = new String(source.CnameSpeedupStatus);
        }
        if (source.ForwardRuleName != null) {
            this.ForwardRuleName = new String(source.ForwardRuleName);
        }
        if (source.ForwardRuleType != null) {
            this.ForwardRuleType = new String(source.ForwardRuleType);
        }
        if (source.ForwardAddress != null) {
            this.ForwardAddress = new String(source.ForwardAddress);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.DeletedVpcSet != null) {
            this.DeletedVpcSet = new VpcInfo[source.DeletedVpcSet.length];
            for (int i = 0; i < source.DeletedVpcSet.length; i++) {
                this.DeletedVpcSet[i] = new VpcInfo(source.DeletedVpcSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DnsForwardStatus", this.DnsForwardStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "AccountVpcSet.", this.AccountVpcSet);
        this.setParamSimple(map, prefix + "IsCustomTld", this.IsCustomTld);
        this.setParamSimple(map, prefix + "CnameSpeedupStatus", this.CnameSpeedupStatus);
        this.setParamSimple(map, prefix + "ForwardRuleName", this.ForwardRuleName);
        this.setParamSimple(map, prefix + "ForwardRuleType", this.ForwardRuleType);
        this.setParamSimple(map, prefix + "ForwardAddress", this.ForwardAddress);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamArrayObj(map, prefix + "DeletedVpcSet.", this.DeletedVpcSet);

    }
}

