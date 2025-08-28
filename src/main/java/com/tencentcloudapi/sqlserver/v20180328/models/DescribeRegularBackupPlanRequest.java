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

public class DescribeRegularBackupPlanRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Scheduled backup retention days, in the range of [90 - 3650]. The default value is 365.
    */
    @SerializedName("RegularBackupSaveDays")
    @Expose
    private Long RegularBackupSaveDays;

    /**
    * Scheduled backup policy. years - annually; quarters - quarterly; months - monthly. The default value is months.
    */
    @SerializedName("RegularBackupStrategy")
    @Expose
    private String RegularBackupStrategy;

    /**
    * Number of retained scheduled backups. The default value is 1.
    */
    @SerializedName("RegularBackupCounts")
    @Expose
    private Long RegularBackupCounts;

    /**
    * Scheduled backup start date, in the format of YYYY-MM-DD. The current date is used by default.
    */
    @SerializedName("RegularBackupStartTime")
    @Expose
    private String RegularBackupStartTime;

    /**
    * Regular backup cycle.
    */
    @SerializedName("BackupCycle")
    @Expose
    private Long [] BackupCycle;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Scheduled backup retention days, in the range of [90 - 3650]. The default value is 365. 
     * @return RegularBackupSaveDays Scheduled backup retention days, in the range of [90 - 3650]. The default value is 365.
     */
    public Long getRegularBackupSaveDays() {
        return this.RegularBackupSaveDays;
    }

    /**
     * Set Scheduled backup retention days, in the range of [90 - 3650]. The default value is 365.
     * @param RegularBackupSaveDays Scheduled backup retention days, in the range of [90 - 3650]. The default value is 365.
     */
    public void setRegularBackupSaveDays(Long RegularBackupSaveDays) {
        this.RegularBackupSaveDays = RegularBackupSaveDays;
    }

    /**
     * Get Scheduled backup policy. years - annually; quarters - quarterly; months - monthly. The default value is months. 
     * @return RegularBackupStrategy Scheduled backup policy. years - annually; quarters - quarterly; months - monthly. The default value is months.
     */
    public String getRegularBackupStrategy() {
        return this.RegularBackupStrategy;
    }

    /**
     * Set Scheduled backup policy. years - annually; quarters - quarterly; months - monthly. The default value is months.
     * @param RegularBackupStrategy Scheduled backup policy. years - annually; quarters - quarterly; months - monthly. The default value is months.
     */
    public void setRegularBackupStrategy(String RegularBackupStrategy) {
        this.RegularBackupStrategy = RegularBackupStrategy;
    }

    /**
     * Get Number of retained scheduled backups. The default value is 1. 
     * @return RegularBackupCounts Number of retained scheduled backups. The default value is 1.
     */
    public Long getRegularBackupCounts() {
        return this.RegularBackupCounts;
    }

    /**
     * Set Number of retained scheduled backups. The default value is 1.
     * @param RegularBackupCounts Number of retained scheduled backups. The default value is 1.
     */
    public void setRegularBackupCounts(Long RegularBackupCounts) {
        this.RegularBackupCounts = RegularBackupCounts;
    }

    /**
     * Get Scheduled backup start date, in the format of YYYY-MM-DD. The current date is used by default. 
     * @return RegularBackupStartTime Scheduled backup start date, in the format of YYYY-MM-DD. The current date is used by default.
     */
    public String getRegularBackupStartTime() {
        return this.RegularBackupStartTime;
    }

    /**
     * Set Scheduled backup start date, in the format of YYYY-MM-DD. The current date is used by default.
     * @param RegularBackupStartTime Scheduled backup start date, in the format of YYYY-MM-DD. The current date is used by default.
     */
    public void setRegularBackupStartTime(String RegularBackupStartTime) {
        this.RegularBackupStartTime = RegularBackupStartTime;
    }

    /**
     * Get Regular backup cycle. 
     * @return BackupCycle Regular backup cycle.
     */
    public Long [] getBackupCycle() {
        return this.BackupCycle;
    }

    /**
     * Set Regular backup cycle.
     * @param BackupCycle Regular backup cycle.
     */
    public void setBackupCycle(Long [] BackupCycle) {
        this.BackupCycle = BackupCycle;
    }

    public DescribeRegularBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegularBackupPlanRequest(DescribeRegularBackupPlanRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RegularBackupSaveDays != null) {
            this.RegularBackupSaveDays = new Long(source.RegularBackupSaveDays);
        }
        if (source.RegularBackupStrategy != null) {
            this.RegularBackupStrategy = new String(source.RegularBackupStrategy);
        }
        if (source.RegularBackupCounts != null) {
            this.RegularBackupCounts = new Long(source.RegularBackupCounts);
        }
        if (source.RegularBackupStartTime != null) {
            this.RegularBackupStartTime = new String(source.RegularBackupStartTime);
        }
        if (source.BackupCycle != null) {
            this.BackupCycle = new Long[source.BackupCycle.length];
            for (int i = 0; i < source.BackupCycle.length; i++) {
                this.BackupCycle[i] = new Long(source.BackupCycle[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RegularBackupSaveDays", this.RegularBackupSaveDays);
        this.setParamSimple(map, prefix + "RegularBackupStrategy", this.RegularBackupStrategy);
        this.setParamSimple(map, prefix + "RegularBackupCounts", this.RegularBackupCounts);
        this.setParamSimple(map, prefix + "RegularBackupStartTime", this.RegularBackupStartTime);
        this.setParamArraySimple(map, prefix + "BackupCycle.", this.BackupCycle);

    }
}

