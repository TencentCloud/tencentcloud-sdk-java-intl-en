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
    * <p>System automation time</p>
    */
    @SerializedName("BackupCustomAutoTime")
    @Expose
    private Boolean BackupCustomAutoTime;

    /**
    * <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
    */
    @SerializedName("BackupTimeBeg")
    @Expose
    private Long BackupTimeBeg;

    /**
    * <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
    */
    @SerializedName("BackupTimeEnd")
    @Expose
    private Long BackupTimeEnd;

    /**
    * <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to the backup method from Sunday to Saturday, full-full backup, increment-incremental backup.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupWeekDays")
    @Expose
    private String [] BackupWeekDays;

    /**
    * <p>Interval</p>
    */
    @SerializedName("BackupIntervalTime")
    @Expose
    private Long BackupIntervalTime;

    /**
    * <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. 7 days means 3600*24*7=604800. The maximum value is 158112000.</p>
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * <p>Cross-region backup enabled<br>yes-Enable<br>no-Disable</p>
    */
    @SerializedName("CrossRegionsEnable")
    @Expose
    private String CrossRegionsEnable;

    /**
    * <p>Cross-regional backup region</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * <p>Cross-region backup retention period</p><p>Unit: Day</p>
    */
    @SerializedName("CrossRegionSaveDays")
    @Expose
    private Long CrossRegionSaveDays;

    /**
    * <p>Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high frequency backup</p>
    */
    @SerializedName("BackupTriggerStrategy")
    @Expose
    private String BackupTriggerStrategy;

    /**
    * <p>Backup delivery relationship</p>
    */
    @SerializedName("AutoCopyVaults")
    @Expose
    private CreateBackupVaultItem [] AutoCopyVaults;

    /**
     * Get <p>System automation time</p> 
     * @return BackupCustomAutoTime <p>System automation time</p>
     */
    public Boolean getBackupCustomAutoTime() {
        return this.BackupCustomAutoTime;
    }

    /**
     * Set <p>System automation time</p>
     * @param BackupCustomAutoTime <p>System automation time</p>
     */
    public void setBackupCustomAutoTime(Boolean BackupCustomAutoTime) {
        this.BackupCustomAutoTime = BackupCustomAutoTime;
    }

    /**
     * Get <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p> 
     * @return BackupTimeBeg <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     */
    public Long getBackupTimeBeg() {
        return this.BackupTimeBeg;
    }

    /**
     * Set <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     * @param BackupTimeBeg <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     */
    public void setBackupTimeBeg(Long BackupTimeBeg) {
        this.BackupTimeBeg = BackupTimeBeg;
    }

    /**
     * Get <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p> 
     * @return BackupTimeEnd <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     */
    public Long getBackupTimeEnd() {
        return this.BackupTimeEnd;
    }

    /**
     * Set <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     * @param BackupTimeEnd <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     */
    public void setBackupTimeEnd(Long BackupTimeEnd) {
        this.BackupTimeEnd = BackupTimeEnd;
    }

    /**
     * Get <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to the backup method from Sunday to Saturday, full-full backup, increment-incremental backup.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupWeekDays <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to the backup method from Sunday to Saturday, full-full backup, increment-incremental backup.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBackupWeekDays() {
        return this.BackupWeekDays;
    }

    /**
     * Set <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to the backup method from Sunday to Saturday, full-full backup, increment-incremental backup.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupWeekDays <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to the backup method from Sunday to Saturday, full-full backup, increment-incremental backup.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupWeekDays(String [] BackupWeekDays) {
        this.BackupWeekDays = BackupWeekDays;
    }

    /**
     * Get <p>Interval</p> 
     * @return BackupIntervalTime <p>Interval</p>
     */
    public Long getBackupIntervalTime() {
        return this.BackupIntervalTime;
    }

    /**
     * Set <p>Interval</p>
     * @param BackupIntervalTime <p>Interval</p>
     */
    public void setBackupIntervalTime(Long BackupIntervalTime) {
        this.BackupIntervalTime = BackupIntervalTime;
    }

    /**
     * Get <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. 7 days means 3600*24*7=604800. The maximum value is 158112000.</p> 
     * @return ReserveDuration <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. 7 days means 3600*24*7=604800. The maximum value is 158112000.</p>
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. 7 days means 3600*24*7=604800. The maximum value is 158112000.</p>
     * @param ReserveDuration <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. 7 days means 3600*24*7=604800. The maximum value is 158112000.</p>
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get <p>Cross-region backup enabled<br>yes-Enable<br>no-Disable</p> 
     * @return CrossRegionsEnable <p>Cross-region backup enabled<br>yes-Enable<br>no-Disable</p>
     */
    public String getCrossRegionsEnable() {
        return this.CrossRegionsEnable;
    }

    /**
     * Set <p>Cross-region backup enabled<br>yes-Enable<br>no-Disable</p>
     * @param CrossRegionsEnable <p>Cross-region backup enabled<br>yes-Enable<br>no-Disable</p>
     */
    public void setCrossRegionsEnable(String CrossRegionsEnable) {
        this.CrossRegionsEnable = CrossRegionsEnable;
    }

    /**
     * Get <p>Cross-regional backup region</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CrossRegions <p>Cross-regional backup region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set <p>Cross-regional backup region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CrossRegions <p>Cross-regional backup region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get <p>Cross-region backup retention period</p><p>Unit: Day</p> 
     * @return CrossRegionSaveDays <p>Cross-region backup retention period</p><p>Unit: Day</p>
     */
    public Long getCrossRegionSaveDays() {
        return this.CrossRegionSaveDays;
    }

    /**
     * Set <p>Cross-region backup retention period</p><p>Unit: Day</p>
     * @param CrossRegionSaveDays <p>Cross-region backup retention period</p><p>Unit: Day</p>
     */
    public void setCrossRegionSaveDays(Long CrossRegionSaveDays) {
        this.CrossRegionSaveDays = CrossRegionSaveDays;
    }

    /**
     * Get <p>Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high frequency backup</p> 
     * @return BackupTriggerStrategy <p>Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high frequency backup</p>
     */
    public String getBackupTriggerStrategy() {
        return this.BackupTriggerStrategy;
    }

    /**
     * Set <p>Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high frequency backup</p>
     * @param BackupTriggerStrategy <p>Automatic data backup trigger policy, periodically: automatic periodic backup, frequent: high frequency backup</p>
     */
    public void setBackupTriggerStrategy(String BackupTriggerStrategy) {
        this.BackupTriggerStrategy = BackupTriggerStrategy;
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
        if (source.CrossRegionSaveDays != null) {
            this.CrossRegionSaveDays = new Long(source.CrossRegionSaveDays);
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
        this.setParamSimple(map, prefix + "CrossRegionSaveDays", this.CrossRegionSaveDays);
        this.setParamSimple(map, prefix + "BackupTriggerStrategy", this.BackupTriggerStrategy);
        this.setParamArrayObj(map, prefix + "AutoCopyVaults.", this.AutoCopyVaults);

    }
}

