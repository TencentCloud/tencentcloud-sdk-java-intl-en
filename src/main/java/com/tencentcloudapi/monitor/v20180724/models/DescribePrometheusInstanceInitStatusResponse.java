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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusInstanceInitStatusResponse extends AbstractModel{

    /**
    * Instance initialization status. Valid values:
`uninitialized` 
`initializing`
`running`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Initialize task steps
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Steps")
    @Expose
    private TaskStepInfo [] Steps;

    /**
    * EKS cluster ID of the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EksClusterId")
    @Expose
    private String EksClusterId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance initialization status. Valid values:
`uninitialized` 
`initializing`
`running`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Instance initialization status. Valid values:
`uninitialized` 
`initializing`
`running`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance initialization status. Valid values:
`uninitialized` 
`initializing`
`running`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Instance initialization status. Valid values:
`uninitialized` 
`initializing`
`running`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Initialize task steps
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Steps Initialize task steps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskStepInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set Initialize task steps
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Steps Initialize task steps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSteps(TaskStepInfo [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get EKS cluster ID of the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EksClusterId EKS cluster ID of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEksClusterId() {
        return this.EksClusterId;
    }

    /**
     * Set EKS cluster ID of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EksClusterId EKS cluster ID of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEksClusterId(String EksClusterId) {
        this.EksClusterId = EksClusterId;
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

    public DescribePrometheusInstanceInitStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstanceInitStatusResponse(DescribePrometheusInstanceInitStatusResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Steps != null) {
            this.Steps = new TaskStepInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new TaskStepInfo(source.Steps[i]);
            }
        }
        if (source.EksClusterId != null) {
            this.EksClusterId = new String(source.EksClusterId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "EksClusterId", this.EksClusterId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

