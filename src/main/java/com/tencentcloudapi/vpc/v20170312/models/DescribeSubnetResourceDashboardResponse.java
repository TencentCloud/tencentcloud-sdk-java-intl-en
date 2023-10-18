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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubnetResourceDashboardResponse extends AbstractModel {

    /**
    * Information of resources returned
    */
    @SerializedName("ResourceStatisticsSet")
    @Expose
    private ResourceStatistics [] ResourceStatisticsSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of resources returned 
     * @return ResourceStatisticsSet Information of resources returned
     */
    public ResourceStatistics [] getResourceStatisticsSet() {
        return this.ResourceStatisticsSet;
    }

    /**
     * Set Information of resources returned
     * @param ResourceStatisticsSet Information of resources returned
     */
    public void setResourceStatisticsSet(ResourceStatistics [] ResourceStatisticsSet) {
        this.ResourceStatisticsSet = ResourceStatisticsSet;
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

    public DescribeSubnetResourceDashboardResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubnetResourceDashboardResponse(DescribeSubnetResourceDashboardResponse source) {
        if (source.ResourceStatisticsSet != null) {
            this.ResourceStatisticsSet = new ResourceStatistics[source.ResourceStatisticsSet.length];
            for (int i = 0; i < source.ResourceStatisticsSet.length; i++) {
                this.ResourceStatisticsSet[i] = new ResourceStatistics(source.ResourceStatisticsSet[i]);
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
        this.setParamArrayObj(map, prefix + "ResourceStatisticsSet.", this.ResourceStatisticsSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

