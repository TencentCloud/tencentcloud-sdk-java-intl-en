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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateJobInfo extends AbstractModel {

    /**
    * Data migration task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Data migration task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Migration task configuration options
    */
    @SerializedName("MigrateOption")
    @Expose
    private MigrateOption MigrateOption;

    /**
    * Source instance database type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances)
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * Source instance information, which is correlated with the migration task type
    */
    @SerializedName("SrcInfo")
    @Expose
    private SrcInfo SrcInfo;

    /**
    * Target instance access type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * Target instance access type, which currently only supports cdb (TencentDB instance)
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * Target instance information
    */
    @SerializedName("DstInfo")
    @Expose
    private DstInfo DstInfo;

    /**
    * Information of the source table to be migrated. If the entire instance is to be migrated, this field should be []
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
    * Task creation/submission time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task status. Value range: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task details
    */
    @SerializedName("Detail")
    @Expose
    private MigrateDetailInfo Detail;

    /**
    * Prompt message for task error, which is not null or empty when an error occurs with the task
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ErrorInfo [] ErrorInfo;

    /**
    * Tag
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * Information of the source instance, a cluster edition instance whose access type is not `cdb`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcInfoMulti")
    @Expose
    private SrcInfo [] SrcInfoMulti;

    /**
     * Get Data migration task ID 
     * @return JobId Data migration task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Data migration task ID
     * @param JobId Data migration task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Data migration task name 
     * @return JobName Data migration task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Data migration task name
     * @param JobName Data migration task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Migration task configuration options 
     * @return MigrateOption Migration task configuration options
     */
    public MigrateOption getMigrateOption() {
        return this.MigrateOption;
    }

    /**
     * Set Migration task configuration options
     * @param MigrateOption Migration task configuration options
     */
    public void setMigrateOption(MigrateOption MigrateOption) {
        this.MigrateOption = MigrateOption;
    }

    /**
     * Get Source instance database type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona 
     * @return SrcDatabaseType Source instance database type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set Source instance database type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona
     * @param SrcDatabaseType Source instance database type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances) 
     * @return SrcAccessType Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances)
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances)
     * @param SrcAccessType Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances)
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get Source instance information, which is correlated with the migration task type 
     * @return SrcInfo Source instance information, which is correlated with the migration task type
     */
    public SrcInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source instance information, which is correlated with the migration task type
     * @param SrcInfo Source instance information, which is correlated with the migration task type
     */
    public void setSrcInfo(SrcInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Target instance access type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona 
     * @return DstDatabaseType Target instance access type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set Target instance access type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona
     * @param DstDatabaseType Target instance access type: MySQL, Redis, MongoDB, PostgreSQL, MariaDB, Percona
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get Target instance access type, which currently only supports cdb (TencentDB instance) 
     * @return DstAccessType Target instance access type, which currently only supports cdb (TencentDB instance)
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Target instance access type, which currently only supports cdb (TencentDB instance)
     * @param DstAccessType Target instance access type, which currently only supports cdb (TencentDB instance)
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Target instance information 
     * @return DstInfo Target instance information
     */
    public DstInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Target instance information
     * @param DstInfo Target instance information
     */
    public void setDstInfo(DstInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get Information of the source table to be migrated. If the entire instance is to be migrated, this field should be [] 
     * @return DatabaseInfo Information of the source table to be migrated. If the entire instance is to be migrated, this field should be []
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set Information of the source table to be migrated. If the entire instance is to be migrated, this field should be []
     * @param DatabaseInfo Information of the source table to be migrated. If the entire instance is to be migrated, this field should be []
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Get Task creation/submission time 
     * @return CreateTime Task creation/submission time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation/submission time
     * @param CreateTime Task creation/submission time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task start time 
     * @return StartTime Task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
     * @param StartTime Task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time 
     * @return EndTime Task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
     * @param EndTime Task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task status. Value range: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing) 
     * @return Status Task status. Value range: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Value range: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
     * @param Status Task status. Value range: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task details 
     * @return Detail Task details
     */
    public MigrateDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * Set Task details
     * @param Detail Task details
     */
    public void setDetail(MigrateDetailInfo Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Prompt message for task error, which is not null or empty when an error occurs with the task 
     * @return ErrorInfo Prompt message for task error, which is not null or empty when an error occurs with the task
     */
    public ErrorInfo [] getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set Prompt message for task error, which is not null or empty when an error occurs with the task
     * @param ErrorInfo Prompt message for task error, which is not null or empty when an error occurs with the task
     */
    public void setErrorInfo(ErrorInfo [] ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get Tag
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Information of the source instance, a cluster edition instance whose access type is not `cdb`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SrcInfoMulti Information of the source instance, a cluster edition instance whose access type is not `cdb`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public SrcInfo [] getSrcInfoMulti() {
        return this.SrcInfoMulti;
    }

    /**
     * Set Information of the source instance, a cluster edition instance whose access type is not `cdb`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SrcInfoMulti Information of the source instance, a cluster edition instance whose access type is not `cdb`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSrcInfoMulti(SrcInfo [] SrcInfoMulti) {
        this.SrcInfoMulti = SrcInfoMulti;
    }

    public MigrateJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateJobInfo(MigrateJobInfo source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.MigrateOption != null) {
            this.MigrateOption = new MigrateOption(source.MigrateOption);
        }
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String(source.SrcDatabaseType);
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String(source.SrcAccessType);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new SrcInfo(source.SrcInfo);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String(source.DstDatabaseType);
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String(source.DstAccessType);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new DstInfo(source.DstInfo);
        }
        if (source.DatabaseInfo != null) {
            this.DatabaseInfo = new String(source.DatabaseInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Detail != null) {
            this.Detail = new MigrateDetailInfo(source.Detail);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new ErrorInfo[source.ErrorInfo.length];
            for (int i = 0; i < source.ErrorInfo.length; i++) {
                this.ErrorInfo[i] = new ErrorInfo(source.ErrorInfo[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.SrcInfoMulti != null) {
            this.SrcInfoMulti = new SrcInfo[source.SrcInfoMulti.length];
            for (int i = 0; i < source.SrcInfoMulti.length; i++) {
                this.SrcInfoMulti[i] = new SrcInfo(source.SrcInfoMulti[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "MigrateOption.", this.MigrateOption);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamArrayObj(map, prefix + "ErrorInfo.", this.ErrorInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "SrcInfoMulti.", this.SrcInfoMulti);

    }
}

