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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagerInfo extends AbstractModel {

    /**
    * Status: audit: under review ok: pass invalid: invalid expiring: expiring soon expired: expired
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Manager name
    */
    @SerializedName("ManagerFirstName")
    @Expose
    private String ManagerFirstName;

    /**
    * Manager name
    */
    @SerializedName("ManagerLastName")
    @Expose
    private String ManagerLastName;

    /**
    * manager position
    */
    @SerializedName("ManagerPosition")
    @Expose
    private String ManagerPosition;

    /**
    * Manager phone
    */
    @SerializedName("ManagerPhone")
    @Expose
    private String ManagerPhone;

    /**
    * Manager mailbox
    */
    @SerializedName("ManagerMail")
    @Expose
    private String ManagerMail;

    /**
    * department of the manager
    */
    @SerializedName("ManagerDepartment")
    @Expose
    private String ManagerDepartment;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of domains for manager
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * Number of manager certificates
    */
    @SerializedName("CertCount")
    @Expose
    private Long CertCount;

    /**
    * Manager ID
    */
    @SerializedName("ManagerId")
    @Expose
    private Long ManagerId;

    /**
    * Review valid expiry time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Last submission review time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubmitAuditTime")
    @Expose
    private String SubmitAuditTime;

    /**
    * Approval Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyTime")
    @Expose
    private String VerifyTime;

    /**
    * Review status info
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusInfo")
    @Expose
    private ManagerStatusInfo [] StatusInfo;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
     * Get Status: audit: under review ok: pass invalid: invalid expiring: expiring soon expired: expired 
     * @return Status Status: audit: under review ok: pass invalid: invalid expiring: expiring soon expired: expired
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status: audit: under review ok: pass invalid: invalid expiring: expiring soon expired: expired
     * @param Status Status: audit: under review ok: pass invalid: invalid expiring: expiring soon expired: expired
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Manager name 
     * @return ManagerFirstName Manager name
     */
    public String getManagerFirstName() {
        return this.ManagerFirstName;
    }

    /**
     * Set Manager name
     * @param ManagerFirstName Manager name
     */
    public void setManagerFirstName(String ManagerFirstName) {
        this.ManagerFirstName = ManagerFirstName;
    }

    /**
     * Get Manager name 
     * @return ManagerLastName Manager name
     */
    public String getManagerLastName() {
        return this.ManagerLastName;
    }

    /**
     * Set Manager name
     * @param ManagerLastName Manager name
     */
    public void setManagerLastName(String ManagerLastName) {
        this.ManagerLastName = ManagerLastName;
    }

    /**
     * Get manager position 
     * @return ManagerPosition manager position
     */
    public String getManagerPosition() {
        return this.ManagerPosition;
    }

    /**
     * Set manager position
     * @param ManagerPosition manager position
     */
    public void setManagerPosition(String ManagerPosition) {
        this.ManagerPosition = ManagerPosition;
    }

    /**
     * Get Manager phone 
     * @return ManagerPhone Manager phone
     */
    public String getManagerPhone() {
        return this.ManagerPhone;
    }

    /**
     * Set Manager phone
     * @param ManagerPhone Manager phone
     */
    public void setManagerPhone(String ManagerPhone) {
        this.ManagerPhone = ManagerPhone;
    }

    /**
     * Get Manager mailbox 
     * @return ManagerMail Manager mailbox
     */
    public String getManagerMail() {
        return this.ManagerMail;
    }

    /**
     * Set Manager mailbox
     * @param ManagerMail Manager mailbox
     */
    public void setManagerMail(String ManagerMail) {
        this.ManagerMail = ManagerMail;
    }

    /**
     * Get department of the manager 
     * @return ManagerDepartment department of the manager
     */
    public String getManagerDepartment() {
        return this.ManagerDepartment;
    }

    /**
     * Set department of the manager
     * @param ManagerDepartment department of the manager
     */
    public void setManagerDepartment(String ManagerDepartment) {
        this.ManagerDepartment = ManagerDepartment;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of domains for manager 
     * @return DomainCount Number of domains for manager
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set Number of domains for manager
     * @param DomainCount Number of domains for manager
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get Number of manager certificates 
     * @return CertCount Number of manager certificates
     */
    public Long getCertCount() {
        return this.CertCount;
    }

    /**
     * Set Number of manager certificates
     * @param CertCount Number of manager certificates
     */
    public void setCertCount(Long CertCount) {
        this.CertCount = CertCount;
    }

    /**
     * Get Manager ID 
     * @return ManagerId Manager ID
     */
    public Long getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set Manager ID
     * @param ManagerId Manager ID
     */
    public void setManagerId(Long ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get Review valid expiry time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Review valid expiry time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Review valid expiry time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Review valid expiry time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Last submission review time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubmitAuditTime Last submission review time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubmitAuditTime() {
        return this.SubmitAuditTime;
    }

    /**
     * Set Last submission review time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubmitAuditTime Last submission review time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubmitAuditTime(String SubmitAuditTime) {
        this.SubmitAuditTime = SubmitAuditTime;
    }

    /**
     * Get Approval Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VerifyTime Approval Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVerifyTime() {
        return this.VerifyTime;
    }

    /**
     * Set Approval Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VerifyTime Approval Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyTime(String VerifyTime) {
        this.VerifyTime = VerifyTime;
    }

    /**
     * Get Review status info
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusInfo Review status info
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ManagerStatusInfo [] getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set Review status info
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusInfo Review status info
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusInfo(ManagerStatusInfo [] StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    public ManagerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagerInfo(ManagerInfo source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ManagerFirstName != null) {
            this.ManagerFirstName = new String(source.ManagerFirstName);
        }
        if (source.ManagerLastName != null) {
            this.ManagerLastName = new String(source.ManagerLastName);
        }
        if (source.ManagerPosition != null) {
            this.ManagerPosition = new String(source.ManagerPosition);
        }
        if (source.ManagerPhone != null) {
            this.ManagerPhone = new String(source.ManagerPhone);
        }
        if (source.ManagerMail != null) {
            this.ManagerMail = new String(source.ManagerMail);
        }
        if (source.ManagerDepartment != null) {
            this.ManagerDepartment = new String(source.ManagerDepartment);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.CertCount != null) {
            this.CertCount = new Long(source.CertCount);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new Long(source.ManagerId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.SubmitAuditTime != null) {
            this.SubmitAuditTime = new String(source.SubmitAuditTime);
        }
        if (source.VerifyTime != null) {
            this.VerifyTime = new String(source.VerifyTime);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new ManagerStatusInfo[source.StatusInfo.length];
            for (int i = 0; i < source.StatusInfo.length; i++) {
                this.StatusInfo[i] = new ManagerStatusInfo(source.StatusInfo[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ManagerFirstName", this.ManagerFirstName);
        this.setParamSimple(map, prefix + "ManagerLastName", this.ManagerLastName);
        this.setParamSimple(map, prefix + "ManagerPosition", this.ManagerPosition);
        this.setParamSimple(map, prefix + "ManagerPhone", this.ManagerPhone);
        this.setParamSimple(map, prefix + "ManagerMail", this.ManagerMail);
        this.setParamSimple(map, prefix + "ManagerDepartment", this.ManagerDepartment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "CertCount", this.CertCount);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "SubmitAuditTime", this.SubmitAuditTime);
        this.setParamSimple(map, prefix + "VerifyTime", this.VerifyTime);
        this.setParamArrayObj(map, prefix + "StatusInfo.", this.StatusInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

