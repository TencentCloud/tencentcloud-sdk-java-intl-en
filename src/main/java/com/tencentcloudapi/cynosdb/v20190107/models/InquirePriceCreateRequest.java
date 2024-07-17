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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateRequest extends AbstractModel {

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Number of compute node to purchase
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Instance type for purchase. Valid values: `PREPAID`, `POSTPAID`, `SERVERLESS`.
    */
    @SerializedName("InstancePayMode")
    @Expose
    private String InstancePayMode;

    /**
    * Storage type for purchase. Valid values: `PREPAID`, `POSTPAID`.
    */
    @SerializedName("StoragePayMode")
    @Expose
    private String StoragePayMode;

    /**
    * device type:common, exclusive
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Number of CPU cores, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size in GB, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * CCU size, which is required when `InstancePayMode` is `SERVERLESS`.
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

    /**
    * Storage size, which is required when `StoragePayMode` is `PREPAID`.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Validity period, which is required when `InstancePayMode` is `PREPAID`.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Duration unit, which is required when `InstancePayMode` is `PREPAID`. Valid values: `m` (month), `d` (day).
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Number of compute node to purchase 
     * @return GoodsNum Number of compute node to purchase
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of compute node to purchase
     * @param GoodsNum Number of compute node to purchase
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Instance type for purchase. Valid values: `PREPAID`, `POSTPAID`, `SERVERLESS`. 
     * @return InstancePayMode Instance type for purchase. Valid values: `PREPAID`, `POSTPAID`, `SERVERLESS`.
     */
    public String getInstancePayMode() {
        return this.InstancePayMode;
    }

    /**
     * Set Instance type for purchase. Valid values: `PREPAID`, `POSTPAID`, `SERVERLESS`.
     * @param InstancePayMode Instance type for purchase. Valid values: `PREPAID`, `POSTPAID`, `SERVERLESS`.
     */
    public void setInstancePayMode(String InstancePayMode) {
        this.InstancePayMode = InstancePayMode;
    }

    /**
     * Get Storage type for purchase. Valid values: `PREPAID`, `POSTPAID`. 
     * @return StoragePayMode Storage type for purchase. Valid values: `PREPAID`, `POSTPAID`.
     */
    public String getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set Storage type for purchase. Valid values: `PREPAID`, `POSTPAID`.
     * @param StoragePayMode Storage type for purchase. Valid values: `PREPAID`, `POSTPAID`.
     */
    public void setStoragePayMode(String StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get device type:common, exclusive 
     * @return DeviceType device type:common, exclusive
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set device type:common, exclusive
     * @param DeviceType device type:common, exclusive
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Number of CPU cores, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`. 
     * @return Cpu Number of CPU cores, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`.
     * @param Cpu Number of CPU cores, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size in GB, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`. 
     * @return Memory Memory size in GB, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`.
     * @param Memory Memory size in GB, which is required when `InstancePayMode` is `PREPAID` or `POSTPAID`.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CCU size, which is required when `InstancePayMode` is `SERVERLESS`. 
     * @return Ccu CCU size, which is required when `InstancePayMode` is `SERVERLESS`.
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set CCU size, which is required when `InstancePayMode` is `SERVERLESS`.
     * @param Ccu CCU size, which is required when `InstancePayMode` is `SERVERLESS`.
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    /**
     * Get Storage size, which is required when `StoragePayMode` is `PREPAID`. 
     * @return StorageLimit Storage size, which is required when `StoragePayMode` is `PREPAID`.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage size, which is required when `StoragePayMode` is `PREPAID`.
     * @param StorageLimit Storage size, which is required when `StoragePayMode` is `PREPAID`.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Validity period, which is required when `InstancePayMode` is `PREPAID`. 
     * @return TimeSpan Validity period, which is required when `InstancePayMode` is `PREPAID`.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Validity period, which is required when `InstancePayMode` is `PREPAID`.
     * @param TimeSpan Validity period, which is required when `InstancePayMode` is `PREPAID`.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Duration unit, which is required when `InstancePayMode` is `PREPAID`. Valid values: `m` (month), `d` (day). 
     * @return TimeUnit Duration unit, which is required when `InstancePayMode` is `PREPAID`. Valid values: `m` (month), `d` (day).
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Duration unit, which is required when `InstancePayMode` is `PREPAID`. Valid values: `m` (month), `d` (day).
     * @param TimeUnit Duration unit, which is required when `InstancePayMode` is `PREPAID`. Valid values: `m` (month), `d` (day).
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    public InquirePriceCreateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateRequest(InquirePriceCreateRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.InstancePayMode != null) {
            this.InstancePayMode = new String(source.InstancePayMode);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new String(source.StoragePayMode);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Ccu != null) {
            this.Ccu = new Float(source.Ccu);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "InstancePayMode", this.InstancePayMode);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Ccu", this.Ccu);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);

    }
}

