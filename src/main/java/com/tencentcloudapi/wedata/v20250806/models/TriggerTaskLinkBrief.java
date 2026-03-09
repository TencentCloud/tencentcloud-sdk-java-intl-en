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

public class TriggerTaskLinkBrief extends AbstractModel {

    /**
    * Connection ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LinkId")
    @Expose
    private String LinkId;

    /**
    * Workflow ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow version ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowVersionId")
    @Expose
    private String WorkflowVersionId;

    /**
    * Upstream task ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpstreamTaskId")
    @Expose
    private String UpstreamTaskId;

    /**
    * Downstream task ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DownstreamTaskId")
    @Expose
    private String DownstreamTaskId;

    /**
     * Get Connection ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LinkId Connection ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLinkId() {
        return this.LinkId;
    }

    /**
     * Set Connection ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LinkId Connection ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLinkId(String LinkId) {
        this.LinkId = LinkId;
    }

    /**
     * Get Workflow ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowId Workflow ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowId Workflow ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow version ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowVersionId Workflow version ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowVersionId() {
        return this.WorkflowVersionId;
    }

    /**
     * Set Workflow version ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowVersionId Workflow version ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowVersionId(String WorkflowVersionId) {
        this.WorkflowVersionId = WorkflowVersionId;
    }

    /**
     * Get Upstream task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpstreamTaskId Upstream task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpstreamTaskId() {
        return this.UpstreamTaskId;
    }

    /**
     * Set Upstream task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpstreamTaskId Upstream task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpstreamTaskId(String UpstreamTaskId) {
        this.UpstreamTaskId = UpstreamTaskId;
    }

    /**
     * Get Downstream task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DownstreamTaskId Downstream task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDownstreamTaskId() {
        return this.DownstreamTaskId;
    }

    /**
     * Set Downstream task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DownstreamTaskId Downstream task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDownstreamTaskId(String DownstreamTaskId) {
        this.DownstreamTaskId = DownstreamTaskId;
    }

    public TriggerTaskLinkBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskLinkBrief(TriggerTaskLinkBrief source) {
        if (source.LinkId != null) {
            this.LinkId = new String(source.LinkId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowVersionId != null) {
            this.WorkflowVersionId = new String(source.WorkflowVersionId);
        }
        if (source.UpstreamTaskId != null) {
            this.UpstreamTaskId = new String(source.UpstreamTaskId);
        }
        if (source.DownstreamTaskId != null) {
            this.DownstreamTaskId = new String(source.DownstreamTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinkId", this.LinkId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowVersionId", this.WorkflowVersionId);
        this.setParamSimple(map, prefix + "UpstreamTaskId", this.UpstreamTaskId);
        this.setParamSimple(map, prefix + "DownstreamTaskId", this.DownstreamTaskId);

    }
}

