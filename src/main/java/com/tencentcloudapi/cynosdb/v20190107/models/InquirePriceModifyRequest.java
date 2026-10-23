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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceModifyRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Number of CPU cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage size and storage resource configuration change: ClusterId, StorageLimit
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Instance ID. This parameter is required for compute resource reallocation: ClusterId, InstanceId, Cpu, Memory.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance device type
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * ccu size of a serverless instance
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

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
     * Get Number of CPU cores. 
     * @return Cpu Number of CPU cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores.
     * @param Cpu Number of CPU cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size. 
     * @return Memory Memory size.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size.
     * @param Memory Memory size.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage size and storage resource configuration change: ClusterId, StorageLimit 
     * @return StorageLimit Storage size and storage resource configuration change: ClusterId, StorageLimit
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage size and storage resource configuration change: ClusterId, StorageLimit
     * @param StorageLimit Storage size and storage resource configuration change: ClusterId, StorageLimit
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Instance ID. This parameter is required for compute resource reallocation: ClusterId, InstanceId, Cpu, Memory. 
     * @return InstanceId Instance ID. This parameter is required for compute resource reallocation: ClusterId, InstanceId, Cpu, Memory.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. This parameter is required for compute resource reallocation: ClusterId, InstanceId, Cpu, Memory.
     * @param InstanceId Instance ID. This parameter is required for compute resource reallocation: ClusterId, InstanceId, Cpu, Memory.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance device type 
     * @return DeviceType Instance device type
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance device type
     * @param DeviceType Instance device type
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get ccu size of a serverless instance 
     * @return Ccu ccu size of a serverless instance
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set ccu size of a serverless instance
     * @param Ccu ccu size of a serverless instance
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    public InquirePriceModifyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceModifyRequest(InquirePriceModifyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Ccu != null) {
            this.Ccu = new Float(source.Ccu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Ccu", this.Ccu);

    }
}

