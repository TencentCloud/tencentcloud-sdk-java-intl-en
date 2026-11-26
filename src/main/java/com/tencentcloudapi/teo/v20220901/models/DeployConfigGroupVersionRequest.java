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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployConfigGroupVersionRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Environment ID. Please enter the environment ID to which the version needs to be released.
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Version information to release. You can update versions of multiple different configuration groups at the same time. Each configuration group supports updating only one version at a time.
    */
    @SerializedName("ConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] ConfigGroupVersionInfos;

    /**
    * Change description. Used to describe the content and reason for this change. Supports up to 100 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Environment ID. Please enter the environment ID to which the version needs to be released. 
     * @return EnvId Environment ID. Please enter the environment ID to which the version needs to be released.
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Environment ID. Please enter the environment ID to which the version needs to be released.
     * @param EnvId Environment ID. Please enter the environment ID to which the version needs to be released.
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Version information to release. You can update versions of multiple different configuration groups at the same time. Each configuration group supports updating only one version at a time. 
     * @return ConfigGroupVersionInfos Version information to release. You can update versions of multiple different configuration groups at the same time. Each configuration group supports updating only one version at a time.
     */
    public ConfigGroupVersionInfo [] getConfigGroupVersionInfos() {
        return this.ConfigGroupVersionInfos;
    }

    /**
     * Set Version information to release. You can update versions of multiple different configuration groups at the same time. Each configuration group supports updating only one version at a time.
     * @param ConfigGroupVersionInfos Version information to release. You can update versions of multiple different configuration groups at the same time. Each configuration group supports updating only one version at a time.
     */
    public void setConfigGroupVersionInfos(ConfigGroupVersionInfo [] ConfigGroupVersionInfos) {
        this.ConfigGroupVersionInfos = ConfigGroupVersionInfos;
    }

    /**
     * Get Change description. Used to describe the content and reason for this change. Supports up to 100 characters. 
     * @return Description Change description. Used to describe the content and reason for this change. Supports up to 100 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Change description. Used to describe the content and reason for this change. Supports up to 100 characters.
     * @param Description Change description. Used to describe the content and reason for this change. Supports up to 100 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public DeployConfigGroupVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployConfigGroupVersionRequest(DeployConfigGroupVersionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ConfigGroupVersionInfos != null) {
            this.ConfigGroupVersionInfos = new ConfigGroupVersionInfo[source.ConfigGroupVersionInfos.length];
            for (int i = 0; i < source.ConfigGroupVersionInfos.length; i++) {
                this.ConfigGroupVersionInfos[i] = new ConfigGroupVersionInfo(source.ConfigGroupVersionInfos[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArrayObj(map, prefix + "ConfigGroupVersionInfos.", this.ConfigGroupVersionInfos);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

