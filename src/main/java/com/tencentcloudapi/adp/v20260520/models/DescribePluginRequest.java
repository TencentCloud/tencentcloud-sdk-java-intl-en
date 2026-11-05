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

public class DescribePluginRequest extends AbstractModel {

    /**
    * <p>Plugin id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>Current space id</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Get the specified field</p>
    */
    @SerializedName("FieldMask")
    @Expose
    private FieldMask FieldMask;

    /**
    * <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul>
    */
    @SerializedName("Module")
    @Expose
    private Long Module;

    /**
     * Get <p>Plugin id</p> 
     * @return PluginId <p>Plugin id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>Plugin id</p>
     * @param PluginId <p>Plugin id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>Current space id</p> 
     * @return SpaceId <p>Current space id</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Current space id</p>
     * @param SpaceId <p>Current space id</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Get the specified field</p> 
     * @return FieldMask <p>Get the specified field</p>
     */
    public FieldMask getFieldMask() {
        return this.FieldMask;
    }

    /**
     * Set <p>Get the specified field</p>
     * @param FieldMask <p>Get the specified field</p>
     */
    public void setFieldMask(FieldMask FieldMask) {
        this.FieldMask = FieldMask;
    }

    /**
     * Get <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul> 
     * @return Module <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul>
     */
    public Long getModule() {
        return this.Module;
    }

    /**
     * Set <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul>
     * @param Module <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul>
     */
    public void setModule(Long Module) {
        this.Module = Module;
    }

    public DescribePluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePluginRequest(DescribePluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FieldMask != null) {
            this.FieldMask = new FieldMask(source.FieldMask);
        }
        if (source.Module != null) {
            this.Module = new Long(source.Module);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "FieldMask.", this.FieldMask);
        this.setParamSimple(map, prefix + "Module", this.Module);

    }
}

