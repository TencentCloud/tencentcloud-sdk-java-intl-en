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
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * Agent'S telephone number (with 0086 prefix).
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
    * User id.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * List of skill groups associated with the agent.
    */
    @SerializedName("SkillGroupNameList")
    @Expose
    private String [] SkillGroupNameList;

    /**
    * 1: admin.
2: quality inspector.
3: ordinary agent.
Else: custom role id.
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

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
     * Get Worker number. 
     * @return StaffNumber Worker number.
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set Worker number.
     * @param StaffNumber Worker number.
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get Agent'S telephone number (with 0086 prefix). 
     * @return Phone Agent'S telephone number (with 0086 prefix).
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Agent'S telephone number (with 0086 prefix).
     * @param Phone Agent'S telephone number (with 0086 prefix).
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
     * Get User id. 
     * @return UserId User id.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User id.
     * @param UserId User id.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get List of skill groups associated with the agent. 
     * @return SkillGroupNameList List of skill groups associated with the agent.
     */
    public String [] getSkillGroupNameList() {
        return this.SkillGroupNameList;
    }

    /**
     * Set List of skill groups associated with the agent.
     * @param SkillGroupNameList List of skill groups associated with the agent.
     */
    public void setSkillGroupNameList(String [] SkillGroupNameList) {
        this.SkillGroupNameList = SkillGroupNameList;
    }

    /**
     * Get 1: admin.
2: quality inspector.
3: ordinary agent.
Else: custom role id. 
     * @return Role 1: admin.
2: quality inspector.
3: ordinary agent.
Else: custom role id.
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set 1: admin.
2: quality inspector.
3: ordinary agent.
Else: custom role id.
     * @param Role 1: admin.
2: quality inspector.
3: ordinary agent.
Else: custom role id.
     */
    public void setRole(Long Role) {
        this.Role = Role;
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
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "SkillGroupNameList.", this.SkillGroupNameList);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "ExtensionNumber", this.ExtensionNumber);

    }
}

