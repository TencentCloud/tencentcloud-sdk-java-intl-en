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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskMetrics extends AbstractModel{

    /**
    * Submitted count
    */
    @SerializedName("SubmittedCount")
    @Expose
    private Long SubmittedCount;

    /**
    * Pending count
    */
    @SerializedName("PendingCount")
    @Expose
    private Long PendingCount;

    /**
    * Runnable count
    */
    @SerializedName("RunnableCount")
    @Expose
    private Long RunnableCount;

    /**
    * Starting count
    */
    @SerializedName("StartingCount")
    @Expose
    private Long StartingCount;

    /**
    * Running count
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * Succeed count
    */
    @SerializedName("SucceedCount")
    @Expose
    private Long SucceedCount;

    /**
    * FailedInterrupted count
    */
    @SerializedName("FailedInterruptedCount")
    @Expose
    private Long FailedInterruptedCount;

    /**
    * Failed count
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
     * Get Submitted count 
     * @return SubmittedCount Submitted count
     */
    public Long getSubmittedCount() {
        return this.SubmittedCount;
    }

    /**
     * Set Submitted count
     * @param SubmittedCount Submitted count
     */
    public void setSubmittedCount(Long SubmittedCount) {
        this.SubmittedCount = SubmittedCount;
    }

    /**
     * Get Pending count 
     * @return PendingCount Pending count
     */
    public Long getPendingCount() {
        return this.PendingCount;
    }

    /**
     * Set Pending count
     * @param PendingCount Pending count
     */
    public void setPendingCount(Long PendingCount) {
        this.PendingCount = PendingCount;
    }

    /**
     * Get Runnable count 
     * @return RunnableCount Runnable count
     */
    public Long getRunnableCount() {
        return this.RunnableCount;
    }

    /**
     * Set Runnable count
     * @param RunnableCount Runnable count
     */
    public void setRunnableCount(Long RunnableCount) {
        this.RunnableCount = RunnableCount;
    }

    /**
     * Get Starting count 
     * @return StartingCount Starting count
     */
    public Long getStartingCount() {
        return this.StartingCount;
    }

    /**
     * Set Starting count
     * @param StartingCount Starting count
     */
    public void setStartingCount(Long StartingCount) {
        this.StartingCount = StartingCount;
    }

    /**
     * Get Running count 
     * @return RunningCount Running count
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set Running count
     * @param RunningCount Running count
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get Succeed count 
     * @return SucceedCount Succeed count
     */
    public Long getSucceedCount() {
        return this.SucceedCount;
    }

    /**
     * Set Succeed count
     * @param SucceedCount Succeed count
     */
    public void setSucceedCount(Long SucceedCount) {
        this.SucceedCount = SucceedCount;
    }

    /**
     * Get FailedInterrupted count 
     * @return FailedInterruptedCount FailedInterrupted count
     */
    public Long getFailedInterruptedCount() {
        return this.FailedInterruptedCount;
    }

    /**
     * Set FailedInterrupted count
     * @param FailedInterruptedCount FailedInterrupted count
     */
    public void setFailedInterruptedCount(Long FailedInterruptedCount) {
        this.FailedInterruptedCount = FailedInterruptedCount;
    }

    /**
     * Get Failed count 
     * @return FailedCount Failed count
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set Failed count
     * @param FailedCount Failed count
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubmittedCount", this.SubmittedCount);
        this.setParamSimple(map, prefix + "PendingCount", this.PendingCount);
        this.setParamSimple(map, prefix + "RunnableCount", this.RunnableCount);
        this.setParamSimple(map, prefix + "StartingCount", this.StartingCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "SucceedCount", this.SucceedCount);
        this.setParamSimple(map, prefix + "FailedInterruptedCount", this.FailedInterruptedCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);

    }
}

