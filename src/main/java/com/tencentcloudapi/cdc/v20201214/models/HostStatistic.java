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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostStatistic extends AbstractModel {

    /**
    * Host type
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * Host model family
    */
    @SerializedName("HostFamily")
    @Expose
    private String HostFamily;

    /**
    * Number of CPU cores of host, in cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Host memory, in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Number of hosts of this type
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Average CPU load percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("CpuAverage")
    @Expose
    private Float CpuAverage;

    /**
    * Average memory usage percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("MemAverage")
    @Expose
    private Float MemAverage;

    /**
    * Average network traffic 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("NetAverage")
    @Expose
    private Float NetAverage;

    /**
    * Detailed CPU monitoring data 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("CpuDetailData")
    @Expose
    private DetailData CpuDetailData;

    /**
    * Memory details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("MemDetailData")
    @Expose
    private DetailData MemDetailData;

    /**
    * Network rate details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("NetRateDetailData")
    @Expose
    private DetailData NetRateDetailData;

    /**
    * Network packet details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("NetPacketDetailData")
    @Expose
    private DetailData NetPacketDetailData;

    /**
     * Get Host type 
     * @return HostType Host type
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set Host type
     * @param HostType Host type
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get Host model family 
     * @return HostFamily Host model family
     */
    public String getHostFamily() {
        return this.HostFamily;
    }

    /**
     * Set Host model family
     * @param HostFamily Host model family
     */
    public void setHostFamily(String HostFamily) {
        this.HostFamily = HostFamily;
    }

    /**
     * Get Number of CPU cores of host, in cores 
     * @return Cpu Number of CPU cores of host, in cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores of host, in cores
     * @param Cpu Number of CPU cores of host, in cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Host memory, in GB 
     * @return Memory Host memory, in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Host memory, in GB
     * @param Memory Host memory, in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Number of hosts of this type 
     * @return Count Number of hosts of this type
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of hosts of this type
     * @param Count Number of hosts of this type
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Average CPU load percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return CpuAverage Average CPU load percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Float getCpuAverage() {
        return this.CpuAverage;
    }

    /**
     * Set Average CPU load percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param CpuAverage Average CPU load percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setCpuAverage(Float CpuAverage) {
        this.CpuAverage = CpuAverage;
    }

    /**
     * Get Average memory usage percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return MemAverage Average memory usage percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Float getMemAverage() {
        return this.MemAverage;
    }

    /**
     * Set Average memory usage percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param MemAverage Average memory usage percentage 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setMemAverage(Float MemAverage) {
        this.MemAverage = MemAverage;
    }

    /**
     * Get Average network traffic 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return NetAverage Average network traffic 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Float getNetAverage() {
        return this.NetAverage;
    }

    /**
     * Set Average network traffic 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param NetAverage Average network traffic 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setNetAverage(Float NetAverage) {
        this.NetAverage = NetAverage;
    }

    /**
     * Get Detailed CPU monitoring data 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return CpuDetailData Detailed CPU monitoring data 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public DetailData getCpuDetailData() {
        return this.CpuDetailData;
    }

    /**
     * Set Detailed CPU monitoring data 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param CpuDetailData Detailed CPU monitoring data 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setCpuDetailData(DetailData CpuDetailData) {
        this.CpuDetailData = CpuDetailData;
    }

    /**
     * Get Memory details 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return MemDetailData Memory details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public DetailData getMemDetailData() {
        return this.MemDetailData;
    }

    /**
     * Set Memory details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param MemDetailData Memory details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setMemDetailData(DetailData MemDetailData) {
        this.MemDetailData = MemDetailData;
    }

    /**
     * Get Network rate details 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return NetRateDetailData Network rate details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public DetailData getNetRateDetailData() {
        return this.NetRateDetailData;
    }

    /**
     * Set Network rate details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param NetRateDetailData Network rate details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setNetRateDetailData(DetailData NetRateDetailData) {
        this.NetRateDetailData = NetRateDetailData;
    }

    /**
     * Get Network packet details 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return NetPacketDetailData Network packet details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public DetailData getNetPacketDetailData() {
        return this.NetPacketDetailData;
    }

    /**
     * Set Network packet details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param NetPacketDetailData Network packet details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setNetPacketDetailData(DetailData NetPacketDetailData) {
        this.NetPacketDetailData = NetPacketDetailData;
    }

    public HostStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostStatistic(HostStatistic source) {
        if (source.HostType != null) {
            this.HostType = new String(source.HostType);
        }
        if (source.HostFamily != null) {
            this.HostFamily = new String(source.HostFamily);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CpuAverage != null) {
            this.CpuAverage = new Float(source.CpuAverage);
        }
        if (source.MemAverage != null) {
            this.MemAverage = new Float(source.MemAverage);
        }
        if (source.NetAverage != null) {
            this.NetAverage = new Float(source.NetAverage);
        }
        if (source.CpuDetailData != null) {
            this.CpuDetailData = new DetailData(source.CpuDetailData);
        }
        if (source.MemDetailData != null) {
            this.MemDetailData = new DetailData(source.MemDetailData);
        }
        if (source.NetRateDetailData != null) {
            this.NetRateDetailData = new DetailData(source.NetRateDetailData);
        }
        if (source.NetPacketDetailData != null) {
            this.NetPacketDetailData = new DetailData(source.NetPacketDetailData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "HostFamily", this.HostFamily);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CpuAverage", this.CpuAverage);
        this.setParamSimple(map, prefix + "MemAverage", this.MemAverage);
        this.setParamSimple(map, prefix + "NetAverage", this.NetAverage);
        this.setParamObj(map, prefix + "CpuDetailData.", this.CpuDetailData);
        this.setParamObj(map, prefix + "MemDetailData.", this.MemDetailData);
        this.setParamObj(map, prefix + "NetRateDetailData.", this.NetRateDetailData);
        this.setParamObj(map, prefix + "NetPacketDetailData.", this.NetPacketDetailData);

    }
}

