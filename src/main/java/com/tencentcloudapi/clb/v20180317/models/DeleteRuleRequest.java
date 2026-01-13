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

public class DeleteRuleRequest extends AbstractModel {

    /**
    * ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Array of ids of forwarding rules to be deleted, can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api.
    */
    @SerializedName("LocationIds")
    @Expose
    private String [] LocationIds;

    /**
    * Domain name of the forwarding rule to be deleted. if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding path of the forwarding rule to be deleted can be accessed through the DescribeLoadBalancersDetail api (https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * A default domain name must be configured under the listener. when you need to delete the default domain name, you can specify another domain name as the new default domain name. if the new default domain name is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
    */
    @SerializedName("NewDefaultServerDomain")
    @Expose
    private String NewDefaultServerDomain;

    /**
     * Get ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID. 
     * @return LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     * @param LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID. 
     * @return ListenerId ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     * @param ListenerId ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Array of ids of forwarding rules to be deleted, can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api. 
     * @return LocationIds Array of ids of forwarding rules to be deleted, can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api.
     */
    public String [] getLocationIds() {
        return this.LocationIds;
    }

    /**
     * Set Array of ids of forwarding rules to be deleted, can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api.
     * @param LocationIds Array of ids of forwarding rules to be deleted, can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api.
     */
    public void setLocationIds(String [] LocationIds) {
        this.LocationIds = LocationIds;
    }

    /**
     * Get Domain name of the forwarding rule to be deleted. if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api. 
     * @return Domain Domain name of the forwarding rule to be deleted. if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule to be deleted. if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api.
     * @param Domain Domain name of the forwarding rule to be deleted. if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeLoadBalancersDetail](https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1) api.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding path of the forwarding rule to be deleted can be accessed through the DescribeLoadBalancersDetail api (https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1). 
     * @return Url Forwarding path of the forwarding rule to be deleted can be accessed through the DescribeLoadBalancersDetail api (https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1).
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Forwarding path of the forwarding rule to be deleted can be accessed through the DescribeLoadBalancersDetail api (https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1).
     * @param Url Forwarding path of the forwarding rule to be deleted can be accessed through the DescribeLoadBalancersDetail api (https://www.tencentcloud.com/document/api/214/46916?from_cn_redirect=1).
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get A default domain name must be configured under the listener. when you need to delete the default domain name, you can specify another domain name as the new default domain name. if the new default domain name is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api. 
     * @return NewDefaultServerDomain A default domain name must be configured under the listener. when you need to delete the default domain name, you can specify another domain name as the new default domain name. if the new default domain name is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
     */
    public String getNewDefaultServerDomain() {
        return this.NewDefaultServerDomain;
    }

    /**
     * Set A default domain name must be configured under the listener. when you need to delete the default domain name, you can specify another domain name as the new default domain name. if the new default domain name is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
     * @param NewDefaultServerDomain A default domain name must be configured under the listener. when you need to delete the default domain name, you can specify another domain name as the new default domain name. if the new default domain name is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
     */
    public void setNewDefaultServerDomain(String NewDefaultServerDomain) {
        this.NewDefaultServerDomain = NewDefaultServerDomain;
    }

    public DeleteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRuleRequest(DeleteRuleRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationIds != null) {
            this.LocationIds = new String[source.LocationIds.length];
            for (int i = 0; i < source.LocationIds.length; i++) {
                this.LocationIds[i] = new String(source.LocationIds[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.NewDefaultServerDomain != null) {
            this.NewDefaultServerDomain = new String(source.NewDefaultServerDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "LocationIds.", this.LocationIds);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "NewDefaultServerDomain", this.NewDefaultServerDomain);

    }
}

