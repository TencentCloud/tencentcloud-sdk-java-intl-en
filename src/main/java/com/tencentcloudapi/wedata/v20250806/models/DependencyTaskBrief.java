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

public class DependencyTaskBrief extends AbstractModel {

    /**
    * Task ID

    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Main dependency configuration. Valid values:

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * Configures secondary dependencies.  Valid values:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * Offset in Range/List Mode
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Dependency Execution Policy
    */
    @SerializedName("DependencyStrategy")
    @Expose
    private DependencyStrategyTask DependencyStrategy;

    /**
     * Get Task ID
 
     * @return TaskId Task ID

     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID

     * @param TaskId Task ID

     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Main dependency configuration. Valid values:

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR 
     * @return MainCyclicConfig Main dependency configuration. Valid values:

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set Main dependency configuration. Valid values:

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
     * @param MainCyclicConfig Main dependency configuration. Valid values:

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get Configures secondary dependencies.  Valid values:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE 
     * @return SubordinateCyclicConfig Configures secondary dependencies.  Valid values:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set Configures secondary dependencies.  Valid values:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
     * @param SubordinateCyclicConfig Configures secondary dependencies.  Valid values:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get Offset in Range/List Mode 
     * @return Offset Offset in Range/List Mode
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset in Range/List Mode
     * @param Offset Offset in Range/List Mode
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Dependency Execution Policy 
     * @return DependencyStrategy Dependency Execution Policy
     */
    public DependencyStrategyTask getDependencyStrategy() {
        return this.DependencyStrategy;
    }

    /**
     * Set Dependency Execution Policy
     * @param DependencyStrategy Dependency Execution Policy
     */
    public void setDependencyStrategy(DependencyStrategyTask DependencyStrategy) {
        this.DependencyStrategy = DependencyStrategy;
    }

    public DependencyTaskBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyTaskBrief(DependencyTaskBrief source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.MainCyclicConfig != null) {
            this.MainCyclicConfig = new String(source.MainCyclicConfig);
        }
        if (source.SubordinateCyclicConfig != null) {
            this.SubordinateCyclicConfig = new String(source.SubordinateCyclicConfig);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.DependencyStrategy != null) {
            this.DependencyStrategy = new DependencyStrategyTask(source.DependencyStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "MainCyclicConfig", this.MainCyclicConfig);
        this.setParamSimple(map, prefix + "SubordinateCyclicConfig", this.SubordinateCyclicConfig);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamObj(map, prefix + "DependencyStrategy.", this.DependencyStrategy);

    }
}

