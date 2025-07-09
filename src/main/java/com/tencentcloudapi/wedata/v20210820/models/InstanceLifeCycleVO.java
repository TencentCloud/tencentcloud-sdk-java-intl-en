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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLifeCycleVO extends AbstractModel {

    /**
    * Unique identifier of the instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Instance status.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceState")
    @Expose
    private Long InstanceState;

    /**
    * Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LifeRoundNum")
    @Expose
    private Long LifeRoundNum;

    /**
    * Instance running trigger type.

-RERUN indicates rerunning.
-ADDITION indicates data replenishment.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * Number of retries after failure.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * List of instance lifecycle.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LifeCycleDetailList")
    @Expose
    private InstanceLifeDetailDto [] LifeCycleDetailList;

    /**
    * Instance code file.
The file content specifies the code used for running the execution instance this time. only some tasks support it.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CodeFileName")
    @Expose
    private String CodeFileName;

    /**
    * Dispatch execution ID.
The unified execution platform dispatches execution to the new version executor with a unique ID to identify a specific execution, while the existing old executors do not have this ID when dispatching execution.
If it is unknown whether the executor version supports this ID, contact tencent cloud's operations team.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * The execution node where the log resides.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * Log file name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * Instance log type.

-run: indicates the state of functioning. 
-kill: terminates.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Time spent.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
     * Get Unique identifier of the instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceKey Unique identifier of the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Unique identifier of the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceKey Unique identifier of the instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Instance status.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceState Instance status.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceState Instance status.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceState(Long InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LifeRoundNum Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLifeRoundNum() {
        return this.LifeRoundNum;
    }

    /**
     * Set Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LifeRoundNum Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifeRoundNum(Long LifeRoundNum) {
        this.LifeRoundNum = LifeRoundNum;
    }

    /**
     * Get Instance running trigger type.

-RERUN indicates rerunning.
-ADDITION indicates data replenishment.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunType Instance running trigger type.

-RERUN indicates rerunning.
-ADDITION indicates data replenishment.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set Instance running trigger type.

-RERUN indicates rerunning.
-ADDITION indicates data replenishment.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunType Instance running trigger type.

-RERUN indicates rerunning.
-ADDITION indicates data replenishment.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get Number of retries after failure.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tries Number of retries after failure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set Number of retries after failure.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tries Number of retries after failure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get List of instance lifecycle.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LifeCycleDetailList List of instance lifecycle.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceLifeDetailDto [] getLifeCycleDetailList() {
        return this.LifeCycleDetailList;
    }

    /**
     * Set List of instance lifecycle.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LifeCycleDetailList List of instance lifecycle.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifeCycleDetailList(InstanceLifeDetailDto [] LifeCycleDetailList) {
        this.LifeCycleDetailList = LifeCycleDetailList;
    }

    /**
     * Get Instance code file.
The file content specifies the code used for running the execution instance this time. only some tasks support it.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CodeFileName Instance code file.
The file content specifies the code used for running the execution instance this time. only some tasks support it.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCodeFileName() {
        return this.CodeFileName;
    }

    /**
     * Set Instance code file.
The file content specifies the code used for running the execution instance this time. only some tasks support it.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CodeFileName Instance code file.
The file content specifies the code used for running the execution instance this time. only some tasks support it.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodeFileName(String CodeFileName) {
        this.CodeFileName = CodeFileName;
    }

    /**
     * Get Dispatch execution ID.
The unified execution platform dispatches execution to the new version executor with a unique ID to identify a specific execution, while the existing old executors do not have this ID when dispatching execution.
If it is unknown whether the executor version supports this ID, contact tencent cloud's operations team.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionJobId Dispatch execution ID.
The unified execution platform dispatches execution to the new version executor with a unique ID to identify a specific execution, while the existing old executors do not have this ID when dispatching execution.
If it is unknown whether the executor version supports this ID, contact tencent cloud's operations team.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set Dispatch execution ID.
The unified execution platform dispatches execution to the new version executor with a unique ID to identify a specific execution, while the existing old executors do not have this ID when dispatching execution.
If it is unknown whether the executor version supports this ID, contact tencent cloud's operations team.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionJobId Dispatch execution ID.
The unified execution platform dispatches execution to the new version executor with a unique ID to identify a specific execution, while the existing old executors do not have this ID when dispatching execution.
If it is unknown whether the executor version supports this ID, contact tencent cloud's operations team.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get The execution node where the log resides.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BrokerIp The execution node where the log resides.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set The execution node where the log resides.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BrokerIp The execution node where the log resides.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get Log file name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginFileName Log file name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set Log file name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginFileName Log file name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get Instance log type.

-run: indicates the state of functioning. 
-kill: terminates.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogType Instance log type.

-run: indicates the state of functioning. 
-kill: terminates.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Instance log type.

-run: indicates the state of functioning. 
-kill: terminates.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogType Instance log type.

-run: indicates the state of functioning. 
-kill: terminates.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Time spent.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CostTime Time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CostTime Time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    public InstanceLifeCycleVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLifeCycleVO(InstanceLifeCycleVO source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new Long(source.InstanceState);
        }
        if (source.LifeRoundNum != null) {
            this.LifeRoundNum = new Long(source.LifeRoundNum);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.LifeCycleDetailList != null) {
            this.LifeCycleDetailList = new InstanceLifeDetailDto[source.LifeCycleDetailList.length];
            for (int i = 0; i < source.LifeCycleDetailList.length; i++) {
                this.LifeCycleDetailList[i] = new InstanceLifeDetailDto(source.LifeCycleDetailList[i]);
            }
        }
        if (source.CodeFileName != null) {
            this.CodeFileName = new String(source.CodeFileName);
        }
        if (source.ExecutionJobId != null) {
            this.ExecutionJobId = new String(source.ExecutionJobId);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.OriginFileName != null) {
            this.OriginFileName = new String(source.OriginFileName);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "LifeRoundNum", this.LifeRoundNum);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamArrayObj(map, prefix + "LifeCycleDetailList.", this.LifeCycleDetailList);
        this.setParamSimple(map, prefix + "CodeFileName", this.CodeFileName);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

