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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupSummary extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Number of log backups of an instance
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * Size of log backups of an instance
    */
    @SerializedName("LogBackupSize")
    @Expose
    private Long LogBackupSize;

    /**
    * Number of manually created full backups of an instance
    */
    @SerializedName("ManualBaseBackupCount")
    @Expose
    private Long ManualBaseBackupCount;

    /**
    * Size of manually created full backups of an instance
    */
    @SerializedName("ManualBaseBackupSize")
    @Expose
    private Long ManualBaseBackupSize;

    /**
    * Number of automatically created full backups of an instance
    */
    @SerializedName("AutoBaseBackupCount")
    @Expose
    private Long AutoBaseBackupCount;

    /**
    * Size of automatically created full backups of an instance
    */
    @SerializedName("AutoBaseBackupSize")
    @Expose
    private Long AutoBaseBackupSize;

    /**
    * Total number of backups
    */
    @SerializedName("TotalBackupCount")
    @Expose
    private Long TotalBackupCount;

    /**
    * Total backup size
    */
    @SerializedName("TotalBackupSize")
    @Expose
    private Long TotalBackupSize;

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Number of log backups of an instance 
     * @return LogBackupCount Number of log backups of an instance
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set Number of log backups of an instance
     * @param LogBackupCount Number of log backups of an instance
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get Size of log backups of an instance 
     * @return LogBackupSize Size of log backups of an instance
     */
    public Long getLogBackupSize() {
        return this.LogBackupSize;
    }

    /**
     * Set Size of log backups of an instance
     * @param LogBackupSize Size of log backups of an instance
     */
    public void setLogBackupSize(Long LogBackupSize) {
        this.LogBackupSize = LogBackupSize;
    }

    /**
     * Get Number of manually created full backups of an instance 
     * @return ManualBaseBackupCount Number of manually created full backups of an instance
     */
    public Long getManualBaseBackupCount() {
        return this.ManualBaseBackupCount;
    }

    /**
     * Set Number of manually created full backups of an instance
     * @param ManualBaseBackupCount Number of manually created full backups of an instance
     */
    public void setManualBaseBackupCount(Long ManualBaseBackupCount) {
        this.ManualBaseBackupCount = ManualBaseBackupCount;
    }

    /**
     * Get Size of manually created full backups of an instance 
     * @return ManualBaseBackupSize Size of manually created full backups of an instance
     */
    public Long getManualBaseBackupSize() {
        return this.ManualBaseBackupSize;
    }

    /**
     * Set Size of manually created full backups of an instance
     * @param ManualBaseBackupSize Size of manually created full backups of an instance
     */
    public void setManualBaseBackupSize(Long ManualBaseBackupSize) {
        this.ManualBaseBackupSize = ManualBaseBackupSize;
    }

    /**
     * Get Number of automatically created full backups of an instance 
     * @return AutoBaseBackupCount Number of automatically created full backups of an instance
     */
    public Long getAutoBaseBackupCount() {
        return this.AutoBaseBackupCount;
    }

    /**
     * Set Number of automatically created full backups of an instance
     * @param AutoBaseBackupCount Number of automatically created full backups of an instance
     */
    public void setAutoBaseBackupCount(Long AutoBaseBackupCount) {
        this.AutoBaseBackupCount = AutoBaseBackupCount;
    }

    /**
     * Get Size of automatically created full backups of an instance 
     * @return AutoBaseBackupSize Size of automatically created full backups of an instance
     */
    public Long getAutoBaseBackupSize() {
        return this.AutoBaseBackupSize;
    }

    /**
     * Set Size of automatically created full backups of an instance
     * @param AutoBaseBackupSize Size of automatically created full backups of an instance
     */
    public void setAutoBaseBackupSize(Long AutoBaseBackupSize) {
        this.AutoBaseBackupSize = AutoBaseBackupSize;
    }

    /**
     * Get Total number of backups 
     * @return TotalBackupCount Total number of backups
     */
    public Long getTotalBackupCount() {
        return this.TotalBackupCount;
    }

    /**
     * Set Total number of backups
     * @param TotalBackupCount Total number of backups
     */
    public void setTotalBackupCount(Long TotalBackupCount) {
        this.TotalBackupCount = TotalBackupCount;
    }

    /**
     * Get Total backup size 
     * @return TotalBackupSize Total backup size
     */
    public Long getTotalBackupSize() {
        return this.TotalBackupSize;
    }

    /**
     * Set Total backup size
     * @param TotalBackupSize Total backup size
     */
    public void setTotalBackupSize(Long TotalBackupSize) {
        this.TotalBackupSize = TotalBackupSize;
    }

    public BackupSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupSummary(BackupSummary source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.LogBackupCount != null) {
            this.LogBackupCount = new Long(source.LogBackupCount);
        }
        if (source.LogBackupSize != null) {
            this.LogBackupSize = new Long(source.LogBackupSize);
        }
        if (source.ManualBaseBackupCount != null) {
            this.ManualBaseBackupCount = new Long(source.ManualBaseBackupCount);
        }
        if (source.ManualBaseBackupSize != null) {
            this.ManualBaseBackupSize = new Long(source.ManualBaseBackupSize);
        }
        if (source.AutoBaseBackupCount != null) {
            this.AutoBaseBackupCount = new Long(source.AutoBaseBackupCount);
        }
        if (source.AutoBaseBackupSize != null) {
            this.AutoBaseBackupSize = new Long(source.AutoBaseBackupSize);
        }
        if (source.TotalBackupCount != null) {
            this.TotalBackupCount = new Long(source.TotalBackupCount);
        }
        if (source.TotalBackupSize != null) {
            this.TotalBackupSize = new Long(source.TotalBackupSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSize", this.LogBackupSize);
        this.setParamSimple(map, prefix + "ManualBaseBackupCount", this.ManualBaseBackupCount);
        this.setParamSimple(map, prefix + "ManualBaseBackupSize", this.ManualBaseBackupSize);
        this.setParamSimple(map, prefix + "AutoBaseBackupCount", this.AutoBaseBackupCount);
        this.setParamSimple(map, prefix + "AutoBaseBackupSize", this.AutoBaseBackupSize);
        this.setParamSimple(map, prefix + "TotalBackupCount", this.TotalBackupCount);
        this.setParamSimple(map, prefix + "TotalBackupSize", this.TotalBackupSize);

    }
}

