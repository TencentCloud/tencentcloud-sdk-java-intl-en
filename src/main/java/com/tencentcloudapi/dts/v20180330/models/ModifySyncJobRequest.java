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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySyncJobRequest extends AbstractModel{

    /**
    * ID of the disaster recovery sync task to be modified
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Name of the disaster recovery sync task
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Configuration options of a disaster recovery sync task
    */
    @SerializedName("SyncOption")
    @Expose
    private SyncOption SyncOption;

    /**
    * When syncing the specified table, you need to set the information of the source table to be synced, which should be described in JSON string format. Below are examples.
For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
     * Get ID of the disaster recovery sync task to be modified 
     * @return JobId ID of the disaster recovery sync task to be modified
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set ID of the disaster recovery sync task to be modified
     * @param JobId ID of the disaster recovery sync task to be modified
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Name of the disaster recovery sync task 
     * @return JobName Name of the disaster recovery sync task
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Name of the disaster recovery sync task
     * @param JobName Name of the disaster recovery sync task
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Configuration options of a disaster recovery sync task 
     * @return SyncOption Configuration options of a disaster recovery sync task
     */
    public SyncOption getSyncOption() {
        return this.SyncOption;
    }

    /**
     * Set Configuration options of a disaster recovery sync task
     * @param SyncOption Configuration options of a disaster recovery sync task
     */
    public void setSyncOption(SyncOption SyncOption) {
        this.SyncOption = SyncOption;
    }

    /**
     * Get When syncing the specified table, you need to set the information of the source table to be synced, which should be described in JSON string format. Below are examples.
For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}] 
     * @return DatabaseInfo When syncing the specified table, you need to set the information of the source table to be synced, which should be described in JSON string format. Below are examples.
For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set When syncing the specified table, you need to set the information of the source table to be synced, which should be described in JSON string format. Below are examples.
For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
     * @param DatabaseInfo When syncing the specified table, you need to set the information of the source table to be synced, which should be described in JSON string format. Below are examples.
For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    public ModifySyncJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySyncJobRequest(ModifySyncJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.SyncOption != null) {
            this.SyncOption = new SyncOption(source.SyncOption);
        }
        if (source.DatabaseInfo != null) {
            this.DatabaseInfo = new String(source.DatabaseInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "SyncOption.", this.SyncOption);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);

    }
}

