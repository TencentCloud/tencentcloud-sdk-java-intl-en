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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkflowsRequest extends AbstractModel {

    /**
    * <p>Workflow ID filter condition, with an array length limit of 100.</p>
    */
    @SerializedName("WorkflowIds")
    @Expose
    private Long [] WorkflowIds;

    /**
    * <p>Workflow status. Value range:</p><li>Enabled: on,</li><li>Disabled: off.</li>If this parameter is not specified, workflow status is not distinguished.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Paging offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Workflow ID filter condition, with an array length limit of 100.</p> 
     * @return WorkflowIds <p>Workflow ID filter condition, with an array length limit of 100.</p>
     */
    public Long [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set <p>Workflow ID filter condition, with an array length limit of 100.</p>
     * @param WorkflowIds <p>Workflow ID filter condition, with an array length limit of 100.</p>
     */
    public void setWorkflowIds(Long [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get <p>Workflow status. Value range:</p><li>Enabled: on,</li><li>Disabled: off.</li>If this parameter is not specified, workflow status is not distinguished. 
     * @return Status <p>Workflow status. Value range:</p><li>Enabled: on,</li><li>Disabled: off.</li>If this parameter is not specified, workflow status is not distinguished.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Workflow status. Value range:</p><li>Enabled: on,</li><li>Disabled: off.</li>If this parameter is not specified, workflow status is not distinguished.
     * @param Status <p>Workflow status. Value range:</p><li>Enabled: on,</li><li>Disabled: off.</li>If this parameter is not specified, workflow status is not distinguished.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Paging offset. Default value: 0.</p> 
     * @return Offset <p>Paging offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset. Default value: 0.</p>
     * @param Offset <p>Paging offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned entries. Default value: 10. Maximum value: 100.</p> 
     * @return Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     * @param Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkflowsRequest(DescribeWorkflowsRequest source) {
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new Long[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new Long(source.WorkflowIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

