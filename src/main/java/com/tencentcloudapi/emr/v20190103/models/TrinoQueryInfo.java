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

public class TrinoQueryInfo extends AbstractModel {

    /**
    * catalog
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * IP address used for submission.
    */
    @SerializedName("ClientIpAddr")
    @Expose
    private String ClientIpAddr;

    /**
    * Number of segments.
    */
    @SerializedName("CompletedSplits")
    @Expose
    private String CompletedSplits;

    /**
    * CPU time.
    */
    @SerializedName("CpuTime")
    @Expose
    private Long CpuTime;

    /**
    * Cumulative memory.
    */
    @SerializedName("CumulativeMemory")
    @Expose
    private Long CumulativeMemory;

    /**
    * Execution duration.
    */
    @SerializedName("DurationMillis")
    @Expose
    private Long DurationMillis;

    /**
    * End time (seconds).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Query ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Internal transmission volume.
    */
    @SerializedName("InternalNetworkBytes")
    @Expose
    private Long InternalNetworkBytes;

    /**
    * Number of output bytes.
    */
    @SerializedName("OutputBytes")
    @Expose
    private Long OutputBytes;

    /**
    * Peak memory.
    */
    @SerializedName("PeakUserMemoryBytes")
    @Expose
    private Long PeakUserMemoryBytes;

    /**
    * Physical input volume.
    */
    @SerializedName("PhysicalInputBytes")
    @Expose
    private Long PhysicalInputBytes;

    /**
    * Processed input volume.
    */
    @SerializedName("ProcessedInputBytes")
    @Expose
    private Long ProcessedInputBytes;

    /**
    * Compilation duration.
    */
    @SerializedName("SqlCompileTime")
    @Expose
    private Long SqlCompileTime;

    /**
    * Start time (seconds).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Execution status.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Execution statement.
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * User who submits requests.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Number of bytes written.
    */
    @SerializedName("WrittenBytes")
    @Expose
    private Long WrittenBytes;

    /**
     * Get catalog 
     * @return Catalog catalog
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog
     * @param Catalog catalog
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get IP address used for submission. 
     * @return ClientIpAddr IP address used for submission.
     */
    public String getClientIpAddr() {
        return this.ClientIpAddr;
    }

    /**
     * Set IP address used for submission.
     * @param ClientIpAddr IP address used for submission.
     */
    public void setClientIpAddr(String ClientIpAddr) {
        this.ClientIpAddr = ClientIpAddr;
    }

    /**
     * Get Number of segments. 
     * @return CompletedSplits Number of segments.
     */
    public String getCompletedSplits() {
        return this.CompletedSplits;
    }

    /**
     * Set Number of segments.
     * @param CompletedSplits Number of segments.
     */
    public void setCompletedSplits(String CompletedSplits) {
        this.CompletedSplits = CompletedSplits;
    }

    /**
     * Get CPU time. 
     * @return CpuTime CPU time.
     */
    public Long getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set CPU time.
     * @param CpuTime CPU time.
     */
    public void setCpuTime(Long CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get Cumulative memory. 
     * @return CumulativeMemory Cumulative memory.
     */
    public Long getCumulativeMemory() {
        return this.CumulativeMemory;
    }

    /**
     * Set Cumulative memory.
     * @param CumulativeMemory Cumulative memory.
     */
    public void setCumulativeMemory(Long CumulativeMemory) {
        this.CumulativeMemory = CumulativeMemory;
    }

    /**
     * Get Execution duration. 
     * @return DurationMillis Execution duration.
     */
    public Long getDurationMillis() {
        return this.DurationMillis;
    }

    /**
     * Set Execution duration.
     * @param DurationMillis Execution duration.
     */
    public void setDurationMillis(Long DurationMillis) {
        this.DurationMillis = DurationMillis;
    }

    /**
     * Get End time (seconds). 
     * @return EndTime End time (seconds).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (seconds).
     * @param EndTime End time (seconds).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
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
     * Get Internal transmission volume. 
     * @return InternalNetworkBytes Internal transmission volume.
     */
    public Long getInternalNetworkBytes() {
        return this.InternalNetworkBytes;
    }

    /**
     * Set Internal transmission volume.
     * @param InternalNetworkBytes Internal transmission volume.
     */
    public void setInternalNetworkBytes(Long InternalNetworkBytes) {
        this.InternalNetworkBytes = InternalNetworkBytes;
    }

    /**
     * Get Number of output bytes. 
     * @return OutputBytes Number of output bytes.
     */
    public Long getOutputBytes() {
        return this.OutputBytes;
    }

    /**
     * Set Number of output bytes.
     * @param OutputBytes Number of output bytes.
     */
    public void setOutputBytes(Long OutputBytes) {
        this.OutputBytes = OutputBytes;
    }

    /**
     * Get Peak memory. 
     * @return PeakUserMemoryBytes Peak memory.
     */
    public Long getPeakUserMemoryBytes() {
        return this.PeakUserMemoryBytes;
    }

    /**
     * Set Peak memory.
     * @param PeakUserMemoryBytes Peak memory.
     */
    public void setPeakUserMemoryBytes(Long PeakUserMemoryBytes) {
        this.PeakUserMemoryBytes = PeakUserMemoryBytes;
    }

    /**
     * Get Physical input volume. 
     * @return PhysicalInputBytes Physical input volume.
     */
    public Long getPhysicalInputBytes() {
        return this.PhysicalInputBytes;
    }

    /**
     * Set Physical input volume.
     * @param PhysicalInputBytes Physical input volume.
     */
    public void setPhysicalInputBytes(Long PhysicalInputBytes) {
        this.PhysicalInputBytes = PhysicalInputBytes;
    }

    /**
     * Get Processed input volume. 
     * @return ProcessedInputBytes Processed input volume.
     */
    public Long getProcessedInputBytes() {
        return this.ProcessedInputBytes;
    }

    /**
     * Set Processed input volume.
     * @param ProcessedInputBytes Processed input volume.
     */
    public void setProcessedInputBytes(Long ProcessedInputBytes) {
        this.ProcessedInputBytes = ProcessedInputBytes;
    }

    /**
     * Get Compilation duration. 
     * @return SqlCompileTime Compilation duration.
     */
    public Long getSqlCompileTime() {
        return this.SqlCompileTime;
    }

    /**
     * Set Compilation duration.
     * @param SqlCompileTime Compilation duration.
     */
    public void setSqlCompileTime(Long SqlCompileTime) {
        this.SqlCompileTime = SqlCompileTime;
    }

    /**
     * Get Start time (seconds). 
     * @return StartTime Start time (seconds).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (seconds).
     * @param StartTime Start time (seconds).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Execution status. 
     * @return State Execution status.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Execution status.
     * @param State Execution status.
     */
    public void setState(String State) {
        this.State = State;
    }

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
     * Get User who submits requests. 
     * @return User User who submits requests.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User who submits requests.
     * @param User User who submits requests.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Number of bytes written. 
     * @return WrittenBytes Number of bytes written.
     */
    public Long getWrittenBytes() {
        return this.WrittenBytes;
    }

    /**
     * Set Number of bytes written.
     * @param WrittenBytes Number of bytes written.
     */
    public void setWrittenBytes(Long WrittenBytes) {
        this.WrittenBytes = WrittenBytes;
    }

    public TrinoQueryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrinoQueryInfo(TrinoQueryInfo source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.ClientIpAddr != null) {
            this.ClientIpAddr = new String(source.ClientIpAddr);
        }
        if (source.CompletedSplits != null) {
            this.CompletedSplits = new String(source.CompletedSplits);
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Long(source.CpuTime);
        }
        if (source.CumulativeMemory != null) {
            this.CumulativeMemory = new Long(source.CumulativeMemory);
        }
        if (source.DurationMillis != null) {
            this.DurationMillis = new Long(source.DurationMillis);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InternalNetworkBytes != null) {
            this.InternalNetworkBytes = new Long(source.InternalNetworkBytes);
        }
        if (source.OutputBytes != null) {
            this.OutputBytes = new Long(source.OutputBytes);
        }
        if (source.PeakUserMemoryBytes != null) {
            this.PeakUserMemoryBytes = new Long(source.PeakUserMemoryBytes);
        }
        if (source.PhysicalInputBytes != null) {
            this.PhysicalInputBytes = new Long(source.PhysicalInputBytes);
        }
        if (source.ProcessedInputBytes != null) {
            this.ProcessedInputBytes = new Long(source.ProcessedInputBytes);
        }
        if (source.SqlCompileTime != null) {
            this.SqlCompileTime = new Long(source.SqlCompileTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.WrittenBytes != null) {
            this.WrittenBytes = new Long(source.WrittenBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "ClientIpAddr", this.ClientIpAddr);
        this.setParamSimple(map, prefix + "CompletedSplits", this.CompletedSplits);
        this.setParamSimple(map, prefix + "CpuTime", this.CpuTime);
        this.setParamSimple(map, prefix + "CumulativeMemory", this.CumulativeMemory);
        this.setParamSimple(map, prefix + "DurationMillis", this.DurationMillis);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InternalNetworkBytes", this.InternalNetworkBytes);
        this.setParamSimple(map, prefix + "OutputBytes", this.OutputBytes);
        this.setParamSimple(map, prefix + "PeakUserMemoryBytes", this.PeakUserMemoryBytes);
        this.setParamSimple(map, prefix + "PhysicalInputBytes", this.PhysicalInputBytes);
        this.setParamSimple(map, prefix + "ProcessedInputBytes", this.ProcessedInputBytes);
        this.setParamSimple(map, prefix + "SqlCompileTime", this.SqlCompileTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "WrittenBytes", this.WrittenBytes);

    }
}

