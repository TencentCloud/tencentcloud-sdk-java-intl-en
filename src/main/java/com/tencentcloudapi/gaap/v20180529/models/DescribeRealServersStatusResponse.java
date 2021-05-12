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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServersStatusResponse extends AbstractModel{

    /**
    * Quantity of origin server query results returned
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Binding status list of origin servers
    */
    @SerializedName("RealServerStatusSet")
    @Expose
    private RealServerStatus [] RealServerStatusSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Quantity of origin server query results returned 
     * @return TotalCount Quantity of origin server query results returned
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Quantity of origin server query results returned
     * @param TotalCount Quantity of origin server query results returned
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Binding status list of origin servers 
     * @return RealServerStatusSet Binding status list of origin servers
     */
    public RealServerStatus [] getRealServerStatusSet() {
        return this.RealServerStatusSet;
    }

    /**
     * Set Binding status list of origin servers
     * @param RealServerStatusSet Binding status list of origin servers
     */
    public void setRealServerStatusSet(RealServerStatus [] RealServerStatusSet) {
        this.RealServerStatusSet = RealServerStatusSet;
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

    public DescribeRealServersStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealServersStatusResponse(DescribeRealServersStatusResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RealServerStatusSet != null) {
            this.RealServerStatusSet = new RealServerStatus[source.RealServerStatusSet.length];
            for (int i = 0; i < source.RealServerStatusSet.length; i++) {
                this.RealServerStatusSet[i] = new RealServerStatus(source.RealServerStatusSet[i]);
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
        this.setParamArrayObj(map, prefix + "RealServerStatusSet.", this.RealServerStatusSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

