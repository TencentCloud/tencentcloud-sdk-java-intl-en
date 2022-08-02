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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainInfo extends AbstractModel{

    /**
    * Domain ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * Domain status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * DNS plan level
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * Domain group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Whether the domain is starred
    */
    @SerializedName("IsMark")
    @Expose
    private String IsMark;

    /**
    * TTL (DNS record cache time)
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Whether CNAME flattening is enabled
    */
    @SerializedName("CnameSpeedup")
    @Expose
    private String CnameSpeedup;

    /**
    * Domain remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Domain Punycode
    */
    @SerializedName("Punycode")
    @Expose
    private String Punycode;

    /**
    * DNS status of the domain
    */
    @SerializedName("DnsStatus")
    @Expose
    private String DnsStatus;

    /**
    * NS list of the domain
    */
    @SerializedName("DnspodNsList")
    @Expose
    private String [] DnspodNsList;

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain level ID
    */
    @SerializedName("GradeLevel")
    @Expose
    private Long GradeLevel;

    /**
    * Domain user ID
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * Whether the domain is a VIP domain
    */
    @SerializedName("IsVip")
    @Expose
    private String IsVip;

    /**
    * Domain owner account
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Domain level description
    */
    @SerializedName("GradeTitle")
    @Expose
    private String GradeTitle;

    /**
    * Domain creation time
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Last update time
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * Tencent Cloud account `Uin`
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * NS list actually used by the domain
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActualNsList")
    @Expose
    private String [] ActualNsList;

    /**
    * Number of domain records
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * Alias of the domain account owner
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerNick")
    @Expose
    private String OwnerNick;

    /**
     * Get Domain ID 
     * @return DomainId Domain ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID
     * @param DomainId Domain ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Domain status 
     * @return Status Domain status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Domain status
     * @param Status Domain status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get DNS plan level 
     * @return Grade DNS plan level
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set DNS plan level
     * @param Grade DNS plan level
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get Domain group ID 
     * @return GroupId Domain group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Domain group ID
     * @param GroupId Domain group ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Whether the domain is starred 
     * @return IsMark Whether the domain is starred
     */
    public String getIsMark() {
        return this.IsMark;
    }

    /**
     * Set Whether the domain is starred
     * @param IsMark Whether the domain is starred
     */
    public void setIsMark(String IsMark) {
        this.IsMark = IsMark;
    }

    /**
     * Get TTL (DNS record cache time) 
     * @return TTL TTL (DNS record cache time)
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL (DNS record cache time)
     * @param TTL TTL (DNS record cache time)
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Whether CNAME flattening is enabled 
     * @return CnameSpeedup Whether CNAME flattening is enabled
     */
    public String getCnameSpeedup() {
        return this.CnameSpeedup;
    }

    /**
     * Set Whether CNAME flattening is enabled
     * @param CnameSpeedup Whether CNAME flattening is enabled
     */
    public void setCnameSpeedup(String CnameSpeedup) {
        this.CnameSpeedup = CnameSpeedup;
    }

    /**
     * Get Domain remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Domain remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Domain remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Domain remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Domain Punycode 
     * @return Punycode Domain Punycode
     */
    public String getPunycode() {
        return this.Punycode;
    }

    /**
     * Set Domain Punycode
     * @param Punycode Domain Punycode
     */
    public void setPunycode(String Punycode) {
        this.Punycode = Punycode;
    }

    /**
     * Get DNS status of the domain 
     * @return DnsStatus DNS status of the domain
     */
    public String getDnsStatus() {
        return this.DnsStatus;
    }

    /**
     * Set DNS status of the domain
     * @param DnsStatus DNS status of the domain
     */
    public void setDnsStatus(String DnsStatus) {
        this.DnsStatus = DnsStatus;
    }

    /**
     * Get NS list of the domain 
     * @return DnspodNsList NS list of the domain
     */
    public String [] getDnspodNsList() {
        return this.DnspodNsList;
    }

    /**
     * Set NS list of the domain
     * @param DnspodNsList NS list of the domain
     */
    public void setDnspodNsList(String [] DnspodNsList) {
        this.DnspodNsList = DnspodNsList;
    }

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain level ID 
     * @return GradeLevel Domain level ID
     */
    public Long getGradeLevel() {
        return this.GradeLevel;
    }

    /**
     * Set Domain level ID
     * @param GradeLevel Domain level ID
     */
    public void setGradeLevel(Long GradeLevel) {
        this.GradeLevel = GradeLevel;
    }

    /**
     * Get Domain user ID 
     * @return UserId Domain user ID
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set Domain user ID
     * @param UserId Domain user ID
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Whether the domain is a VIP domain 
     * @return IsVip Whether the domain is a VIP domain
     */
    public String getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Whether the domain is a VIP domain
     * @param IsVip Whether the domain is a VIP domain
     */
    public void setIsVip(String IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get Domain owner account 
     * @return Owner Domain owner account
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Domain owner account
     * @param Owner Domain owner account
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Domain level description 
     * @return GradeTitle Domain level description
     */
    public String getGradeTitle() {
        return this.GradeTitle;
    }

    /**
     * Set Domain level description
     * @param GradeTitle Domain level description
     */
    public void setGradeTitle(String GradeTitle) {
        this.GradeTitle = GradeTitle;
    }

    /**
     * Get Domain creation time 
     * @return CreatedOn Domain creation time
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Domain creation time
     * @param CreatedOn Domain creation time
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Last update time 
     * @return UpdatedOn Last update time
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set Last update time
     * @param UpdatedOn Last update time
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get Tencent Cloud account `Uin` 
     * @return Uin Tencent Cloud account `Uin`
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Tencent Cloud account `Uin`
     * @param Uin Tencent Cloud account `Uin`
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get NS list actually used by the domain
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActualNsList NS list actually used by the domain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getActualNsList() {
        return this.ActualNsList;
    }

    /**
     * Set NS list actually used by the domain
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActualNsList NS list actually used by the domain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActualNsList(String [] ActualNsList) {
        this.ActualNsList = ActualNsList;
    }

    /**
     * Get Number of domain records 
     * @return RecordCount Number of domain records
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set Number of domain records
     * @param RecordCount Number of domain records
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get Alias of the domain account owner
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerNick Alias of the domain account owner
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerNick() {
        return this.OwnerNick;
    }

    /**
     * Set Alias of the domain account owner
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerNick Alias of the domain account owner
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerNick(String OwnerNick) {
        this.OwnerNick = OwnerNick;
    }

    public DomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainInfo(DomainInfo source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.IsMark != null) {
            this.IsMark = new String(source.IsMark);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.CnameSpeedup != null) {
            this.CnameSpeedup = new String(source.CnameSpeedup);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Punycode != null) {
            this.Punycode = new String(source.Punycode);
        }
        if (source.DnsStatus != null) {
            this.DnsStatus = new String(source.DnsStatus);
        }
        if (source.DnspodNsList != null) {
            this.DnspodNsList = new String[source.DnspodNsList.length];
            for (int i = 0; i < source.DnspodNsList.length; i++) {
                this.DnspodNsList[i] = new String(source.DnspodNsList[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.GradeLevel != null) {
            this.GradeLevel = new Long(source.GradeLevel);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.IsVip != null) {
            this.IsVip = new String(source.IsVip);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.GradeTitle != null) {
            this.GradeTitle = new String(source.GradeTitle);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ActualNsList != null) {
            this.ActualNsList = new String[source.ActualNsList.length];
            for (int i = 0; i < source.ActualNsList.length; i++) {
                this.ActualNsList[i] = new String(source.ActualNsList[i]);
            }
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.OwnerNick != null) {
            this.OwnerNick = new String(source.OwnerNick);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "IsMark", this.IsMark);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "CnameSpeedup", this.CnameSpeedup);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Punycode", this.Punycode);
        this.setParamSimple(map, prefix + "DnsStatus", this.DnsStatus);
        this.setParamArraySimple(map, prefix + "DnspodNsList.", this.DnspodNsList);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GradeLevel", this.GradeLevel);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "GradeTitle", this.GradeTitle);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArraySimple(map, prefix + "ActualNsList.", this.ActualNsList);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "OwnerNick", this.OwnerNick);

    }
}

