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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceRequest extends AbstractModel{

    /**
    * Instance memory size in GB after upgrade
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GB after upgrade
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Instance ID in the format of postgres-lnp6j617
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Whether to automatically use vouchers. 1: yes, 0: no. Default value: no
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list (only one voucher can be specified currently)
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Activity ID
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
     * Get Instance memory size in GB after upgrade 
     * @return Memory Instance memory size in GB after upgrade
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB after upgrade
     * @param Memory Instance memory size in GB after upgrade
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GB after upgrade 
     * @return Storage Instance disk size in GB after upgrade
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance disk size in GB after upgrade
     * @param Storage Instance disk size in GB after upgrade
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Instance ID in the format of postgres-lnp6j617 
     * @return DBInstanceId Instance ID in the format of postgres-lnp6j617
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-lnp6j617
     * @param DBInstanceId Instance ID in the format of postgres-lnp6j617
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Whether to automatically use vouchers. 1: yes, 0: no. Default value: no 
     * @return AutoVoucher Whether to automatically use vouchers. 1: yes, 0: no. Default value: no
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers. 1: yes, 0: no. Default value: no
     * @param AutoVoucher Whether to automatically use vouchers. 1: yes, 0: no. Default value: no
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list (only one voucher can be specified currently) 
     * @return VoucherIds Voucher ID list (only one voucher can be specified currently)
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list (only one voucher can be specified currently)
     * @param VoucherIds Voucher ID list (only one voucher can be specified currently)
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Activity ID 
     * @return ActivityId Activity ID
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Activity ID
     * @param ActivityId Activity ID
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);

    }
}

