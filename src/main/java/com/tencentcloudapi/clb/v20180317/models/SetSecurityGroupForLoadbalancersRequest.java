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

public class SetSecurityGroupForLoadbalancersRequest extends AbstractModel {

    /**
    * Security group ID, such as sg-12345678. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1).
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * ADD: bind a security group;
DEL: unbind a security group
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * ID array of the clb instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
Specifies the maximum length supported by the list is 20.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
     * Get Security group ID, such as sg-12345678. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1). 
     * @return SecurityGroup Security group ID, such as sg-12345678. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1).
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group ID, such as sg-12345678. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1).
     * @param SecurityGroup Security group ID, such as sg-12345678. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1).
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get ADD: bind a security group;
DEL: unbind a security group 
     * @return OperationType ADD: bind a security group;
DEL: unbind a security group
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set ADD: bind a security group;
DEL: unbind a security group
     * @param OperationType ADD: bind a security group;
DEL: unbind a security group
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get ID array of the clb instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
Specifies the maximum length supported by the list is 20. 
     * @return LoadBalancerIds ID array of the clb instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
Specifies the maximum length supported by the list is 20.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set ID array of the clb instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
Specifies the maximum length supported by the list is 20.
     * @param LoadBalancerIds ID array of the clb instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ID.
Specifies the maximum length supported by the list is 20.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    public SetSecurityGroupForLoadbalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetSecurityGroupForLoadbalancersRequest(SetSecurityGroupForLoadbalancersRequest source) {
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);

    }
}

