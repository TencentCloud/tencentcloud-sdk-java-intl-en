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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstanceUtilizationRate extends AbstractModel {

    /**
    * Usage rate
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Rate")
    @Expose
    private Float Rate;

    /**
    * Quantity of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * Number of cores

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("CPU")
    @Expose
    private Float CPU;

    /**
    * Memory

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    *  Type of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("GpuNum")
    @Expose
    private String GpuNum;

    /**
    * Availability zone

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Cluster ID

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Node name

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Number of Pods
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("PodNum")
    @Expose
    private Long PodNum;

    /**
     * Get Usage rate
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Rate Usage rate
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Float getRate() {
        return this.Rate;
    }

    /**
     * Set Usage rate
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Rate Usage rate
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Quantity of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Num Quantity of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Quantity of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Num Quantity of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get Number of cores

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return CPU Number of cores

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Float getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of cores

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param CPU Number of cores

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setCPU(Float CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Memory

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Memory Memory

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Memory Memory

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get  Type of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Type  Type of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set  Type of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Type  Type of Reserved Coupons
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return GpuNum Number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getGpuNum() {
        return this.GpuNum;
    }

    /**
     * Set Number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param GpuNum Number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setGpuNum(String GpuNum) {
        this.GpuNum = GpuNum;
    }

    /**
     * Get Availability zone

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Zone Availability zone

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Zone Availability zone

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Cluster ID

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ClusterId Cluster ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ClusterId Cluster ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Node name

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return NodeName Node name

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param NodeName Node name

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Number of Pods
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return PodNum Number of Pods
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getPodNum() {
        return this.PodNum;
    }

    /**
     * Set Number of Pods
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param PodNum Number of Pods
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setPodNum(Long PodNum) {
        this.PodNum = PodNum;
    }

    public ReservedInstanceUtilizationRate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstanceUtilizationRate(ReservedInstanceUtilizationRate source) {
        if (source.Rate != null) {
            this.Rate = new Float(source.Rate);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.CPU != null) {
            this.CPU = new Float(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GpuNum != null) {
            this.GpuNum = new String(source.GpuNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.PodNum != null) {
            this.PodNum = new Long(source.PodNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GpuNum", this.GpuNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "PodNum", this.PodNum);

    }
}

