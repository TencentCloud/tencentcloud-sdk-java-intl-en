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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryByProjectResponse extends AbstractModel{

    /**
    * Indicates whether or not the data is ready. 0 = not ready, 1 = ready.
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * Detailed cost distribution for all projects
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("SummaryOverview")
    @Expose
    private ProjectSummaryOverviewItem [] SummaryOverview;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Indicates whether or not the data is ready. 0 = not ready, 1 = ready. 
     * @return Ready Indicates whether or not the data is ready. 0 = not ready, 1 = ready.
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set Indicates whether or not the data is ready. 0 = not ready, 1 = ready.
     * @param Ready Indicates whether or not the data is ready. 0 = not ready, 1 = ready.
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get Detailed cost distribution for all projects
Note: This field may return null, indicating that no valid value was found. 
     * @return SummaryOverview Detailed cost distribution for all projects
Note: This field may return null, indicating that no valid value was found.
     */
    public ProjectSummaryOverviewItem [] getSummaryOverview() {
        return this.SummaryOverview;
    }

    /**
     * Set Detailed cost distribution for all projects
Note: This field may return null, indicating that no valid value was found.
     * @param SummaryOverview Detailed cost distribution for all projects
Note: This field may return null, indicating that no valid value was found.
     */
    public void setSummaryOverview(ProjectSummaryOverviewItem [] SummaryOverview) {
        this.SummaryOverview = SummaryOverview;
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
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamArrayObj(map, prefix + "SummaryOverview.", this.SummaryOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

