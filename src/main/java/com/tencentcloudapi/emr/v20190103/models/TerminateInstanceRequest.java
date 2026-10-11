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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateInstanceRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>ID of the terminated node. This parameter is reserved and does not need to be configured.</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId takes effect; when the type is ComputeResource, ComputeResourceId is used for identification.</p>
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * <p>Computing resource ID.</p>
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
    * <p>Retain the TKE cluster associated with the computing resource.</p>
    */
    @SerializedName("RetainTkeCluster")
    @Expose
    private Boolean RetainTkeCluster;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>ID of the terminated node. This parameter is reserved and does not need to be configured.</p> 
     * @return ResourceIds <p>ID of the terminated node. This parameter is reserved and does not need to be configured.</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>ID of the terminated node. This parameter is reserved and does not need to be configured.</p>
     * @param ResourceIds <p>ID of the terminated node. This parameter is reserved and does not need to be configured.</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId takes effect; when the type is ComputeResource, ComputeResourceId is used for identification.</p> 
     * @return ResourceBaseType <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId takes effect; when the type is ComputeResource, ComputeResourceId is used for identification.</p>
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId takes effect; when the type is ComputeResource, ComputeResourceId is used for identification.</p>
     * @param ResourceBaseType <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId takes effect; when the type is ComputeResource, ComputeResourceId is used for identification.</p>
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get <p>Computing resource ID.</p> 
     * @return ComputeResourceId <p>Computing resource ID.</p>
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set <p>Computing resource ID.</p>
     * @param ComputeResourceId <p>Computing resource ID.</p>
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    /**
     * Get <p>Retain the TKE cluster associated with the computing resource.</p> 
     * @return RetainTkeCluster <p>Retain the TKE cluster associated with the computing resource.</p>
     */
    public Boolean getRetainTkeCluster() {
        return this.RetainTkeCluster;
    }

    /**
     * Set <p>Retain the TKE cluster associated with the computing resource.</p>
     * @param RetainTkeCluster <p>Retain the TKE cluster associated with the computing resource.</p>
     */
    public void setRetainTkeCluster(Boolean RetainTkeCluster) {
        this.RetainTkeCluster = RetainTkeCluster;
    }

    public TerminateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateInstanceRequest(TerminateInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
        if (source.RetainTkeCluster != null) {
            this.RetainTkeCluster = new Boolean(source.RetainTkeCluster);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamSimple(map, prefix + "RetainTkeCluster", this.RetainTkeCluster);

    }
}

