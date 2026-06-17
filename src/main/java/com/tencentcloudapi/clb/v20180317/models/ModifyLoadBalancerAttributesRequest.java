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
    * <p>Unique ID of the Cloud Load Balancer (CLB). You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>CLB instance name. Rules: 1-80 internationally compatible characters including letters, Chinese characters, digits, "-", "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden).</p>
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * <p>Set the backend service information for cross-region binding 1.0 of Cloud Load Balancer.</p>
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * <p>Network billing related parameters</p>
    */
    @SerializedName("InternetChargeInfo")
    @Expose
    private InternetAccessible InternetChargeInfo;

    /**
    * <p>Allow CLB traffic to the Target.<br>Enable (true): verify security groups on CLB;<br>deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.<br>Leave blank for no modification.</p>
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * <p>Switchover between different billing modes: 0 means no switchover, 1 means switch between prepaid and postpaid, 2 means switch between postpaid modes. Default value: 0</p>
    */
    @SerializedName("SwitchFlag")
    @Expose
    private Long SwitchFlag;

    /**
    * <p>Whether cross-region binding 2.0 is enabled. Leave it blank for no modification.</p>
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * <p>Whether to enable deletion protection. Leave it empty to skip modification.</p>
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * <p>Change the second-level domain name of Cloud Load Balancer (CLB) from mycloud.com to tencentclb.com. The subdomain will also be transformed. After modification, the mycloud.com domain name will become invalid. Leave it blank if no modification is needed.</p>
    */
    @SerializedName("ModifyClassicDomain")
    @Expose
    private Boolean ModifyClassicDomain;

    /**
    * <p>Id of the associated endpoint, which can be queried via the <a href="https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1">DescribeVpcEndPoint</a> api. Input an empty string to unbind.</p>
    */
    @SerializedName("AssociateEndpoint")
    @Expose
    private String AssociateEndpoint;

    /**
     * Get <p>Unique ID of the Cloud Load Balancer (CLB). You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p> 
     * @return LoadBalancerId <p>Unique ID of the Cloud Load Balancer (CLB). You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>Unique ID of the Cloud Load Balancer (CLB). You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p>
     * @param LoadBalancerId <p>Unique ID of the Cloud Load Balancer (CLB). You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>CLB instance name. Rules: 1-80 internationally compatible characters including letters, Chinese characters, digits, "-", "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden).</p> 
     * @return LoadBalancerName <p>CLB instance name. Rules: 1-80 internationally compatible characters including letters, Chinese characters, digits, "-", "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden).</p>
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set <p>CLB instance name. Rules: 1-80 internationally compatible characters including letters, Chinese characters, digits, "-", "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden).</p>
     * @param LoadBalancerName <p>CLB instance name. Rules: 1-80 internationally compatible characters including letters, Chinese characters, digits, "-", "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden).</p>
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get <p>Set the backend service information for cross-region binding 1.0 of Cloud Load Balancer.</p> 
     * @return TargetRegionInfo <p>Set the backend service information for cross-region binding 1.0 of Cloud Load Balancer.</p>
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set <p>Set the backend service information for cross-region binding 1.0 of Cloud Load Balancer.</p>
     * @param TargetRegionInfo <p>Set the backend service information for cross-region binding 1.0 of Cloud Load Balancer.</p>
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get <p>Network billing related parameters</p> 
     * @return InternetChargeInfo <p>Network billing related parameters</p>
     */
    public InternetAccessible getInternetChargeInfo() {
        return this.InternetChargeInfo;
    }

    /**
     * Set <p>Network billing related parameters</p>
     * @param InternetChargeInfo <p>Network billing related parameters</p>
     */
    public void setInternetChargeInfo(InternetAccessible InternetChargeInfo) {
        this.InternetChargeInfo = InternetChargeInfo;
    }

    /**
     * Get <p>Allow CLB traffic to the Target.<br>Enable (true): verify security groups on CLB;<br>deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.<br>Leave blank for no modification.</p> 
     * @return LoadBalancerPassToTarget <p>Allow CLB traffic to the Target.<br>Enable (true): verify security groups on CLB;<br>deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.<br>Leave blank for no modification.</p>
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set <p>Allow CLB traffic to the Target.<br>Enable (true): verify security groups on CLB;<br>deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.<br>Leave blank for no modification.</p>
     * @param LoadBalancerPassToTarget <p>Allow CLB traffic to the Target.<br>Enable (true): verify security groups on CLB;<br>deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.<br>Leave blank for no modification.</p>
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get <p>Switchover between different billing modes: 0 means no switchover, 1 means switch between prepaid and postpaid, 2 means switch between postpaid modes. Default value: 0</p> 
     * @return SwitchFlag <p>Switchover between different billing modes: 0 means no switchover, 1 means switch between prepaid and postpaid, 2 means switch between postpaid modes. Default value: 0</p>
     */
    public Long getSwitchFlag() {
        return this.SwitchFlag;
    }

    /**
     * Set <p>Switchover between different billing modes: 0 means no switchover, 1 means switch between prepaid and postpaid, 2 means switch between postpaid modes. Default value: 0</p>
     * @param SwitchFlag <p>Switchover between different billing modes: 0 means no switchover, 1 means switch between prepaid and postpaid, 2 means switch between postpaid modes. Default value: 0</p>
     */
    public void setSwitchFlag(Long SwitchFlag) {
        this.SwitchFlag = SwitchFlag;
    }

    /**
     * Get <p>Whether cross-region binding 2.0 is enabled. Leave it blank for no modification.</p> 
     * @return SnatPro <p>Whether cross-region binding 2.0 is enabled. Leave it blank for no modification.</p>
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set <p>Whether cross-region binding 2.0 is enabled. Leave it blank for no modification.</p>
     * @param SnatPro <p>Whether cross-region binding 2.0 is enabled. Leave it blank for no modification.</p>
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get <p>Whether to enable deletion protection. Leave it empty to skip modification.</p> 
     * @return DeleteProtect <p>Whether to enable deletion protection. Leave it empty to skip modification.</p>
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set <p>Whether to enable deletion protection. Leave it empty to skip modification.</p>
     * @param DeleteProtect <p>Whether to enable deletion protection. Leave it empty to skip modification.</p>
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get <p>Change the second-level domain name of Cloud Load Balancer (CLB) from mycloud.com to tencentclb.com. The subdomain will also be transformed. After modification, the mycloud.com domain name will become invalid. Leave it blank if no modification is needed.</p> 
     * @return ModifyClassicDomain <p>Change the second-level domain name of Cloud Load Balancer (CLB) from mycloud.com to tencentclb.com. The subdomain will also be transformed. After modification, the mycloud.com domain name will become invalid. Leave it blank if no modification is needed.</p>
     */
    public Boolean getModifyClassicDomain() {
        return this.ModifyClassicDomain;
    }

    /**
     * Set <p>Change the second-level domain name of Cloud Load Balancer (CLB) from mycloud.com to tencentclb.com. The subdomain will also be transformed. After modification, the mycloud.com domain name will become invalid. Leave it blank if no modification is needed.</p>
     * @param ModifyClassicDomain <p>Change the second-level domain name of Cloud Load Balancer (CLB) from mycloud.com to tencentclb.com. The subdomain will also be transformed. After modification, the mycloud.com domain name will become invalid. Leave it blank if no modification is needed.</p>
     */
    public void setModifyClassicDomain(Boolean ModifyClassicDomain) {
        this.ModifyClassicDomain = ModifyClassicDomain;
    }

    /**
     * Get <p>Id of the associated endpoint, which can be queried via the <a href="https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1">DescribeVpcEndPoint</a> api. Input an empty string to unbind.</p> 
     * @return AssociateEndpoint <p>Id of the associated endpoint, which can be queried via the <a href="https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1">DescribeVpcEndPoint</a> api. Input an empty string to unbind.</p>
     */
    public String getAssociateEndpoint() {
        return this.AssociateEndpoint;
    }

    /**
     * Set <p>Id of the associated endpoint, which can be queried via the <a href="https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1">DescribeVpcEndPoint</a> api. Input an empty string to unbind.</p>
     * @param AssociateEndpoint <p>Id of the associated endpoint, which can be queried via the <a href="https://www.tencentcloud.com/document/product/215/54679?from_cn_redirect=1">DescribeVpcEndPoint</a> api. Input an empty string to unbind.</p>
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
        if (source.SwitchFlag != null) {
            this.SwitchFlag = new Long(source.SwitchFlag);
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
        this.setParamSimple(map, prefix + "SwitchFlag", this.SwitchFlag);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);
        this.setParamSimple(map, prefix + "ModifyClassicDomain", this.ModifyClassicDomain);
        this.setParamSimple(map, prefix + "AssociateEndpoint", this.AssociateEndpoint);

    }
}

