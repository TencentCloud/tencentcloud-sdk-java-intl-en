/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleRealServersResponse extends AbstractModel {

    /**
    * Quantity of origin servers that can be bound
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information list of origin servers that can be bound
    */
    @SerializedName("RealServerSet")
    @Expose
    private RealServer [] RealServerSet;

    /**
    * Quantity of bound origin servers
    */
    @SerializedName("BindRealServerTotalCount")
    @Expose
    private Long BindRealServerTotalCount;

    /**
    * Bound origin server information list
    */
    @SerializedName("BindRealServerSet")
    @Expose
    private BindRealServer [] BindRealServerSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Quantity of origin servers that can be bound 
     * @return TotalCount Quantity of origin servers that can be bound
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Quantity of origin servers that can be bound
     * @param TotalCount Quantity of origin servers that can be bound
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information list of origin servers that can be bound 
     * @return RealServerSet Information list of origin servers that can be bound
     */
    public RealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * Set Information list of origin servers that can be bound
     * @param RealServerSet Information list of origin servers that can be bound
     */
    public void setRealServerSet(RealServer [] RealServerSet) {
        this.RealServerSet = RealServerSet;
    }

    /**
     * Get Quantity of bound origin servers 
     * @return BindRealServerTotalCount Quantity of bound origin servers
     */
    public Long getBindRealServerTotalCount() {
        return this.BindRealServerTotalCount;
    }

    /**
     * Set Quantity of bound origin servers
     * @param BindRealServerTotalCount Quantity of bound origin servers
     */
    public void setBindRealServerTotalCount(Long BindRealServerTotalCount) {
        this.BindRealServerTotalCount = BindRealServerTotalCount;
    }

    /**
     * Get Bound origin server information list 
     * @return BindRealServerSet Bound origin server information list
     */
    public BindRealServer [] getBindRealServerSet() {
        return this.BindRealServerSet;
    }

    /**
     * Set Bound origin server information list
     * @param BindRealServerSet Bound origin server information list
     */
    public void setBindRealServerSet(BindRealServer [] BindRealServerSet) {
        this.BindRealServerSet = BindRealServerSet;
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

    public DescribeRuleRealServersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleRealServersResponse(DescribeRuleRealServersResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RealServerSet != null) {
            this.RealServerSet = new RealServer[source.RealServerSet.length];
            for (int i = 0; i < source.RealServerSet.length; i++) {
                this.RealServerSet[i] = new RealServer(source.RealServerSet[i]);
            }
        }
        if (source.BindRealServerTotalCount != null) {
            this.BindRealServerTotalCount = new Long(source.BindRealServerTotalCount);
        }
        if (source.BindRealServerSet != null) {
            this.BindRealServerSet = new BindRealServer[source.BindRealServerSet.length];
            for (int i = 0; i < source.BindRealServerSet.length; i++) {
                this.BindRealServerSet[i] = new BindRealServer(source.BindRealServerSet[i]);
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
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "BindRealServerTotalCount", this.BindRealServerTotalCount);
        this.setParamArrayObj(map, prefix + "BindRealServerSet.", this.BindRealServerSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

