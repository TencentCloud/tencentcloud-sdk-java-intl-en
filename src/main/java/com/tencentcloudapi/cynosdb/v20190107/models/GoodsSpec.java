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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Number of CPU cores. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size in gb. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Ccu size. required for serverless type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

    /**
    * Storage size. required for PREPAID storage type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Purchase duration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Duration unit.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Machine type.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get Number of products
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GoodsNum Number of products
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of products
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GoodsNum Number of products
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Number of CPU cores. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cpu Number of CPU cores. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cpu Number of CPU cores. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size in gb. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Memory Memory size in gb. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in gb. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Memory Memory size in gb. required for PREPAID and POSTPAID instance types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Ccu size. required for serverless type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ccu Ccu size. required for serverless type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set Ccu size. required for serverless type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ccu Ccu size. required for serverless type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    /**
     * Get Storage size. required for PREPAID storage type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageLimit Storage size. required for PREPAID storage type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage size. required for PREPAID storage type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageLimit Storage size. required for PREPAID storage type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Purchase duration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeSpan Purchase duration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase duration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeSpan Purchase duration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Duration unit.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeUnit Duration unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Duration unit.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeUnit Duration unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Machine type. 
     * @return DeviceType Machine type.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Machine type.
     * @param DeviceType Machine type.
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

