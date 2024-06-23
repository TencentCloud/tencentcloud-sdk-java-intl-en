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

public class DependencyConfig extends AbstractModel {

    /**
    * Only five types of periodic execution dependency configurations: HOUR, DAY, WEEK, MONTH, YEAR, CRONTAB, MINUTE
    */
    @SerializedName("DependConfType")
    @Expose
    private String DependConfType;

    /**
    * Dependency Configuration Subordinate Period Type, CURRENT_HOUR, PREVIOUS_HOUR, CURRENT_DAY, PREVIOUS_DAY, PREVIOUS_WEEK, PREVIOUS_FRIDAY, PREVIOUS_WEEKEND, CURRENT_MONTH, PREVIOUS_MONTH, PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH,ALL_MONTH_OF_YEAR,ALL_DAY_OF_YEAR,CURRENT_YEAR,CURRENT,CURRENT_MINUTE,PREVIOUS_MINUTE_CYCLE,PREVIOUS_HOUR_CYCLE
    */
    @SerializedName("SubordinateCyclicType")
    @Expose
    private String SubordinateCyclicType;

    /**
    * WAITING, waiting (default policy) EXECUTING: executing
    */
    @SerializedName("DependencyStrategy")
    @Expose
    private String DependencyStrategy;

    /**
    * Parent Task Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentTask")
    @Expose
    private TaskInnerInfo ParentTask;

    /**
    * Subtask Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SonTask")
    @Expose
    private TaskInnerInfo SonTask;

    /**
     * Get Only five types of periodic execution dependency configurations: HOUR, DAY, WEEK, MONTH, YEAR, CRONTAB, MINUTE 
     * @return DependConfType Only five types of periodic execution dependency configurations: HOUR, DAY, WEEK, MONTH, YEAR, CRONTAB, MINUTE
     */
    public String getDependConfType() {
        return this.DependConfType;
    }

    /**
     * Set Only five types of periodic execution dependency configurations: HOUR, DAY, WEEK, MONTH, YEAR, CRONTAB, MINUTE
     * @param DependConfType Only five types of periodic execution dependency configurations: HOUR, DAY, WEEK, MONTH, YEAR, CRONTAB, MINUTE
     */
    public void setDependConfType(String DependConfType) {
        this.DependConfType = DependConfType;
    }

    /**
     * Get Dependency Configuration Subordinate Period Type, CURRENT_HOUR, PREVIOUS_HOUR, CURRENT_DAY, PREVIOUS_DAY, PREVIOUS_WEEK, PREVIOUS_FRIDAY, PREVIOUS_WEEKEND, CURRENT_MONTH, PREVIOUS_MONTH, PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH,ALL_MONTH_OF_YEAR,ALL_DAY_OF_YEAR,CURRENT_YEAR,CURRENT,CURRENT_MINUTE,PREVIOUS_MINUTE_CYCLE,PREVIOUS_HOUR_CYCLE 
     * @return SubordinateCyclicType Dependency Configuration Subordinate Period Type, CURRENT_HOUR, PREVIOUS_HOUR, CURRENT_DAY, PREVIOUS_DAY, PREVIOUS_WEEK, PREVIOUS_FRIDAY, PREVIOUS_WEEKEND, CURRENT_MONTH, PREVIOUS_MONTH, PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH,ALL_MONTH_OF_YEAR,ALL_DAY_OF_YEAR,CURRENT_YEAR,CURRENT,CURRENT_MINUTE,PREVIOUS_MINUTE_CYCLE,PREVIOUS_HOUR_CYCLE
     */
    public String getSubordinateCyclicType() {
        return this.SubordinateCyclicType;
    }

    /**
     * Set Dependency Configuration Subordinate Period Type, CURRENT_HOUR, PREVIOUS_HOUR, CURRENT_DAY, PREVIOUS_DAY, PREVIOUS_WEEK, PREVIOUS_FRIDAY, PREVIOUS_WEEKEND, CURRENT_MONTH, PREVIOUS_MONTH, PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH,ALL_MONTH_OF_YEAR,ALL_DAY_OF_YEAR,CURRENT_YEAR,CURRENT,CURRENT_MINUTE,PREVIOUS_MINUTE_CYCLE,PREVIOUS_HOUR_CYCLE
     * @param SubordinateCyclicType Dependency Configuration Subordinate Period Type, CURRENT_HOUR, PREVIOUS_HOUR, CURRENT_DAY, PREVIOUS_DAY, PREVIOUS_WEEK, PREVIOUS_FRIDAY, PREVIOUS_WEEKEND, CURRENT_MONTH, PREVIOUS_MONTH, PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH,ALL_MONTH_OF_YEAR,ALL_DAY_OF_YEAR,CURRENT_YEAR,CURRENT,CURRENT_MINUTE,PREVIOUS_MINUTE_CYCLE,PREVIOUS_HOUR_CYCLE
     */
    public void setSubordinateCyclicType(String SubordinateCyclicType) {
        this.SubordinateCyclicType = SubordinateCyclicType;
    }

    /**
     * Get WAITING, waiting (default policy) EXECUTING: executing 
     * @return DependencyStrategy WAITING, waiting (default policy) EXECUTING: executing
     */
    public String getDependencyStrategy() {
        return this.DependencyStrategy;
    }

    /**
     * Set WAITING, waiting (default policy) EXECUTING: executing
     * @param DependencyStrategy WAITING, waiting (default policy) EXECUTING: executing
     */
    public void setDependencyStrategy(String DependencyStrategy) {
        this.DependencyStrategy = DependencyStrategy;
    }

    /**
     * Get Parent Task Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParentTask Parent Task Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskInnerInfo getParentTask() {
        return this.ParentTask;
    }

    /**
     * Set Parent Task Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParentTask Parent Task Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParentTask(TaskInnerInfo ParentTask) {
        this.ParentTask = ParentTask;
    }

    /**
     * Get Subtask Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SonTask Subtask Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskInnerInfo getSonTask() {
        return this.SonTask;
    }

    /**
     * Set Subtask Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SonTask Subtask Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSonTask(TaskInnerInfo SonTask) {
        this.SonTask = SonTask;
    }

    public DependencyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyConfig(DependencyConfig source) {
        if (source.DependConfType != null) {
            this.DependConfType = new String(source.DependConfType);
        }
        if (source.SubordinateCyclicType != null) {
            this.SubordinateCyclicType = new String(source.SubordinateCyclicType);
        }
        if (source.DependencyStrategy != null) {
            this.DependencyStrategy = new String(source.DependencyStrategy);
        }
        if (source.ParentTask != null) {
            this.ParentTask = new TaskInnerInfo(source.ParentTask);
        }
        if (source.SonTask != null) {
            this.SonTask = new TaskInnerInfo(source.SonTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DependConfType", this.DependConfType);
        this.setParamSimple(map, prefix + "SubordinateCyclicType", this.SubordinateCyclicType);
        this.setParamSimple(map, prefix + "DependencyStrategy", this.DependencyStrategy);
        this.setParamObj(map, prefix + "ParentTask.", this.ParentTask);
        this.setParamObj(map, prefix + "SonTask.", this.SonTask);

    }
}

