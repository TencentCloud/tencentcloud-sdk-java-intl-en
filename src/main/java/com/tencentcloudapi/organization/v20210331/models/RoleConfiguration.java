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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleConfiguration extends AbstractModel {

    /**
    * Permission configuration ID.
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * Permission configuration name.
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * Permission configuration description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Session duration. It indicates the maximum session duration when CIC users use the access configuration to access member accounts.
Unit: seconds.
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

    /**
    * Initial access page. It indicates the initial access page URL when CIC users use the access configuration to access member accounts.
    */
    @SerializedName("RelayState")
    @Expose
    private String RelayState;

    /**
    * Creation time of the permission configuration.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time of the permission configuration.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * If the input parameter FilterTargets is provided, check whether the member account has been configured with permissions. If configured, return true; otherwise, return false.
    */
    @SerializedName("IsSelected")
    @Expose
    private Boolean IsSelected;

    /**
     * Get Permission configuration ID. 
     * @return RoleConfigurationId Permission configuration ID.
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set Permission configuration ID.
     * @param RoleConfigurationId Permission configuration ID.
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get Permission configuration name. 
     * @return RoleConfigurationName Permission configuration name.
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set Permission configuration name.
     * @param RoleConfigurationName Permission configuration name.
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get Permission configuration description. 
     * @return Description Permission configuration description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Permission configuration description.
     * @param Description Permission configuration description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Session duration. It indicates the maximum session duration when CIC users use the access configuration to access member accounts.
Unit: seconds. 
     * @return SessionDuration Session duration. It indicates the maximum session duration when CIC users use the access configuration to access member accounts.
Unit: seconds.
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set Session duration. It indicates the maximum session duration when CIC users use the access configuration to access member accounts.
Unit: seconds.
     * @param SessionDuration Session duration. It indicates the maximum session duration when CIC users use the access configuration to access member accounts.
Unit: seconds.
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    /**
     * Get Initial access page. It indicates the initial access page URL when CIC users use the access configuration to access member accounts. 
     * @return RelayState Initial access page. It indicates the initial access page URL when CIC users use the access configuration to access member accounts.
     */
    public String getRelayState() {
        return this.RelayState;
    }

    /**
     * Set Initial access page. It indicates the initial access page URL when CIC users use the access configuration to access member accounts.
     * @param RelayState Initial access page. It indicates the initial access page URL when CIC users use the access configuration to access member accounts.
     */
    public void setRelayState(String RelayState) {
        this.RelayState = RelayState;
    }

    /**
     * Get Creation time of the permission configuration. 
     * @return CreateTime Creation time of the permission configuration.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the permission configuration.
     * @param CreateTime Creation time of the permission configuration.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time of the permission configuration. 
     * @return UpdateTime Update time of the permission configuration.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time of the permission configuration.
     * @param UpdateTime Update time of the permission configuration.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get If the input parameter FilterTargets is provided, check whether the member account has been configured with permissions. If configured, return true; otherwise, return false. 
     * @return IsSelected If the input parameter FilterTargets is provided, check whether the member account has been configured with permissions. If configured, return true; otherwise, return false.
     */
    public Boolean getIsSelected() {
        return this.IsSelected;
    }

    /**
     * Set If the input parameter FilterTargets is provided, check whether the member account has been configured with permissions. If configured, return true; otherwise, return false.
     * @param IsSelected If the input parameter FilterTargets is provided, check whether the member account has been configured with permissions. If configured, return true; otherwise, return false.
     */
    public void setIsSelected(Boolean IsSelected) {
        this.IsSelected = IsSelected;
    }

    public RoleConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleConfiguration(RoleConfiguration source) {
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RoleConfigurationName != null) {
            this.RoleConfigurationName = new String(source.RoleConfigurationName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SessionDuration != null) {
            this.SessionDuration = new Long(source.SessionDuration);
        }
        if (source.RelayState != null) {
            this.RelayState = new String(source.RelayState);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsSelected != null) {
            this.IsSelected = new Boolean(source.IsSelected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SessionDuration", this.SessionDuration);
        this.setParamSimple(map, prefix + "RelayState", this.RelayState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsSelected", this.IsSelected);

    }
}

