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
    * <p>Whether automatic logical backup is enabled</p>
    */
    @SerializedName("LogicBackupEnable")
    @Expose
    private String LogicBackupEnable;

    /**
    * <p>Automatic logic backup start time</p>
    */
    @SerializedName("LogicBackupTimeBeg")
    @Expose
    private Long LogicBackupTimeBeg;

    /**
    * <p>Automated logic backup end time</p>
    */
    @SerializedName("LogicBackupTimeEnd")
    @Expose
    private Long LogicBackupTimeEnd;

    /**
    * <p>Automatic logical backup retention time<br>Unit: second</p>
    */
    @SerializedName("LogicReserveDuration")
    @Expose
    private Long LogicReserveDuration;

    /**
    * <p>Whether cross-regional logical backup is enabled<br>Available values: ON/OFF</p>
    */
    @SerializedName("LogicCrossRegionsEnable")
    @Expose
    private String LogicCrossRegionsEnable;

    /**
    * <p>Cross-regional logic backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogicCrossRegions")
    @Expose
    private String [] LogicCrossRegions;

    /**
    * <p>Backup delivery relationship</p>
    */
    @SerializedName("AutoCopyVaults")
    @Expose
    private CreateBackupVaultItem [] AutoCopyVaults;

    /**
    * <p>Day</p><p>Unit: Cross-regional logical backup retention time</p>
    */
    @SerializedName("LogicCrossRegionSaveDays")
    @Expose
    private Long LogicCrossRegionSaveDays;

    /**
     * Get <p>Whether automatic logical backup is enabled</p> 
     * @return LogicBackupEnable <p>Whether automatic logical backup is enabled</p>
     */
    public String getLogicBackupEnable() {
        return this.LogicBackupEnable;
    }

    /**
     * Set <p>Whether automatic logical backup is enabled</p>
     * @param LogicBackupEnable <p>Whether automatic logical backup is enabled</p>
     */
    public void setLogicBackupEnable(String LogicBackupEnable) {
        this.LogicBackupEnable = LogicBackupEnable;
    }

    /**
     * Get <p>Automatic logic backup start time</p> 
     * @return LogicBackupTimeBeg <p>Automatic logic backup start time</p>
     */
    public Long getLogicBackupTimeBeg() {
        return this.LogicBackupTimeBeg;
    }

    /**
     * Set <p>Automatic logic backup start time</p>
     * @param LogicBackupTimeBeg <p>Automatic logic backup start time</p>
     */
    public void setLogicBackupTimeBeg(Long LogicBackupTimeBeg) {
        this.LogicBackupTimeBeg = LogicBackupTimeBeg;
    }

    /**
     * Get <p>Automated logic backup end time</p> 
     * @return LogicBackupTimeEnd <p>Automated logic backup end time</p>
     */
    public Long getLogicBackupTimeEnd() {
        return this.LogicBackupTimeEnd;
    }

    /**
     * Set <p>Automated logic backup end time</p>
     * @param LogicBackupTimeEnd <p>Automated logic backup end time</p>
     */
    public void setLogicBackupTimeEnd(Long LogicBackupTimeEnd) {
        this.LogicBackupTimeEnd = LogicBackupTimeEnd;
    }

    /**
     * Get <p>Automatic logical backup retention time<br>Unit: second</p> 
     * @return LogicReserveDuration <p>Automatic logical backup retention time<br>Unit: second</p>
     */
    public Long getLogicReserveDuration() {
        return this.LogicReserveDuration;
    }

    /**
     * Set <p>Automatic logical backup retention time<br>Unit: second</p>
     * @param LogicReserveDuration <p>Automatic logical backup retention time<br>Unit: second</p>
     */
    public void setLogicReserveDuration(Long LogicReserveDuration) {
        this.LogicReserveDuration = LogicReserveDuration;
    }

    /**
     * Get <p>Whether cross-regional logical backup is enabled<br>Available values: ON/OFF</p> 
     * @return LogicCrossRegionsEnable <p>Whether cross-regional logical backup is enabled<br>Available values: ON/OFF</p>
     */
    public String getLogicCrossRegionsEnable() {
        return this.LogicCrossRegionsEnable;
    }

    /**
     * Set <p>Whether cross-regional logical backup is enabled<br>Available values: ON/OFF</p>
     * @param LogicCrossRegionsEnable <p>Whether cross-regional logical backup is enabled<br>Available values: ON/OFF</p>
     */
    public void setLogicCrossRegionsEnable(String LogicCrossRegionsEnable) {
        this.LogicCrossRegionsEnable = LogicCrossRegionsEnable;
    }

    /**
     * Get <p>Cross-regional logic backup</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogicCrossRegions <p>Cross-regional logic backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getLogicCrossRegions() {
        return this.LogicCrossRegions;
    }

    /**
     * Set <p>Cross-regional logic backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogicCrossRegions <p>Cross-regional logic backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogicCrossRegions(String [] LogicCrossRegions) {
        this.LogicCrossRegions = LogicCrossRegions;
    }

    /**
     * Get <p>Backup delivery relationship</p> 
     * @return AutoCopyVaults <p>Backup delivery relationship</p>
     */
    public CreateBackupVaultItem [] getAutoCopyVaults() {
        return this.AutoCopyVaults;
    }

    /**
     * Set <p>Backup delivery relationship</p>
     * @param AutoCopyVaults <p>Backup delivery relationship</p>
     */
    public void setAutoCopyVaults(CreateBackupVaultItem [] AutoCopyVaults) {
        this.AutoCopyVaults = AutoCopyVaults;
    }

    /**
     * Get <p>Day</p><p>Unit: Cross-regional logical backup retention time</p> 
     * @return LogicCrossRegionSaveDays <p>Day</p><p>Unit: Cross-regional logical backup retention time</p>
     */
    public Long getLogicCrossRegionSaveDays() {
        return this.LogicCrossRegionSaveDays;
    }

    /**
     * Set <p>Day</p><p>Unit: Cross-regional logical backup retention time</p>
     * @param LogicCrossRegionSaveDays <p>Day</p><p>Unit: Cross-regional logical backup retention time</p>
     */
    public void setLogicCrossRegionSaveDays(Long LogicCrossRegionSaveDays) {
        this.LogicCrossRegionSaveDays = LogicCrossRegionSaveDays;
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
        if (source.LogicCrossRegionSaveDays != null) {
            this.LogicCrossRegionSaveDays = new Long(source.LogicCrossRegionSaveDays);
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
        this.setParamSimple(map, prefix + "LogicCrossRegionSaveDays", this.LogicCrossRegionSaveDays);

    }
}

