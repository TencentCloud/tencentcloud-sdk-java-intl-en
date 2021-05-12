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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeDBInstanceRequest extends AbstractModel{

    /**
    * Instance ID in the format of mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Memory size after instance upgrade in GB, which cannot be smaller than the current instance memory size
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage capacity after instance upgrade in GB, which cannot be smaller than the current instance storage capacity
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * The number of CUP cores after the instance is upgraded, which cannot be smaller than that of the current cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get Instance ID in the format of mssql-njj2mtpl 
     * @return InstanceId Instance ID in the format of mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-njj2mtpl
     * @param InstanceId Instance ID in the format of mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Memory size after instance upgrade in GB, which cannot be smaller than the current instance memory size 
     * @return Memory Memory size after instance upgrade in GB, which cannot be smaller than the current instance memory size
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size after instance upgrade in GB, which cannot be smaller than the current instance memory size
     * @param Memory Memory size after instance upgrade in GB, which cannot be smaller than the current instance memory size
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage capacity after instance upgrade in GB, which cannot be smaller than the current instance storage capacity 
     * @return Storage Storage capacity after instance upgrade in GB, which cannot be smaller than the current instance storage capacity
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity after instance upgrade in GB, which cannot be smaller than the current instance storage capacity
     * @param Storage Storage capacity after instance upgrade in GB, which cannot be smaller than the current instance storage capacity
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get The number of CUP cores after the instance is upgraded, which cannot be smaller than that of the current cores. 
     * @return Cpu The number of CUP cores after the instance is upgraded, which cannot be smaller than that of the current cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of CUP cores after the instance is upgraded, which cannot be smaller than that of the current cores.
     * @param Cpu The number of CUP cores after the instance is upgraded, which cannot be smaller than that of the current cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    public InquiryPriceUpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpgradeDBInstanceRequest(InquiryPriceUpgradeDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

