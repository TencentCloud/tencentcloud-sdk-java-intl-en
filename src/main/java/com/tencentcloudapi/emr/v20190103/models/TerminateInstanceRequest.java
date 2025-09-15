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
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of terminated node. This parameter is reserved and does not need to be configured.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId is effective. When the type is ComputeResource, ComputeResourceId is used.
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * Computing resource ID.
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID of terminated node. This parameter is reserved and does not need to be configured. 
     * @return ResourceIds ID of terminated node. This parameter is reserved and does not need to be configured.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set ID of terminated node. This parameter is reserved and does not need to be configured.
     * @param ResourceIds ID of terminated node. This parameter is reserved and does not need to be configured.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId is effective. When the type is ComputeResource, ComputeResourceId is used. 
     * @return ResourceBaseType The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId is effective. When the type is ComputeResource, ComputeResourceId is used.
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId is effective. When the type is ComputeResource, ComputeResourceId is used.
     * @param ResourceBaseType The type can be ComputeResource, EMR, or a default value. The default value is EMR. When the type is EMR, InstanceId is effective. When the type is ComputeResource, ComputeResourceId is used.
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get Computing resource ID. 
     * @return ComputeResourceId Computing resource ID.
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set Computing resource ID.
     * @param ComputeResourceId Computing resource ID.
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);

    }
}

