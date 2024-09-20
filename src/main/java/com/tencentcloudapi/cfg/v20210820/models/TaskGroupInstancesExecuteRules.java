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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupInstancesExecuteRules extends AbstractModel {

    /**
    * Instance selection mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstancesExecuteMode")
    @Expose
    private Long TaskGroupInstancesExecuteMode;

    /**
    * Proportion of selected machines in selection by proportion mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstancesExecutePercent")
    @Expose
    private Long TaskGroupInstancesExecutePercent;

    /**
    * Number of selected machines in selection by quantity mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstancesExecuteNum")
    @Expose
    private Long TaskGroupInstancesExecuteNum;

    /**
     * Get Instance selection mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstancesExecuteMode Instance selection mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskGroupInstancesExecuteMode() {
        return this.TaskGroupInstancesExecuteMode;
    }

    /**
     * Set Instance selection mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstancesExecuteMode Instance selection mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstancesExecuteMode(Long TaskGroupInstancesExecuteMode) {
        this.TaskGroupInstancesExecuteMode = TaskGroupInstancesExecuteMode;
    }

    /**
     * Get Proportion of selected machines in selection by proportion mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstancesExecutePercent Proportion of selected machines in selection by proportion mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskGroupInstancesExecutePercent() {
        return this.TaskGroupInstancesExecutePercent;
    }

    /**
     * Set Proportion of selected machines in selection by proportion mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstancesExecutePercent Proportion of selected machines in selection by proportion mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstancesExecutePercent(Long TaskGroupInstancesExecutePercent) {
        this.TaskGroupInstancesExecutePercent = TaskGroupInstancesExecutePercent;
    }

    /**
     * Get Number of selected machines in selection by quantity mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstancesExecuteNum Number of selected machines in selection by quantity mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskGroupInstancesExecuteNum() {
        return this.TaskGroupInstancesExecuteNum;
    }

    /**
     * Set Number of selected machines in selection by quantity mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstancesExecuteNum Number of selected machines in selection by quantity mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstancesExecuteNum(Long TaskGroupInstancesExecuteNum) {
        this.TaskGroupInstancesExecuteNum = TaskGroupInstancesExecuteNum;
    }

    public TaskGroupInstancesExecuteRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupInstancesExecuteRules(TaskGroupInstancesExecuteRules source) {
        if (source.TaskGroupInstancesExecuteMode != null) {
            this.TaskGroupInstancesExecuteMode = new Long(source.TaskGroupInstancesExecuteMode);
        }
        if (source.TaskGroupInstancesExecutePercent != null) {
            this.TaskGroupInstancesExecutePercent = new Long(source.TaskGroupInstancesExecutePercent);
        }
        if (source.TaskGroupInstancesExecuteNum != null) {
            this.TaskGroupInstancesExecuteNum = new Long(source.TaskGroupInstancesExecuteNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecuteMode", this.TaskGroupInstancesExecuteMode);
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecutePercent", this.TaskGroupInstancesExecutePercent);
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecuteNum", this.TaskGroupInstancesExecuteNum);

    }
}

