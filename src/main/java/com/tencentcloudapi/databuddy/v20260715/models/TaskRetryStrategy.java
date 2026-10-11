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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskRetryStrategy extends AbstractModel {

    /**
    * Maximum retry count. Default value: 3.
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * Waiting time between retries. Default value: 5
    */
    @SerializedName("RetryBetweenWaitTime")
    @Expose
    private Long RetryBetweenWaitTime;

    /**
    * Time unit to wait between retries
ms: MILLISECOND second: SECOND minute (default): MINUTE hour: HOUR
    */
    @SerializedName("RetryBetweenWaitTimeUnit")
    @Expose
    private String RetryBetweenWaitTimeUnit;

    /**
    * Retry switch when task running fails. true by default.
    */
    @SerializedName("TaskRunFailureRetrySwitch")
    @Expose
    private Boolean TaskRunFailureRetrySwitch;

    /**
    * Retry switch for task timeout, false by default
    */
    @SerializedName("TaskRunTimeoutRetrySwitch")
    @Expose
    private Boolean TaskRunTimeoutRetrySwitch;

    /**
     * Get Maximum retry count. Default value: 3. 
     * @return MaxRetryTimes Maximum retry count. Default value: 3.
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set Maximum retry count. Default value: 3.
     * @param MaxRetryTimes Maximum retry count. Default value: 3.
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get Waiting time between retries. Default value: 5 
     * @return RetryBetweenWaitTime Waiting time between retries. Default value: 5
     */
    public Long getRetryBetweenWaitTime() {
        return this.RetryBetweenWaitTime;
    }

    /**
     * Set Waiting time between retries. Default value: 5
     * @param RetryBetweenWaitTime Waiting time between retries. Default value: 5
     */
    public void setRetryBetweenWaitTime(Long RetryBetweenWaitTime) {
        this.RetryBetweenWaitTime = RetryBetweenWaitTime;
    }

    /**
     * Get Time unit to wait between retries
ms: MILLISECOND second: SECOND minute (default): MINUTE hour: HOUR 
     * @return RetryBetweenWaitTimeUnit Time unit to wait between retries
ms: MILLISECOND second: SECOND minute (default): MINUTE hour: HOUR
     */
    public String getRetryBetweenWaitTimeUnit() {
        return this.RetryBetweenWaitTimeUnit;
    }

    /**
     * Set Time unit to wait between retries
ms: MILLISECOND second: SECOND minute (default): MINUTE hour: HOUR
     * @param RetryBetweenWaitTimeUnit Time unit to wait between retries
ms: MILLISECOND second: SECOND minute (default): MINUTE hour: HOUR
     */
    public void setRetryBetweenWaitTimeUnit(String RetryBetweenWaitTimeUnit) {
        this.RetryBetweenWaitTimeUnit = RetryBetweenWaitTimeUnit;
    }

    /**
     * Get Retry switch when task running fails. true by default. 
     * @return TaskRunFailureRetrySwitch Retry switch when task running fails. true by default.
     */
    public Boolean getTaskRunFailureRetrySwitch() {
        return this.TaskRunFailureRetrySwitch;
    }

    /**
     * Set Retry switch when task running fails. true by default.
     * @param TaskRunFailureRetrySwitch Retry switch when task running fails. true by default.
     */
    public void setTaskRunFailureRetrySwitch(Boolean TaskRunFailureRetrySwitch) {
        this.TaskRunFailureRetrySwitch = TaskRunFailureRetrySwitch;
    }

    /**
     * Get Retry switch for task timeout, false by default 
     * @return TaskRunTimeoutRetrySwitch Retry switch for task timeout, false by default
     */
    public Boolean getTaskRunTimeoutRetrySwitch() {
        return this.TaskRunTimeoutRetrySwitch;
    }

    /**
     * Set Retry switch for task timeout, false by default
     * @param TaskRunTimeoutRetrySwitch Retry switch for task timeout, false by default
     */
    public void setTaskRunTimeoutRetrySwitch(Boolean TaskRunTimeoutRetrySwitch) {
        this.TaskRunTimeoutRetrySwitch = TaskRunTimeoutRetrySwitch;
    }

    public TaskRetryStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskRetryStrategy(TaskRetryStrategy source) {
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.RetryBetweenWaitTime != null) {
            this.RetryBetweenWaitTime = new Long(source.RetryBetweenWaitTime);
        }
        if (source.RetryBetweenWaitTimeUnit != null) {
            this.RetryBetweenWaitTimeUnit = new String(source.RetryBetweenWaitTimeUnit);
        }
        if (source.TaskRunFailureRetrySwitch != null) {
            this.TaskRunFailureRetrySwitch = new Boolean(source.TaskRunFailureRetrySwitch);
        }
        if (source.TaskRunTimeoutRetrySwitch != null) {
            this.TaskRunTimeoutRetrySwitch = new Boolean(source.TaskRunTimeoutRetrySwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "RetryBetweenWaitTime", this.RetryBetweenWaitTime);
        this.setParamSimple(map, prefix + "RetryBetweenWaitTimeUnit", this.RetryBetweenWaitTimeUnit);
        this.setParamSimple(map, prefix + "TaskRunFailureRetrySwitch", this.TaskRunFailureRetrySwitch);
        this.setParamSimple(map, prefix + "TaskRunTimeoutRetrySwitch", this.TaskRunTimeoutRetrySwitch);

    }
}

