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

public class UpgradeDBInstanceRequest extends AbstractModel{

    /**
    * Instance ID in the format of mssql-j8kv137v
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
    * Whether to automatically use vouchers. 0: no, 1: yes. Default value: 0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID (currently, only one voucher can be used per order)
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * The number of CUP cores after the instance is upgraded.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get Instance ID in the format of mssql-j8kv137v 
     * @return InstanceId Instance ID in the format of mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-j8kv137v
     * @param InstanceId Instance ID in the format of mssql-j8kv137v
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
     * Get Whether to automatically use vouchers. 0: no, 1: yes. Default value: 0 
     * @return AutoVoucher Whether to automatically use vouchers. 0: no, 1: yes. Default value: 0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers. 0: no, 1: yes. Default value: 0
     * @param AutoVoucher Whether to automatically use vouchers. 0: no, 1: yes. Default value: 0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID (currently, only one voucher can be used per order) 
     * @return VoucherIds Voucher ID (currently, only one voucher can be used per order)
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID (currently, only one voucher can be used per order)
     * @param VoucherIds Voucher ID (currently, only one voucher can be used per order)
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get The number of CUP cores after the instance is upgraded. 
     * @return Cpu The number of CUP cores after the instance is upgraded.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of CUP cores after the instance is upgraded.
     * @param Cpu The number of CUP cores after the instance is upgraded.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

