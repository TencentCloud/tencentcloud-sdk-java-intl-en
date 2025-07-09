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
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Site name. For sites connected via CNAME/NS, pass in the secondary domain name (example.com). Leave it blank if the site is connected without a domain name. 
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * The acceleration area of the L7 domain name when `Type` is `partial` or `full`. When Type is `noDomainAccess`, please leave it blank.
<li>`global`: Global AZs</li>
<li>`mainland`: AZs in the Chinese mainland</li>
<li>`overseas`: (Default) AZs outside the Chinese mainland </li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * ID of the plan to which you want to bind the site. If you don't have an EdgeOne plan, purchase one in the EdgeOne console.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * The site alias. It allows up to 20 characters, including [0-9], [a-z], [A-Z] and [-_]. For details, see [Glossary](https://intl.cloud.tencent.com/document/product/1552/70202?from_cn_redirect=1). If you don't want to use it, just leave it blank.
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * Tags of the site. To create tags, go to the [Tag Console](https://console.cloud.tencent.com/tag/taglist).
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used.
    */
    @SerializedName("AllowDuplicates")
    @Expose
    private Boolean AllowDuplicates;

    /**
    * Whether to skip scanning the existing DNS records of the site. Default value: false.
    */
    @SerializedName("JumpStart")
    @Expose
    private Boolean JumpStart;

    /**
     * Get Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li> 
     * @return Type Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>
     * @param Type Site access type. If this parameter is not input, the default value `partial` is used. Valid values of this parameter are as follows:
<li>partial: CNAME access;</li>
<li>full: NS access;</li>
<li>noDomainAccess: access with no domain name.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Site name. For sites connected via CNAME/NS, pass in the secondary domain name (example.com). Leave it blank if the site is connected without a domain name.  
     * @return ZoneName Site name. For sites connected via CNAME/NS, pass in the secondary domain name (example.com). Leave it blank if the site is connected without a domain name. 
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name. For sites connected via CNAME/NS, pass in the secondary domain name (example.com). Leave it blank if the site is connected without a domain name. 
     * @param ZoneName Site name. For sites connected via CNAME/NS, pass in the secondary domain name (example.com). Leave it blank if the site is connected without a domain name. 
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get The acceleration area of the L7 domain name when `Type` is `partial` or `full`. When Type is `noDomainAccess`, please leave it blank.
<li>`global`: Global AZs</li>
<li>`mainland`: AZs in the Chinese mainland</li>
<li>`overseas`: (Default) AZs outside the Chinese mainland </li> 
     * @return Area The acceleration area of the L7 domain name when `Type` is `partial` or `full`. When Type is `noDomainAccess`, please leave it blank.
<li>`global`: Global AZs</li>
<li>`mainland`: AZs in the Chinese mainland</li>
<li>`overseas`: (Default) AZs outside the Chinese mainland </li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The acceleration area of the L7 domain name when `Type` is `partial` or `full`. When Type is `noDomainAccess`, please leave it blank.
<li>`global`: Global AZs</li>
<li>`mainland`: AZs in the Chinese mainland</li>
<li>`overseas`: (Default) AZs outside the Chinese mainland </li>
     * @param Area The acceleration area of the L7 domain name when `Type` is `partial` or `full`. When Type is `noDomainAccess`, please leave it blank.
<li>`global`: Global AZs</li>
<li>`mainland`: AZs in the Chinese mainland</li>
<li>`overseas`: (Default) AZs outside the Chinese mainland </li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get ID of the plan to which you want to bind the site. If you don't have an EdgeOne plan, purchase one in the EdgeOne console. 
     * @return PlanId ID of the plan to which you want to bind the site. If you don't have an EdgeOne plan, purchase one in the EdgeOne console.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set ID of the plan to which you want to bind the site. If you don't have an EdgeOne plan, purchase one in the EdgeOne console.
     * @param PlanId ID of the plan to which you want to bind the site. If you don't have an EdgeOne plan, purchase one in the EdgeOne console.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get The site alias. It allows up to 20 characters, including [0-9], [a-z], [A-Z] and [-_]. For details, see [Glossary](https://intl.cloud.tencent.com/document/product/1552/70202?from_cn_redirect=1). If you don't want to use it, just leave it blank. 
     * @return AliasZoneName The site alias. It allows up to 20 characters, including [0-9], [a-z], [A-Z] and [-_]. For details, see [Glossary](https://intl.cloud.tencent.com/document/product/1552/70202?from_cn_redirect=1). If you don't want to use it, just leave it blank.
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set The site alias. It allows up to 20 characters, including [0-9], [a-z], [A-Z] and [-_]. For details, see [Glossary](https://intl.cloud.tencent.com/document/product/1552/70202?from_cn_redirect=1). If you don't want to use it, just leave it blank.
     * @param AliasZoneName The site alias. It allows up to 20 characters, including [0-9], [a-z], [A-Z] and [-_]. For details, see [Glossary](https://intl.cloud.tencent.com/document/product/1552/70202?from_cn_redirect=1). If you don't want to use it, just leave it blank.
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get Tags of the site. To create tags, go to the [Tag Console](https://console.cloud.tencent.com/tag/taglist). 
     * @return Tags Tags of the site. To create tags, go to the [Tag Console](https://console.cloud.tencent.com/tag/taglist).
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags of the site. To create tags, go to the [Tag Console](https://console.cloud.tencent.com/tag/taglist).
     * @param Tags Tags of the site. To create tags, go to the [Tag Console](https://console.cloud.tencent.com/tag/taglist).
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used. 
     * @return AllowDuplicates Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used.
     * @deprecated
     */
    @Deprecated
    public Boolean getAllowDuplicates() {
        return this.AllowDuplicates;
    }

    /**
     * Set Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used.
     * @param AllowDuplicates Whether to allow duplicate sites. Values:
<li>`true`: Duplicate sites are allowed.</li>
<li>`false`: Duplicate sites are not allowed.</li>If it is left empty, the default value `false` is used.
     * @deprecated
     */
    @Deprecated
    public void setAllowDuplicates(Boolean AllowDuplicates) {
        this.AllowDuplicates = AllowDuplicates;
    }

    /**
     * Get Whether to skip scanning the existing DNS records of the site. Default value: false. 
     * @return JumpStart Whether to skip scanning the existing DNS records of the site. Default value: false.
     * @deprecated
     */
    @Deprecated
    public Boolean getJumpStart() {
        return this.JumpStart;
    }

    /**
     * Set Whether to skip scanning the existing DNS records of the site. Default value: false.
     * @param JumpStart Whether to skip scanning the existing DNS records of the site. Default value: false.
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

