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

public class DescribeAutoBackupConfigResponse extends AbstractModel{

    /**
    * Backup type. Automatic backup type: 1 (scheduled rollback)
    */
    @SerializedName("AutoBackupType")
    @Expose
    private Long AutoBackupType;

    /**
    * Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * Time period.
    */
    @SerializedName("TimePeriod")
    @Expose
    private String TimePeriod;

    /**
    * Number of days to retain full backup files
    */
    @SerializedName("BackupStorageDays")
    @Expose
    private Long BackupStorageDays;

    /**
    * Number of days to retain Tendis binlog backup files
    */
    @SerializedName("BinlogStorageDays")
    @Expose
    private Long BinlogStorageDays;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Backup type. Automatic backup type: 1 (scheduled rollback) 
     * @return AutoBackupType Backup type. Automatic backup type: 1 (scheduled rollback)
     */
    public Long getAutoBackupType() {
        return this.AutoBackupType;
    }

    /**
     * Set Backup type. Automatic backup type: 1 (scheduled rollback)
     * @param AutoBackupType Backup type. Automatic backup type: 1 (scheduled rollback)
     */
    public void setAutoBackupType(Long AutoBackupType) {
        this.AutoBackupType = AutoBackupType;
    }

    /**
     * Get Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday. 
     * @return WeekDays Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     * @param WeekDays Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get Time period. 
     * @return TimePeriod Time period.
     */
    public String getTimePeriod() {
        return this.TimePeriod;
    }

    /**
     * Set Time period.
     * @param TimePeriod Time period.
     */
    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
    }

    /**
     * Get Number of days to retain full backup files 
     * @return BackupStorageDays Number of days to retain full backup files
     */
    public Long getBackupStorageDays() {
        return this.BackupStorageDays;
    }

    /**
     * Set Number of days to retain full backup files
     * @param BackupStorageDays Number of days to retain full backup files
     */
    public void setBackupStorageDays(Long BackupStorageDays) {
        this.BackupStorageDays = BackupStorageDays;
    }

    /**
     * Get Number of days to retain Tendis binlog backup files 
     * @return BinlogStorageDays Number of days to retain Tendis binlog backup files
     */
    public Long getBinlogStorageDays() {
        return this.BinlogStorageDays;
    }

    /**
     * Set Number of days to retain Tendis binlog backup files
     * @param BinlogStorageDays Number of days to retain Tendis binlog backup files
     */
    public void setBinlogStorageDays(Long BinlogStorageDays) {
        this.BinlogStorageDays = BinlogStorageDays;
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

    public DescribeAutoBackupConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoBackupConfigResponse(DescribeAutoBackupConfigResponse source) {
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
        if (source.BinlogStorageDays != null) {
            this.BinlogStorageDays = new Long(source.BinlogStorageDays);
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
        this.setParamSimple(map, prefix + "BinlogStorageDays", this.BinlogStorageDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

