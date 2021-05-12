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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitJobResponse extends AbstractModel{

    /**
    * When a job is submitted through this API, this parameter is returned and indicates the job ID. Returning the list of job IDs does not mean that the job is parsed/executed successfully. The job state can be queried using the DescribeJob API.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get When a job is submitted through this API, this parameter is returned and indicates the job ID. Returning the list of job IDs does not mean that the job is parsed/executed successfully. The job state can be queried using the DescribeJob API. 
     * @return JobId When a job is submitted through this API, this parameter is returned and indicates the job ID. Returning the list of job IDs does not mean that the job is parsed/executed successfully. The job state can be queried using the DescribeJob API.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set When a job is submitted through this API, this parameter is returned and indicates the job ID. Returning the list of job IDs does not mean that the job is parsed/executed successfully. The job state can be queried using the DescribeJob API.
     * @param JobId When a job is submitted through this API, this parameter is returned and indicates the job ID. Returning the list of job IDs does not mean that the job is parsed/executed successfully. The job state can be queried using the DescribeJob API.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
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

    public SubmitJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitJobResponse(SubmitJobResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

