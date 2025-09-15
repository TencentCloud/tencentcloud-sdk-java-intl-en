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

public class SetNodeResourceConfigDefaultRequest extends AbstractModel {

    /**
    * Cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Configuration ID.
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private Long ResourceConfigId;

    /**
    * Specification node type, with the valid values of CORE, TASK, and ROUTER.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The type can be ComputeResource, EMR, or a default value. The default value is EMR.
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
    * Hardware type.
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
     * Get Cluster instance ID. 
     * @return InstanceId Cluster instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID.
     * @param InstanceId Cluster instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Configuration ID. 
     * @return ResourceConfigId Configuration ID.
     */
    public Long getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set Configuration ID.
     * @param ResourceConfigId Configuration ID.
     */
    public void setResourceConfigId(Long ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get Specification node type, with the valid values of CORE, TASK, and ROUTER. 
     * @return ResourceType Specification node type, with the valid values of CORE, TASK, and ROUTER.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Specification node type, with the valid values of CORE, TASK, and ROUTER.
     * @param ResourceType Specification node type, with the valid values of CORE, TASK, and ROUTER.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The type can be ComputeResource, EMR, or a default value. The default value is EMR. 
     * @return ResourceBaseType The type can be ComputeResource, EMR, or a default value. The default value is EMR.
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set The type can be ComputeResource, EMR, or a default value. The default value is EMR.
     * @param ResourceBaseType The type can be ComputeResource, EMR, or a default value. The default value is EMR.
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

    /**
     * Get Hardware type. 
     * @return HardwareResourceType Hardware type.
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set Hardware type.
     * @param HardwareResourceType Hardware type.
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    public SetNodeResourceConfigDefaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNodeResourceConfigDefaultRequest(SetNodeResourceConfigDefaultRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new Long(source.ResourceConfigId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);

    }
}

