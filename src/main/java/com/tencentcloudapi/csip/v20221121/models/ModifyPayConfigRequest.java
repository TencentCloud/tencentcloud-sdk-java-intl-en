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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPayConfigRequest extends AbstractModel {

    /**
    * Auto-scaling configuration for the CWP module
Supplemental description: if not passed, host configuration will not be modified. At least this module is required for the current period. Named module fields like ContainerConfig / AIAgentConfig can be added for subsequent scalability.
    */
    @SerializedName("HostConfig")
    @Expose
    private HostAutoScaleConfig HostConfig;

    /**
     * Get Auto-scaling configuration for the CWP module
Supplemental description: if not passed, host configuration will not be modified. At least this module is required for the current period. Named module fields like ContainerConfig / AIAgentConfig can be added for subsequent scalability. 
     * @return HostConfig Auto-scaling configuration for the CWP module
Supplemental description: if not passed, host configuration will not be modified. At least this module is required for the current period. Named module fields like ContainerConfig / AIAgentConfig can be added for subsequent scalability.
     */
    public HostAutoScaleConfig getHostConfig() {
        return this.HostConfig;
    }

    /**
     * Set Auto-scaling configuration for the CWP module
Supplemental description: if not passed, host configuration will not be modified. At least this module is required for the current period. Named module fields like ContainerConfig / AIAgentConfig can be added for subsequent scalability.
     * @param HostConfig Auto-scaling configuration for the CWP module
Supplemental description: if not passed, host configuration will not be modified. At least this module is required for the current period. Named module fields like ContainerConfig / AIAgentConfig can be added for subsequent scalability.
     */
    public void setHostConfig(HostAutoScaleConfig HostConfig) {
        this.HostConfig = HostConfig;
    }

    public ModifyPayConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPayConfigRequest(ModifyPayConfigRequest source) {
        if (source.HostConfig != null) {
            this.HostConfig = new HostAutoScaleConfig(source.HostConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HostConfig.", this.HostConfig);

    }
}

