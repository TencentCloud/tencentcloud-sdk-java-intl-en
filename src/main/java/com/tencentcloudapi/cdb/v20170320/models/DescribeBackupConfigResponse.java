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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupConfigResponse extends AbstractModel{

    /**
    * Earliest start time point of automatic backup, such as 2 (for 2:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field)
    */
    @SerializedName("StartTimeMin")
    @Expose
    private Long StartTimeMin;

    /**
    * Latest start time point of automatic backup, such as 6 (for 6:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field)
    */
    @SerializedName("StartTimeMax")
    @Expose
    private Long StartTimeMax;

    /**
    * Backup file retention period in days.
    */
    @SerializedName("BackupExpireDays")
    @Expose
    private Long BackupExpireDays;

    /**
    * Backup mode. Value range: physical, logical
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * Binlog file retention period in days.
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Long BinlogExpireDays;

    /**
    * Time window for automatic instance backup.
    */
    @SerializedName("BackupTimeWindow")
    @Expose
    private CommonTimeWindow BackupTimeWindow;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Earliest start time point of automatic backup, such as 2 (for 2:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field) 
     * @return StartTimeMin Earliest start time point of automatic backup, such as 2 (for 2:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field)
     */
    public Long getStartTimeMin() {
        return this.StartTimeMin;
    }

    /**
     * Set Earliest start time point of automatic backup, such as 2 (for 2:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field)
     * @param StartTimeMin Earliest start time point of automatic backup, such as 2 (for 2:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field)
     */
    public void setStartTimeMin(Long StartTimeMin) {
        this.StartTimeMin = StartTimeMin;
    }

    /**
     * Get Latest start time point of automatic backup, such as 6 (for 6:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field) 
     * @return StartTimeMax Latest start time point of automatic backup, such as 6 (for 6:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field)
     */
    public Long getStartTimeMax() {
        return this.StartTimeMax;
    }

    /**
     * Set Latest start time point of automatic backup, such as 6 (for 6:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field)
     * @param StartTimeMax Latest start time point of automatic backup, such as 6 (for 6:00 AM). (This field has been disused. You are recommended to use the `BackupTimeWindow` field)
     */
    public void setStartTimeMax(Long StartTimeMax) {
        this.StartTimeMax = StartTimeMax;
    }

    /**
     * Get Backup file retention period in days. 
     * @return BackupExpireDays Backup file retention period in days.
     */
    public Long getBackupExpireDays() {
        return this.BackupExpireDays;
    }

    /**
     * Set Backup file retention period in days.
     * @param BackupExpireDays Backup file retention period in days.
     */
    public void setBackupExpireDays(Long BackupExpireDays) {
        this.BackupExpireDays = BackupExpireDays;
    }

    /**
     * Get Backup mode. Value range: physical, logical 
     * @return BackupMethod Backup mode. Value range: physical, logical
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Backup mode. Value range: physical, logical
     * @param BackupMethod Backup mode. Value range: physical, logical
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Binlog file retention period in days. 
     * @return BinlogExpireDays Binlog file retention period in days.
     */
    public Long getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * Set Binlog file retention period in days.
     * @param BinlogExpireDays Binlog file retention period in days.
     */
    public void setBinlogExpireDays(Long BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
    }

    /**
     * Get Time window for automatic instance backup. 
     * @return BackupTimeWindow Time window for automatic instance backup.
     */
    public CommonTimeWindow getBackupTimeWindow() {
        return this.BackupTimeWindow;
    }

    /**
     * Set Time window for automatic instance backup.
     * @param BackupTimeWindow Time window for automatic instance backup.
     */
    public void setBackupTimeWindow(CommonTimeWindow BackupTimeWindow) {
        this.BackupTimeWindow = BackupTimeWindow;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeMin", this.StartTimeMin);
        this.setParamSimple(map, prefix + "StartTimeMax", this.StartTimeMax);
        this.setParamSimple(map, prefix + "BackupExpireDays", this.BackupExpireDays);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BinlogExpireDays", this.BinlogExpireDays);
        this.setParamObj(map, prefix + "BackupTimeWindow.", this.BackupTimeWindow);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

