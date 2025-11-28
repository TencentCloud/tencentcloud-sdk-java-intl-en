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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIdleLoadBalancersRequest extends AbstractModel {

    /**
    * Data offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned CLB instances. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The Region of the cloud load balancer can be obtained through the `RegionSet.Region` field in the API return value of [DescribeRegions](https://www.tencentcloud.comom/document/product/1596/77930?from_cn_redirect=1).
    */
    @SerializedName("LoadBalancerRegion")
    @Expose
    private String LoadBalancerRegion;

    /**
     * Get Data offset. Default value: 0. 
     * @return Offset Data offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. Default value: 0.
     * @param Offset Data offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned CLB instances. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned CLB instances. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned CLB instances. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned CLB instances. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The Region of the cloud load balancer can be obtained through the `RegionSet.Region` field in the API return value of [DescribeRegions](https://www.tencentcloud.comom/document/product/1596/77930?from_cn_redirect=1). 
     * @return LoadBalancerRegion The Region of the cloud load balancer can be obtained through the `RegionSet.Region` field in the API return value of [DescribeRegions](https://www.tencentcloud.comom/document/product/1596/77930?from_cn_redirect=1).
     */
    public String getLoadBalancerRegion() {
        return this.LoadBalancerRegion;
    }

    /**
     * Set The Region of the cloud load balancer can be obtained through the `RegionSet.Region` field in the API return value of [DescribeRegions](https://www.tencentcloud.comom/document/product/1596/77930?from_cn_redirect=1).
     * @param LoadBalancerRegion The Region of the cloud load balancer can be obtained through the `RegionSet.Region` field in the API return value of [DescribeRegions](https://www.tencentcloud.comom/document/product/1596/77930?from_cn_redirect=1).
     */
    public void setLoadBalancerRegion(String LoadBalancerRegion) {
        this.LoadBalancerRegion = LoadBalancerRegion;
    }

    public DescribeIdleLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIdleLoadBalancersRequest(DescribeIdleLoadBalancersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LoadBalancerRegion != null) {
            this.LoadBalancerRegion = new String(source.LoadBalancerRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LoadBalancerRegion", this.LoadBalancerRegion);

    }
}

