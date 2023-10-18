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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmPolicyTriggerTask extends AbstractModel {

    /**
    * Triggered task type. Valid value: AS (auto scaling)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Configuration information in JSON format, such as {"Key1":"Value1","Key2":"Value2"}
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskConfig")
    @Expose
    private String TaskConfig;

    /**
     * Get Triggered task type. Valid value: AS (auto scaling)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Type Triggered task type. Valid value: AS (auto scaling)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Triggered task type. Valid value: AS (auto scaling)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Type Triggered task type. Valid value: AS (auto scaling)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Configuration information in JSON format, such as {"Key1":"Value1","Key2":"Value2"}
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskConfig Configuration information in JSON format, such as {"Key1":"Value1","Key2":"Value2"}
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskConfig() {
        return this.TaskConfig;
    }

    /**
     * Set Configuration information in JSON format, such as {"Key1":"Value1","Key2":"Value2"}
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskConfig Configuration information in JSON format, such as {"Key1":"Value1","Key2":"Value2"}
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskConfig(String TaskConfig) {
        this.TaskConfig = TaskConfig;
    }

    public AlarmPolicyTriggerTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicyTriggerTask(AlarmPolicyTriggerTask source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TaskConfig != null) {
            this.TaskConfig = new String(source.TaskConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskConfig", this.TaskConfig);

    }
}

