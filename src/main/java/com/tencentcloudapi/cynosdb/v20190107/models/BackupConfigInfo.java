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

public class BackupConfigInfo extends AbstractModel {

    /**
    * System automation time.
    */
    @SerializedName("BackupCustomAutoTime")
    @Expose
    private Boolean BackupCustomAutoTime;

    /**
    * Indicates the full backup start time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.
    */
    @SerializedName("BackupTimeBeg")
    @Expose
    private Long BackupTimeBeg;

    /**
    * Indicates the full backup end time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.
    */
    @SerializedName("BackupTimeEnd")
    @Expose
    private Long BackupTimeEnd;

    /**
    * Currently this parameter cannot be modified. no need to specify. backup frequency is an array of length 7, corresponding to the backup method from sunday to saturday, full for full backup and increment for incremental backup.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupWeekDays")
    @Expose
    private String [] BackupWeekDays;

    /**
    * Interval.
    */
    @SerializedName("BackupIntervalTime")
    @Expose
    private Long BackupIntervalTime;

    /**
    * Indicates the backup retention period in seconds. data will be cleaned up longer than this time. 7 days means 3600247=604800. the maximum is 158112000.
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * Enable cross-region backup.
Enable.
0: disabled.
    */
    @SerializedName("CrossRegionsEnable")
    @Expose
    private String CrossRegionsEnable;

    /**
    * Cross-Regional backup region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high-frequency backup
    */
    @SerializedName("BackupTriggerStrategy")
    @Expose
    private String BackupTriggerStrategy;

    /**
    * Backup delivery relationship
    */
    @SerializedName("AutoCopyVaults")
    @Expose
    private CreateBackupVaultItem [] AutoCopyVaults;

    /**
     * Get System automation time. 
     * @return BackupCustomAutoTime System automation time.
     */
    public Boolean getBackupCustomAutoTime() {
        return this.BackupCustomAutoTime;
    }

    /**
     * Set System automation time.
     * @param BackupCustomAutoTime System automation time.
     */
    public void setBackupCustomAutoTime(Boolean BackupCustomAutoTime) {
        this.BackupCustomAutoTime = BackupCustomAutoTime;
    }

    /**
     * Get Indicates the full backup start time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively. 
     * @return BackupTimeBeg Indicates the full backup start time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.
     */
    public Long getBackupTimeBeg() {
        return this.BackupTimeBeg;
    }

    /**
     * Set Indicates the full backup start time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.
     * @param BackupTimeBeg Indicates the full backup start time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.
     */
    public void setBackupTimeBeg(Long BackupTimeBeg) {
        this.BackupTimeBeg = BackupTimeBeg;
    }

    /**
     * Get Indicates the full backup end time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively. 
     * @return BackupTimeEnd Indicates the full backup end time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.
     */
    public Long getBackupTimeEnd() {
        return this.BackupTimeEnd;
    }

    /**
     * Set Indicates the full backup end time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.
     * @param BackupTimeEnd Indicates the full backup end time. value range: [0-24*3600]. for example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.
     */
    public void setBackupTimeEnd(Long BackupTimeEnd) {
        this.BackupTimeEnd = BackupTimeEnd;
    }

    /**
     * Get Currently this parameter cannot be modified. no need to specify. backup frequency is an array of length 7, corresponding to the backup method from sunday to saturday, full for full backup and increment for incremental backup.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupWeekDays Currently this parameter cannot be modified. no need to specify. backup frequency is an array of length 7, corresponding to the backup method from sunday to saturday, full for full backup and increment for incremental backup.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBackupWeekDays() {
        return this.BackupWeekDays;
    }

    /**
     * Set Currently this parameter cannot be modified. no need to specify. backup frequency is an array of length 7, corresponding to the backup method from sunday to saturday, full for full backup and increment for incremental backup.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupWeekDays Currently this parameter cannot be modified. no need to specify. backup frequency is an array of length 7, corresponding to the backup method from sunday to saturday, full for full backup and increment for incremental backup.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupWeekDays(String [] BackupWeekDays) {
        this.BackupWeekDays = BackupWeekDays;
    }

    /**
     * Get Interval. 
     * @return BackupIntervalTime Interval.
     */
    public Long getBackupIntervalTime() {
        return this.BackupIntervalTime;
    }

    /**
     * Set Interval.
     * @param BackupIntervalTime Interval.
     */
    public void setBackupIntervalTime(Long BackupIntervalTime) {
        this.BackupIntervalTime = BackupIntervalTime;
    }

    /**
     * Get Indicates the backup retention period in seconds. data will be cleaned up longer than this time. 7 days means 3600247=604800. the maximum is 158112000. 
     * @return ReserveDuration Indicates the backup retention period in seconds. data will be cleaned up longer than this time. 7 days means 3600247=604800. the maximum is 158112000.
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set Indicates the backup retention period in seconds. data will be cleaned up longer than this time. 7 days means 3600247=604800. the maximum is 158112000.
     * @param ReserveDuration Indicates the backup retention period in seconds. data will be cleaned up longer than this time. 7 days means 3600247=604800. the maximum is 158112000.
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get Enable cross-region backup.
Enable.
0: disabled. 
     * @return CrossRegionsEnable Enable cross-region backup.
Enable.
0: disabled.
     */
    public String getCrossRegionsEnable() {
        return this.CrossRegionsEnable;
    }

    /**
     * Set Enable cross-region backup.
Enable.
0: disabled.
     * @param CrossRegionsEnable Enable cross-region backup.
Enable.
0: disabled.
     */
    public void setCrossRegionsEnable(String CrossRegionsEnable) {
        this.CrossRegionsEnable = CrossRegionsEnable;
    }

    /**
     * Get Cross-Regional backup region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CrossRegions Cross-Regional backup region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set Cross-Regional backup region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CrossRegions Cross-Regional backup region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high-frequency backup 
     * @return BackupTriggerStrategy Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high-frequency backup
     */
    public String getBackupTriggerStrategy() {
        return this.BackupTriggerStrategy;
    }

    /**
     * Set Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high-frequency backup
     * @param BackupTriggerStrategy Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high-frequency backup
     */
    public void setBackupTriggerStrategy(String BackupTriggerStrategy) {
        this.BackupTriggerStrategy = BackupTriggerStrategy;
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

    public BackupConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupConfigInfo(BackupConfigInfo source) {
        if (source.BackupCustomAutoTime != null) {
            this.BackupCustomAutoTime = new Boolean(source.BackupCustomAutoTime);
        }
        if (source.BackupTimeBeg != null) {
            this.BackupTimeBeg = new Long(source.BackupTimeBeg);
        }
        if (source.BackupTimeEnd != null) {
            this.BackupTimeEnd = new Long(source.BackupTimeEnd);
        }
        if (source.BackupWeekDays != null) {
            this.BackupWeekDays = new String[source.BackupWeekDays.length];
            for (int i = 0; i < source.BackupWeekDays.length; i++) {
                this.BackupWeekDays[i] = new String(source.BackupWeekDays[i]);
            }
        }
        if (source.BackupIntervalTime != null) {
            this.BackupIntervalTime = new Long(source.BackupIntervalTime);
        }
        if (source.ReserveDuration != null) {
            this.ReserveDuration = new Long(source.ReserveDuration);
        }
        if (source.CrossRegionsEnable != null) {
            this.CrossRegionsEnable = new String(source.CrossRegionsEnable);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.BackupTriggerStrategy != null) {
            this.BackupTriggerStrategy = new String(source.BackupTriggerStrategy);
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
        this.setParamSimple(map, prefix + "BackupCustomAutoTime", this.BackupCustomAutoTime);
        this.setParamSimple(map, prefix + "BackupTimeBeg", this.BackupTimeBeg);
        this.setParamSimple(map, prefix + "BackupTimeEnd", this.BackupTimeEnd);
        this.setParamArraySimple(map, prefix + "BackupWeekDays.", this.BackupWeekDays);
        this.setParamSimple(map, prefix + "BackupIntervalTime", this.BackupIntervalTime);
        this.setParamSimple(map, prefix + "ReserveDuration", this.ReserveDuration);
        this.setParamSimple(map, prefix + "CrossRegionsEnable", this.CrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "BackupTriggerStrategy", this.BackupTriggerStrategy);
        this.setParamArrayObj(map, prefix + "AutoCopyVaults.", this.AutoCopyVaults);

    }
}

