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

public class AgentPlugin extends AbstractModel {

    /**
    * <p>Basic plug-in configuration</p>
    */
    @SerializedName("Config")
    @Expose
    private AgentPluginConfig Config;

    /**
    * <p>Plugin name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Plug-in icon url</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>Plugin description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul>
    */
    @SerializedName("PluginClass")
    @Expose
    private Long PluginClass;

    /**
    * <p>Plug-in status</p><p>Enumeration values:</p><ul><li>0: unknown</li><li>1: available</li><li>2: unavailable</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Plug-in authentication configuration status</p><p>Enumeration values:</p><ul><li>0: No authorization required</li><li>1: Unconfigured</li><li>2: Configured</li></ul>
    */
    @SerializedName("AuthConfigStatus")
    @Expose
    private Long AuthConfigStatus;

    /**
     * Get <p>Basic plug-in configuration</p> 
     * @return Config <p>Basic plug-in configuration</p>
     */
    public AgentPluginConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Basic plug-in configuration</p>
     * @param Config <p>Basic plug-in configuration</p>
     */
    public void setConfig(AgentPluginConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Plugin name.</p> 
     * @return Name <p>Plugin name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Plugin name.</p>
     * @param Name <p>Plugin name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Plug-in icon url</p> 
     * @return IconUrl <p>Plug-in icon url</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>Plug-in icon url</p>
     * @param IconUrl <p>Plug-in icon url</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>Plugin description</p> 
     * @return Description <p>Plugin description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Plugin description</p>
     * @param Description <p>Plugin description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul> 
     * @return PluginClass <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul>
     */
    public Long getPluginClass() {
        return this.PluginClass;
    }

    /**
     * Set <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul>
     * @param PluginClass <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul>
     */
    public void setPluginClass(Long PluginClass) {
        this.PluginClass = PluginClass;
    }

    /**
     * Get <p>Plug-in status</p><p>Enumeration values:</p><ul><li>0: unknown</li><li>1: available</li><li>2: unavailable</li></ul> 
     * @return Status <p>Plug-in status</p><p>Enumeration values:</p><ul><li>0: unknown</li><li>1: available</li><li>2: unavailable</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Plug-in status</p><p>Enumeration values:</p><ul><li>0: unknown</li><li>1: available</li><li>2: unavailable</li></ul>
     * @param Status <p>Plug-in status</p><p>Enumeration values:</p><ul><li>0: unknown</li><li>1: available</li><li>2: unavailable</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Plug-in authentication configuration status</p><p>Enumeration values:</p><ul><li>0: No authorization required</li><li>1: Unconfigured</li><li>2: Configured</li></ul> 
     * @return AuthConfigStatus <p>Plug-in authentication configuration status</p><p>Enumeration values:</p><ul><li>0: No authorization required</li><li>1: Unconfigured</li><li>2: Configured</li></ul>
     */
    public Long getAuthConfigStatus() {
        return this.AuthConfigStatus;
    }

    /**
     * Set <p>Plug-in authentication configuration status</p><p>Enumeration values:</p><ul><li>0: No authorization required</li><li>1: Unconfigured</li><li>2: Configured</li></ul>
     * @param AuthConfigStatus <p>Plug-in authentication configuration status</p><p>Enumeration values:</p><ul><li>0: No authorization required</li><li>1: Unconfigured</li><li>2: Configured</li></ul>
     */
    public void setAuthConfigStatus(Long AuthConfigStatus) {
        this.AuthConfigStatus = AuthConfigStatus;
    }

    public AgentPlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPlugin(AgentPlugin source) {
        if (source.Config != null) {
            this.Config = new AgentPluginConfig(source.Config);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PluginClass != null) {
            this.PluginClass = new Long(source.PluginClass);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AuthConfigStatus != null) {
            this.AuthConfigStatus = new Long(source.AuthConfigStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PluginClass", this.PluginClass);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AuthConfigStatus", this.AuthConfigStatus);

    }
}

