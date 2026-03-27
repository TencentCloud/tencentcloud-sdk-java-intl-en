/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckItem extends AbstractModel {

    /**
    * Check item names: CK_CPU - Post-Resizing CPU Risk Check; CK_MASTER_STORAGE - During read-only replica resizing, verify that read-only replica storage space is not less than that of the primary instance; CK_MEMORY - Post-Resizing Memory Risk Check; CK_STORAGE - Post-Resizing Storage Space Risk Check; CK_UPGRATE - Resizing Migration Requirement Check;
    */
    @SerializedName("CheckName")
    @Expose
    private String CheckName;

    /**
    * Check item return values: CK_CPU - Maximum CPU utilization (%) in the last 7 days; CK_MASTER_STORAGE - Disk space of the primary instance (GB); CK_MEMORY - Maximum memory usage (GB) in the last 7 days;

CK_STORAGE - Maximum disk usage (GB) in the last 7 days; CK_UPGRATE - Whether the current resizing check requires migration: MIGRATE indicates migration resizing is required, LOCAL indicates local resizing;
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Check item pass status: 0 - Not passed, resizing not allowed; 1 - Passed, resizing allowed
    */
    @SerializedName("Passed")
    @Expose
    private Long Passed;

    /**
    * Whether this resizing item affects the instance: 0 - No impact; 1 - Impact exists
    */
    @SerializedName("IsAffect")
    @Expose
    private Long IsAffect;

    /**
    * Required description when impact exists or the check is not passed
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * Describe the corresponding code
    */
    @SerializedName("MsgCode")
    @Expose
    private Long MsgCode;

    /**
     * Get Check item names: CK_CPU - Post-Resizing CPU Risk Check; CK_MASTER_STORAGE - During read-only replica resizing, verify that read-only replica storage space is not less than that of the primary instance; CK_MEMORY - Post-Resizing Memory Risk Check; CK_STORAGE - Post-Resizing Storage Space Risk Check; CK_UPGRATE - Resizing Migration Requirement Check; 
     * @return CheckName Check item names: CK_CPU - Post-Resizing CPU Risk Check; CK_MASTER_STORAGE - During read-only replica resizing, verify that read-only replica storage space is not less than that of the primary instance; CK_MEMORY - Post-Resizing Memory Risk Check; CK_STORAGE - Post-Resizing Storage Space Risk Check; CK_UPGRATE - Resizing Migration Requirement Check;
     */
    public String getCheckName() {
        return this.CheckName;
    }

    /**
     * Set Check item names: CK_CPU - Post-Resizing CPU Risk Check; CK_MASTER_STORAGE - During read-only replica resizing, verify that read-only replica storage space is not less than that of the primary instance; CK_MEMORY - Post-Resizing Memory Risk Check; CK_STORAGE - Post-Resizing Storage Space Risk Check; CK_UPGRATE - Resizing Migration Requirement Check;
     * @param CheckName Check item names: CK_CPU - Post-Resizing CPU Risk Check; CK_MASTER_STORAGE - During read-only replica resizing, verify that read-only replica storage space is not less than that of the primary instance; CK_MEMORY - Post-Resizing Memory Risk Check; CK_STORAGE - Post-Resizing Storage Space Risk Check; CK_UPGRATE - Resizing Migration Requirement Check;
     */
    public void setCheckName(String CheckName) {
        this.CheckName = CheckName;
    }

    /**
     * Get Check item return values: CK_CPU - Maximum CPU utilization (%) in the last 7 days; CK_MASTER_STORAGE - Disk space of the primary instance (GB); CK_MEMORY - Maximum memory usage (GB) in the last 7 days;

CK_STORAGE - Maximum disk usage (GB) in the last 7 days; CK_UPGRATE - Whether the current resizing check requires migration: MIGRATE indicates migration resizing is required, LOCAL indicates local resizing; 
     * @return CurrentValue Check item return values: CK_CPU - Maximum CPU utilization (%) in the last 7 days; CK_MASTER_STORAGE - Disk space of the primary instance (GB); CK_MEMORY - Maximum memory usage (GB) in the last 7 days;

CK_STORAGE - Maximum disk usage (GB) in the last 7 days; CK_UPGRATE - Whether the current resizing check requires migration: MIGRATE indicates migration resizing is required, LOCAL indicates local resizing;
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Check item return values: CK_CPU - Maximum CPU utilization (%) in the last 7 days; CK_MASTER_STORAGE - Disk space of the primary instance (GB); CK_MEMORY - Maximum memory usage (GB) in the last 7 days;

CK_STORAGE - Maximum disk usage (GB) in the last 7 days; CK_UPGRATE - Whether the current resizing check requires migration: MIGRATE indicates migration resizing is required, LOCAL indicates local resizing;
     * @param CurrentValue Check item return values: CK_CPU - Maximum CPU utilization (%) in the last 7 days; CK_MASTER_STORAGE - Disk space of the primary instance (GB); CK_MEMORY - Maximum memory usage (GB) in the last 7 days;

CK_STORAGE - Maximum disk usage (GB) in the last 7 days; CK_UPGRATE - Whether the current resizing check requires migration: MIGRATE indicates migration resizing is required, LOCAL indicates local resizing;
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Check item pass status: 0 - Not passed, resizing not allowed; 1 - Passed, resizing allowed 
     * @return Passed Check item pass status: 0 - Not passed, resizing not allowed; 1 - Passed, resizing allowed
     */
    public Long getPassed() {
        return this.Passed;
    }

    /**
     * Set Check item pass status: 0 - Not passed, resizing not allowed; 1 - Passed, resizing allowed
     * @param Passed Check item pass status: 0 - Not passed, resizing not allowed; 1 - Passed, resizing allowed
     */
    public void setPassed(Long Passed) {
        this.Passed = Passed;
    }

    /**
     * Get Whether this resizing item affects the instance: 0 - No impact; 1 - Impact exists 
     * @return IsAffect Whether this resizing item affects the instance: 0 - No impact; 1 - Impact exists
     */
    public Long getIsAffect() {
        return this.IsAffect;
    }

    /**
     * Set Whether this resizing item affects the instance: 0 - No impact; 1 - Impact exists
     * @param IsAffect Whether this resizing item affects the instance: 0 - No impact; 1 - Impact exists
     */
    public void setIsAffect(Long IsAffect) {
        this.IsAffect = IsAffect;
    }

    /**
     * Get Required description when impact exists or the check is not passed 
     * @return Msg Required description when impact exists or the check is not passed
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Required description when impact exists or the check is not passed
     * @param Msg Required description when impact exists or the check is not passed
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get Describe the corresponding code 
     * @return MsgCode Describe the corresponding code
     */
    public Long getMsgCode() {
        return this.MsgCode;
    }

    /**
     * Set Describe the corresponding code
     * @param MsgCode Describe the corresponding code
     */
    public void setMsgCode(Long MsgCode) {
        this.MsgCode = MsgCode;
    }

    public CheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckItem(CheckItem source) {
        if (source.CheckName != null) {
            this.CheckName = new String(source.CheckName);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Passed != null) {
            this.Passed = new Long(source.Passed);
        }
        if (source.IsAffect != null) {
            this.IsAffect = new Long(source.IsAffect);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.MsgCode != null) {
            this.MsgCode = new Long(source.MsgCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckName", this.CheckName);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Passed", this.Passed);
        this.setParamSimple(map, prefix + "IsAffect", this.IsAffect);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "MsgCode", this.MsgCode);

    }
}

