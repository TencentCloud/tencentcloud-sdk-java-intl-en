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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVulDefenceSettingRequest extends AbstractModel {

    /**
    * Defense switch: 0 - off; 1 - on
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 1 - All Ultimate edition hosts; 0 - list of hosts with Quuids
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * List of Ultimate Edition hosts within the scope
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * Exclude the list of Ultimate Edition hosts within the scope
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
    * List of Ultimate Edition hosts within the scope
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Defense switch: 0 - off; 1 - on 
     * @return Enable Defense switch: 0 - off; 1 - on
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Defense switch: 0 - off; 1 - on
     * @param Enable Defense switch: 0 - off; 1 - on
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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
     * Get List of Ultimate Edition hosts within the scope 
     * @return Quuids List of Ultimate Edition hosts within the scope
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set List of Ultimate Edition hosts within the scope
     * @param Quuids List of Ultimate Edition hosts within the scope
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get Exclude the list of Ultimate Edition hosts within the scope 
     * @return ExcludeInstanceIds Exclude the list of Ultimate Edition hosts within the scope
     */
    public String [] getExcludeInstanceIds() {
        return this.ExcludeInstanceIds;
    }

    /**
     * Set Exclude the list of Ultimate Edition hosts within the scope
     * @param ExcludeInstanceIds Exclude the list of Ultimate Edition hosts within the scope
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

    /**
     * Get List of Ultimate Edition hosts within the scope 
     * @return InstanceIds List of Ultimate Edition hosts within the scope
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of Ultimate Edition hosts within the scope
     * @param InstanceIds List of Ultimate Edition hosts within the scope
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public ModifyVulDefenceSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulDefenceSettingRequest(ModifyVulDefenceSettingRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
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
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIds.", this.ExcludeInstanceIds);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

