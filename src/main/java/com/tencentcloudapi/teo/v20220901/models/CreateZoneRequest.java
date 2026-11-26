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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateZoneRequest extends AbstractModel {

    /**
    * Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod managed access. To use this access mode, your domain name should have been hosted on DNSPod;</li>
<li>ai: Edge reasoning integration.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Site name. For CNAME/NS access, pass in the second-level domain (example.com) as the site name. For domainless access, leave this value empty.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Acceleration region of the layer-7 domain name when Type is partial/full. The following are the values for this parameter. If left empty, the default value is overseas. When Type is noDomainAccess, retain this value as empty:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * ID of the target bundle to bind. If your account already has a bundle, you can fill in this parameter to bind the site to it directly. If you currently have no bindable bundle, you can purchase one through [CreatePlan](https://www.tencentcloud.com/document/product/1552/105771?from_cn_redirect=1).
Note: If this parameter is not specified, a site in the "init" state will be created. The site is inactive and will not be displayed in the console. You can access [BindZoneToPlan](https://www.tencentcloud.com/document/product/1552/83042?from_cn_redirect=1) to bind a package and activate the site. After activation, the site can provide services properly.


    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Identical site identifier. Only numbers, English letters, ".", "-", and "_" are allowed, up to 200 characters. For details, see [Identical Site Identifier](https://www.tencentcloud.com/document/product/1552/70202?from_cn_redirect=1). If this usage scenario does not apply, just leave this field empty.
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * Tag. This parameter is used for authority control and cost allocation of the site. You need to go to the [tag console](https://console.cloud.tencent.com/tag/taglist) to create the corresponding tag before you can input the corresponding tag key and tag value here.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether repeated access is allowed.
<li> true: Allow repeated access;</li>
<li> false: Duplicate integration is not allowed.</li>If this field is not specified, the default value 'false' will be used.
    */
    @SerializedName("AllowDuplicates")
    @Expose
    private Boolean AllowDuplicates;

    /**
    * Whether to skip scanning existing DNS records of the site. Default value: false.
    */
    @SerializedName("JumpStart")
    @Expose
    private Boolean JumpStart;

    /**
     * Get Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod managed access. To use this access mode, your domain name should have been hosted on DNSPod;</li>
<li>ai: Edge reasoning integration.</li> 
     * @return Type Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod managed access. To use this access mode, your domain name should have been hosted on DNSPod;</li>
<li>ai: Edge reasoning integration.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod managed access. To use this access mode, your domain name should have been hosted on DNSPod;</li>
<li>ai: Edge reasoning integration.</li>
     * @param Type Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod managed access. To use this access mode, your domain name should have been hosted on DNSPod;</li>
<li>ai: Edge reasoning integration.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Site name. For CNAME/NS access, pass in the second-level domain (example.com) as the site name. For domainless access, leave this value empty. 
     * @return ZoneName Site name. For CNAME/NS access, pass in the second-level domain (example.com) as the site name. For domainless access, leave this value empty.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name. For CNAME/NS access, pass in the second-level domain (example.com) as the site name. For domainless access, leave this value empty.
     * @param ZoneName Site name. For CNAME/NS access, pass in the second-level domain (example.com) as the site name. For domainless access, leave this value empty.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Acceleration region of the layer-7 domain name when Type is partial/full. The following are the values for this parameter. If left empty, the default value is overseas. When Type is noDomainAccess, retain this value as empty:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li> 
     * @return Area Acceleration region of the layer-7 domain name when Type is partial/full. The following are the values for this parameter. If left empty, the default value is overseas. When Type is noDomainAccess, retain this value as empty:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region of the layer-7 domain name when Type is partial/full. The following are the values for this parameter. If left empty, the default value is overseas. When Type is noDomainAccess, retain this value as empty:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li>
     * @param Area Acceleration region of the layer-7 domain name when Type is partial/full. The following are the values for this parameter. If left empty, the default value is overseas. When Type is noDomainAccess, retain this value as empty:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get ID of the target bundle to bind. If your account already has a bundle, you can fill in this parameter to bind the site to it directly. If you currently have no bindable bundle, you can purchase one through [CreatePlan](https://www.tencentcloud.com/document/product/1552/105771?from_cn_redirect=1).
Note: If this parameter is not specified, a site in the "init" state will be created. The site is inactive and will not be displayed in the console. You can access [BindZoneToPlan](https://www.tencentcloud.com/document/product/1552/83042?from_cn_redirect=1) to bind a package and activate the site. After activation, the site can provide services properly.

 
     * @return PlanId ID of the target bundle to bind. If your account already has a bundle, you can fill in this parameter to bind the site to it directly. If you currently have no bindable bundle, you can purchase one through [CreatePlan](https://www.tencentcloud.com/document/product/1552/105771?from_cn_redirect=1).
Note: If this parameter is not specified, a site in the "init" state will be created. The site is inactive and will not be displayed in the console. You can access [BindZoneToPlan](https://www.tencentcloud.com/document/product/1552/83042?from_cn_redirect=1) to bind a package and activate the site. After activation, the site can provide services properly.


     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set ID of the target bundle to bind. If your account already has a bundle, you can fill in this parameter to bind the site to it directly. If you currently have no bindable bundle, you can purchase one through [CreatePlan](https://www.tencentcloud.com/document/product/1552/105771?from_cn_redirect=1).
Note: If this parameter is not specified, a site in the "init" state will be created. The site is inactive and will not be displayed in the console. You can access [BindZoneToPlan](https://www.tencentcloud.com/document/product/1552/83042?from_cn_redirect=1) to bind a package and activate the site. After activation, the site can provide services properly.


     * @param PlanId ID of the target bundle to bind. If your account already has a bundle, you can fill in this parameter to bind the site to it directly. If you currently have no bindable bundle, you can purchase one through [CreatePlan](https://www.tencentcloud.com/document/product/1552/105771?from_cn_redirect=1).
Note: If this parameter is not specified, a site in the "init" state will be created. The site is inactive and will not be displayed in the console. You can access [BindZoneToPlan](https://www.tencentcloud.com/document/product/1552/83042?from_cn_redirect=1) to bind a package and activate the site. After activation, the site can provide services properly.


     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Identical site identifier. Only numbers, English letters, ".", "-", and "_" are allowed, up to 200 characters. For details, see [Identical Site Identifier](https://www.tencentcloud.com/document/product/1552/70202?from_cn_redirect=1). If this usage scenario does not apply, just leave this field empty. 
     * @return AliasZoneName Identical site identifier. Only numbers, English letters, ".", "-", and "_" are allowed, up to 200 characters. For details, see [Identical Site Identifier](https://www.tencentcloud.com/document/product/1552/70202?from_cn_redirect=1). If this usage scenario does not apply, just leave this field empty.
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set Identical site identifier. Only numbers, English letters, ".", "-", and "_" are allowed, up to 200 characters. For details, see [Identical Site Identifier](https://www.tencentcloud.com/document/product/1552/70202?from_cn_redirect=1). If this usage scenario does not apply, just leave this field empty.
     * @param AliasZoneName Identical site identifier. Only numbers, English letters, ".", "-", and "_" are allowed, up to 200 characters. For details, see [Identical Site Identifier](https://www.tencentcloud.com/document/product/1552/70202?from_cn_redirect=1). If this usage scenario does not apply, just leave this field empty.
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get Tag. This parameter is used for authority control and cost allocation of the site. You need to go to the [tag console](https://console.cloud.tencent.com/tag/taglist) to create the corresponding tag before you can input the corresponding tag key and tag value here. 
     * @return Tags Tag. This parameter is used for authority control and cost allocation of the site. You need to go to the [tag console](https://console.cloud.tencent.com/tag/taglist) to create the corresponding tag before you can input the corresponding tag key and tag value here.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag. This parameter is used for authority control and cost allocation of the site. You need to go to the [tag console](https://console.cloud.tencent.com/tag/taglist) to create the corresponding tag before you can input the corresponding tag key and tag value here.
     * @param Tags Tag. This parameter is used for authority control and cost allocation of the site. You need to go to the [tag console](https://console.cloud.tencent.com/tag/taglist) to create the corresponding tag before you can input the corresponding tag key and tag value here.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether repeated access is allowed.
<li> true: Allow repeated access;</li>
<li> false: Duplicate integration is not allowed.</li>If this field is not specified, the default value 'false' will be used. 
     * @return AllowDuplicates Whether repeated access is allowed.
<li> true: Allow repeated access;</li>
<li> false: Duplicate integration is not allowed.</li>If this field is not specified, the default value 'false' will be used.
     * @deprecated
     */
    @Deprecated
    public Boolean getAllowDuplicates() {
        return this.AllowDuplicates;
    }

    /**
     * Set Whether repeated access is allowed.
<li> true: Allow repeated access;</li>
<li> false: Duplicate integration is not allowed.</li>If this field is not specified, the default value 'false' will be used.
     * @param AllowDuplicates Whether repeated access is allowed.
<li> true: Allow repeated access;</li>
<li> false: Duplicate integration is not allowed.</li>If this field is not specified, the default value 'false' will be used.
     * @deprecated
     */
    @Deprecated
    public void setAllowDuplicates(Boolean AllowDuplicates) {
        this.AllowDuplicates = AllowDuplicates;
    }

    /**
     * Get Whether to skip scanning existing DNS records of the site. Default value: false. 
     * @return JumpStart Whether to skip scanning existing DNS records of the site. Default value: false.
     * @deprecated
     */
    @Deprecated
    public Boolean getJumpStart() {
        return this.JumpStart;
    }

    /**
     * Set Whether to skip scanning existing DNS records of the site. Default value: false.
     * @param JumpStart Whether to skip scanning existing DNS records of the site. Default value: false.
     * @deprecated
     */
    @Deprecated
    public void setJumpStart(Boolean JumpStart) {
        this.JumpStart = JumpStart;
    }

    public CreateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateZoneRequest(CreateZoneRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AllowDuplicates != null) {
            this.AllowDuplicates = new Boolean(source.AllowDuplicates);
        }
        if (source.JumpStart != null) {
            this.JumpStart = new Boolean(source.JumpStart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AllowDuplicates", this.AllowDuplicates);
        this.setParamSimple(map, prefix + "JumpStart", this.JumpStart);

    }
}

