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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationJobsResponse extends AbstractModel{

    /**
    * Number of migration tasks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Migration task list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobList")
    @Expose
    private JobItem [] JobList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of migration tasks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of migration tasks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of migration tasks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of migration tasks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Migration task list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobList Migration task list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public JobItem [] getJobList() {
        return this.JobList;
    }

    /**
     * Set Migration task list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobList Migration task list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobList(JobItem [] JobList) {
        this.JobList = JobList;
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

    public DescribeMigrationJobsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationJobsResponse(DescribeMigrationJobsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.JobList != null) {
            this.JobList = new JobItem[source.JobList.length];
            for (int i = 0; i < source.JobList.length; i++) {
                this.JobList[i] = new JobItem(source.JobList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "JobList.", this.JobList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

