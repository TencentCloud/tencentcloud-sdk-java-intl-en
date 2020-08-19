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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePluginsRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of names of the plugins to be installed
    */
    @SerializedName("InstallPluginList")
    @Expose
    private String [] InstallPluginList;

    /**
    * List of names of the plugins to be uninstalled
    */
    @SerializedName("RemovePluginList")
    @Expose
    private String [] RemovePluginList;

    /**
    * Whether to force restart
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get List of names of the plugins to be installed 
     * @return InstallPluginList List of names of the plugins to be installed
     */
    public String [] getInstallPluginList() {
        return this.InstallPluginList;
    }

    /**
     * Set List of names of the plugins to be installed
     * @param InstallPluginList List of names of the plugins to be installed
     */
    public void setInstallPluginList(String [] InstallPluginList) {
        this.InstallPluginList = InstallPluginList;
    }

    /**
     * Get List of names of the plugins to be uninstalled 
     * @return RemovePluginList List of names of the plugins to be uninstalled
     */
    public String [] getRemovePluginList() {
        return this.RemovePluginList;
    }

    /**
     * Set List of names of the plugins to be uninstalled
     * @param RemovePluginList List of names of the plugins to be uninstalled
     */
    public void setRemovePluginList(String [] RemovePluginList) {
        this.RemovePluginList = RemovePluginList;
    }

    /**
     * Get Whether to force restart 
     * @return ForceRestart Whether to force restart
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set Whether to force restart
     * @param ForceRestart Whether to force restart
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "InstallPluginList.", this.InstallPluginList);
        this.setParamArraySimple(map, prefix + "RemovePluginList.", this.RemovePluginList);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);

    }
}

