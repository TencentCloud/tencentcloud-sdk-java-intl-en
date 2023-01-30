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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEscapeEventTypeSummaryResponse extends AbstractModel{

    /**
    * Number of container escape events
    */
    @SerializedName("ContainerEscapeEventCount")
    @Expose
    private Long ContainerEscapeEventCount;

    /**
    * Number of program privilege escalation events
    */
    @SerializedName("ProcessPrivilegeEventCount")
    @Expose
    private Long ProcessPrivilegeEventCount;

    /**
    * Number of risky container events
    */
    @SerializedName("RiskContainerEventCount")
    @Expose
    private Long RiskContainerEventCount;

    /**
    * Number of pending escape events
    */
    @SerializedName("PendingEscapeEventCount")
    @Expose
    private Long PendingEscapeEventCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of container escape events 
     * @return ContainerEscapeEventCount Number of container escape events
     */
    public Long getContainerEscapeEventCount() {
        return this.ContainerEscapeEventCount;
    }

    /**
     * Set Number of container escape events
     * @param ContainerEscapeEventCount Number of container escape events
     */
    public void setContainerEscapeEventCount(Long ContainerEscapeEventCount) {
        this.ContainerEscapeEventCount = ContainerEscapeEventCount;
    }

    /**
     * Get Number of program privilege escalation events 
     * @return ProcessPrivilegeEventCount Number of program privilege escalation events
     */
    public Long getProcessPrivilegeEventCount() {
        return this.ProcessPrivilegeEventCount;
    }

    /**
     * Set Number of program privilege escalation events
     * @param ProcessPrivilegeEventCount Number of program privilege escalation events
     */
    public void setProcessPrivilegeEventCount(Long ProcessPrivilegeEventCount) {
        this.ProcessPrivilegeEventCount = ProcessPrivilegeEventCount;
    }

    /**
     * Get Number of risky container events 
     * @return RiskContainerEventCount Number of risky container events
     */
    public Long getRiskContainerEventCount() {
        return this.RiskContainerEventCount;
    }

    /**
     * Set Number of risky container events
     * @param RiskContainerEventCount Number of risky container events
     */
    public void setRiskContainerEventCount(Long RiskContainerEventCount) {
        this.RiskContainerEventCount = RiskContainerEventCount;
    }

    /**
     * Get Number of pending escape events 
     * @return PendingEscapeEventCount Number of pending escape events
     */
    public Long getPendingEscapeEventCount() {
        return this.PendingEscapeEventCount;
    }

    /**
     * Set Number of pending escape events
     * @param PendingEscapeEventCount Number of pending escape events
     */
    public void setPendingEscapeEventCount(Long PendingEscapeEventCount) {
        this.PendingEscapeEventCount = PendingEscapeEventCount;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEscapeEventTypeSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEscapeEventTypeSummaryResponse(DescribeEscapeEventTypeSummaryResponse source) {
        if (source.ContainerEscapeEventCount != null) {
            this.ContainerEscapeEventCount = new Long(source.ContainerEscapeEventCount);
        }
        if (source.ProcessPrivilegeEventCount != null) {
            this.ProcessPrivilegeEventCount = new Long(source.ProcessPrivilegeEventCount);
        }
        if (source.RiskContainerEventCount != null) {
            this.RiskContainerEventCount = new Long(source.RiskContainerEventCount);
        }
        if (source.PendingEscapeEventCount != null) {
            this.PendingEscapeEventCount = new Long(source.PendingEscapeEventCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerEscapeEventCount", this.ContainerEscapeEventCount);
        this.setParamSimple(map, prefix + "ProcessPrivilegeEventCount", this.ProcessPrivilegeEventCount);
        this.setParamSimple(map, prefix + "RiskContainerEventCount", this.RiskContainerEventCount);
        this.setParamSimple(map, prefix + "PendingEscapeEventCount", this.PendingEscapeEventCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

