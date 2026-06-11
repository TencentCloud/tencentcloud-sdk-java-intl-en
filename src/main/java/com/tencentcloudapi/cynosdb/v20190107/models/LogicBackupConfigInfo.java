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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogicBackupConfigInfo extends AbstractModel {

    /**
    * Whether automatic logical backup is enabled.
    */
    @SerializedName("LogicBackupEnable")
    @Expose
    private String LogicBackupEnable;

    /**
    * Specifies the automatic logic backup start time.
    */
    @SerializedName("LogicBackupTimeBeg")
    @Expose
    private Long LogicBackupTimeBeg;

    /**
    * Specifies the termination time of automatic logical backup.
    */
    @SerializedName("LogicBackupTimeEnd")
    @Expose
    private Long LogicBackupTimeEnd;

    /**
    * Automatic logical backup retention time.
Unit: seconds.
    */
    @SerializedName("LogicReserveDuration")
    @Expose
    private Long LogicReserveDuration;

    /**
    * Is cross-regional logical backup enabled?.
Valid values: ON/OFF.
    */
    @SerializedName("LogicCrossRegionsEnable")
    @Expose
    private String LogicCrossRegionsEnable;

    /**
    * Regions covered by logical backup.
    */
    @SerializedName("LogicCrossRegions")
    @Expose
    private String [] LogicCrossRegions;

    /**
    * Backup delivery relationship
    */
    @SerializedName("AutoCopyVaults")
    @Expose
    private CreateBackupVaultItem [] AutoCopyVaults;

    /**
     * Get Whether automatic logical backup is enabled. 
     * @return LogicBackupEnable Whether automatic logical backup is enabled.
     */
    public String getLogicBackupEnable() {
        return this.LogicBackupEnable;
    }

    /**
     * Set Whether automatic logical backup is enabled.
     * @param LogicBackupEnable Whether automatic logical backup is enabled.
     */
    public void setLogicBackupEnable(String LogicBackupEnable) {
        this.LogicBackupEnable = LogicBackupEnable;
    }

    /**
     * Get Specifies the automatic logic backup start time. 
     * @return LogicBackupTimeBeg Specifies the automatic logic backup start time.
     */
    public Long getLogicBackupTimeBeg() {
        return this.LogicBackupTimeBeg;
    }

    /**
     * Set Specifies the automatic logic backup start time.
     * @param LogicBackupTimeBeg Specifies the automatic logic backup start time.
     */
    public void setLogicBackupTimeBeg(Long LogicBackupTimeBeg) {
        this.LogicBackupTimeBeg = LogicBackupTimeBeg;
    }

    /**
     * Get Specifies the termination time of automatic logical backup. 
     * @return LogicBackupTimeEnd Specifies the termination time of automatic logical backup.
     */
    public Long getLogicBackupTimeEnd() {
        return this.LogicBackupTimeEnd;
    }

    /**
     * Set Specifies the termination time of automatic logical backup.
     * @param LogicBackupTimeEnd Specifies the termination time of automatic logical backup.
     */
    public void setLogicBackupTimeEnd(Long LogicBackupTimeEnd) {
        this.LogicBackupTimeEnd = LogicBackupTimeEnd;
    }

    /**
     * Get Automatic logical backup retention time.
Unit: seconds. 
     * @return LogicReserveDuration Automatic logical backup retention time.
Unit: seconds.
     */
    public Long getLogicReserveDuration() {
        return this.LogicReserveDuration;
    }

    /**
     * Set Automatic logical backup retention time.
Unit: seconds.
     * @param LogicReserveDuration Automatic logical backup retention time.
Unit: seconds.
     */
    public void setLogicReserveDuration(Long LogicReserveDuration) {
        this.LogicReserveDuration = LogicReserveDuration;
    }

    /**
     * Get Is cross-regional logical backup enabled?.
Valid values: ON/OFF. 
     * @return LogicCrossRegionsEnable Is cross-regional logical backup enabled?.
Valid values: ON/OFF.
     */
    public String getLogicCrossRegionsEnable() {
        return this.LogicCrossRegionsEnable;
    }

    /**
     * Set Is cross-regional logical backup enabled?.
Valid values: ON/OFF.
     * @param LogicCrossRegionsEnable Is cross-regional logical backup enabled?.
Valid values: ON/OFF.
     */
    public void setLogicCrossRegionsEnable(String LogicCrossRegionsEnable) {
        this.LogicCrossRegionsEnable = LogicCrossRegionsEnable;
    }

    /**
     * Get Regions covered by logical backup. 
     * @return LogicCrossRegions Regions covered by logical backup.
     */
    public String [] getLogicCrossRegions() {
        return this.LogicCrossRegions;
    }

    /**
     * Set Regions covered by logical backup.
     * @param LogicCrossRegions Regions covered by logical backup.
     */
    public void setLogicCrossRegions(String [] LogicCrossRegions) {
        this.LogicCrossRegions = LogicCrossRegions;
    }

    /**
     * Get Backup delivery relationship 
     * @return AutoCopyVaults Backup delivery relationship
     */
    public CreateBackupVaultItem [] getAutoCopyVaults() {
        return this.AutoCopyVaults;
    }

    /**
     * Set Backup delivery relationship
     * @param AutoCopyVaults Backup delivery relationship
     */
    public void setAutoCopyVaults(CreateBackupVaultItem [] AutoCopyVaults) {
        this.AutoCopyVaults = AutoCopyVaults;
    }

    public LogicBackupConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogicBackupConfigInfo(LogicBackupConfigInfo source) {
        if (source.LogicBackupEnable != null) {
            this.LogicBackupEnable = new String(source.LogicBackupEnable);
        }
        if (source.LogicBackupTimeBeg != null) {
            this.LogicBackupTimeBeg = new Long(source.LogicBackupTimeBeg);
        }
        if (source.LogicBackupTimeEnd != null) {
            this.LogicBackupTimeEnd = new Long(source.LogicBackupTimeEnd);
        }
        if (source.LogicReserveDuration != null) {
            this.LogicReserveDuration = new Long(source.LogicReserveDuration);
        }
        if (source.LogicCrossRegionsEnable != null) {
            this.LogicCrossRegionsEnable = new String(source.LogicCrossRegionsEnable);
        }
        if (source.LogicCrossRegions != null) {
            this.LogicCrossRegions = new String[source.LogicCrossRegions.length];
            for (int i = 0; i < source.LogicCrossRegions.length; i++) {
                this.LogicCrossRegions[i] = new String(source.LogicCrossRegions[i]);
            }
        }
        if (source.AutoCopyVaults != null) {
            this.AutoCopyVaults = new CreateBackupVaultItem[source.AutoCopyVaults.length];
            for (int i = 0; i < source.AutoCopyVaults.length; i++) {
                this.AutoCopyVaults[i] = new CreateBackupVaultItem(source.AutoCopyVaults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogicBackupEnable", this.LogicBackupEnable);
        this.setParamSimple(map, prefix + "LogicBackupTimeBeg", this.LogicBackupTimeBeg);
        this.setParamSimple(map, prefix + "LogicBackupTimeEnd", this.LogicBackupTimeEnd);
        this.setParamSimple(map, prefix + "LogicReserveDuration", this.LogicReserveDuration);
        this.setParamSimple(map, prefix + "LogicCrossRegionsEnable", this.LogicCrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "LogicCrossRegions.", this.LogicCrossRegions);
        this.setParamArrayObj(map, prefix + "AutoCopyVaults.", this.AutoCopyVaults);

    }
}

