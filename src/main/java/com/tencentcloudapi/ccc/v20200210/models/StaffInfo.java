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
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Agent's Telephone Number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Agent nickname.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * Agent ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * User Role ID
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * Affiliated Skill Group List.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkillGroupList")
    @Expose
    private SkillGroupItem [] SkillGroupList;

    /**
    * Last modification time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTimestamp")
    @Expose
    private Long LastModifyTimestamp;

    /**
     * Get Agent name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Agent name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Agent name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Agent name.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Agent's Telephone Number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Phone Agent's Telephone Number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Agent's Telephone Number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Phone Agent's Telephone Number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Agent nickname.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nick Agent nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set Agent nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nick Agent nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get Agent ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StaffNumber Agent ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set Agent ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StaffNumber Agent ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get User Role ID 
     * @return RoleId User Role ID
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set User Role ID
     * @param RoleId User Role ID
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Affiliated Skill Group List.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SkillGroupList Affiliated Skill Group List.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SkillGroupItem [] getSkillGroupList() {
        return this.SkillGroupList;
    }

    /**
     * Set Affiliated Skill Group List.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SkillGroupList Affiliated Skill Group List.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSkillGroupList(SkillGroupItem [] SkillGroupList) {
        this.SkillGroupList = SkillGroupList;
    }

    /**
     * Get Last modification time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifyTimestamp Last modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastModifyTimestamp() {
        return this.LastModifyTimestamp;
    }

    /**
     * Set Last modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifyTimestamp Last modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifyTimestamp(Long LastModifyTimestamp) {
        this.LastModifyTimestamp = LastModifyTimestamp;
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

    }
}

