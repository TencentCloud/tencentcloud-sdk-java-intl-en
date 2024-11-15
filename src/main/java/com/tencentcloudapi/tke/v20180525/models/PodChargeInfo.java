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

public class PodChargeInfo extends AbstractModel {

    /**
    * Pod billing start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * UID of the pod.
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Pod CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * Pod Memory
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * Pod Type: intel, amd, v100, t4, a10\*gnv4, a10\*gnv4v, and so on.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * If the Pod is a GPU, then it indicates the number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Gpu")
    @Expose
    private String Gpu;

    /**
    * Billing type

PREPAID: Pod scheduled to monthly subscription super node
POSTPAID_BY_HOUR: Pay-as-you-go
RESERVED_INSTANCE: Deducted by reserved coupon in the previous period
SPOT: Bidding instance
TPOD: Preference instance
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Pod name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Pod billing start time 
     * @return StartTime Pod billing start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Pod billing start time
     * @param StartTime Pod billing start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get UID of the pod. 
     * @return Uid UID of the pod.
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set UID of the pod.
     * @param Uid UID of the pod.
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Pod CPU 
     * @return Cpu Pod CPU
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set Pod CPU
     * @param Cpu Pod CPU
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Pod Memory 
     * @return Memory Pod Memory
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set Pod Memory
     * @param Memory Pod Memory
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Pod Type: intel, amd, v100, t4, a10\*gnv4, a10\*gnv4v, and so on. 
     * @return Type Pod Type: intel, amd, v100, t4, a10\*gnv4, a10\*gnv4v, and so on.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Pod Type: intel, amd, v100, t4, a10\*gnv4, a10\*gnv4v, and so on.
     * @param Type Pod Type: intel, amd, v100, t4, a10\*gnv4, a10\*gnv4v, and so on.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get If the Pod is a GPU, then it indicates the number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Gpu If the Pod is a GPU, then it indicates the number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getGpu() {
        return this.Gpu;
    }

    /**
     * Set If the Pod is a GPU, then it indicates the number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Gpu If the Pod is a GPU, then it indicates the number of GPU cards
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setGpu(String Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get Billing type

PREPAID: Pod scheduled to monthly subscription super node
POSTPAID_BY_HOUR: Pay-as-you-go
RESERVED_INSTANCE: Deducted by reserved coupon in the previous period
SPOT: Bidding instance
TPOD: Preference instance 
     * @return ChargeType Billing type

PREPAID: Pod scheduled to monthly subscription super node
POSTPAID_BY_HOUR: Pay-as-you-go
RESERVED_INSTANCE: Deducted by reserved coupon in the previous period
SPOT: Bidding instance
TPOD: Preference instance
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type

PREPAID: Pod scheduled to monthly subscription super node
POSTPAID_BY_HOUR: Pay-as-you-go
RESERVED_INSTANCE: Deducted by reserved coupon in the previous period
SPOT: Bidding instance
TPOD: Preference instance
     * @param ChargeType Billing type

PREPAID: Pod scheduled to monthly subscription super node
POSTPAID_BY_HOUR: Pay-as-you-go
RESERVED_INSTANCE: Deducted by reserved coupon in the previous period
SPOT: Bidding instance
TPOD: Preference instance
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Pod name 
     * @return Name Pod name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pod name
     * @param Name Pod name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public PodChargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodChargeInfo(PodChargeInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Gpu != null) {
            this.Gpu = new String(source.Gpu);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

