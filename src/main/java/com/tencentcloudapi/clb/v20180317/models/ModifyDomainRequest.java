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

public class ModifyDomainRequest extends AbstractModel {

    /**
    * ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * ID of the clb listener. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * An existing domain under the listener, can be queried through the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) api.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * New domain name. 	Length limit: 1-120. There are three usage formats: non-regular expression, wildcard, and regular expression. A non-regular expression can only contain letters, digits, "-", and ".". In a wildcard, "*" can only be at the beginning or the end. A regular expressions must begin with a "~".
    */
    @SerializedName("NewDomain")
    @Expose
    private String NewDomain;

    /**
     * Get ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API to query the ID. 
     * @return LoadBalancerId ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     * @param LoadBalancerId ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get ID of the clb listener. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) API to query the ID. 
     * @return ListenerId ID of the clb listener. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set ID of the clb listener. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     * @param ListenerId ID of the clb listener. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get An existing domain under the listener, can be queried through the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) api. 
     * @return Domain An existing domain under the listener, can be queried through the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) api.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set An existing domain under the listener, can be queried through the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) api.
     * @param Domain An existing domain under the listener, can be queried through the [DescribeListeners](https://www.tencentcloud.comom/document/product/214/30686?from_cn_redirect=1) api.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get New domain name. 	Length limit: 1-120. There are three usage formats: non-regular expression, wildcard, and regular expression. A non-regular expression can only contain letters, digits, "-", and ".". In a wildcard, "*" can only be at the beginning or the end. A regular expressions must begin with a "~". 
     * @return NewDomain New domain name. 	Length limit: 1-120. There are three usage formats: non-regular expression, wildcard, and regular expression. A non-regular expression can only contain letters, digits, "-", and ".". In a wildcard, "*" can only be at the beginning or the end. A regular expressions must begin with a "~".
     */
    public String getNewDomain() {
        return this.NewDomain;
    }

    /**
     * Set New domain name. 	Length limit: 1-120. There are three usage formats: non-regular expression, wildcard, and regular expression. A non-regular expression can only contain letters, digits, "-", and ".". In a wildcard, "*" can only be at the beginning or the end. A regular expressions must begin with a "~".
     * @param NewDomain New domain name. 	Length limit: 1-120. There are three usage formats: non-regular expression, wildcard, and regular expression. A non-regular expression can only contain letters, digits, "-", and ".". In a wildcard, "*" can only be at the beginning or the end. A regular expressions must begin with a "~".
     */
    public void setNewDomain(String NewDomain) {
        this.NewDomain = NewDomain;
    }

    public ModifyDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainRequest(ModifyDomainRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.NewDomain != null) {
            this.NewDomain = new String(source.NewDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "NewDomain", this.NewDomain);

    }
}

