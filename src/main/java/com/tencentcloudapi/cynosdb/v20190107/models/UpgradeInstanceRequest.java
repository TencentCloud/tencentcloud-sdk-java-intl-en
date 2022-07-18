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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Database memory in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Upgrade type. Valid values: upgradeImmediate, upgradeInMaintain
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * This parameter has been disused.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * This parameter has been disused.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database CPU 
     * @return Cpu Database CPU
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Database CPU
     * @param Cpu Database CPU
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Database memory in GB 
     * @return Memory Database memory in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Database memory in GB
     * @param Memory Database memory in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Upgrade type. Valid values: upgradeImmediate, upgradeInMaintain 
     * @return UpgradeType Upgrade type. Valid values: upgradeImmediate, upgradeInMaintain
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set Upgrade type. Valid values: upgradeImmediate, upgradeInMaintain
     * @param UpgradeType Upgrade type. Valid values: upgradeImmediate, upgradeInMaintain
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get This parameter has been disused. 
     * @return StorageLimit This parameter has been disused.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set This parameter has been disused.
     * @param StorageLimit This parameter has been disused.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0 
     * @return AutoVoucher Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0
     * @param AutoVoucher Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get This parameter has been disused. 
     * @return DbType This parameter has been disused.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set This parameter has been disused.
     * @param DbType This parameter has been disused.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order) 
     * @return DealMode Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     * @param DealMode Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    public UpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceRequest(UpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);

    }
}

