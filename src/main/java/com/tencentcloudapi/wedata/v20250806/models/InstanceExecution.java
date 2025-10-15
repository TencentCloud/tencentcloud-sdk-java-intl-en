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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceExecution extends AbstractModel {

    /**
    * Instance unique identifier.

    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **Instance lifecycle number, identifies one-time execution of the instance.**.

For example, the first run of a periodic instance is numbered 0. if the user reruns the instance subsequently, the second execution is numbered 1.

    */
    @SerializedName("LifeRoundNum")
    @Expose
    private Long LifeRoundNum;

    /**
    * **Instance status**.
-WAIT_EVENT: specifies the wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
- RUNNING: indicates the instance is RUNNING.
- SKIP_RUNNING: SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
- EXPIRED: failed.
-COMPLETED: success.

    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * **Trigger type for instance running**.

-RERUN indicates a rerun.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN indicates rerun - empty run.
-ADDITION_SKIP_RUN indicates a supplementary empty run.
-PERIODIC_SKIP_RUN indicates cycle - empty run.
-APERIODIC_SKIP_RUN indicates non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * Specifies the number of retry attempts on failure.

    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * **Specifies the lifecycle list for instance execution.**.

    */
    @SerializedName("ExecutionPhaseList")
    @Expose
    private InstanceExecutionPhase [] ExecutionPhaseList;

    /**
    * Time spent, in milliseconds.

    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
     * Get Instance unique identifier.
 
     * @return InstanceKey Instance unique identifier.

     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Instance unique identifier.

     * @param InstanceKey Instance unique identifier.

     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get **Instance lifecycle number, identifies one-time execution of the instance.**.

For example, the first run of a periodic instance is numbered 0. if the user reruns the instance subsequently, the second execution is numbered 1.
 
     * @return LifeRoundNum **Instance lifecycle number, identifies one-time execution of the instance.**.

For example, the first run of a periodic instance is numbered 0. if the user reruns the instance subsequently, the second execution is numbered 1.

     */
    public Long getLifeRoundNum() {
        return this.LifeRoundNum;
    }

    /**
     * Set **Instance lifecycle number, identifies one-time execution of the instance.**.

For example, the first run of a periodic instance is numbered 0. if the user reruns the instance subsequently, the second execution is numbered 1.

     * @param LifeRoundNum **Instance lifecycle number, identifies one-time execution of the instance.**.

For example, the first run of a periodic instance is numbered 0. if the user reruns the instance subsequently, the second execution is numbered 1.

     */
    public void setLifeRoundNum(Long LifeRoundNum) {
        this.LifeRoundNum = LifeRoundNum;
    }

    /**
     * Get **Instance status**.
-WAIT_EVENT: specifies the wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
- RUNNING: indicates the instance is RUNNING.
- SKIP_RUNNING: SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
- EXPIRED: failed.
-COMPLETED: success.
 
     * @return InstanceState **Instance status**.
-WAIT_EVENT: specifies the wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
- RUNNING: indicates the instance is RUNNING.
- SKIP_RUNNING: SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
- EXPIRED: failed.
-COMPLETED: success.

     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set **Instance status**.
-WAIT_EVENT: specifies the wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
- RUNNING: indicates the instance is RUNNING.
- SKIP_RUNNING: SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
- EXPIRED: failed.
-COMPLETED: success.

     * @param InstanceState **Instance status**.
-WAIT_EVENT: specifies the wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
- RUNNING: indicates the instance is RUNNING.
- SKIP_RUNNING: SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
- EXPIRED: failed.
-COMPLETED: success.

     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get **Trigger type for instance running**.

-RERUN indicates a rerun.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN indicates rerun - empty run.
-ADDITION_SKIP_RUN indicates a supplementary empty run.
-PERIODIC_SKIP_RUN indicates cycle - empty run.
-APERIODIC_SKIP_RUN indicates non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun. 
     * @return RunType **Trigger type for instance running**.

-RERUN indicates a rerun.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN indicates rerun - empty run.
-ADDITION_SKIP_RUN indicates a supplementary empty run.
-PERIODIC_SKIP_RUN indicates cycle - empty run.
-APERIODIC_SKIP_RUN indicates non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set **Trigger type for instance running**.

-RERUN indicates a rerun.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN indicates rerun - empty run.
-ADDITION_SKIP_RUN indicates a supplementary empty run.
-PERIODIC_SKIP_RUN indicates cycle - empty run.
-APERIODIC_SKIP_RUN indicates non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
     * @param RunType **Trigger type for instance running**.

-RERUN indicates a rerun.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN indicates rerun - empty run.
-ADDITION_SKIP_RUN indicates a supplementary empty run.
-PERIODIC_SKIP_RUN indicates cycle - empty run.
-APERIODIC_SKIP_RUN indicates non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get Specifies the number of retry attempts on failure.
 
     * @return Tries Specifies the number of retry attempts on failure.

     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set Specifies the number of retry attempts on failure.

     * @param Tries Specifies the number of retry attempts on failure.

     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get **Specifies the lifecycle list for instance execution.**.
 
     * @return ExecutionPhaseList **Specifies the lifecycle list for instance execution.**.

     */
    public InstanceExecutionPhase [] getExecutionPhaseList() {
        return this.ExecutionPhaseList;
    }

    /**
     * Set **Specifies the lifecycle list for instance execution.**.

     * @param ExecutionPhaseList **Specifies the lifecycle list for instance execution.**.

     */
    public void setExecutionPhaseList(InstanceExecutionPhase [] ExecutionPhaseList) {
        this.ExecutionPhaseList = ExecutionPhaseList;
    }

    /**
     * Get Time spent, in milliseconds.
 
     * @return CostTime Time spent, in milliseconds.

     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Time spent, in milliseconds.

     * @param CostTime Time spent, in milliseconds.

     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    public InstanceExecution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceExecution(InstanceExecution source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.LifeRoundNum != null) {
            this.LifeRoundNum = new Long(source.LifeRoundNum);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.ExecutionPhaseList != null) {
            this.ExecutionPhaseList = new InstanceExecutionPhase[source.ExecutionPhaseList.length];
            for (int i = 0; i < source.ExecutionPhaseList.length; i++) {
                this.ExecutionPhaseList[i] = new InstanceExecutionPhase(source.ExecutionPhaseList[i]);
            }
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "LifeRoundNum", this.LifeRoundNum);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamArrayObj(map, prefix + "ExecutionPhaseList.", this.ExecutionPhaseList);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

