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

public class DescribeVpcEndPointServiceWhiteListResponse extends AbstractModel {

    /**
    * Array of allowed endpoint services
    */
    @SerializedName("VpcEndpointServiceUserSet")
    @Expose
    private VpcEndPointServiceUser [] VpcEndpointServiceUserSet;

    /**
    * Number of matched allowlists
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Array of allowed endpoint services 
     * @return VpcEndpointServiceUserSet Array of allowed endpoint services
     */
    public VpcEndPointServiceUser [] getVpcEndpointServiceUserSet() {
        return this.VpcEndpointServiceUserSet;
    }

    /**
     * Set Array of allowed endpoint services
     * @param VpcEndpointServiceUserSet Array of allowed endpoint services
     */
    public void setVpcEndpointServiceUserSet(VpcEndPointServiceUser [] VpcEndpointServiceUserSet) {
        this.VpcEndpointServiceUserSet = VpcEndpointServiceUserSet;
    }

    /**
     * Get Number of matched allowlists 
     * @return TotalCount Number of matched allowlists
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of matched allowlists
     * @param TotalCount Number of matched allowlists
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeVpcEndPointServiceWhiteListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcEndPointServiceWhiteListResponse(DescribeVpcEndPointServiceWhiteListResponse source) {
        if (source.VpcEndpointServiceUserSet != null) {
            this.VpcEndpointServiceUserSet = new VpcEndPointServiceUser[source.VpcEndpointServiceUserSet.length];
            for (int i = 0; i < source.VpcEndpointServiceUserSet.length; i++) {
                this.VpcEndpointServiceUserSet[i] = new VpcEndPointServiceUser(source.VpcEndpointServiceUserSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VpcEndpointServiceUserSet.", this.VpcEndpointServiceUserSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

