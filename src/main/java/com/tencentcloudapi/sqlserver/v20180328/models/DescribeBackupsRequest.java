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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupsRequest extends AbstractModel{

    /**
    * Start name (yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Instance ID in the format of mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of results per page. Value range: 1-100. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter by backup name. If this parameter is left empty, backup name will not be used in filtering.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering.
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Filter by backup mode. Valid values: 0 (automatic backup on a regular basis), 1 (manual backup performed by the user at any time). If this parameter is left empty, backup mode will not be used in filtering.
    */
    @SerializedName("BackupWay")
    @Expose
    private Long BackupWay;

    /**
    * Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering.
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
     * Get Start name (yyyy-MM-dd HH:mm:ss) 
     * @return StartTime Start name (yyyy-MM-dd HH:mm:ss)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start name (yyyy-MM-dd HH:mm:ss)
     * @param StartTime Start name (yyyy-MM-dd HH:mm:ss)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (yyyy-MM-dd HH:mm:ss) 
     * @return EndTime End time (yyyy-MM-dd HH:mm:ss)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (yyyy-MM-dd HH:mm:ss)
     * @param EndTime End time (yyyy-MM-dd HH:mm:ss)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Instance ID in the format of mssql-njj2mtpl 
     * @return InstanceId Instance ID in the format of mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-njj2mtpl
     * @param InstanceId Instance ID in the format of mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of results per page. Value range: 1-100. Default value: 20 
     * @return Limit Number of results per page. Value range: 1-100. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page. Value range: 1-100. Default value: 20
     * @param Limit Number of results per page. Value range: 1-100. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. Default value: 0 
     * @return Offset Page number. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: 0
     * @param Offset Page number. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter by backup name. If this parameter is left empty, backup name will not be used in filtering. 
     * @return BackupName Filter by backup name. If this parameter is left empty, backup name will not be used in filtering.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Filter by backup name. If this parameter is left empty, backup name will not be used in filtering.
     * @param BackupName Filter by backup name. If this parameter is left empty, backup name will not be used in filtering.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering. 
     * @return Strategy Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering.
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering.
     * @param Strategy Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering.
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Filter by backup mode. Valid values: 0 (automatic backup on a regular basis), 1 (manual backup performed by the user at any time). If this parameter is left empty, backup mode will not be used in filtering. 
     * @return BackupWay Filter by backup mode. Valid values: 0 (automatic backup on a regular basis), 1 (manual backup performed by the user at any time). If this parameter is left empty, backup mode will not be used in filtering.
     */
    public Long getBackupWay() {
        return this.BackupWay;
    }

    /**
     * Set Filter by backup mode. Valid values: 0 (automatic backup on a regular basis), 1 (manual backup performed by the user at any time). If this parameter is left empty, backup mode will not be used in filtering.
     * @param BackupWay Filter by backup mode. Valid values: 0 (automatic backup on a regular basis), 1 (manual backup performed by the user at any time). If this parameter is left empty, backup mode will not be used in filtering.
     */
    public void setBackupWay(Long BackupWay) {
        this.BackupWay = BackupWay;
    }

    /**
     * Get Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering. 
     * @return BackupId Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering.
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering.
     * @param BackupId Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering.
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "BackupWay", this.BackupWay);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

