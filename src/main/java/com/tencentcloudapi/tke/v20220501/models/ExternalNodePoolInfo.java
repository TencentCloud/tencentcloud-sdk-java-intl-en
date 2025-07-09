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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalNodePoolInfo extends AbstractModel {

    /**
    * Third-party node runtime configuration
    */
    @SerializedName("RuntimeConfig")
    @Expose
    private RuntimeConfig RuntimeConfig;

    /**
    * Number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("NodesNum")
    @Expose
    private Long NodesNum;

    /**
     * Get Third-party node runtime configuration 
     * @return RuntimeConfig Third-party node runtime configuration
     */
    public RuntimeConfig getRuntimeConfig() {
        return this.RuntimeConfig;
    }

    /**
     * Set Third-party node runtime configuration
     * @param RuntimeConfig Third-party node runtime configuration
     */
    public void setRuntimeConfig(RuntimeConfig RuntimeConfig) {
        this.RuntimeConfig = RuntimeConfig;
    }

    /**
     * Get Number of nodes
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return NodesNum Number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getNodesNum() {
        return this.NodesNum;
    }

    /**
     * Set Number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param NodesNum Number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNodesNum(Long NodesNum) {
        this.NodesNum = NodesNum;
    }

    public ExternalNodePoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalNodePoolInfo(ExternalNodePoolInfo source) {
        if (source.RuntimeConfig != null) {
            this.RuntimeConfig = new RuntimeConfig(source.RuntimeConfig);
        }
        if (source.NodesNum != null) {
            this.NodesNum = new Long(source.NodesNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RuntimeConfig.", this.RuntimeConfig);
        this.setParamSimple(map, prefix + "NodesNum", this.NodesNum);

    }
}

