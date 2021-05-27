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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeInfo extends AbstractModel{

    /**
    * Name of the server type, such as `Standard SA1`
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Specification of the server type, such as `SA1.SMALL1`
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * CPU, in core
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory, in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * The packet sending and receiving capability, in 10k PPS. 
    */
    @SerializedName("NetworkCard")
    @Expose
    private Long NetworkCard;

    /**
     * Get Name of the server type, such as `Standard SA1` 
     * @return TypeName Name of the server type, such as `Standard SA1`
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Name of the server type, such as `Standard SA1`
     * @param TypeName Name of the server type, such as `Standard SA1`
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Specification of the server type, such as `SA1.SMALL1` 
     * @return InstanceType Specification of the server type, such as `SA1.SMALL1`
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specification of the server type, such as `SA1.SMALL1`
     * @param InstanceType Specification of the server type, such as `SA1.SMALL1`
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get CPU, in core 
     * @return Cpu CPU, in core
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU, in core
     * @param Cpu CPU, in core
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory, in GB 
     * @return Memory Memory, in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory, in GB
     * @param Memory Memory, in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get The packet sending and receiving capability, in 10k PPS.  
     * @return NetworkCard The packet sending and receiving capability, in 10k PPS. 
     */
    public Long getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set The packet sending and receiving capability, in 10k PPS. 
     * @param NetworkCard The packet sending and receiving capability, in 10k PPS. 
     */
    public void setNetworkCard(Long NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    public InstanceTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTypeInfo(InstanceTypeInfo source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.NetworkCard != null) {
            this.NetworkCard = new Long(source.NetworkCard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);

    }
}

