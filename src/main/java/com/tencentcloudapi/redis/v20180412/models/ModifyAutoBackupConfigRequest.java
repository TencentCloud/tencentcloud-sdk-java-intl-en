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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoBackupConfigRequest extends AbstractModel {

    /**
    * <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID in the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Set the automatic backup cycle. It can be set to Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday. This parameter cannot be modified for the moment.</p>
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * <p>Backup time period. It can be set to every full hour. Format: 00:00-01:00, 01:00-02:00...... 23:00-00:00.</p>
    */
    @SerializedName("TimePeriod")
    @Expose
    private String TimePeriod;

    /**
    * <p>Automatic backup type. Currently, it can only be configured as: 1, scheduled backup.</p>
    */
    @SerializedName("AutoBackupType")
    @Expose
    private Long AutoBackupType;

    /**
    * <p>Number of days to save full backup files. Only support setting to 7, unit: days. For a longer period, please <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p>
    */
    @SerializedName("BackupStorageDays")
    @Expose
    private Long BackupStorageDays;

    /**
     * Get <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID in the instance list.</p> 
     * @return InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID in the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID in the instance list.</p>
     * @param InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID in the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Set the automatic backup cycle. It can be set to Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday. This parameter cannot be modified for the moment.</p> 
     * @return WeekDays <p>Set the automatic backup cycle. It can be set to Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday. This parameter cannot be modified for the moment.</p>
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set <p>Set the automatic backup cycle. It can be set to Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday. This parameter cannot be modified for the moment.</p>
     * @param WeekDays <p>Set the automatic backup cycle. It can be set to Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday. This parameter cannot be modified for the moment.</p>
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get <p>Backup time period. It can be set to every full hour. Format: 00:00-01:00, 01:00-02:00...... 23:00-00:00.</p> 
     * @return TimePeriod <p>Backup time period. It can be set to every full hour. Format: 00:00-01:00, 01:00-02:00...... 23:00-00:00.</p>
     */
    public String getTimePeriod() {
        return this.TimePeriod;
    }

    /**
     * Set <p>Backup time period. It can be set to every full hour. Format: 00:00-01:00, 01:00-02:00...... 23:00-00:00.</p>
     * @param TimePeriod <p>Backup time period. It can be set to every full hour. Format: 00:00-01:00, 01:00-02:00...... 23:00-00:00.</p>
     */
    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
    }

    /**
     * Get <p>Automatic backup type. Currently, it can only be configured as: 1, scheduled backup.</p> 
     * @return AutoBackupType <p>Automatic backup type. Currently, it can only be configured as: 1, scheduled backup.</p>
     */
    public Long getAutoBackupType() {
        return this.AutoBackupType;
    }

    /**
     * Set <p>Automatic backup type. Currently, it can only be configured as: 1, scheduled backup.</p>
     * @param AutoBackupType <p>Automatic backup type. Currently, it can only be configured as: 1, scheduled backup.</p>
     */
    public void setAutoBackupType(Long AutoBackupType) {
        this.AutoBackupType = AutoBackupType;
    }

    /**
     * Get <p>Number of days to save full backup files. Only support setting to 7, unit: days. For a longer period, please <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p> 
     * @return BackupStorageDays <p>Number of days to save full backup files. Only support setting to 7, unit: days. For a longer period, please <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p>
     */
    public Long getBackupStorageDays() {
        return this.BackupStorageDays;
    }

    /**
     * Set <p>Number of days to save full backup files. Only support setting to 7, unit: days. For a longer period, please <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p>
     * @param BackupStorageDays <p>Number of days to save full backup files. Only support setting to 7, unit: days. For a longer period, please <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p>
     */
    public void setBackupStorageDays(Long BackupStorageDays) {
        this.BackupStorageDays = BackupStorageDays;
    }

    public ModifyAutoBackupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoBackupConfigRequest(ModifyAutoBackupConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new String(source.WeekDays[i]);
            }
        }
        if (source.TimePeriod != null) {
            this.TimePeriod = new String(source.TimePeriod);
        }
        if (source.AutoBackupType != null) {
            this.AutoBackupType = new Long(source.AutoBackupType);
        }
        if (source.BackupStorageDays != null) {
            this.BackupStorageDays = new Long(source.BackupStorageDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "TimePeriod", this.TimePeriod);
        this.setParamSimple(map, prefix + "AutoBackupType", this.AutoBackupType);
        this.setParamSimple(map, prefix + "BackupStorageDays", this.BackupStorageDays);

    }
}

