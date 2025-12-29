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

public class EnableControlPlaneLogsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster type. currently only support tke.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Component name list. currently supports cluster-autoscaler, kapenter.
    */
    @SerializedName("Components")
    @Expose
    private ComponentLogConfig [] Components;

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
     * Get Cluster type. currently only support tke. 
     * @return ClusterType Cluster type. currently only support tke.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. currently only support tke.
     * @param ClusterType Cluster type. currently only support tke.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Component name list. currently supports cluster-autoscaler, kapenter. 
     * @return Components Component name list. currently supports cluster-autoscaler, kapenter.
     */
    public ComponentLogConfig [] getComponents() {
        return this.Components;
    }

    /**
     * Set Component name list. currently supports cluster-autoscaler, kapenter.
     * @param Components Component name list. currently supports cluster-autoscaler, kapenter.
     */
    public void setComponents(ComponentLogConfig [] Components) {
        this.Components = Components;
    }

    public EnableControlPlaneLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableControlPlaneLogsRequest(EnableControlPlaneLogsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Components != null) {
            this.Components = new ComponentLogConfig[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new ComponentLogConfig(source.Components[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);

    }
}

