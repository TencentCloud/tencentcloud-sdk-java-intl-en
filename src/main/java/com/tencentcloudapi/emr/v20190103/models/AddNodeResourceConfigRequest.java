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

public class AddNodeResourceConfigRequest extends AbstractModel {

    /**
    * Cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node type: Core, Task, and Router.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource details.
    */
    @SerializedName("ResourceConfig")
    @Expose
    private Resource ResourceConfig;

    /**
    * Payment mode.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Whether default configuration applies, DEFAULT or BACKUP. If it is not specified, the default configuration does not apply.
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * Region ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * When multiple specifications are added, details of the first specifications are in the ResourceConfig parameter, and those of the second to n-th are in the MultipleResourceConfig parameter.
    */
    @SerializedName("MultipleResourceConfig")
    @Expose
    private Resource [] MultipleResourceConfig;

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
     * Get Node type: Core, Task, and Router. 
     * @return ResourceType Node type: Core, Task, and Router.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Node type: Core, Task, and Router.
     * @param ResourceType Node type: Core, Task, and Router.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource details. 
     * @return ResourceConfig Resource details.
     */
    public Resource getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set Resource details.
     * @param ResourceConfig Resource details.
     */
    public void setResourceConfig(Resource ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get Payment mode. 
     * @return PayMode Payment mode.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode.
     * @param PayMode Payment mode.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Whether default configuration applies, DEFAULT or BACKUP. If it is not specified, the default configuration does not apply. 
     * @return IsDefault Whether default configuration applies, DEFAULT or BACKUP. If it is not specified, the default configuration does not apply.
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether default configuration applies, DEFAULT or BACKUP. If it is not specified, the default configuration does not apply.
     * @param IsDefault Whether default configuration applies, DEFAULT or BACKUP. If it is not specified, the default configuration does not apply.
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Region ID. 
     * @return ZoneId Region ID.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID.
     * @param ZoneId Region ID.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get When multiple specifications are added, details of the first specifications are in the ResourceConfig parameter, and those of the second to n-th are in the MultipleResourceConfig parameter. 
     * @return MultipleResourceConfig When multiple specifications are added, details of the first specifications are in the ResourceConfig parameter, and those of the second to n-th are in the MultipleResourceConfig parameter.
     */
    public Resource [] getMultipleResourceConfig() {
        return this.MultipleResourceConfig;
    }

    /**
     * Set When multiple specifications are added, details of the first specifications are in the ResourceConfig parameter, and those of the second to n-th are in the MultipleResourceConfig parameter.
     * @param MultipleResourceConfig When multiple specifications are added, details of the first specifications are in the ResourceConfig parameter, and those of the second to n-th are in the MultipleResourceConfig parameter.
     */
    public void setMultipleResourceConfig(Resource [] MultipleResourceConfig) {
        this.MultipleResourceConfig = MultipleResourceConfig;
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

    public AddNodeResourceConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddNodeResourceConfigRequest(AddNodeResourceConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new Resource(source.ResourceConfig);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new String(source.IsDefault);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.MultipleResourceConfig != null) {
            this.MultipleResourceConfig = new Resource[source.MultipleResourceConfig.length];
            for (int i = 0; i < source.MultipleResourceConfig.length; i++) {
                this.MultipleResourceConfig[i] = new Resource(source.MultipleResourceConfig[i]);
            }
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
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "MultipleResourceConfig.", this.MultipleResourceConfig);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);

    }
}

