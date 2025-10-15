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

public class DeleteOpsAlarmRuleRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Alarm Rule Unique ID. Obtained from the response of the CreateAlarmRule API. Either this field or AlarmRuleName must be provided.
    */
    @SerializedName("AlarmRuleId")
    @Expose
    private String AlarmRuleId;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Alarm Rule Unique ID. Obtained from the response of the CreateAlarmRule API. Either this field or AlarmRuleName must be provided. 
     * @return AlarmRuleId Alarm Rule Unique ID. Obtained from the response of the CreateAlarmRule API. Either this field or AlarmRuleName must be provided.
     */
    public String getAlarmRuleId() {
        return this.AlarmRuleId;
    }

    /**
     * Set Alarm Rule Unique ID. Obtained from the response of the CreateAlarmRule API. Either this field or AlarmRuleName must be provided.
     * @param AlarmRuleId Alarm Rule Unique ID. Obtained from the response of the CreateAlarmRule API. Either this field or AlarmRuleName must be provided.
     */
    public void setAlarmRuleId(String AlarmRuleId) {
        this.AlarmRuleId = AlarmRuleId;
    }

    public DeleteOpsAlarmRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOpsAlarmRuleRequest(DeleteOpsAlarmRuleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AlarmRuleId != null) {
            this.AlarmRuleId = new String(source.AlarmRuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AlarmRuleId", this.AlarmRuleId);

    }
}

