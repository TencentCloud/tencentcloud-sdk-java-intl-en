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

public class AgentTool extends AbstractModel {

    /**
    * <p>Tool configuration field</p>
    */
    @SerializedName("Config")
    @Expose
    private AgentToolBasicConfig Config;

    /**
    * <p>Tool name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Tool status</p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li><li>3: invalid</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Calling method</p><p>Enumeration values:</p><ul><li>0: Non-streaming</li><li>1: Streaming</li></ul>
    */
    @SerializedName("StreamMode")
    @Expose
    private Long StreamMode;

    /**
    * <p>Tool access mode</p><p>Enumeration values:</p><ul><li>0: Not specified</li><li>1: Read-only</li><li>2: Write/Delete</li></ul>
    */
    @SerializedName("ToolAccessMode")
    @Expose
    private Long ToolAccessMode;

    /**
     * Get <p>Tool configuration field</p> 
     * @return Config <p>Tool configuration field</p>
     */
    public AgentToolBasicConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Tool configuration field</p>
     * @param Config <p>Tool configuration field</p>
     */
    public void setConfig(AgentToolBasicConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Tool name</p> 
     * @return Name <p>Tool name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Tool name</p>
     * @param Name <p>Tool name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Tool status</p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li><li>3: invalid</li></ul> 
     * @return Status <p>Tool status</p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li><li>3: invalid</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Tool status</p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li><li>3: invalid</li></ul>
     * @param Status <p>Tool status</p><p>Enumeration values:</p><ul><li>1: available</li><li>2: unavailable</li><li>3: invalid</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Calling method</p><p>Enumeration values:</p><ul><li>0: Non-streaming</li><li>1: Streaming</li></ul> 
     * @return StreamMode <p>Calling method</p><p>Enumeration values:</p><ul><li>0: Non-streaming</li><li>1: Streaming</li></ul>
     */
    public Long getStreamMode() {
        return this.StreamMode;
    }

    /**
     * Set <p>Calling method</p><p>Enumeration values:</p><ul><li>0: Non-streaming</li><li>1: Streaming</li></ul>
     * @param StreamMode <p>Calling method</p><p>Enumeration values:</p><ul><li>0: Non-streaming</li><li>1: Streaming</li></ul>
     */
    public void setStreamMode(Long StreamMode) {
        this.StreamMode = StreamMode;
    }

    /**
     * Get <p>Tool access mode</p><p>Enumeration values:</p><ul><li>0: Not specified</li><li>1: Read-only</li><li>2: Write/Delete</li></ul> 
     * @return ToolAccessMode <p>Tool access mode</p><p>Enumeration values:</p><ul><li>0: Not specified</li><li>1: Read-only</li><li>2: Write/Delete</li></ul>
     */
    public Long getToolAccessMode() {
        return this.ToolAccessMode;
    }

    /**
     * Set <p>Tool access mode</p><p>Enumeration values:</p><ul><li>0: Not specified</li><li>1: Read-only</li><li>2: Write/Delete</li></ul>
     * @param ToolAccessMode <p>Tool access mode</p><p>Enumeration values:</p><ul><li>0: Not specified</li><li>1: Read-only</li><li>2: Write/Delete</li></ul>
     */
    public void setToolAccessMode(Long ToolAccessMode) {
        this.ToolAccessMode = ToolAccessMode;
    }

    public AgentTool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentTool(AgentTool source) {
        if (source.Config != null) {
            this.Config = new AgentToolBasicConfig(source.Config);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StreamMode != null) {
            this.StreamMode = new Long(source.StreamMode);
        }
        if (source.ToolAccessMode != null) {
            this.ToolAccessMode = new Long(source.ToolAccessMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StreamMode", this.StreamMode);
        this.setParamSimple(map, prefix + "ToolAccessMode", this.ToolAccessMode);

    }
}

