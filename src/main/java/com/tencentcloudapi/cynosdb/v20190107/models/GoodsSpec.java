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

public class GoodsSpec extends AbstractModel {

    /**
    * Number of products
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Number of CPU cores. Required for PREPAID and POSTPAID instance types.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size, unit G, required for PREPAID and POSTPAID instance types
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Ccu size, required for serverless type
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

    /**
    * Storage size, required for PREPAID storage type
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Purchase period
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Duration unit.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Instance machine type
1. common, universal type.
2. exclusive, dedicated.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get Number of products 
     * @return GoodsNum Number of products
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of products
     * @param GoodsNum Number of products
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Number of CPU cores. Required for PREPAID and POSTPAID instance types. 
     * @return Cpu Number of CPU cores. Required for PREPAID and POSTPAID instance types.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores. Required for PREPAID and POSTPAID instance types.
     * @param Cpu Number of CPU cores. Required for PREPAID and POSTPAID instance types.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size, unit G, required for PREPAID and POSTPAID instance types 
     * @return Memory Memory size, unit G, required for PREPAID and POSTPAID instance types
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size, unit G, required for PREPAID and POSTPAID instance types
     * @param Memory Memory size, unit G, required for PREPAID and POSTPAID instance types
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Ccu size, required for serverless type 
     * @return Ccu Ccu size, required for serverless type
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set Ccu size, required for serverless type
     * @param Ccu Ccu size, required for serverless type
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    /**
     * Get Storage size, required for PREPAID storage type 
     * @return StorageLimit Storage size, required for PREPAID storage type
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage size, required for PREPAID storage type
     * @param StorageLimit Storage size, required for PREPAID storage type
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Purchase period 
     * @return TimeSpan Purchase period
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase period
     * @param TimeSpan Purchase period
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Duration unit. 
     * @return TimeUnit Duration unit.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Duration unit.
     * @param TimeUnit Duration unit.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Instance machine type
1. common, universal type.
2. exclusive, dedicated. 
     * @return DeviceType Instance machine type
1. common, universal type.
2. exclusive, dedicated.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance machine type
1. common, universal type.
2. exclusive, dedicated.
     * @param DeviceType Instance machine type
1. common, universal type.
2. exclusive, dedicated.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public GoodsSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsSpec(GoodsSpec source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
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
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Ccu", this.Ccu);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

