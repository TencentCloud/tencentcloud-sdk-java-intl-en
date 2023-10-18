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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationDetailResponse extends AbstractModel {

    /**
    * Migration task ID
    */
    @SerializedName("MigrateId")
    @Expose
    private Long MigrateId;

    /**
    * Migration task name
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * User ID of migration task
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Migration task region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Migration task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Migration task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Migration task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Migration task progress
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Migration type (1: structure migration, 2: data migration, 3: incremental sync)
    */
    @SerializedName("MigrateType")
    @Expose
    private Long MigrateType;

    /**
    * Migration source
    */
    @SerializedName("Source")
    @Expose
    private MigrateSource Source;

    /**
    * Migration target
    */
    @SerializedName("Target")
    @Expose
    private MigrateTarget Target;

    /**
    * Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5)
    */
    @SerializedName("MigrateDBSet")
    @Expose
    private MigrateDB [] MigrateDBSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Migration task ID 
     * @return MigrateId Migration task ID
     */
    public Long getMigrateId() {
        return this.MigrateId;
    }

    /**
     * Set Migration task ID
     * @param MigrateId Migration task ID
     */
    public void setMigrateId(Long MigrateId) {
        this.MigrateId = MigrateId;
    }

    /**
     * Get Migration task name 
     * @return MigrateName Migration task name
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * Set Migration task name
     * @param MigrateName Migration task name
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * Get User ID of migration task 
     * @return AppId User ID of migration task
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID of migration task
     * @param AppId User ID of migration task
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Migration task region 
     * @return Region Migration task region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Migration task region
     * @param Region Migration task region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode) 
     * @return SourceType Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     * @param SourceType Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Migration task creation time 
     * @return CreateTime Migration task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Migration task creation time
     * @param CreateTime Migration task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Migration task start time 
     * @return StartTime Migration task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Migration task start time
     * @param StartTime Migration task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Migration task end time 
     * @return EndTime Migration task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Migration task end time
     * @param EndTime Migration task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded) 
     * @return Status Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded)
     * @param Status Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Migration task progress 
     * @return Progress Migration task progress
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Migration task progress
     * @param Progress Migration task progress
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Migration type (1: structure migration, 2: data migration, 3: incremental sync) 
     * @return MigrateType Migration type (1: structure migration, 2: data migration, 3: incremental sync)
     */
    public Long getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set Migration type (1: structure migration, 2: data migration, 3: incremental sync)
     * @param MigrateType Migration type (1: structure migration, 2: data migration, 3: incremental sync)
     */
    public void setMigrateType(Long MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get Migration source 
     * @return Source Migration source
     */
    public MigrateSource getSource() {
        return this.Source;
    }

    /**
     * Set Migration source
     * @param Source Migration source
     */
    public void setSource(MigrateSource Source) {
        this.Source = Source;
    }

    /**
     * Get Migration target 
     * @return Target Migration target
     */
    public MigrateTarget getTarget() {
        return this.Target;
    }

    /**
     * Set Migration target
     * @param Target Migration target
     */
    public void setTarget(MigrateTarget Target) {
        this.Target = Target;
    }

    /**
     * Get Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5) 
     * @return MigrateDBSet Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5)
     */
    public MigrateDB [] getMigrateDBSet() {
        return this.MigrateDBSet;
    }

    /**
     * Set Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5)
     * @param MigrateDBSet Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5)
     */
    public void setMigrateDBSet(MigrateDB [] MigrateDBSet) {
        this.MigrateDBSet = MigrateDBSet;
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

    public DescribeMigrationDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationDetailResponse(DescribeMigrationDetailResponse source) {
        if (source.MigrateId != null) {
            this.MigrateId = new Long(source.MigrateId);
        }
        if (source.MigrateName != null) {
            this.MigrateName = new String(source.MigrateName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
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
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.MigrateType != null) {
            this.MigrateType = new Long(source.MigrateType);
        }
        if (source.Source != null) {
            this.Source = new MigrateSource(source.Source);
        }
        if (source.Target != null) {
            this.Target = new MigrateTarget(source.Target);
        }
        if (source.MigrateDBSet != null) {
            this.MigrateDBSet = new MigrateDB[source.MigrateDBSet.length];
            for (int i = 0; i < source.MigrateDBSet.length; i++) {
                this.MigrateDBSet[i] = new MigrateDB(source.MigrateDBSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateId", this.MigrateId);
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "MigrateDBSet.", this.MigrateDBSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

