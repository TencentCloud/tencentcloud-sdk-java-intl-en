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

public class ModifyLoadBalancerAttributesRequest extends AbstractModel {

    /**
    * Specifies the unique ID of the cloud load balancer. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Load balancing instance name. rule: 1-60 english letters, chinese characters, digits, hyphens "-", or underscores "_".
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * The backend service information of cross-region binding 1.0
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * Network billing parameter
    */
    @SerializedName("InternetChargeInfo")
    @Expose
    private InternetAccessible InternetChargeInfo;

    /**
    * Specifies whether to allow CLB traffic to the Target.
Enable pass-through (true): verify security groups on CLB only.
Denies CLB traffic to the target (false): verify security groups on both CLB and backend instances.
Specifies no modification if left blank.
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * Specifies whether the cross-region binding 2.0 feature is enabled. leave blank for no modification.
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * Specifies whether to enable deletion protection. leave it blank to keep the current setting.
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * Modifies the second-level domain name of cloud load balancer from mycloud.com to tencentclb.com. the subdomain will be transformed, and the mycloud.com domain name will become invalid after modification. leave it blank if no modification is required.
    */
    @SerializedName("ModifyClassicDomain")
    @Expose
    private Boolean ModifyClassicDomain;

    /**
    * The associated endpoint Id, which can be queried via the [DescribeVpcEndPoint](https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1) api. input an empty string to unbind.
    */
    @SerializedName("AssociateEndpoint")
    @Expose
    private String AssociateEndpoint;

    /**
     * Get Specifies the unique ID of the cloud load balancer. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID. 
     * @return LoadBalancerId Specifies the unique ID of the cloud load balancer. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Specifies the unique ID of the cloud load balancer. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     * @param LoadBalancerId Specifies the unique ID of the cloud load balancer. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Load balancing instance name. rule: 1-60 english letters, chinese characters, digits, hyphens "-", or underscores "_". 
     * @return LoadBalancerName Load balancing instance name. rule: 1-60 english letters, chinese characters, digits, hyphens "-", or underscores "_".
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set Load balancing instance name. rule: 1-60 english letters, chinese characters, digits, hyphens "-", or underscores "_".
     * @param LoadBalancerName Load balancing instance name. rule: 1-60 english letters, chinese characters, digits, hyphens "-", or underscores "_".
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get The backend service information of cross-region binding 1.0 
     * @return TargetRegionInfo The backend service information of cross-region binding 1.0
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set The backend service information of cross-region binding 1.0
     * @param TargetRegionInfo The backend service information of cross-region binding 1.0
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get Network billing parameter 
     * @return InternetChargeInfo Network billing parameter
     */
    public InternetAccessible getInternetChargeInfo() {
        return this.InternetChargeInfo;
    }

    /**
     * Set Network billing parameter
     * @param InternetChargeInfo Network billing parameter
     */
    public void setInternetChargeInfo(InternetAccessible InternetChargeInfo) {
        this.InternetChargeInfo = InternetChargeInfo;
    }

    /**
     * Get Specifies whether to allow CLB traffic to the Target.
Enable pass-through (true): verify security groups on CLB only.
Denies CLB traffic to the target (false): verify security groups on both CLB and backend instances.
Specifies no modification if left blank. 
     * @return LoadBalancerPassToTarget Specifies whether to allow CLB traffic to the Target.
Enable pass-through (true): verify security groups on CLB only.
Denies CLB traffic to the target (false): verify security groups on both CLB and backend instances.
Specifies no modification if left blank.
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Specifies whether to allow CLB traffic to the Target.
Enable pass-through (true): verify security groups on CLB only.
Denies CLB traffic to the target (false): verify security groups on both CLB and backend instances.
Specifies no modification if left blank.
     * @param LoadBalancerPassToTarget Specifies whether to allow CLB traffic to the Target.
Enable pass-through (true): verify security groups on CLB only.
Denies CLB traffic to the target (false): verify security groups on both CLB and backend instances.
Specifies no modification if left blank.
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get Specifies whether the cross-region binding 2.0 feature is enabled. leave blank for no modification. 
     * @return SnatPro Specifies whether the cross-region binding 2.0 feature is enabled. leave blank for no modification.
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set Specifies whether the cross-region binding 2.0 feature is enabled. leave blank for no modification.
     * @param SnatPro Specifies whether the cross-region binding 2.0 feature is enabled. leave blank for no modification.
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get Specifies whether to enable deletion protection. leave it blank to keep the current setting. 
     * @return DeleteProtect Specifies whether to enable deletion protection. leave it blank to keep the current setting.
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set Specifies whether to enable deletion protection. leave it blank to keep the current setting.
     * @param DeleteProtect Specifies whether to enable deletion protection. leave it blank to keep the current setting.
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get Modifies the second-level domain name of cloud load balancer from mycloud.com to tencentclb.com. the subdomain will be transformed, and the mycloud.com domain name will become invalid after modification. leave it blank if no modification is required. 
     * @return ModifyClassicDomain Modifies the second-level domain name of cloud load balancer from mycloud.com to tencentclb.com. the subdomain will be transformed, and the mycloud.com domain name will become invalid after modification. leave it blank if no modification is required.
     */
    public Boolean getModifyClassicDomain() {
        return this.ModifyClassicDomain;
    }

    /**
     * Set Modifies the second-level domain name of cloud load balancer from mycloud.com to tencentclb.com. the subdomain will be transformed, and the mycloud.com domain name will become invalid after modification. leave it blank if no modification is required.
     * @param ModifyClassicDomain Modifies the second-level domain name of cloud load balancer from mycloud.com to tencentclb.com. the subdomain will be transformed, and the mycloud.com domain name will become invalid after modification. leave it blank if no modification is required.
     */
    public void setModifyClassicDomain(Boolean ModifyClassicDomain) {
        this.ModifyClassicDomain = ModifyClassicDomain;
    }

    /**
     * Get The associated endpoint Id, which can be queried via the [DescribeVpcEndPoint](https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1) api. input an empty string to unbind. 
     * @return AssociateEndpoint The associated endpoint Id, which can be queried via the [DescribeVpcEndPoint](https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1) api. input an empty string to unbind.
     */
    public String getAssociateEndpoint() {
        return this.AssociateEndpoint;
    }

    /**
     * Set The associated endpoint Id, which can be queried via the [DescribeVpcEndPoint](https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1) api. input an empty string to unbind.
     * @param AssociateEndpoint The associated endpoint Id, which can be queried via the [DescribeVpcEndPoint](https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1) api. input an empty string to unbind.
     */
    public void setAssociateEndpoint(String AssociateEndpoint) {
        this.AssociateEndpoint = AssociateEndpoint;
    }

    public ModifyLoadBalancerAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerAttributesRequest(ModifyLoadBalancerAttributesRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.TargetRegionInfo != null) {
            this.TargetRegionInfo = new TargetRegionInfo(source.TargetRegionInfo);
        }
        if (source.InternetChargeInfo != null) {
            this.InternetChargeInfo = new InternetAccessible(source.InternetChargeInfo);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
        if (source.SnatPro != null) {
            this.SnatPro = new Boolean(source.SnatPro);
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
        if (source.ModifyClassicDomain != null) {
            this.ModifyClassicDomain = new Boolean(source.ModifyClassicDomain);
        }
        if (source.AssociateEndpoint != null) {
            this.AssociateEndpoint = new String(source.AssociateEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamObj(map, prefix + "TargetRegionInfo.", this.TargetRegionInfo);
        this.setParamObj(map, prefix + "InternetChargeInfo.", this.InternetChargeInfo);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);
        this.setParamSimple(map, prefix + "ModifyClassicDomain", this.ModifyClassicDomain);
        this.setParamSimple(map, prefix + "AssociateEndpoint", this.AssociateEndpoint);

    }
}

