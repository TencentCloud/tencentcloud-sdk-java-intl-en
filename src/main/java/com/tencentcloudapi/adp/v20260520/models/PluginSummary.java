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

public class PluginSummary extends AbstractModel {

    /**
    * <p>Plug-in configuration message.</p>
    */
    @SerializedName("Config")
    @Expose
    private PluginConfig Config;

    /**
    * <p>Whether shared is configured</p>
    */
    @SerializedName("IsShared")
    @Expose
    private Boolean IsShared;

    /**
    * <p>Plugin operation management information.</p>
    */
    @SerializedName("Operation")
    @Expose
    private PluginOperation Operation;

    /**
    * <p>plugin_id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>Basic information of the plug-in.</p>
    */
    @SerializedName("Profile")
    @Expose
    private PluginProfile Profile;

    /**
    * <p>Space ID that the plug-in belongs to; empty for built-in plugins</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Plugin statistical information.</p>
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
    * <p>Tool information</p>
    */
    @SerializedName("ToolList")
    @Expose
    private ToolSummary [] ToolList;

    /**
    * <p>Plugin status information by user dimension</p>
    */
    @SerializedName("UserState")
    @Expose
    private PluginUserState UserState;

    /**
    * <p>Update time, Unix timestamp</p><p>Unit: seconds</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Plug-in configuration message.</p> 
     * @return Config <p>Plug-in configuration message.</p>
     */
    public PluginConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Plug-in configuration message.</p>
     * @param Config <p>Plug-in configuration message.</p>
     */
    public void setConfig(PluginConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Whether shared is configured</p> 
     * @return IsShared <p>Whether shared is configured</p>
     */
    public Boolean getIsShared() {
        return this.IsShared;
    }

    /**
     * Set <p>Whether shared is configured</p>
     * @param IsShared <p>Whether shared is configured</p>
     */
    public void setIsShared(Boolean IsShared) {
        this.IsShared = IsShared;
    }

    /**
     * Get <p>Plugin operation management information.</p> 
     * @return Operation <p>Plugin operation management information.</p>
     */
    public PluginOperation getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>Plugin operation management information.</p>
     * @param Operation <p>Plugin operation management information.</p>
     */
    public void setOperation(PluginOperation Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>plugin_id</p> 
     * @return PluginId <p>plugin_id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>plugin_id</p>
     * @param PluginId <p>plugin_id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>Basic information of the plug-in.</p> 
     * @return Profile <p>Basic information of the plug-in.</p>
     */
    public PluginProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>Basic information of the plug-in.</p>
     * @param Profile <p>Basic information of the plug-in.</p>
     */
    public void setProfile(PluginProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>Space ID that the plug-in belongs to; empty for built-in plugins</p> 
     * @return SpaceId <p>Space ID that the plug-in belongs to; empty for built-in plugins</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space ID that the plug-in belongs to; empty for built-in plugins</p>
     * @param SpaceId <p>Space ID that the plug-in belongs to; empty for built-in plugins</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Plugin statistical information.</p> 
     * @return Statistics <p>Plugin statistical information.</p>
     */
    public PluginStatistics getStatistics() {
        return this.Statistics;
    }

    /**
     * Set <p>Plugin statistical information.</p>
     * @param Statistics <p>Plugin statistical information.</p>
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
     * Get <p>Tool information</p> 
     * @return ToolList <p>Tool information</p>
     */
    public ToolSummary [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>Tool information</p>
     * @param ToolList <p>Tool information</p>
     */
    public void setToolList(ToolSummary [] ToolList) {
        this.ToolList = ToolList;
    }

    /**
     * Get <p>Plugin status information by user dimension</p> 
     * @return UserState <p>Plugin status information by user dimension</p>
     */
    public PluginUserState getUserState() {
        return this.UserState;
    }

    /**
     * Set <p>Plugin status information by user dimension</p>
     * @param UserState <p>Plugin status information by user dimension</p>
     */
    public void setUserState(PluginUserState UserState) {
        this.UserState = UserState;
    }

    /**
     * Get <p>Update time, Unix timestamp</p><p>Unit: seconds</p> 
     * @return UpdateTime <p>Update time, Unix timestamp</p><p>Unit: seconds</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time, Unix timestamp</p><p>Unit: seconds</p>
     * @param UpdateTime <p>Update time, Unix timestamp</p><p>Unit: seconds</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public PluginSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginSummary(PluginSummary source) {
        if (source.Config != null) {
            this.Config = new PluginConfig(source.Config);
        }
        if (source.IsShared != null) {
            this.IsShared = new Boolean(source.IsShared);
        }
        if (source.Operation != null) {
            this.Operation = new PluginOperation(source.Operation);
        }
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Profile != null) {
            this.Profile = new PluginProfile(source.Profile);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Statistics != null) {
            this.Statistics = new PluginStatistics(source.Statistics);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ToolList != null) {
            this.ToolList = new ToolSummary[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new ToolSummary(source.ToolList[i]);
            }
        }
        if (source.UserState != null) {
            this.UserState = new PluginUserState(source.UserState);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "IsShared", this.IsShared);
        this.setParamObj(map, prefix + "Operation.", this.Operation);
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);
        this.setParamObj(map, prefix + "UserState.", this.UserState);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

