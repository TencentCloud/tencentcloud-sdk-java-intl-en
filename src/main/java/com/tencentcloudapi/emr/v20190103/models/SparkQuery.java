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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkQuery extends AbstractModel {

    /**
    * Execution statement.
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * Execution duration (ms).
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Execution status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Query ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Number of scanned partitions.
    */
    @SerializedName("ScanPartitionNum")
    @Expose
    private Long ScanPartitionNum;

    /**
    * Total number of scanned rows.
    */
    @SerializedName("ScanRowNum")
    @Expose
    private Long ScanRowNum;

    /**
    * Total number of scanned files.
    */
    @SerializedName("ScanFileNum")
    @Expose
    private Long ScanFileNum;

    /**
    * Total data volume scanned by query (bytes).
    */
    @SerializedName("ScanTotalData")
    @Expose
    private Long ScanTotalData;

    /**
    * Application ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String [] ApplicationId;

    /**
    * Total number of output rows.
    */
    @SerializedName("OutputRowNum")
    @Expose
    private Long OutputRowNum;

    /**
    * Total number of output files.
    */
    @SerializedName("OutputFileNum")
    @Expose
    private Long OutputFileNum;

    /**
    * Number of output partitions.
    */
    @SerializedName("OutputPartitionNum")
    @Expose
    private Long OutputPartitionNum;

    /**
    * Total output data volume (bytes).
    */
    @SerializedName("OutputTotalData")
    @Expose
    private Long OutputTotalData;

    /**
    * Start time.
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Execution statement. 
     * @return Statement Execution statement.
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set Execution statement.
     * @param Statement Execution statement.
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get Execution duration (ms). 
     * @return Duration Execution duration (ms).
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Execution duration (ms).
     * @param Duration Execution duration (ms).
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Execution status. 
     * @return Status Execution status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Execution status.
     * @param Status Execution status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Query ID. 
     * @return Id Query ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Query ID.
     * @param Id Query ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Number of scanned partitions. 
     * @return ScanPartitionNum Number of scanned partitions.
     */
    public Long getScanPartitionNum() {
        return this.ScanPartitionNum;
    }

    /**
     * Set Number of scanned partitions.
     * @param ScanPartitionNum Number of scanned partitions.
     */
    public void setScanPartitionNum(Long ScanPartitionNum) {
        this.ScanPartitionNum = ScanPartitionNum;
    }

    /**
     * Get Total number of scanned rows. 
     * @return ScanRowNum Total number of scanned rows.
     */
    public Long getScanRowNum() {
        return this.ScanRowNum;
    }

    /**
     * Set Total number of scanned rows.
     * @param ScanRowNum Total number of scanned rows.
     */
    public void setScanRowNum(Long ScanRowNum) {
        this.ScanRowNum = ScanRowNum;
    }

    /**
     * Get Total number of scanned files. 
     * @return ScanFileNum Total number of scanned files.
     */
    public Long getScanFileNum() {
        return this.ScanFileNum;
    }

    /**
     * Set Total number of scanned files.
     * @param ScanFileNum Total number of scanned files.
     */
    public void setScanFileNum(Long ScanFileNum) {
        this.ScanFileNum = ScanFileNum;
    }

    /**
     * Get Total data volume scanned by query (bytes). 
     * @return ScanTotalData Total data volume scanned by query (bytes).
     */
    public Long getScanTotalData() {
        return this.ScanTotalData;
    }

    /**
     * Set Total data volume scanned by query (bytes).
     * @param ScanTotalData Total data volume scanned by query (bytes).
     */
    public void setScanTotalData(Long ScanTotalData) {
        this.ScanTotalData = ScanTotalData;
    }

    /**
     * Get Application ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String [] ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Total number of output rows. 
     * @return OutputRowNum Total number of output rows.
     */
    public Long getOutputRowNum() {
        return this.OutputRowNum;
    }

    /**
     * Set Total number of output rows.
     * @param OutputRowNum Total number of output rows.
     */
    public void setOutputRowNum(Long OutputRowNum) {
        this.OutputRowNum = OutputRowNum;
    }

    /**
     * Get Total number of output files. 
     * @return OutputFileNum Total number of output files.
     */
    public Long getOutputFileNum() {
        return this.OutputFileNum;
    }

    /**
     * Set Total number of output files.
     * @param OutputFileNum Total number of output files.
     */
    public void setOutputFileNum(Long OutputFileNum) {
        this.OutputFileNum = OutputFileNum;
    }

    /**
     * Get Number of output partitions. 
     * @return OutputPartitionNum Number of output partitions.
     */
    public Long getOutputPartitionNum() {
        return this.OutputPartitionNum;
    }

    /**
     * Set Number of output partitions.
     * @param OutputPartitionNum Number of output partitions.
     */
    public void setOutputPartitionNum(Long OutputPartitionNum) {
        this.OutputPartitionNum = OutputPartitionNum;
    }

    /**
     * Get Total output data volume (bytes). 
     * @return OutputTotalData Total output data volume (bytes).
     */
    public Long getOutputTotalData() {
        return this.OutputTotalData;
    }

    /**
     * Set Total output data volume (bytes).
     * @param OutputTotalData Total output data volume (bytes).
     */
    public void setOutputTotalData(Long OutputTotalData) {
        this.OutputTotalData = OutputTotalData;
    }

    /**
     * Get Start time. 
     * @return BeginTime Start time.
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time.
     * @param BeginTime Start time.
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public SparkQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkQuery(SparkQuery source) {
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ScanPartitionNum != null) {
            this.ScanPartitionNum = new Long(source.ScanPartitionNum);
        }
        if (source.ScanRowNum != null) {
            this.ScanRowNum = new Long(source.ScanRowNum);
        }
        if (source.ScanFileNum != null) {
            this.ScanFileNum = new Long(source.ScanFileNum);
        }
        if (source.ScanTotalData != null) {
            this.ScanTotalData = new Long(source.ScanTotalData);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String[source.ApplicationId.length];
            for (int i = 0; i < source.ApplicationId.length; i++) {
                this.ApplicationId[i] = new String(source.ApplicationId[i]);
            }
        }
        if (source.OutputRowNum != null) {
            this.OutputRowNum = new Long(source.OutputRowNum);
        }
        if (source.OutputFileNum != null) {
            this.OutputFileNum = new Long(source.OutputFileNum);
        }
        if (source.OutputPartitionNum != null) {
            this.OutputPartitionNum = new Long(source.OutputPartitionNum);
        }
        if (source.OutputTotalData != null) {
            this.OutputTotalData = new Long(source.OutputTotalData);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ScanPartitionNum", this.ScanPartitionNum);
        this.setParamSimple(map, prefix + "ScanRowNum", this.ScanRowNum);
        this.setParamSimple(map, prefix + "ScanFileNum", this.ScanFileNum);
        this.setParamSimple(map, prefix + "ScanTotalData", this.ScanTotalData);
        this.setParamArraySimple(map, prefix + "ApplicationId.", this.ApplicationId);
        this.setParamSimple(map, prefix + "OutputRowNum", this.OutputRowNum);
        this.setParamSimple(map, prefix + "OutputFileNum", this.OutputFileNum);
        this.setParamSimple(map, prefix + "OutputPartitionNum", this.OutputPartitionNum);
        this.setParamSimple(map, prefix + "OutputTotalData", this.OutputTotalData);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

