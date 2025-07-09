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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInstanceMetrics extends AbstractModel {

    /**
    * Number of submitted tasks
    */
    @SerializedName("SubmittedCount")
    @Expose
    private Long SubmittedCount;

    /**
    * Number of pending tasks
    */
    @SerializedName("PendingCount")
    @Expose
    private Long PendingCount;

    /**
    * Number of Runnable tasks
    */
    @SerializedName("RunnableCount")
    @Expose
    private Long RunnableCount;

    /**
    * Number of starting tasks
    */
    @SerializedName("StartingCount")
    @Expose
    private Long StartingCount;

    /**
    * Number of running tasks
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * Number of successful tasks
    */
    @SerializedName("SucceedCount")
    @Expose
    private Long SucceedCount;

    /**
    * Number of failed and interrupted tasks
    */
    @SerializedName("FailedInterruptedCount")
    @Expose
    private Long FailedInterruptedCount;

    /**
    * Number of failed tasks
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
     * Get Number of submitted tasks 
     * @return SubmittedCount Number of submitted tasks
     */
    public Long getSubmittedCount() {
        return this.SubmittedCount;
    }

    /**
     * Set Number of submitted tasks
     * @param SubmittedCount Number of submitted tasks
     */
    public void setSubmittedCount(Long SubmittedCount) {
        this.SubmittedCount = SubmittedCount;
    }

    /**
     * Get Number of pending tasks 
     * @return PendingCount Number of pending tasks
     */
    public Long getPendingCount() {
        return this.PendingCount;
    }

    /**
     * Set Number of pending tasks
     * @param PendingCount Number of pending tasks
     */
    public void setPendingCount(Long PendingCount) {
        this.PendingCount = PendingCount;
    }

    /**
     * Get Number of Runnable tasks 
     * @return RunnableCount Number of Runnable tasks
     */
    public Long getRunnableCount() {
        return this.RunnableCount;
    }

    /**
     * Set Number of Runnable tasks
     * @param RunnableCount Number of Runnable tasks
     */
    public void setRunnableCount(Long RunnableCount) {
        this.RunnableCount = RunnableCount;
    }

    /**
     * Get Number of starting tasks 
     * @return StartingCount Number of starting tasks
     */
    public Long getStartingCount() {
        return this.StartingCount;
    }

    /**
     * Set Number of starting tasks
     * @param StartingCount Number of starting tasks
     */
    public void setStartingCount(Long StartingCount) {
        this.StartingCount = StartingCount;
    }

    /**
     * Get Number of running tasks 
     * @return RunningCount Number of running tasks
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set Number of running tasks
     * @param RunningCount Number of running tasks
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get Number of successful tasks 
     * @return SucceedCount Number of successful tasks
     */
    public Long getSucceedCount() {
        return this.SucceedCount;
    }

    /**
     * Set Number of successful tasks
     * @param SucceedCount Number of successful tasks
     */
    public void setSucceedCount(Long SucceedCount) {
        this.SucceedCount = SucceedCount;
    }

    /**
     * Get Number of failed and interrupted tasks 
     * @return FailedInterruptedCount Number of failed and interrupted tasks
     */
    public Long getFailedInterruptedCount() {
        return this.FailedInterruptedCount;
    }

    /**
     * Set Number of failed and interrupted tasks
     * @param FailedInterruptedCount Number of failed and interrupted tasks
     */
    public void setFailedInterruptedCount(Long FailedInterruptedCount) {
        this.FailedInterruptedCount = FailedInterruptedCount;
    }

    /**
     * Get Number of failed tasks 
     * @return FailedCount Number of failed tasks
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set Number of failed tasks
     * @param FailedCount Number of failed tasks
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    public TaskInstanceMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInstanceMetrics(TaskInstanceMetrics source) {
        if (source.SubmittedCount != null) {
            this.SubmittedCount = new Long(source.SubmittedCount);
        }
        if (source.PendingCount != null) {
            this.PendingCount = new Long(source.PendingCount);
        }
        if (source.RunnableCount != null) {
            this.RunnableCount = new Long(source.RunnableCount);
        }
        if (source.StartingCount != null) {
            this.StartingCount = new Long(source.StartingCount);
        }
        if (source.RunningCount != null) {
            this.RunningCount = new Long(source.RunningCount);
        }
        if (source.SucceedCount != null) {
            this.SucceedCount = new Long(source.SucceedCount);
        }
        if (source.FailedInterruptedCount != null) {
            this.FailedInterruptedCount = new Long(source.FailedInterruptedCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
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

