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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCheckSimilarPersonJobIdListResponse extends AbstractModel{

    /**
    * List of duplicate person check task information.
    */
    @SerializedName("JobIdInfos")
    @Expose
    private JobIdInfo [] JobIdInfos;

    /**
    * Total number of duplicate check tasks.
    */
    @SerializedName("JobIdNum")
    @Expose
    private Long JobIdNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of duplicate person check task information. 
     * @return JobIdInfos List of duplicate person check task information.
     */
    public JobIdInfo [] getJobIdInfos() {
        return this.JobIdInfos;
    }

    /**
     * Set List of duplicate person check task information.
     * @param JobIdInfos List of duplicate person check task information.
     */
    public void setJobIdInfos(JobIdInfo [] JobIdInfos) {
        this.JobIdInfos = JobIdInfos;
    }

    /**
     * Get Total number of duplicate check tasks. 
     * @return JobIdNum Total number of duplicate check tasks.
     */
    public Long getJobIdNum() {
        return this.JobIdNum;
    }

    /**
     * Set Total number of duplicate check tasks.
     * @param JobIdNum Total number of duplicate check tasks.
     */
    public void setJobIdNum(Long JobIdNum) {
        this.JobIdNum = JobIdNum;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "JobIdInfos.", this.JobIdInfos);
        this.setParamSimple(map, prefix + "JobIdNum", this.JobIdNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

