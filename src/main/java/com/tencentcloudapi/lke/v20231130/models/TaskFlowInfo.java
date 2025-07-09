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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFlowInfo extends AbstractModel {

    /**
    * Task flow ID.
    */
    @SerializedName("TaskFlowId")
    @Expose
    private String TaskFlowId;

    /**
    * Task flow name.
    */
    @SerializedName("TaskFlowName")
    @Expose
    private String TaskFlowName;

    /**
    * Rewrite results of query.
    */
    @SerializedName("QueryRewrite")
    @Expose
    private String QueryRewrite;

    /**
    * Hit intent.
    */
    @SerializedName("HitIntent")
    @Expose
    private String HitIntent;

    /**
    * Task flow response type.
0: Task flow response.
1: Silent task flow.
2: Pull back script of workflow.
3: Custom response of task flow.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Task flow ID. 
     * @return TaskFlowId Task flow ID.
     */
    public String getTaskFlowId() {
        return this.TaskFlowId;
    }

    /**
     * Set Task flow ID.
     * @param TaskFlowId Task flow ID.
     */
    public void setTaskFlowId(String TaskFlowId) {
        this.TaskFlowId = TaskFlowId;
    }

    /**
     * Get Task flow name. 
     * @return TaskFlowName Task flow name.
     */
    public String getTaskFlowName() {
        return this.TaskFlowName;
    }

    /**
     * Set Task flow name.
     * @param TaskFlowName Task flow name.
     */
    public void setTaskFlowName(String TaskFlowName) {
        this.TaskFlowName = TaskFlowName;
    }

    /**
     * Get Rewrite results of query. 
     * @return QueryRewrite Rewrite results of query.
     */
    public String getQueryRewrite() {
        return this.QueryRewrite;
    }

    /**
     * Set Rewrite results of query.
     * @param QueryRewrite Rewrite results of query.
     */
    public void setQueryRewrite(String QueryRewrite) {
        this.QueryRewrite = QueryRewrite;
    }

    /**
     * Get Hit intent. 
     * @return HitIntent Hit intent.
     */
    public String getHitIntent() {
        return this.HitIntent;
    }

    /**
     * Set Hit intent.
     * @param HitIntent Hit intent.
     */
    public void setHitIntent(String HitIntent) {
        this.HitIntent = HitIntent;
    }

    /**
     * Get Task flow response type.
0: Task flow response.
1: Silent task flow.
2: Pull back script of workflow.
3: Custom response of task flow. 
     * @return Type Task flow response type.
0: Task flow response.
1: Silent task flow.
2: Pull back script of workflow.
3: Custom response of task flow.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Task flow response type.
0: Task flow response.
1: Silent task flow.
2: Pull back script of workflow.
3: Custom response of task flow.
     * @param Type Task flow response type.
0: Task flow response.
1: Silent task flow.
2: Pull back script of workflow.
3: Custom response of task flow.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public TaskFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFlowInfo(TaskFlowInfo source) {
        if (source.TaskFlowId != null) {
            this.TaskFlowId = new String(source.TaskFlowId);
        }
        if (source.TaskFlowName != null) {
            this.TaskFlowName = new String(source.TaskFlowName);
        }
        if (source.QueryRewrite != null) {
            this.QueryRewrite = new String(source.QueryRewrite);
        }
        if (source.HitIntent != null) {
            this.HitIntent = new String(source.HitIntent);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskFlowId", this.TaskFlowId);
        this.setParamSimple(map, prefix + "TaskFlowName", this.TaskFlowName);
        this.setParamSimple(map, prefix + "QueryRewrite", this.QueryRewrite);
        this.setParamSimple(map, prefix + "HitIntent", this.HitIntent);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

