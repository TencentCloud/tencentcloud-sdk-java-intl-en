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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBandwidthPackageResourcesResponse extends AbstractModel{

    /**
    * The number of eligible resources in the bandwidth package.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The list of resources in the bandwidth package.
    */
    @SerializedName("ResourceSet")
    @Expose
    private Resource [] ResourceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of eligible resources in the bandwidth package. 
     * @return TotalCount The number of eligible resources in the bandwidth package.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of eligible resources in the bandwidth package.
     * @param TotalCount The number of eligible resources in the bandwidth package.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The list of resources in the bandwidth package. 
     * @return ResourceSet The list of resources in the bandwidth package.
     */
    public Resource [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * Set The list of resources in the bandwidth package.
     * @param ResourceSet The list of resources in the bandwidth package.
     */
    public void setResourceSet(Resource [] ResourceSet) {
        this.ResourceSet = ResourceSet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

