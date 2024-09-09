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

public class ModifyStaffRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Agent account.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Agent name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Agent phone number (preceded by 0086, example: 008618011111111).
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
    * Agent ID
    */
    @SerializedName("StaffNo")
    @Expose
    private String StaffNo;

    /**
    * Bind skill group ID list.
    */
    @SerializedName("SkillGroupIds")
    @Expose
    private Long [] SkillGroupIds;

    /**
    * Whether the cell phone outbound call switch is enabled or not.
    */
    @SerializedName("UseMobileCallOut")
    @Expose
    private Boolean UseMobileCallOut;

    /**
    * Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always.
    */
    @SerializedName("UseMobileAccept")
    @Expose
    private Long UseMobileAccept;

    /**
     * Get Application ID 
     * @return SdkAppId Application ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID
     * @param SdkAppId Application ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Agent account. 
     * @return Email Agent account.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Agent account.
     * @param Email Agent account.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

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
     * Get Agent phone number (preceded by 0086, example: 008618011111111). 
     * @return Phone Agent phone number (preceded by 0086, example: 008618011111111).
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Agent phone number (preceded by 0086, example: 008618011111111).
     * @param Phone Agent phone number (preceded by 0086, example: 008618011111111).
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
     * Get Agent ID 
     * @return StaffNo Agent ID
     */
    public String getStaffNo() {
        return this.StaffNo;
    }

    /**
     * Set Agent ID
     * @param StaffNo Agent ID
     */
    public void setStaffNo(String StaffNo) {
        this.StaffNo = StaffNo;
    }

    /**
     * Get Bind skill group ID list. 
     * @return SkillGroupIds Bind skill group ID list.
     */
    public Long [] getSkillGroupIds() {
        return this.SkillGroupIds;
    }

    /**
     * Set Bind skill group ID list.
     * @param SkillGroupIds Bind skill group ID list.
     */
    public void setSkillGroupIds(Long [] SkillGroupIds) {
        this.SkillGroupIds = SkillGroupIds;
    }

    /**
     * Get Whether the cell phone outbound call switch is enabled or not. 
     * @return UseMobileCallOut Whether the cell phone outbound call switch is enabled or not.
     */
    public Boolean getUseMobileCallOut() {
        return this.UseMobileCallOut;
    }

    /**
     * Set Whether the cell phone outbound call switch is enabled or not.
     * @param UseMobileCallOut Whether the cell phone outbound call switch is enabled or not.
     */
    public void setUseMobileCallOut(Boolean UseMobileCallOut) {
        this.UseMobileCallOut = UseMobileCallOut;
    }

    /**
     * Get Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always. 
     * @return UseMobileAccept Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always.
     */
    public Long getUseMobileAccept() {
        return this.UseMobileAccept;
    }

    /**
     * Set Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always.
     * @param UseMobileAccept Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always.
     */
    public void setUseMobileAccept(Long UseMobileAccept) {
        this.UseMobileAccept = UseMobileAccept;
    }

    public ModifyStaffRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStaffRequest(ModifyStaffRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.StaffNo != null) {
            this.StaffNo = new String(source.StaffNo);
        }
        if (source.SkillGroupIds != null) {
            this.SkillGroupIds = new Long[source.SkillGroupIds.length];
            for (int i = 0; i < source.SkillGroupIds.length; i++) {
                this.SkillGroupIds[i] = new Long(source.SkillGroupIds[i]);
            }
        }
        if (source.UseMobileCallOut != null) {
            this.UseMobileCallOut = new Boolean(source.UseMobileCallOut);
        }
        if (source.UseMobileAccept != null) {
            this.UseMobileAccept = new Long(source.UseMobileAccept);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "StaffNo", this.StaffNo);
        this.setParamArraySimple(map, prefix + "SkillGroupIds.", this.SkillGroupIds);
        this.setParamSimple(map, prefix + "UseMobileCallOut", this.UseMobileCallOut);
        this.setParamSimple(map, prefix + "UseMobileAccept", this.UseMobileAccept);

    }
}

