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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePurgeTaskResponse extends AbstractModel {

    /**
    * ID of the task.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * List of failed tasks and reasons.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailedList")
    @Expose
    private FailReason [] FailedList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the task. 
     * @return JobId ID of the task.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set ID of the task.
     * @param JobId ID of the task.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get List of failed tasks and reasons.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailedList List of failed tasks and reasons.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FailReason [] getFailedList() {
        return this.FailedList;
    }

    /**
     * Set List of failed tasks and reasons.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailedList List of failed tasks and reasons.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailedList(FailReason [] FailedList) {
        this.FailedList = FailedList;
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

    public CreatePurgeTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePurgeTaskResponse(CreatePurgeTaskResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.FailedList != null) {
            this.FailedList = new FailReason[source.FailedList.length];
            for (int i = 0; i < source.FailedList.length; i++) {
                this.FailedList[i] = new FailReason(source.FailedList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArrayObj(map, prefix + "FailedList.", this.FailedList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

