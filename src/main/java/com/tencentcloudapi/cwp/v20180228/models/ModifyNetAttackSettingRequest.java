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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetAttackSettingRequest extends AbstractModel {

    /**
    * 0 - Disable Network Attack Detection; 1 - Enable Network Attack Detection.
    */
    @SerializedName("NetAttackEnable")
    @Expose
    private Long NetAttackEnable;

    /**
    * 0: New warning events pending processing by default, 1: New warning events processed by default, 3: New warning events ignored by default.
    */
    @SerializedName("NetAttackAlarmStatus")
    @Expose
    private Long NetAttackAlarmStatus;

    /**
    * 1 - All Ultimate edition hosts; 0 - list of hosts with Quuids
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * Specified hosts
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Manually Excluded Hosts
    */
    @SerializedName("ExcludeInstanceIds")
    @Expose
    private String [] ExcludeInstanceIds;

    /**
    * New assets automatically include: 0 - Do not include, 1 - include.
    */
    @SerializedName("AutoInclude")
    @Expose
    private Long AutoInclude;

    /**
     * Get 0 - Disable Network Attack Detection; 1 - Enable Network Attack Detection. 
     * @return NetAttackEnable 0 - Disable Network Attack Detection; 1 - Enable Network Attack Detection.
     */
    public Long getNetAttackEnable() {
        return this.NetAttackEnable;
    }

    /**
     * Set 0 - Disable Network Attack Detection; 1 - Enable Network Attack Detection.
     * @param NetAttackEnable 0 - Disable Network Attack Detection; 1 - Enable Network Attack Detection.
     */
    public void setNetAttackEnable(Long NetAttackEnable) {
        this.NetAttackEnable = NetAttackEnable;
    }

    /**
     * Get 0: New warning events pending processing by default, 1: New warning events processed by default, 3: New warning events ignored by default. 
     * @return NetAttackAlarmStatus 0: New warning events pending processing by default, 1: New warning events processed by default, 3: New warning events ignored by default.
     */
    public Long getNetAttackAlarmStatus() {
        return this.NetAttackAlarmStatus;
    }

    /**
     * Set 0: New warning events pending processing by default, 1: New warning events processed by default, 3: New warning events ignored by default.
     * @param NetAttackAlarmStatus 0: New warning events pending processing by default, 1: New warning events processed by default, 3: New warning events ignored by default.
     */
    public void setNetAttackAlarmStatus(Long NetAttackAlarmStatus) {
        this.NetAttackAlarmStatus = NetAttackAlarmStatus;
    }

    /**
     * Get 1 - All Ultimate edition hosts; 0 - list of hosts with Quuids 
     * @return Scope 1 - All Ultimate edition hosts; 0 - list of hosts with Quuids
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 1 - All Ultimate edition hosts; 0 - list of hosts with Quuids
     * @param Scope 1 - All Ultimate edition hosts; 0 - list of hosts with Quuids
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Specified hosts 
     * @return InstanceIds Specified hosts
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Specified hosts
     * @param InstanceIds Specified hosts
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Manually Excluded Hosts 
     * @return ExcludeInstanceIds Manually Excluded Hosts
     */
    public String [] getExcludeInstanceIds() {
        return this.ExcludeInstanceIds;
    }

    /**
     * Set Manually Excluded Hosts
     * @param ExcludeInstanceIds Manually Excluded Hosts
     */
    public void setExcludeInstanceIds(String [] ExcludeInstanceIds) {
        this.ExcludeInstanceIds = ExcludeInstanceIds;
    }

    /**
     * Get New assets automatically include: 0 - Do not include, 1 - include. 
     * @return AutoInclude New assets automatically include: 0 - Do not include, 1 - include.
     */
    public Long getAutoInclude() {
        return this.AutoInclude;
    }

    /**
     * Set New assets automatically include: 0 - Do not include, 1 - include.
     * @param AutoInclude New assets automatically include: 0 - Do not include, 1 - include.
     */
    public void setAutoInclude(Long AutoInclude) {
        this.AutoInclude = AutoInclude;
    }

    public ModifyNetAttackSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetAttackSettingRequest(ModifyNetAttackSettingRequest source) {
        if (source.NetAttackEnable != null) {
            this.NetAttackEnable = new Long(source.NetAttackEnable);
        }
        if (source.NetAttackAlarmStatus != null) {
            this.NetAttackAlarmStatus = new Long(source.NetAttackAlarmStatus);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ExcludeInstanceIds != null) {
            this.ExcludeInstanceIds = new String[source.ExcludeInstanceIds.length];
            for (int i = 0; i < source.ExcludeInstanceIds.length; i++) {
                this.ExcludeInstanceIds[i] = new String(source.ExcludeInstanceIds[i]);
            }
        }
        if (source.AutoInclude != null) {
            this.AutoInclude = new Long(source.AutoInclude);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetAttackEnable", this.NetAttackEnable);
        this.setParamSimple(map, prefix + "NetAttackAlarmStatus", this.NetAttackAlarmStatus);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIds.", this.ExcludeInstanceIds);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);

    }
}

