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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNetworkLimitConfig extends AbstractModel {

    /**
    * Number of CPU cores
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * ENI quantity limit
    */
    @SerializedName("NetworkInterfaceLimit")
    @Expose
    private Long NetworkInterfaceLimit;

    /**
    * Private IP quantity limit per ENI
    */
    @SerializedName("InnerIpPerNetworkInterface")
    @Expose
    private Long InnerIpPerNetworkInterface;

    /**
    * Public IP limit per instance
    */
    @SerializedName("PublicIpPerInstance")
    @Expose
    private Long PublicIpPerInstance;

    /**
     * Get Number of CPU cores 
     * @return CpuNum Number of CPU cores
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of CPU cores
     * @param CpuNum Number of CPU cores
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get ENI quantity limit 
     * @return NetworkInterfaceLimit ENI quantity limit
     */
    public Long getNetworkInterfaceLimit() {
        return this.NetworkInterfaceLimit;
    }

    /**
     * Set ENI quantity limit
     * @param NetworkInterfaceLimit ENI quantity limit
     */
    public void setNetworkInterfaceLimit(Long NetworkInterfaceLimit) {
        this.NetworkInterfaceLimit = NetworkInterfaceLimit;
    }

    /**
     * Get Private IP quantity limit per ENI 
     * @return InnerIpPerNetworkInterface Private IP quantity limit per ENI
     */
    public Long getInnerIpPerNetworkInterface() {
        return this.InnerIpPerNetworkInterface;
    }

    /**
     * Set Private IP quantity limit per ENI
     * @param InnerIpPerNetworkInterface Private IP quantity limit per ENI
     */
    public void setInnerIpPerNetworkInterface(Long InnerIpPerNetworkInterface) {
        this.InnerIpPerNetworkInterface = InnerIpPerNetworkInterface;
    }

    /**
     * Get Public IP limit per instance 
     * @return PublicIpPerInstance Public IP limit per instance
     */
    public Long getPublicIpPerInstance() {
        return this.PublicIpPerInstance;
    }

    /**
     * Set Public IP limit per instance
     * @param PublicIpPerInstance Public IP limit per instance
     */
    public void setPublicIpPerInstance(Long PublicIpPerInstance) {
        this.PublicIpPerInstance = PublicIpPerInstance;
    }

    public InstanceNetworkLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNetworkLimitConfig(InstanceNetworkLimitConfig source) {
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.NetworkInterfaceLimit != null) {
            this.NetworkInterfaceLimit = new Long(source.NetworkInterfaceLimit);
        }
        if (source.InnerIpPerNetworkInterface != null) {
            this.InnerIpPerNetworkInterface = new Long(source.InnerIpPerNetworkInterface);
        }
        if (source.PublicIpPerInstance != null) {
            this.PublicIpPerInstance = new Long(source.PublicIpPerInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "NetworkInterfaceLimit", this.NetworkInterfaceLimit);
        this.setParamSimple(map, prefix + "InnerIpPerNetworkInterface", this.InnerIpPerNetworkInterface);
        this.setParamSimple(map, prefix + "PublicIpPerInstance", this.PublicIpPerInstance);

    }
}

