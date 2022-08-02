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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkAppJobResponse extends AbstractModel{

    /**
    * Spark job details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Job")
    @Expose
    private SparkJobInfo Job;

    /**
    * Whether the queried Spark job exists
    */
    @SerializedName("IsExists")
    @Expose
    private Boolean IsExists;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Spark job details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Job Spark job details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SparkJobInfo getJob() {
        return this.Job;
    }

    /**
     * Set Spark job details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Job Spark job details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJob(SparkJobInfo Job) {
        this.Job = Job;
    }

    /**
     * Get Whether the queried Spark job exists 
     * @return IsExists Whether the queried Spark job exists
     */
    public Boolean getIsExists() {
        return this.IsExists;
    }

    /**
     * Set Whether the queried Spark job exists
     * @param IsExists Whether the queried Spark job exists
     */
    public void setIsExists(Boolean IsExists) {
        this.IsExists = IsExists;
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

    public DescribeSparkAppJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppJobResponse(DescribeSparkAppJobResponse source) {
        if (source.Job != null) {
            this.Job = new SparkJobInfo(source.Job);
        }
        if (source.IsExists != null) {
            this.IsExists = new Boolean(source.IsExists);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Job.", this.Job);
        this.setParamSimple(map, prefix + "IsExists", this.IsExists);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

