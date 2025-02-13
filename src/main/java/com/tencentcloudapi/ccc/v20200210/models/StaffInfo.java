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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffInfo extends AbstractModel {

    /**
    * Agent name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Agent email.
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * Agent phone number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Agent nickname.
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * Agent id.
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * User role id.
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * Affiliated skill group list.
    */
    @SerializedName("SkillGroupList")
    @Expose
    private SkillGroupItem [] SkillGroupList;

    /**
    * Last modification time.
    */
    @SerializedName("LastModifyTimestamp")
    @Expose
    private Long LastModifyTimestamp;

    /**
    * Agent extension number (starting with 1 to 8, 4 - 6 digits).
    */
    @SerializedName("ExtensionNumber")
    @Expose
    private String ExtensionNumber;

    /**
     * Get Agent name. 
     * @return Name Agent name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Agent name.
     * @param Name Agent name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Agent email. 
     * @return Mail Agent email.
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set Agent email.
     * @param Mail Agent email.
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get Agent phone number. 
     * @return Phone Agent phone number.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Agent phone number.
     * @param Phone Agent phone number.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Agent nickname. 
     * @return Nick Agent nickname.
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set Agent nickname.
     * @param Nick Agent nickname.
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get Agent id. 
     * @return StaffNumber Agent id.
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set Agent id.
     * @param StaffNumber Agent id.
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get User role id. 
     * @return RoleId User role id.
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set User role id.
     * @param RoleId User role id.
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Affiliated skill group list. 
     * @return SkillGroupList Affiliated skill group list.
     */
    public SkillGroupItem [] getSkillGroupList() {
        return this.SkillGroupList;
    }

    /**
     * Set Affiliated skill group list.
     * @param SkillGroupList Affiliated skill group list.
     */
    public void setSkillGroupList(SkillGroupItem [] SkillGroupList) {
        this.SkillGroupList = SkillGroupList;
    }

    /**
     * Get Last modification time. 
     * @return LastModifyTimestamp Last modification time.
     */
    public Long getLastModifyTimestamp() {
        return this.LastModifyTimestamp;
    }

    /**
     * Set Last modification time.
     * @param LastModifyTimestamp Last modification time.
     */
    public void setLastModifyTimestamp(Long LastModifyTimestamp) {
        this.LastModifyTimestamp = LastModifyTimestamp;
    }

    /**
     * Get Agent extension number (starting with 1 to 8, 4 - 6 digits). 
     * @return ExtensionNumber Agent extension number (starting with 1 to 8, 4 - 6 digits).
     */
    public String getExtensionNumber() {
        return this.ExtensionNumber;
    }

    /**
     * Set Agent extension number (starting with 1 to 8, 4 - 6 digits).
     * @param ExtensionNumber Agent extension number (starting with 1 to 8, 4 - 6 digits).
     */
    public void setExtensionNumber(String ExtensionNumber) {
        this.ExtensionNumber = ExtensionNumber;
    }

    public StaffInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffInfo(StaffInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.StaffNumber != null) {
            this.StaffNumber = new String(source.StaffNumber);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.SkillGroupList != null) {
            this.SkillGroupList = new SkillGroupItem[source.SkillGroupList.length];
            for (int i = 0; i < source.SkillGroupList.length; i++) {
                this.SkillGroupList[i] = new SkillGroupItem(source.SkillGroupList[i]);
            }
        }
        if (source.LastModifyTimestamp != null) {
            this.LastModifyTimestamp = new Long(source.LastModifyTimestamp);
        }
        if (source.ExtensionNumber != null) {
            this.ExtensionNumber = new String(source.ExtensionNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamArrayObj(map, prefix + "SkillGroupList.", this.SkillGroupList);
        this.setParamSimple(map, prefix + "LastModifyTimestamp", this.LastModifyTimestamp);
        this.setParamSimple(map, prefix + "ExtensionNumber", this.ExtensionNumber);

    }
}

