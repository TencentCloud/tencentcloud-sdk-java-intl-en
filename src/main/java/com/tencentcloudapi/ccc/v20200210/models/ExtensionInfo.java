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

public class ExtensionInfo extends AbstractModel {

    /**
    * Instance id.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Extension full name.
    */
    @SerializedName("FullExtensionId")
    @Expose
    private String FullExtensionId;

    /**
    * Extension.
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * Affiliated skill group list.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private String SkillGroupId;

    /**
    * Extension name.
    */
    @SerializedName("ExtensionName")
    @Expose
    private String ExtensionName;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Last modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * Telephone status (0 offline, 100 free, 200 busy).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether to register.
    */
    @SerializedName("Register")
    @Expose
    private Boolean Register;

    /**
    * Bind agent email.
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
    * Bind agent name.
    */
    @SerializedName("RelationName")
    @Expose
    private String RelationName;

    /**
     * Get Instance id. 
     * @return SdkAppId Instance id.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Instance id.
     * @param SdkAppId Instance id.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Extension full name. 
     * @return FullExtensionId Extension full name.
     */
    public String getFullExtensionId() {
        return this.FullExtensionId;
    }

    /**
     * Set Extension full name.
     * @param FullExtensionId Extension full name.
     */
    public void setFullExtensionId(String FullExtensionId) {
        this.FullExtensionId = FullExtensionId;
    }

    /**
     * Get Extension. 
     * @return ExtensionId Extension.
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set Extension.
     * @param ExtensionId Extension.
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get Affiliated skill group list. 
     * @return SkillGroupId Affiliated skill group list.
     */
    public String getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Affiliated skill group list.
     * @param SkillGroupId Affiliated skill group list.
     */
    public void setSkillGroupId(String SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get Extension name. 
     * @return ExtensionName Extension name.
     */
    public String getExtensionName() {
        return this.ExtensionName;
    }

    /**
     * Set Extension name.
     * @param ExtensionName Extension name.
     */
    public void setExtensionName(String ExtensionName) {
        this.ExtensionName = ExtensionName;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time. 
     * @return ModifyTime Last modification time.
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last modification time.
     * @param ModifyTime Last modification time.
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Telephone status (0 offline, 100 free, 200 busy). 
     * @return Status Telephone status (0 offline, 100 free, 200 busy).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Telephone status (0 offline, 100 free, 200 busy).
     * @param Status Telephone status (0 offline, 100 free, 200 busy).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether to register. 
     * @return Register Whether to register.
     */
    public Boolean getRegister() {
        return this.Register;
    }

    /**
     * Set Whether to register.
     * @param Register Whether to register.
     */
    public void setRegister(Boolean Register) {
        this.Register = Register;
    }

    /**
     * Get Bind agent email. 
     * @return Relation Bind agent email.
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set Bind agent email.
     * @param Relation Bind agent email.
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    /**
     * Get Bind agent name. 
     * @return RelationName Bind agent name.
     */
    public String getRelationName() {
        return this.RelationName;
    }

    /**
     * Set Bind agent name.
     * @param RelationName Bind agent name.
     */
    public void setRelationName(String RelationName) {
        this.RelationName = RelationName;
    }

    public ExtensionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtensionInfo(ExtensionInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.FullExtensionId != null) {
            this.FullExtensionId = new String(source.FullExtensionId);
        }
        if (source.ExtensionId != null) {
            this.ExtensionId = new String(source.ExtensionId);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new String(source.SkillGroupId);
        }
        if (source.ExtensionName != null) {
            this.ExtensionName = new String(source.ExtensionName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Register != null) {
            this.Register = new Boolean(source.Register);
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
        if (source.RelationName != null) {
            this.RelationName = new String(source.RelationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "FullExtensionId", this.FullExtensionId);
        this.setParamSimple(map, prefix + "ExtensionId", this.ExtensionId);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "ExtensionName", this.ExtensionName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Register", this.Register);
        this.setParamSimple(map, prefix + "Relation", this.Relation);
        this.setParamSimple(map, prefix + "RelationName", this.RelationName);

    }
}

