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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainListItem extends AbstractModel {

    /**
    * Unique ID assigned to the domain by the system
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * Original format of the domain
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Domain status. Valid values: `ENABLE` (normal), `PAUSE` (suspended), `SPAM` (blocked).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Default TTL of the default DNS record of the domain
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Whether CNAME flattening is enabled. Valid values: `ENABLE` (enabled); `DISABLE` (disabled).
    */
    @SerializedName("CNAMESpeedup")
    @Expose
    private String CNAMESpeedup;

    /**
    * DNS configuration status. Valid values: `DNSERROR` (error), an empty string (normal).
    */
    @SerializedName("DNSStatus")
    @Expose
    private String DNSStatus;

    /**
    * Plan level code of the domain
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * Group ID of the domain
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Whether search engine push optimization is enabled. Valid values: `YES` (yes), `NO` (no).
    */
    @SerializedName("SearchEnginePush")
    @Expose
    private String SearchEnginePush;

    /**
    * Domain remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Punycode-encoded domain format
    */
    @SerializedName("Punycode")
    @Expose
    private String Punycode;

    /**
    * Effective DNS assigned to the domain by the system
    */
    @SerializedName("EffectiveDNS")
    @Expose
    private String [] EffectiveDNS;

    /**
    * Number corresponding to the plan level of the domain
    */
    @SerializedName("GradeLevel")
    @Expose
    private Long GradeLevel;

    /**
    * Plan name
    */
    @SerializedName("GradeTitle")
    @Expose
    private String GradeTitle;

    /**
    * Whether it is a paid plan
    */
    @SerializedName("IsVip")
    @Expose
    private String IsVip;

    /**
    * Activation time of the paid plan
    */
    @SerializedName("VipStartAt")
    @Expose
    private String VipStartAt;

    /**
    * Expiry time of the paid plan
    */
    @SerializedName("VipEndAt")
    @Expose
    private String VipEndAt;

    /**
    * Whether VIP automatic renewal is enabled for the domain. Valid values: `YES` (yes); `NO` (no). Default value: `DEFAULT`.
    */
    @SerializedName("VipAutoRenew")
    @Expose
    private String VipAutoRenew;

    /**
    * Number of records under the domain
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * Domain adding time
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Domain update time
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * Account of the domain
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
     * Get Unique ID assigned to the domain by the system 
     * @return DomainId Unique ID assigned to the domain by the system
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Unique ID assigned to the domain by the system
     * @param DomainId Unique ID assigned to the domain by the system
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Original format of the domain 
     * @return Name Original format of the domain
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Original format of the domain
     * @param Name Original format of the domain
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Domain status. Valid values: `ENABLE` (normal), `PAUSE` (suspended), `SPAM` (blocked). 
     * @return Status Domain status. Valid values: `ENABLE` (normal), `PAUSE` (suspended), `SPAM` (blocked).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Domain status. Valid values: `ENABLE` (normal), `PAUSE` (suspended), `SPAM` (blocked).
     * @param Status Domain status. Valid values: `ENABLE` (normal), `PAUSE` (suspended), `SPAM` (blocked).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Default TTL of the default DNS record of the domain 
     * @return TTL Default TTL of the default DNS record of the domain
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Default TTL of the default DNS record of the domain
     * @param TTL Default TTL of the default DNS record of the domain
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Whether CNAME flattening is enabled. Valid values: `ENABLE` (enabled); `DISABLE` (disabled). 
     * @return CNAMESpeedup Whether CNAME flattening is enabled. Valid values: `ENABLE` (enabled); `DISABLE` (disabled).
     */
    public String getCNAMESpeedup() {
        return this.CNAMESpeedup;
    }

    /**
     * Set Whether CNAME flattening is enabled. Valid values: `ENABLE` (enabled); `DISABLE` (disabled).
     * @param CNAMESpeedup Whether CNAME flattening is enabled. Valid values: `ENABLE` (enabled); `DISABLE` (disabled).
     */
    public void setCNAMESpeedup(String CNAMESpeedup) {
        this.CNAMESpeedup = CNAMESpeedup;
    }

    /**
     * Get DNS configuration status. Valid values: `DNSERROR` (error), an empty string (normal). 
     * @return DNSStatus DNS configuration status. Valid values: `DNSERROR` (error), an empty string (normal).
     */
    public String getDNSStatus() {
        return this.DNSStatus;
    }

    /**
     * Set DNS configuration status. Valid values: `DNSERROR` (error), an empty string (normal).
     * @param DNSStatus DNS configuration status. Valid values: `DNSERROR` (error), an empty string (normal).
     */
    public void setDNSStatus(String DNSStatus) {
        this.DNSStatus = DNSStatus;
    }

    /**
     * Get Plan level code of the domain 
     * @return Grade Plan level code of the domain
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set Plan level code of the domain
     * @param Grade Plan level code of the domain
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get Group ID of the domain 
     * @return GroupId Group ID of the domain
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID of the domain
     * @param GroupId Group ID of the domain
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Whether search engine push optimization is enabled. Valid values: `YES` (yes), `NO` (no). 
     * @return SearchEnginePush Whether search engine push optimization is enabled. Valid values: `YES` (yes), `NO` (no).
     */
    public String getSearchEnginePush() {
        return this.SearchEnginePush;
    }

    /**
     * Set Whether search engine push optimization is enabled. Valid values: `YES` (yes), `NO` (no).
     * @param SearchEnginePush Whether search engine push optimization is enabled. Valid values: `YES` (yes), `NO` (no).
     */
    public void setSearchEnginePush(String SearchEnginePush) {
        this.SearchEnginePush = SearchEnginePush;
    }

    /**
     * Get Domain remarks 
     * @return Remark Domain remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Domain remarks
     * @param Remark Domain remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Punycode-encoded domain format 
     * @return Punycode Punycode-encoded domain format
     */
    public String getPunycode() {
        return this.Punycode;
    }

    /**
     * Set Punycode-encoded domain format
     * @param Punycode Punycode-encoded domain format
     */
    public void setPunycode(String Punycode) {
        this.Punycode = Punycode;
    }

    /**
     * Get Effective DNS assigned to the domain by the system 
     * @return EffectiveDNS Effective DNS assigned to the domain by the system
     */
    public String [] getEffectiveDNS() {
        return this.EffectiveDNS;
    }

    /**
     * Set Effective DNS assigned to the domain by the system
     * @param EffectiveDNS Effective DNS assigned to the domain by the system
     */
    public void setEffectiveDNS(String [] EffectiveDNS) {
        this.EffectiveDNS = EffectiveDNS;
    }

    /**
     * Get Number corresponding to the plan level of the domain 
     * @return GradeLevel Number corresponding to the plan level of the domain
     */
    public Long getGradeLevel() {
        return this.GradeLevel;
    }

    /**
     * Set Number corresponding to the plan level of the domain
     * @param GradeLevel Number corresponding to the plan level of the domain
     */
    public void setGradeLevel(Long GradeLevel) {
        this.GradeLevel = GradeLevel;
    }

    /**
     * Get Plan name 
     * @return GradeTitle Plan name
     */
    public String getGradeTitle() {
        return this.GradeTitle;
    }

    /**
     * Set Plan name
     * @param GradeTitle Plan name
     */
    public void setGradeTitle(String GradeTitle) {
        this.GradeTitle = GradeTitle;
    }

    /**
     * Get Whether it is a paid plan 
     * @return IsVip Whether it is a paid plan
     */
    public String getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Whether it is a paid plan
     * @param IsVip Whether it is a paid plan
     */
    public void setIsVip(String IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get Activation time of the paid plan 
     * @return VipStartAt Activation time of the paid plan
     */
    public String getVipStartAt() {
        return this.VipStartAt;
    }

    /**
     * Set Activation time of the paid plan
     * @param VipStartAt Activation time of the paid plan
     */
    public void setVipStartAt(String VipStartAt) {
        this.VipStartAt = VipStartAt;
    }

    /**
     * Get Expiry time of the paid plan 
     * @return VipEndAt Expiry time of the paid plan
     */
    public String getVipEndAt() {
        return this.VipEndAt;
    }

    /**
     * Set Expiry time of the paid plan
     * @param VipEndAt Expiry time of the paid plan
     */
    public void setVipEndAt(String VipEndAt) {
        this.VipEndAt = VipEndAt;
    }

    /**
     * Get Whether VIP automatic renewal is enabled for the domain. Valid values: `YES` (yes); `NO` (no). Default value: `DEFAULT`. 
     * @return VipAutoRenew Whether VIP automatic renewal is enabled for the domain. Valid values: `YES` (yes); `NO` (no). Default value: `DEFAULT`.
     */
    public String getVipAutoRenew() {
        return this.VipAutoRenew;
    }

    /**
     * Set Whether VIP automatic renewal is enabled for the domain. Valid values: `YES` (yes); `NO` (no). Default value: `DEFAULT`.
     * @param VipAutoRenew Whether VIP automatic renewal is enabled for the domain. Valid values: `YES` (yes); `NO` (no). Default value: `DEFAULT`.
     */
    public void setVipAutoRenew(String VipAutoRenew) {
        this.VipAutoRenew = VipAutoRenew;
    }

    /**
     * Get Number of records under the domain 
     * @return RecordCount Number of records under the domain
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set Number of records under the domain
     * @param RecordCount Number of records under the domain
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get Domain adding time 
     * @return CreatedOn Domain adding time
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Domain adding time
     * @param CreatedOn Domain adding time
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Domain update time 
     * @return UpdatedOn Domain update time
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set Domain update time
     * @param UpdatedOn Domain update time
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get Account of the domain 
     * @return Owner Account of the domain
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Account of the domain
     * @param Owner Account of the domain
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public DomainListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainListItem(DomainListItem source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.CNAMESpeedup != null) {
            this.CNAMESpeedup = new String(source.CNAMESpeedup);
        }
        if (source.DNSStatus != null) {
            this.DNSStatus = new String(source.DNSStatus);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.SearchEnginePush != null) {
            this.SearchEnginePush = new String(source.SearchEnginePush);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Punycode != null) {
            this.Punycode = new String(source.Punycode);
        }
        if (source.EffectiveDNS != null) {
            this.EffectiveDNS = new String[source.EffectiveDNS.length];
            for (int i = 0; i < source.EffectiveDNS.length; i++) {
                this.EffectiveDNS[i] = new String(source.EffectiveDNS[i]);
            }
        }
        if (source.GradeLevel != null) {
            this.GradeLevel = new Long(source.GradeLevel);
        }
        if (source.GradeTitle != null) {
            this.GradeTitle = new String(source.GradeTitle);
        }
        if (source.IsVip != null) {
            this.IsVip = new String(source.IsVip);
        }
        if (source.VipStartAt != null) {
            this.VipStartAt = new String(source.VipStartAt);
        }
        if (source.VipEndAt != null) {
            this.VipEndAt = new String(source.VipEndAt);
        }
        if (source.VipAutoRenew != null) {
            this.VipAutoRenew = new String(source.VipAutoRenew);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "CNAMESpeedup", this.CNAMESpeedup);
        this.setParamSimple(map, prefix + "DNSStatus", this.DNSStatus);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SearchEnginePush", this.SearchEnginePush);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Punycode", this.Punycode);
        this.setParamArraySimple(map, prefix + "EffectiveDNS.", this.EffectiveDNS);
        this.setParamSimple(map, prefix + "GradeLevel", this.GradeLevel);
        this.setParamSimple(map, prefix + "GradeTitle", this.GradeTitle);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "VipStartAt", this.VipStartAt);
        this.setParamSimple(map, prefix + "VipEndAt", this.VipEndAt);
        this.setParamSimple(map, prefix + "VipAutoRenew", this.VipAutoRenew);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Owner", this.Owner);

    }
}

