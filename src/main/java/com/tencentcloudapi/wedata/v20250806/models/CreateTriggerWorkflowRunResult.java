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

public class CreateTriggerWorkflowRunResult extends AbstractModel {

    /**
    * Workflow execution id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowExecutionId")
    @Expose
    private String WorkflowExecutionId;

    /**
     * Get Workflow execution id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowExecutionId Workflow execution id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowExecutionId() {
        return this.WorkflowExecutionId;
    }

    /**
     * Set Workflow execution id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowExecutionId Workflow execution id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowExecutionId(String WorkflowExecutionId) {
        this.WorkflowExecutionId = WorkflowExecutionId;
    }

    public CreateTriggerWorkflowRunResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerWorkflowRunResult(CreateTriggerWorkflowRunResult source) {
        if (source.WorkflowExecutionId != null) {
            this.WorkflowExecutionId = new String(source.WorkflowExecutionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowExecutionId", this.WorkflowExecutionId);

    }
}

