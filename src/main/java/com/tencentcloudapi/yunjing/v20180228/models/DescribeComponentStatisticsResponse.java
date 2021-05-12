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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComponentStatisticsResponse extends AbstractModel{

    /**
    * Total number of records in component statistics list.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Component statistics list data array.
    */
    @SerializedName("ComponentStatistics")
    @Expose
    private ComponentStatistics [] ComponentStatistics;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of records in component statistics list. 
     * @return TotalCount Total number of records in component statistics list.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records in component statistics list.
     * @param TotalCount Total number of records in component statistics list.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Component statistics list data array. 
     * @return ComponentStatistics Component statistics list data array.
     */
    public ComponentStatistics [] getComponentStatistics() {
        return this.ComponentStatistics;
    }

    /**
     * Set Component statistics list data array.
     * @param ComponentStatistics Component statistics list data array.
     */
    public void setComponentStatistics(ComponentStatistics [] ComponentStatistics) {
        this.ComponentStatistics = ComponentStatistics;
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

    public DescribeComponentStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComponentStatisticsResponse(DescribeComponentStatisticsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ComponentStatistics != null) {
            this.ComponentStatistics = new ComponentStatistics[source.ComponentStatistics.length];
            for (int i = 0; i < source.ComponentStatistics.length; i++) {
                this.ComponentStatistics[i] = new ComponentStatistics(source.ComponentStatistics[i]);
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
        this.setParamArrayObj(map, prefix + "ComponentStatistics.", this.ComponentStatistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

