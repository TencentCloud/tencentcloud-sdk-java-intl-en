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

public class DependencyStrategyTask extends AbstractModel {

    /**
    * Wait upstream task instance policy: EXECUTING (execute); WAITING (wait).

    */
    @SerializedName("PollingNullStrategy")
    @Expose
    private String PollingNullStrategy;

    /**
    * This field is required only when PollingNullStrategy is set to EXECUTING.
Type: List

NOT_EXIST (default) - In cases where minute depends on minute / hour depends on hour, the parent instance does not fall within the scheduling time range of the downstream instance.

PARENT_EXPIRED - The parent instance failed.

PARENT_TIMEOUT - The parent instance timed out.

If any of the above conditions are met, the dependency check for that parent task instance is considered satisfied. In all other cases, the system must wait for the parent instance.
    */
    @SerializedName("TaskDependencyExecutingStrategies")
    @Expose
    private String [] TaskDependencyExecutingStrategies;

    /**
    * This field is required only when TaskDependencyExecutingStrategies includes PARENT_TIMEOUT.
Specifies the timeout duration (in minutes) for the downstream task's dependency on the parent instance execution.
    */
    @SerializedName("TaskDependencyExecutingTimeoutValue")
    @Expose
    private Long TaskDependencyExecutingTimeoutValue;

    /**
     * Get Wait upstream task instance policy: EXECUTING (execute); WAITING (wait).
 
     * @return PollingNullStrategy Wait upstream task instance policy: EXECUTING (execute); WAITING (wait).

     */
    public String getPollingNullStrategy() {
        return this.PollingNullStrategy;
    }

    /**
     * Set Wait upstream task instance policy: EXECUTING (execute); WAITING (wait).

     * @param PollingNullStrategy Wait upstream task instance policy: EXECUTING (execute); WAITING (wait).

     */
    public void setPollingNullStrategy(String PollingNullStrategy) {
        this.PollingNullStrategy = PollingNullStrategy;
    }

    /**
     * Get This field is required only when PollingNullStrategy is set to EXECUTING.
Type: List

NOT_EXIST (default) - In cases where minute depends on minute / hour depends on hour, the parent instance does not fall within the scheduling time range of the downstream instance.

PARENT_EXPIRED - The parent instance failed.

PARENT_TIMEOUT - The parent instance timed out.

If any of the above conditions are met, the dependency check for that parent task instance is considered satisfied. In all other cases, the system must wait for the parent instance. 
     * @return TaskDependencyExecutingStrategies This field is required only when PollingNullStrategy is set to EXECUTING.
Type: List

NOT_EXIST (default) - In cases where minute depends on minute / hour depends on hour, the parent instance does not fall within the scheduling time range of the downstream instance.

PARENT_EXPIRED - The parent instance failed.

PARENT_TIMEOUT - The parent instance timed out.

If any of the above conditions are met, the dependency check for that parent task instance is considered satisfied. In all other cases, the system must wait for the parent instance.
     */
    public String [] getTaskDependencyExecutingStrategies() {
        return this.TaskDependencyExecutingStrategies;
    }

    /**
     * Set This field is required only when PollingNullStrategy is set to EXECUTING.
Type: List

NOT_EXIST (default) - In cases where minute depends on minute / hour depends on hour, the parent instance does not fall within the scheduling time range of the downstream instance.

PARENT_EXPIRED - The parent instance failed.

PARENT_TIMEOUT - The parent instance timed out.

If any of the above conditions are met, the dependency check for that parent task instance is considered satisfied. In all other cases, the system must wait for the parent instance.
     * @param TaskDependencyExecutingStrategies This field is required only when PollingNullStrategy is set to EXECUTING.
Type: List

NOT_EXIST (default) - In cases where minute depends on minute / hour depends on hour, the parent instance does not fall within the scheduling time range of the downstream instance.

PARENT_EXPIRED - The parent instance failed.

PARENT_TIMEOUT - The parent instance timed out.

If any of the above conditions are met, the dependency check for that parent task instance is considered satisfied. In all other cases, the system must wait for the parent instance.
     */
    public void setTaskDependencyExecutingStrategies(String [] TaskDependencyExecutingStrategies) {
        this.TaskDependencyExecutingStrategies = TaskDependencyExecutingStrategies;
    }

    /**
     * Get This field is required only when TaskDependencyExecutingStrategies includes PARENT_TIMEOUT.
Specifies the timeout duration (in minutes) for the downstream task's dependency on the parent instance execution. 
     * @return TaskDependencyExecutingTimeoutValue This field is required only when TaskDependencyExecutingStrategies includes PARENT_TIMEOUT.
Specifies the timeout duration (in minutes) for the downstream task's dependency on the parent instance execution.
     */
    public Long getTaskDependencyExecutingTimeoutValue() {
        return this.TaskDependencyExecutingTimeoutValue;
    }

    /**
     * Set This field is required only when TaskDependencyExecutingStrategies includes PARENT_TIMEOUT.
Specifies the timeout duration (in minutes) for the downstream task's dependency on the parent instance execution.
     * @param TaskDependencyExecutingTimeoutValue This field is required only when TaskDependencyExecutingStrategies includes PARENT_TIMEOUT.
Specifies the timeout duration (in minutes) for the downstream task's dependency on the parent instance execution.
     */
    public void setTaskDependencyExecutingTimeoutValue(Long TaskDependencyExecutingTimeoutValue) {
        this.TaskDependencyExecutingTimeoutValue = TaskDependencyExecutingTimeoutValue;
    }

    public DependencyStrategyTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyStrategyTask(DependencyStrategyTask source) {
        if (source.PollingNullStrategy != null) {
            this.PollingNullStrategy = new String(source.PollingNullStrategy);
        }
        if (source.TaskDependencyExecutingStrategies != null) {
            this.TaskDependencyExecutingStrategies = new String[source.TaskDependencyExecutingStrategies.length];
            for (int i = 0; i < source.TaskDependencyExecutingStrategies.length; i++) {
                this.TaskDependencyExecutingStrategies[i] = new String(source.TaskDependencyExecutingStrategies[i]);
            }
        }
        if (source.TaskDependencyExecutingTimeoutValue != null) {
            this.TaskDependencyExecutingTimeoutValue = new Long(source.TaskDependencyExecutingTimeoutValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PollingNullStrategy", this.PollingNullStrategy);
        this.setParamArraySimple(map, prefix + "TaskDependencyExecutingStrategies.", this.TaskDependencyExecutingStrategies);
        this.setParamSimple(map, prefix + "TaskDependencyExecutingTimeoutValue", this.TaskDependencyExecutingTimeoutValue);

    }
}

