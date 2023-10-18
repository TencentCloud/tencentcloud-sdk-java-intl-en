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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVulDefenceSettingRequest extends AbstractModel {

    /**
    * Whether it is enabled. Valid values: `0` (disabled); `1` (enabled).
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Scope of servers for which to enable exploit prevention. Valid values: `0` (specified servers); `1` (all servers). This parameter is required when `IsEnabled` is `1`.
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * Specified servers for which to enable exploit prevention. This parameter is required when `Scope` is `0`.
    */
    @SerializedName("HostIDs")
    @Expose
    private String [] HostIDs;

    /**
     * Get Whether it is enabled. Valid values: `0` (disabled); `1` (enabled). 
     * @return IsEnabled Whether it is enabled. Valid values: `0` (disabled); `1` (enabled).
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether it is enabled. Valid values: `0` (disabled); `1` (enabled).
     * @param IsEnabled Whether it is enabled. Valid values: `0` (disabled); `1` (enabled).
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Scope of servers for which to enable exploit prevention. Valid values: `0` (specified servers); `1` (all servers). This parameter is required when `IsEnabled` is `1`. 
     * @return Scope Scope of servers for which to enable exploit prevention. Valid values: `0` (specified servers); `1` (all servers). This parameter is required when `IsEnabled` is `1`.
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set Scope of servers for which to enable exploit prevention. Valid values: `0` (specified servers); `1` (all servers). This parameter is required when `IsEnabled` is `1`.
     * @param Scope Scope of servers for which to enable exploit prevention. Valid values: `0` (specified servers); `1` (all servers). This parameter is required when `IsEnabled` is `1`.
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Specified servers for which to enable exploit prevention. This parameter is required when `Scope` is `0`. 
     * @return HostIDs Specified servers for which to enable exploit prevention. This parameter is required when `Scope` is `0`.
     */
    public String [] getHostIDs() {
        return this.HostIDs;
    }

    /**
     * Set Specified servers for which to enable exploit prevention. This parameter is required when `Scope` is `0`.
     * @param HostIDs Specified servers for which to enable exploit prevention. This parameter is required when `Scope` is `0`.
     */
    public void setHostIDs(String [] HostIDs) {
        this.HostIDs = HostIDs;
    }

    public ModifyVulDefenceSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulDefenceSettingRequest(ModifyVulDefenceSettingRequest source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.HostIDs != null) {
            this.HostIDs = new String[source.HostIDs.length];
            for (int i = 0; i < source.HostIDs.length; i++) {
                this.HostIDs[i] = new String(source.HostIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "HostIDs.", this.HostIDs);

    }
}

