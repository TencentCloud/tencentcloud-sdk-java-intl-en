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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateComputeNodesRequest extends AbstractModel {

    /**
    * Compute environment ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * List of compute node IDs
    */
    @SerializedName("ComputeNodeIds")
    @Expose
    private String [] ComputeNodeIds;

    /**
     * Get Compute environment ID 
     * @return EnvId Compute environment ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID
     * @param EnvId Compute environment ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get List of compute node IDs 
     * @return ComputeNodeIds List of compute node IDs
     */
    public String [] getComputeNodeIds() {
        return this.ComputeNodeIds;
    }

    /**
     * Set List of compute node IDs
     * @param ComputeNodeIds List of compute node IDs
     */
    public void setComputeNodeIds(String [] ComputeNodeIds) {
        this.ComputeNodeIds = ComputeNodeIds;
    }

    public TerminateComputeNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateComputeNodesRequest(TerminateComputeNodesRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ComputeNodeIds != null) {
            this.ComputeNodeIds = new String[source.ComputeNodeIds.length];
            for (int i = 0; i < source.ComputeNodeIds.length; i++) {
                this.ComputeNodeIds[i] = new String(source.ComputeNodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArraySimple(map, prefix + "ComputeNodeIds.", this.ComputeNodeIds);

    }
}

