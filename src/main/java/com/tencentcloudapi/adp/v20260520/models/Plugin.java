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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Plugin extends AbstractModel {

    /**
    * Plug-in configuration
    */
    @SerializedName("Config")
    @Expose
    private PluginConfig Config;

    /**
    * Creation time, Unix Timestamp
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Plug-in operation management information
    */
    @SerializedName("Operation")
    @Expose
    private PluginOperation Operation;

    /**
    * Plugin ID
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * Plugin version number
    */
    @SerializedName("PluginVersion")
    @Expose
    private Long PluginVersion;

    /**
    * Basic plug-in information.
    */
    @SerializedName("Profile")
    @Expose
    private PluginProfile Profile;

    /**
    * Plug-in statistical information
    */
    @SerializedName("Statistics")
    @Expose
    private PluginStatistics Statistics;

    /**
    * <p>Plug-in status. 1: available, 2: unavailable </p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Tool list
    */
    @SerializedName("ToolList")
    @Expose
    private Tool [] ToolList;

    /**
    * Update time, Unix timestamp
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Plugin status information by user dimension
    */
    @SerializedName("UserState")
    @Expose
    private PluginUserState UserState;

    /**
     * Get Plug-in configuration 
     * @return Config Plug-in configuration
     */
    public PluginConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Plug-in configuration
     * @param Config Plug-in configuration
     */
    public void setConfig(PluginConfig Config) {
        this.Config = Config;
    }

    /**
     * Get Creation time, Unix Timestamp 
     * @return CreateTime Creation time, Unix Timestamp
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, Unix Timestamp
     * @param CreateTime Creation time, Unix Timestamp
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Plug-in operation management information 
     * @return Operation Plug-in operation management information
     */
    public PluginOperation getOperation() {
        return this.Operation;
    }

    /**
     * Set Plug-in operation management information
     * @param Operation Plug-in operation management information
     */
    public void setOperation(PluginOperation Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Plugin ID 
     * @return PluginId Plugin ID
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set Plugin ID
     * @param PluginId Plugin ID
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get Plugin version number 
     * @return PluginVersion Plugin version number
     */
    public Long getPluginVersion() {
        return this.PluginVersion;
    }

    /**
     * Set Plugin version number
     * @param PluginVersion Plugin version number
     */
    public void setPluginVersion(Long PluginVersion) {
        this.PluginVersion = PluginVersion;
    }

    /**
     * Get Basic plug-in information. 
     * @return Profile Basic plug-in information.
     */
    public PluginProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set Basic plug-in information.
     * @param Profile Basic plug-in information.
     */
    public void setProfile(PluginProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Plug-in statistical information 
     * @return Statistics Plug-in statistical information
     */
    public PluginStatistics getStatistics() {
        return this.Statistics;
    }

    /**
     * Set Plug-in statistical information
     * @param Statistics Plug-in statistical information
     */
    public void setStatistics(PluginStatistics Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get <p>Plug-in status. 1: available, 2: unavailable </p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li></ul> 
     * @return Status <p>Plug-in status. 1: available, 2: unavailable </p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Plug-in status. 1: available, 2: unavailable </p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li></ul>
     * @param Status <p>Plug-in status. 1: available, 2: unavailable </p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Tool list 
     * @return ToolList Tool list
     */
    public Tool [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set Tool list
     * @param ToolList Tool list
     */
    public void setToolList(Tool [] ToolList) {
        this.ToolList = ToolList;
    }

    /**
     * Get Update time, Unix timestamp 
     * @return UpdateTime Update time, Unix timestamp
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time, Unix timestamp
     * @param UpdateTime Update time, Unix timestamp
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Plugin status information by user dimension 
     * @return UserState Plugin status information by user dimension
     */
    public PluginUserState getUserState() {
        return this.UserState;
    }

    /**
     * Set Plugin status information by user dimension
     * @param UserState Plugin status information by user dimension
     */
    public void setUserState(PluginUserState UserState) {
        this.UserState = UserState;
    }

    public Plugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Plugin(Plugin source) {
        if (source.Config != null) {
            this.Config = new PluginConfig(source.Config);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Operation != null) {
            this.Operation = new PluginOperation(source.Operation);
        }
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginVersion != null) {
            this.PluginVersion = new Long(source.PluginVersion);
        }
        if (source.Profile != null) {
            this.Profile = new PluginProfile(source.Profile);
        }
        if (source.Statistics != null) {
            this.Statistics = new PluginStatistics(source.Statistics);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ToolList != null) {
            this.ToolList = new Tool[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new Tool(source.ToolList[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UserState != null) {
            this.UserState = new PluginUserState(source.UserState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Operation.", this.Operation);
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginVersion", this.PluginVersion);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "UserState.", this.UserState);

    }
}

