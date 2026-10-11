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

public class DescribeNodeResourceConfigFastRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node type. Valid values: CORE, TASK, ROUTER, and ALL.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Billing type.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * AZ ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Type. Valid values: ComputeResource and EMR. Default value: EMR.
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
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node type. Valid values: CORE, TASK, ROUTER, and ALL. 
     * @return ResourceType Node type. Valid values: CORE, TASK, ROUTER, and ALL.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Node type. Valid values: CORE, TASK, ROUTER, and ALL.
     * @param ResourceType Node type. Valid values: CORE, TASK, ROUTER, and ALL.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Billing type. 
     * @return PayMode Billing type.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing type.
     * @param PayMode Billing type.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get AZ ID. 
     * @return ZoneId AZ ID.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID.
     * @param ZoneId AZ ID.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Type. Valid values: ComputeResource and EMR. Default value: EMR. 
     * @return ResourceBaseType Type. Valid values: ComputeResource and EMR. Default value: EMR.
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set Type. Valid values: ComputeResource and EMR. Default value: EMR.
     * @param ResourceBaseType Type. Valid values: ComputeResource and EMR. Default value: EMR.
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

    public DescribeNodeResourceConfigFastRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeResourceConfigFastRequest(DescribeNodeResourceConfigFastRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
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
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);

    }
}

