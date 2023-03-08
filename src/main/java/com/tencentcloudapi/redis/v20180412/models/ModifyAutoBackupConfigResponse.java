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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoBackupConfigResponse extends AbstractModel{

    /**
    * Automatic backup type: 1 (scheduled rollback)
    */
    @SerializedName("AutoBackupType")
    @Expose
    private Long AutoBackupType;

    /**
    * Automatic backup cycle. Valid values: `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * Automatic backup time in the format of 00:00-01:00, 01:00-02:00... 23:00-00:00.
    */
    @SerializedName("TimePeriod")
    @Expose
    private String TimePeriod;

    /**
    * Retention time of full backup files in days
    */
    @SerializedName("BackupStorageDays")
    @Expose
    private Long BackupStorageDays;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Automatic backup type: 1 (scheduled rollback) 
     * @return AutoBackupType Automatic backup type: 1 (scheduled rollback)
     */
    public Long getAutoBackupType() {
        return this.AutoBackupType;
    }

    /**
     * Set Automatic backup type: 1 (scheduled rollback)
     * @param AutoBackupType Automatic backup type: 1 (scheduled rollback)
     */
    public void setAutoBackupType(Long AutoBackupType) {
        this.AutoBackupType = AutoBackupType;
    }

    /**
     * Get Automatic backup cycle. Valid values: `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`. 
     * @return WeekDays Automatic backup cycle. Valid values: `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set Automatic backup cycle. Valid values: `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
     * @param WeekDays Automatic backup cycle. Valid values: `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get Automatic backup time in the format of 00:00-01:00, 01:00-02:00... 23:00-00:00. 
     * @return TimePeriod Automatic backup time in the format of 00:00-01:00, 01:00-02:00... 23:00-00:00.
     */
    public String getTimePeriod() {
        return this.TimePeriod;
    }

    /**
     * Set Automatic backup time in the format of 00:00-01:00, 01:00-02:00... 23:00-00:00.
     * @param TimePeriod Automatic backup time in the format of 00:00-01:00, 01:00-02:00... 23:00-00:00.
     */
    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
    }

    /**
     * Get Retention time of full backup files in days 
     * @return BackupStorageDays Retention time of full backup files in days
     */
    public Long getBackupStorageDays() {
        return this.BackupStorageDays;
    }

    /**
     * Set Retention time of full backup files in days
     * @param BackupStorageDays Retention time of full backup files in days
     */
    public void setBackupStorageDays(Long BackupStorageDays) {
        this.BackupStorageDays = BackupStorageDays;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyAutoBackupConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoBackupConfigResponse(ModifyAutoBackupConfigResponse source) {
        if (source.AutoBackupType != null) {
            this.AutoBackupType = new Long(source.AutoBackupType);
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
        if (source.BackupStorageDays != null) {
            this.BackupStorageDays = new Long(source.BackupStorageDays);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoBackupType", this.AutoBackupType);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "TimePeriod", this.TimePeriod);
        this.setParamSimple(map, prefix + "BackupStorageDays", this.BackupStorageDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

