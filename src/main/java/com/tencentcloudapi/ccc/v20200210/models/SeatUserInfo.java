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

public class SeatUserInfo extends AbstractModel {

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
    * Worker number.
Note: This field may return null, indicating that no valid value could be obtained.
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * Agent's Telephone Number (With 0086 Prefix)
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
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * List of skill groups associated with the seat
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkillGroupNameList")
    @Expose
    private String [] SkillGroupNameList;

    /**
    * 1: Admin.
2: Quality inspector.
3: Ordinary agent.
else: Custom Role ID.
Note: This field may return null, indicating that no valid value could be obtained.
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

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
     * Get Worker number.
Note: This field may return null, indicating that no valid value could be obtained. 
     * @return StaffNumber Worker number.
Note: This field may return null, indicating that no valid value could be obtained.
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set Worker number.
Note: This field may return null, indicating that no valid value could be obtained.
     * @param StaffNumber Worker number.
Note: This field may return null, indicating that no valid value could be obtained.
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get Agent's Telephone Number (With 0086 Prefix) 
     * @return Phone Agent's Telephone Number (With 0086 Prefix)
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Agent's Telephone Number (With 0086 Prefix)
     * @param Phone Agent's Telephone Number (With 0086 Prefix)
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
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get List of skill groups associated with the seat
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SkillGroupNameList List of skill groups associated with the seat
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSkillGroupNameList() {
        return this.SkillGroupNameList;
    }

    /**
     * Set List of skill groups associated with the seat
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SkillGroupNameList List of skill groups associated with the seat
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSkillGroupNameList(String [] SkillGroupNameList) {
        this.SkillGroupNameList = SkillGroupNameList;
    }

    /**
     * Get 1: Admin.
2: Quality inspector.
3: Ordinary agent.
else: Custom Role ID.
Note: This field may return null, indicating that no valid value could be obtained. 
     * @return Role 1: Admin.
2: Quality inspector.
3: Ordinary agent.
else: Custom Role ID.
Note: This field may return null, indicating that no valid value could be obtained.
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set 1: Admin.
2: Quality inspector.
3: Ordinary agent.
else: Custom Role ID.
Note: This field may return null, indicating that no valid value could be obtained.
     * @param Role 1: Admin.
2: Quality inspector.
3: Ordinary agent.
else: Custom Role ID.
Note: This field may return null, indicating that no valid value could be obtained.
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    public SeatUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeatUserInfo(SeatUserInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.StaffNumber != null) {
            this.StaffNumber = new String(source.StaffNumber);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SkillGroupNameList != null) {
            this.SkillGroupNameList = new String[source.SkillGroupNameList.length];
            for (int i = 0; i < source.SkillGroupNameList.length; i++) {
                this.SkillGroupNameList[i] = new String(source.SkillGroupNameList[i]);
            }
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "SkillGroupNameList.", this.SkillGroupNameList);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

