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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardLoadBalancer extends AbstractModel {

    /**
    * ID of the load balancer. this parameter is required as an input parameter. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB listener ID. as an input parameter, this parameter is required. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Target rule attribute list. as an input parameter, this parameter is required.
    */
    @SerializedName("TargetAttributes")
    @Expose
    private TargetAttribute [] TargetAttributes;

    /**
    * The forwarding rule ID. note: this parameter is required for layer-7 (http/https) listeners. it can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get ID of the load balancer. this parameter is required as an input parameter. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api. 
     * @return LoadBalancerId ID of the load balancer. this parameter is required as an input parameter. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the load balancer. this parameter is required as an input parameter. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     * @param LoadBalancerId ID of the load balancer. this parameter is required as an input parameter. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB listener ID. as an input parameter, this parameter is required. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api. 
     * @return ListenerId CLB listener ID. as an input parameter, this parameter is required. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID. as an input parameter, this parameter is required. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     * @param ListenerId CLB listener ID. as an input parameter, this parameter is required. you can obtain it through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Target rule attribute list. as an input parameter, this parameter is required. 
     * @return TargetAttributes Target rule attribute list. as an input parameter, this parameter is required.
     */
    public TargetAttribute [] getTargetAttributes() {
        return this.TargetAttributes;
    }

    /**
     * Set Target rule attribute list. as an input parameter, this parameter is required.
     * @param TargetAttributes Target rule attribute list. as an input parameter, this parameter is required.
     */
    public void setTargetAttributes(TargetAttribute [] TargetAttributes) {
        this.TargetAttributes = TargetAttributes;
    }

    /**
     * Get The forwarding rule ID. note: this parameter is required for layer-7 (http/https) listeners. it can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api. 
     * @return LocationId The forwarding rule ID. note: this parameter is required for layer-7 (http/https) listeners. it can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set The forwarding rule ID. note: this parameter is required for layer-7 (http/https) listeners. it can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     * @param LocationId The forwarding rule ID. note: this parameter is required for layer-7 (http/https) listeners. it can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`. 
     * @return Region The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`.
     * @param Region The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ForwardLoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardLoadBalancer(ForwardLoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.TargetAttributes != null) {
            this.TargetAttributes = new TargetAttribute[source.TargetAttributes.length];
            for (int i = 0; i < source.TargetAttributes.length; i++) {
                this.TargetAttributes[i] = new TargetAttribute(source.TargetAttributes[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "TargetAttributes.", this.TargetAttributes);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

