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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineTaskInfo extends AbstractModel {

    /**
    * Engine submission time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineSubmitTime")
    @Expose
    private String EngineSubmitTime;

    /**
    * Engine execution time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineExeTime")
    @Expose
    private String EngineExeTime;

    /**
    * Total execution time of the engine.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineExeTimes")
    @Expose
    private Long EngineExeTimes;

    /**
    * cu consumption.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CuConsume")
    @Expose
    private Long CuConsume;

    /**
    * Resource consumption.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceUsage")
    @Expose
    private Long ResourceUsage;

    /**
    * Engine name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * Engine execution status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineExeStatus")
    @Expose
    private String EngineExeStatus;

    /**
    * Task type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskKind")
    @Expose
    private String TaskKind;

    /**
    * Task type

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task SQL statement.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskContent")
    @Expose
    private String TaskContent;

    /**
    * Total bytes of data scanning.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputBytesSum")
    @Expose
    private Long InputBytesSum;

    /**
    * Total shuffle read bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShuffleReadBytesSum")
    @Expose
    private Long ShuffleReadBytesSum;

    /**
    * Total number of shuffle read lines.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShuffleReadRecordsSum")
    @Expose
    private Long ShuffleReadRecordsSum;

    /**
    * Total number of outputs.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputRecordsSum")
    @Expose
    private Long OutputRecordsSum;

    /**
    * Total output in bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputBytesSum")
    @Expose
    private Long OutputBytesSum;

    /**
    * Number of output files.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputFilesNum")
    @Expose
    private Long OutputFilesNum;

    /**
    * Number of small files output.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputSmallFilesNum")
    @Expose
    private Long OutputSmallFilesNum;

    /**
    * Execution wait time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WaitTime")
    @Expose
    private Long WaitTime;

    /**
    * Query result time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueryResultTime")
    @Expose
    private Long QueryResultTime;

    /**
    * Input parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
     * Get Engine submission time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineSubmitTime Engine submission time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineSubmitTime() {
        return this.EngineSubmitTime;
    }

    /**
     * Set Engine submission time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineSubmitTime Engine submission time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineSubmitTime(String EngineSubmitTime) {
        this.EngineSubmitTime = EngineSubmitTime;
    }

    /**
     * Get Engine execution time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineExeTime Engine execution time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineExeTime() {
        return this.EngineExeTime;
    }

    /**
     * Set Engine execution time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineExeTime Engine execution time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineExeTime(String EngineExeTime) {
        this.EngineExeTime = EngineExeTime;
    }

    /**
     * Get Total execution time of the engine.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineExeTimes Total execution time of the engine.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEngineExeTimes() {
        return this.EngineExeTimes;
    }

    /**
     * Set Total execution time of the engine.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineExeTimes Total execution time of the engine.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineExeTimes(Long EngineExeTimes) {
        this.EngineExeTimes = EngineExeTimes;
    }

    /**
     * Get cu consumption.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CuConsume cu consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCuConsume() {
        return this.CuConsume;
    }

    /**
     * Set cu consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CuConsume cu consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCuConsume(Long CuConsume) {
        this.CuConsume = CuConsume;
    }

    /**
     * Get Resource consumption.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceUsage Resource consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResourceUsage() {
        return this.ResourceUsage;
    }

    /**
     * Set Resource consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceUsage Resource consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceUsage(Long ResourceUsage) {
        this.ResourceUsage = ResourceUsage;
    }

    /**
     * Get Engine name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineName Engine name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set Engine name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineName Engine name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get Engine execution status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineExeStatus Engine execution status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineExeStatus() {
        return this.EngineExeStatus;
    }

    /**
     * Set Engine execution status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineExeStatus Engine execution status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineExeStatus(String EngineExeStatus) {
        this.EngineExeStatus = EngineExeStatus;
    }

    /**
     * Get Task type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskKind Task type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskKind() {
        return this.TaskKind;
    }

    /**
     * Set Task type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskKind Task type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskKind(String TaskKind) {
        this.TaskKind = TaskKind;
    }

    /**
     * Get Task type

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskType Task type

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskType Task type

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task SQL statement.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskContent Task SQL statement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskContent() {
        return this.TaskContent;
    }

    /**
     * Set Task SQL statement.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskContent Task SQL statement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskContent(String TaskContent) {
        this.TaskContent = TaskContent;
    }

    /**
     * Get Total bytes of data scanning.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputBytesSum Total bytes of data scanning.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInputBytesSum() {
        return this.InputBytesSum;
    }

    /**
     * Set Total bytes of data scanning.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputBytesSum Total bytes of data scanning.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputBytesSum(Long InputBytesSum) {
        this.InputBytesSum = InputBytesSum;
    }

    /**
     * Get Total shuffle read bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShuffleReadBytesSum Total shuffle read bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShuffleReadBytesSum() {
        return this.ShuffleReadBytesSum;
    }

    /**
     * Set Total shuffle read bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShuffleReadBytesSum Total shuffle read bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShuffleReadBytesSum(Long ShuffleReadBytesSum) {
        this.ShuffleReadBytesSum = ShuffleReadBytesSum;
    }

    /**
     * Get Total number of shuffle read lines.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShuffleReadRecordsSum Total number of shuffle read lines.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShuffleReadRecordsSum() {
        return this.ShuffleReadRecordsSum;
    }

    /**
     * Set Total number of shuffle read lines.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShuffleReadRecordsSum Total number of shuffle read lines.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShuffleReadRecordsSum(Long ShuffleReadRecordsSum) {
        this.ShuffleReadRecordsSum = ShuffleReadRecordsSum;
    }

    /**
     * Get Total number of outputs.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputRecordsSum Total number of outputs.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOutputRecordsSum() {
        return this.OutputRecordsSum;
    }

    /**
     * Set Total number of outputs.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputRecordsSum Total number of outputs.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputRecordsSum(Long OutputRecordsSum) {
        this.OutputRecordsSum = OutputRecordsSum;
    }

    /**
     * Get Total output in bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputBytesSum Total output in bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOutputBytesSum() {
        return this.OutputBytesSum;
    }

    /**
     * Set Total output in bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputBytesSum Total output in bytes.
Note: This field may return null, indicating that no valid values can be obtained.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputBytesSum(Long OutputBytesSum) {
        this.OutputBytesSum = OutputBytesSum;
    }

    /**
     * Get Number of output files.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputFilesNum Number of output files.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOutputFilesNum() {
        return this.OutputFilesNum;
    }

    /**
     * Set Number of output files.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputFilesNum Number of output files.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputFilesNum(Long OutputFilesNum) {
        this.OutputFilesNum = OutputFilesNum;
    }

    /**
     * Get Number of small files output.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputSmallFilesNum Number of small files output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOutputSmallFilesNum() {
        return this.OutputSmallFilesNum;
    }

    /**
     * Set Number of small files output.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputSmallFilesNum Number of small files output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputSmallFilesNum(Long OutputSmallFilesNum) {
        this.OutputSmallFilesNum = OutputSmallFilesNum;
    }

    /**
     * Get Execution wait time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WaitTime Execution wait time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set Execution wait time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WaitTime Execution wait time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWaitTime(Long WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get Query result time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueryResultTime Query result time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getQueryResultTime() {
        return this.QueryResultTime;
    }

    /**
     * Set Query result time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueryResultTime Query result time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueryResultTime(Long QueryResultTime) {
        this.QueryResultTime = QueryResultTime;
    }

    /**
     * Get Input parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CmdArgs Input parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set Input parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CmdArgs Input parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    public EngineTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineTaskInfo(EngineTaskInfo source) {
        if (source.EngineSubmitTime != null) {
            this.EngineSubmitTime = new String(source.EngineSubmitTime);
        }
        if (source.EngineExeTime != null) {
            this.EngineExeTime = new String(source.EngineExeTime);
        }
        if (source.EngineExeTimes != null) {
            this.EngineExeTimes = new Long(source.EngineExeTimes);
        }
        if (source.CuConsume != null) {
            this.CuConsume = new Long(source.CuConsume);
        }
        if (source.ResourceUsage != null) {
            this.ResourceUsage = new Long(source.ResourceUsage);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.EngineExeStatus != null) {
            this.EngineExeStatus = new String(source.EngineExeStatus);
        }
        if (source.TaskKind != null) {
            this.TaskKind = new String(source.TaskKind);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskContent != null) {
            this.TaskContent = new String(source.TaskContent);
        }
        if (source.InputBytesSum != null) {
            this.InputBytesSum = new Long(source.InputBytesSum);
        }
        if (source.ShuffleReadBytesSum != null) {
            this.ShuffleReadBytesSum = new Long(source.ShuffleReadBytesSum);
        }
        if (source.ShuffleReadRecordsSum != null) {
            this.ShuffleReadRecordsSum = new Long(source.ShuffleReadRecordsSum);
        }
        if (source.OutputRecordsSum != null) {
            this.OutputRecordsSum = new Long(source.OutputRecordsSum);
        }
        if (source.OutputBytesSum != null) {
            this.OutputBytesSum = new Long(source.OutputBytesSum);
        }
        if (source.OutputFilesNum != null) {
            this.OutputFilesNum = new Long(source.OutputFilesNum);
        }
        if (source.OutputSmallFilesNum != null) {
            this.OutputSmallFilesNum = new Long(source.OutputSmallFilesNum);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new Long(source.WaitTime);
        }
        if (source.QueryResultTime != null) {
            this.QueryResultTime = new Long(source.QueryResultTime);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineSubmitTime", this.EngineSubmitTime);
        this.setParamSimple(map, prefix + "EngineExeTime", this.EngineExeTime);
        this.setParamSimple(map, prefix + "EngineExeTimes", this.EngineExeTimes);
        this.setParamSimple(map, prefix + "CuConsume", this.CuConsume);
        this.setParamSimple(map, prefix + "ResourceUsage", this.ResourceUsage);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "EngineExeStatus", this.EngineExeStatus);
        this.setParamSimple(map, prefix + "TaskKind", this.TaskKind);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskContent", this.TaskContent);
        this.setParamSimple(map, prefix + "InputBytesSum", this.InputBytesSum);
        this.setParamSimple(map, prefix + "ShuffleReadBytesSum", this.ShuffleReadBytesSum);
        this.setParamSimple(map, prefix + "ShuffleReadRecordsSum", this.ShuffleReadRecordsSum);
        this.setParamSimple(map, prefix + "OutputRecordsSum", this.OutputRecordsSum);
        this.setParamSimple(map, prefix + "OutputBytesSum", this.OutputBytesSum);
        this.setParamSimple(map, prefix + "OutputFilesNum", this.OutputFilesNum);
        this.setParamSimple(map, prefix + "OutputSmallFilesNum", this.OutputSmallFilesNum);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "QueryResultTime", this.QueryResultTime);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);

    }
}

