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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSpecRequest extends AbstractModel {

    /**
    * Instance ID in the format of postgres-6bwgamo3.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance memory size in GiB after modification.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GiB after modification.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list. Currently, you can specify only one voucher.
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Campaign ID.
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * Switch time after instance configurations are modified.
<li>0: Switch immediately</li>
<li>1: Switch at specified time</li>
<li>2: Switch during maintenance time window</li>
Default value: 0
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid.
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid.
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * Instance CPU size in Cores after modification.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get Instance ID in the format of postgres-6bwgamo3. 
     * @return DBInstanceId Instance ID in the format of postgres-6bwgamo3.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-6bwgamo3.
     * @param DBInstanceId Instance ID in the format of postgres-6bwgamo3.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance memory size in GiB after modification. 
     * @return Memory Instance memory size in GiB after modification.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GiB after modification.
     * @param Memory Instance memory size in GiB after modification.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GiB after modification. 
     * @return Storage Instance disk size in GiB after modification.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance disk size in GiB after modification.
     * @param Storage Instance disk size in GiB after modification.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0 
     * @return AutoVoucher Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     * @param AutoVoucher Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list. Currently, you can specify only one voucher. 
     * @return VoucherIds Voucher ID list. Currently, you can specify only one voucher.
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list. Currently, you can specify only one voucher.
     * @param VoucherIds Voucher ID list. Currently, you can specify only one voucher.
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Campaign ID. 
     * @return ActivityId Campaign ID.
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Campaign ID.
     * @param ActivityId Campaign ID.
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get Switch time after instance configurations are modified.
<li>0: Switch immediately</li>
<li>1: Switch at specified time</li>
<li>2: Switch during maintenance time window</li>
Default value: 0 
     * @return SwitchTag Switch time after instance configurations are modified.
<li>0: Switch immediately</li>
<li>1: Switch at specified time</li>
<li>2: Switch during maintenance time window</li>
Default value: 0
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set Switch time after instance configurations are modified.
<li>0: Switch immediately</li>
<li>1: Switch at specified time</li>
<li>2: Switch during maintenance time window</li>
Default value: 0
     * @param SwitchTag Switch time after instance configurations are modified.
<li>0: Switch immediately</li>
<li>1: Switch at specified time</li>
<li>2: Switch during maintenance time window</li>
Default value: 0
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid. 
     * @return SwitchStartTime Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid.
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid.
     * @param SwitchStartTime Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid.
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid. 
     * @return SwitchEndTime Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid.
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid.
     * @param SwitchEndTime Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is 0 or 2, this parameter becomes invalid.
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get Instance CPU size in Cores after modification. 
     * @return Cpu Instance CPU size in Cores after modification.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Instance CPU size in Cores after modification.
     * @param Cpu Instance CPU size in Cores after modification.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    public ModifyDBInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSpecRequest(ModifyDBInstanceSpecRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

