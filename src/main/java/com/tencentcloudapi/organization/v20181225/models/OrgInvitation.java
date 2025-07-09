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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgInvitation extends AbstractModel {

    /**
    * Invitation ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * UIN of the invitee
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Creator UIN
    */
    @SerializedName("HostUin")
    @Expose
    private Long HostUin;

    /**
    * Creator's name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Creator's email address
    */
    @SerializedName("HostMail")
    @Expose
    private String HostMail;

    /**
    * Invitation status. `-1`: expired; `0`: normal; `1`: accepted; `2`: invalid; `3`: cancelled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notes
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Organization type
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
    * Time of invitation
    */
    @SerializedName("InviteTime")
    @Expose
    private String InviteTime;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Invitation ID 
     * @return Id Invitation ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Invitation ID
     * @param Id Invitation ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get UIN of the invitee 
     * @return Uin UIN of the invitee
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set UIN of the invitee
     * @param Uin UIN of the invitee
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Creator UIN 
     * @return HostUin Creator UIN
     */
    public Long getHostUin() {
        return this.HostUin;
    }

    /**
     * Set Creator UIN
     * @param HostUin Creator UIN
     */
    public void setHostUin(Long HostUin) {
        this.HostUin = HostUin;
    }

    /**
     * Get Creator's name 
     * @return HostName Creator's name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Creator's name
     * @param HostName Creator's name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Creator's email address 
     * @return HostMail Creator's email address
     */
    public String getHostMail() {
        return this.HostMail;
    }

    /**
     * Set Creator's email address
     * @param HostMail Creator's email address
     */
    public void setHostMail(String HostMail) {
        this.HostMail = HostMail;
    }

    /**
     * Get Invitation status. `-1`: expired; `0`: normal; `1`: accepted; `2`: invalid; `3`: cancelled 
     * @return Status Invitation status. `-1`: expired; `0`: normal; `1`: accepted; `2`: invalid; `3`: cancelled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Invitation status. `-1`: expired; `0`: normal; `1`: accepted; `2`: invalid; `3`: cancelled
     * @param Status Invitation status. `-1`: expired; `0`: normal; `1`: accepted; `2`: invalid; `3`: cancelled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Notes 
     * @return Remark Notes
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Notes
     * @param Remark Notes
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Organization type 
     * @return OrgType Organization type
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * Set Organization type
     * @param OrgType Organization type
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    /**
     * Get Time of invitation 
     * @return InviteTime Time of invitation
     */
    public String getInviteTime() {
        return this.InviteTime;
    }

    /**
     * Set Time of invitation
     * @param InviteTime Time of invitation
     */
    public void setInviteTime(String InviteTime) {
        this.InviteTime = InviteTime;
    }

    /**
     * Get Expiration time 
     * @return ExpireTime Expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
     * @param ExpireTime Expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public OrgInvitation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgInvitation(OrgInvitation source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.HostUin != null) {
            this.HostUin = new Long(source.HostUin);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostMail != null) {
            this.HostMail = new String(source.HostMail);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.OrgType != null) {
            this.OrgType = new Long(source.OrgType);
        }
        if (source.InviteTime != null) {
            this.InviteTime = new String(source.InviteTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "HostUin", this.HostUin);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostMail", this.HostMail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OrgType", this.OrgType);
        this.setParamSimple(map, prefix + "InviteTime", this.InviteTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

