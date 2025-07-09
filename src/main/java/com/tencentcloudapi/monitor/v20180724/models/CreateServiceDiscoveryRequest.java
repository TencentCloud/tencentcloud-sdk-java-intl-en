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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceDiscoveryRequest extends AbstractModel {

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
    * Scrape configuration type. Valid values:
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Scrape configuration information
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

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

    /**
     * Get Scrape configuration type. Valid values:
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li> 
     * @return Type Scrape configuration type. Valid values:
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Scrape configuration type. Valid values:
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li>
     * @param Type Scrape configuration type. Valid values:
<li> 1 = ServiceMonitor</li>
<li> 2 = PodMonitor</li>
<li> 3 = JobMonitor</li>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Scrape configuration information 
     * @return Yaml Scrape configuration information
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set Scrape configuration information
     * @param Yaml Scrape configuration information
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    public CreateServiceDiscoveryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceDiscoveryRequest(CreateServiceDiscoveryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KubeClusterId != null) {
            this.KubeClusterId = new String(source.KubeClusterId);
        }
        if (source.KubeType != null) {
            this.KubeType = new Long(source.KubeType);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KubeClusterId", this.KubeClusterId);
        this.setParamSimple(map, prefix + "KubeType", this.KubeType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);

    }
}

