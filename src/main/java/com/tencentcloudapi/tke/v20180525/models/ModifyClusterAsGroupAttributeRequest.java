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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterAsGroupAttributeRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster-associated scaling group attributes
    */
    @SerializedName("ClusterAsGroupAttribute")
    @Expose
    private ClusterAsGroupAttribute ClusterAsGroupAttribute;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster-associated scaling group attributes 
     * @return ClusterAsGroupAttribute Cluster-associated scaling group attributes
     */
    public ClusterAsGroupAttribute getClusterAsGroupAttribute() {
        return this.ClusterAsGroupAttribute;
    }

    /**
     * Set Cluster-associated scaling group attributes
     * @param ClusterAsGroupAttribute Cluster-associated scaling group attributes
     */
    public void setClusterAsGroupAttribute(ClusterAsGroupAttribute ClusterAsGroupAttribute) {
        this.ClusterAsGroupAttribute = ClusterAsGroupAttribute;
    }

    public ModifyClusterAsGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAsGroupAttributeRequest(ModifyClusterAsGroupAttributeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterAsGroupAttribute != null) {
            this.ClusterAsGroupAttribute = new ClusterAsGroupAttribute(source.ClusterAsGroupAttribute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "ClusterAsGroupAttribute.", this.ClusterAsGroupAttribute);

    }
}

