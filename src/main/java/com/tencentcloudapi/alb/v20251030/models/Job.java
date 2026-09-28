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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel {

    /**
    * Operation interface name.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * Task flow Id
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * Task request Id.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * Resource ID list.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * Task status. Valid values: `Processing`, `Succeeded`, `Failed`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Operation interface name. 
     * @return ApiName Operation interface name.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set Operation interface name.
     * @param ApiName Operation interface name.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get Task flow Id 
     * @return FlowId Task flow Id
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Task flow Id
     * @param FlowId Task flow Id
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Task request Id. 
     * @return RequestId Task request Id.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Task request Id.
     * @param RequestId Task request Id.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get Resource ID list. 
     * @return ResourceIds Resource ID list.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID list.
     * @param ResourceIds Resource ID list.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Task status. Valid values: `Processing`, `Succeeded`, `Failed`. 
     * @return Status Task status. Valid values: `Processing`, `Succeeded`, `Failed`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: `Processing`, `Succeeded`, `Failed`.
     * @param Status Task status. Valid values: `Processing`, `Succeeded`, `Failed`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

