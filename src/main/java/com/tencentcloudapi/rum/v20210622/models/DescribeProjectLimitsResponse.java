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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectLimitsResponse extends AbstractModel{

    /**
    * Array of reporting rates
    */
    @SerializedName("ProjectLimitSet")
    @Expose
    private ProjectLimit [] ProjectLimitSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Array of reporting rates 
     * @return ProjectLimitSet Array of reporting rates
     */
    public ProjectLimit [] getProjectLimitSet() {
        return this.ProjectLimitSet;
    }

    /**
     * Set Array of reporting rates
     * @param ProjectLimitSet Array of reporting rates
     */
    public void setProjectLimitSet(ProjectLimit [] ProjectLimitSet) {
        this.ProjectLimitSet = ProjectLimitSet;
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

    public DescribeProjectLimitsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectLimitsResponse(DescribeProjectLimitsResponse source) {
        if (source.ProjectLimitSet != null) {
            this.ProjectLimitSet = new ProjectLimit[source.ProjectLimitSet.length];
            for (int i = 0; i < source.ProjectLimitSet.length; i++) {
                this.ProjectLimitSet[i] = new ProjectLimit(source.ProjectLimitSet[i]);
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
        this.setParamArrayObj(map, prefix + "ProjectLimitSet.", this.ProjectLimitSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

