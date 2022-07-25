/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceDiscoveryRequest extends AbstractModel{

    /**
    * Prometheus instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <li>TKE: ID of the integrated TKE cluster</li>
    */
    @SerializedName("KubeClusterId")
    @Expose
    private String KubeClusterId;

    /**
    * Kubernetes cluster type:
<li> 1 = TKE </li>
    */
    @SerializedName("KubeType")
    @Expose
    private Long KubeType;

    /**
     * Get Prometheus instance ID 
     * @return InstanceId Prometheus instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus instance ID
     * @param InstanceId Prometheus instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <li>TKE: ID of the integrated TKE cluster</li> 
     * @return KubeClusterId <li>TKE: ID of the integrated TKE cluster</li>
     */
    public String getKubeClusterId() {
        return this.KubeClusterId;
    }

    /**
     * Set <li>TKE: ID of the integrated TKE cluster</li>
     * @param KubeClusterId <li>TKE: ID of the integrated TKE cluster</li>
     */
    public void setKubeClusterId(String KubeClusterId) {
        this.KubeClusterId = KubeClusterId;
    }

    /**
     * Get Kubernetes cluster type:
<li> 1 = TKE </li> 
     * @return KubeType Kubernetes cluster type:
<li> 1 = TKE </li>
     */
    public Long getKubeType() {
        return this.KubeType;
    }

    /**
     * Set Kubernetes cluster type:
<li> 1 = TKE </li>
     * @param KubeType Kubernetes cluster type:
<li> 1 = TKE </li>
     */
    public void setKubeType(Long KubeType) {
        this.KubeType = KubeType;
    }

    public DescribeServiceDiscoveryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceDiscoveryRequest(DescribeServiceDiscoveryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KubeClusterId != null) {
            this.KubeClusterId = new String(source.KubeClusterId);
        }
        if (source.KubeType != null) {
            this.KubeType = new Long(source.KubeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KubeClusterId", this.KubeClusterId);
        this.setParamSimple(map, prefix + "KubeType", this.KubeType);

    }
}

