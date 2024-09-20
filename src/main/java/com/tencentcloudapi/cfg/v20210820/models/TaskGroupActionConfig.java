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

public class TaskGroupActionConfig extends AbstractModel {

    /**
    * Order of this action in the action group. The entire order starts from 1. If this parameter is left blank or set to an invalid value, the action whose parameters need to be modified in the template cannot be matched.
    */
    @SerializedName("TaskGroupActionOrder")
    @Expose
    private Long TaskGroupActionOrder;

    /**
    * General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default.
    */
    @SerializedName("TaskGroupActionGeneralConfiguration")
    @Expose
    private String TaskGroupActionGeneralConfiguration;

    /**
    * Custom action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default.
    */
    @SerializedName("TaskGroupActionCustomConfiguration")
    @Expose
    private String TaskGroupActionCustomConfiguration;

    /**
     * Get Order of this action in the action group. The entire order starts from 1. If this parameter is left blank or set to an invalid value, the action whose parameters need to be modified in the template cannot be matched. 
     * @return TaskGroupActionOrder Order of this action in the action group. The entire order starts from 1. If this parameter is left blank or set to an invalid value, the action whose parameters need to be modified in the template cannot be matched.
     */
    public Long getTaskGroupActionOrder() {
        return this.TaskGroupActionOrder;
    }

    /**
     * Set Order of this action in the action group. The entire order starts from 1. If this parameter is left blank or set to an invalid value, the action whose parameters need to be modified in the template cannot be matched.
     * @param TaskGroupActionOrder Order of this action in the action group. The entire order starts from 1. If this parameter is left blank or set to an invalid value, the action whose parameters need to be modified in the template cannot be matched.
     */
    public void setTaskGroupActionOrder(Long TaskGroupActionOrder) {
        this.TaskGroupActionOrder = TaskGroupActionOrder;
    }

    /**
     * Get General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default. 
     * @return TaskGroupActionGeneralConfiguration General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default.
     */
    public String getTaskGroupActionGeneralConfiguration() {
        return this.TaskGroupActionGeneralConfiguration;
    }

    /**
     * Set General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default.
     * @param TaskGroupActionGeneralConfiguration General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default.
     */
    public void setTaskGroupActionGeneralConfiguration(String TaskGroupActionGeneralConfiguration) {
        this.TaskGroupActionGeneralConfiguration = TaskGroupActionGeneralConfiguration;
    }

    /**
     * Get Custom action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default. 
     * @return TaskGroupActionCustomConfiguration Custom action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default.
     */
    public String getTaskGroupActionCustomConfiguration() {
        return this.TaskGroupActionCustomConfiguration;
    }

    /**
     * Set Custom action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default.
     * @param TaskGroupActionCustomConfiguration Custom action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the template details query API. If this field is left blank, action parameters in the template are used by default.
     */
    public void setTaskGroupActionCustomConfiguration(String TaskGroupActionCustomConfiguration) {
        this.TaskGroupActionCustomConfiguration = TaskGroupActionCustomConfiguration;
    }

    public TaskGroupActionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupActionConfig(TaskGroupActionConfig source) {
        if (source.TaskGroupActionOrder != null) {
            this.TaskGroupActionOrder = new Long(source.TaskGroupActionOrder);
        }
        if (source.TaskGroupActionGeneralConfiguration != null) {
            this.TaskGroupActionGeneralConfiguration = new String(source.TaskGroupActionGeneralConfiguration);
        }
        if (source.TaskGroupActionCustomConfiguration != null) {
            this.TaskGroupActionCustomConfiguration = new String(source.TaskGroupActionCustomConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupActionOrder", this.TaskGroupActionOrder);
        this.setParamSimple(map, prefix + "TaskGroupActionGeneralConfiguration", this.TaskGroupActionGeneralConfiguration);
        this.setParamSimple(map, prefix + "TaskGroupActionCustomConfiguration", this.TaskGroupActionCustomConfiguration);

    }
}

