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

public class HealthCheckPolicyBinding extends AbstractModel {

    /**
    * Health check policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Associated node pool array
    */
    @SerializedName("NodePools")
    @Expose
    private String [] NodePools;

    /**
     * Get Health check policy name 
     * @return Name Health check policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Health check policy name
     * @param Name Health check policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule creation time 
     * @return CreatedAt Rule creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Rule creation time
     * @param CreatedAt Rule creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Associated node pool array 
     * @return NodePools Associated node pool array
     */
    public String [] getNodePools() {
        return this.NodePools;
    }

    /**
     * Set Associated node pool array
     * @param NodePools Associated node pool array
     */
    public void setNodePools(String [] NodePools) {
        this.NodePools = NodePools;
    }

    public HealthCheckPolicyBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckPolicyBinding(HealthCheckPolicyBinding source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.NodePools != null) {
            this.NodePools = new String[source.NodePools.length];
            for (int i = 0; i < source.NodePools.length; i++) {
                this.NodePools[i] = new String(source.NodePools[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamArraySimple(map, prefix + "NodePools.", this.NodePools);

    }
}

