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

public class PluginStatistics extends AbstractModel {

    /**
    * Plug-in calling volume
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * Number of tools
    */
    @SerializedName("ToolCount")
    @Expose
    private Long ToolCount;

    /**
     * Get Plug-in calling volume 
     * @return CallCount Plug-in calling volume
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set Plug-in calling volume
     * @param CallCount Plug-in calling volume
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get Number of tools 
     * @return ToolCount Number of tools
     */
    public Long getToolCount() {
        return this.ToolCount;
    }

    /**
     * Set Number of tools
     * @param ToolCount Number of tools
     */
    public void setToolCount(Long ToolCount) {
        this.ToolCount = ToolCount;
    }

    public PluginStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginStatistics(PluginStatistics source) {
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.ToolCount != null) {
            this.ToolCount = new Long(source.ToolCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "ToolCount", this.ToolCount);

    }
}

