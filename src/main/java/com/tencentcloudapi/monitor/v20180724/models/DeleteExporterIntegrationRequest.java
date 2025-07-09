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

public class DeleteExporterIntegrationRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Kubernetes cluster type. Valid values:
<li> 1 = TKE </li>
<li> 2 = EKS </li>
<li> 3 = MEKS </li>
    */
    @SerializedName("KubeType")
    @Expose
    private Long KubeType;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Kubernetes cluster type. Valid values:
<li> 1 = TKE </li>
<li> 2 = EKS </li>
<li> 3 = MEKS </li> 
     * @return KubeType Kubernetes cluster type. Valid values:
<li> 1 = TKE </li>
<li> 2 = EKS </li>
<li> 3 = MEKS </li>
     */
    public Long getKubeType() {
        return this.KubeType;
    }

    /**
     * Set Kubernetes cluster type. Valid values:
<li> 1 = TKE </li>
<li> 2 = EKS </li>
<li> 3 = MEKS </li>
     * @param KubeType Kubernetes cluster type. Valid values:
<li> 1 = TKE </li>
<li> 2 = EKS </li>
<li> 3 = MEKS </li>
     */
    public void setKubeType(Long KubeType) {
        this.KubeType = KubeType;
    }

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
     * Get Type 
     * @return Kind Type
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Type
     * @param Kind Type
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DeleteExporterIntegrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteExporterIntegrationRequest(DeleteExporterIntegrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KubeType != null) {
            this.KubeType = new Long(source.KubeType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KubeType", this.KubeType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

