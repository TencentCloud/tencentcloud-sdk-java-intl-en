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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVodDomainRequest extends AbstractModel {

    /**
    * Domain name for on-demand acceleration. Note: Filling in wildcard domains is not supported.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not specified, VOD will enable acceleration in or outside Chinese mainland based on the regional information a user has configured with Tencent Cloud.
    */
    @SerializedName("AccelerateArea")
    @Expose
    private String AccelerateArea;

    /**
    * Domain type. Valid values: <li>VOD: domain name distributed by the VOD product;</li> <li>EdgeOne: domain name distributed by the EdgeOne product.</li> The default value is VOD.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Domain name for on-demand acceleration. Note: Filling in wildcard domains is not supported. 
     * @return Domain Domain name for on-demand acceleration. Note: Filling in wildcard domains is not supported.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name for on-demand acceleration. Note: Filling in wildcard domains is not supported.
     * @param Domain Domain name for on-demand acceleration. Note: Filling in wildcard domains is not supported.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not specified, VOD will enable acceleration in or outside Chinese mainland based on the regional information a user has configured with Tencent Cloud. 
     * @return AccelerateArea Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not specified, VOD will enable acceleration in or outside Chinese mainland based on the regional information a user has configured with Tencent Cloud.
     */
    public String getAccelerateArea() {
        return this.AccelerateArea;
    }

    /**
     * Set Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not specified, VOD will enable acceleration in or outside Chinese mainland based on the regional information a user has configured with Tencent Cloud.
     * @param AccelerateArea Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not specified, VOD will enable acceleration in or outside Chinese mainland based on the regional information a user has configured with Tencent Cloud.
     */
    public void setAccelerateArea(String AccelerateArea) {
        this.AccelerateArea = AccelerateArea;
    }

    /**
     * Get Domain type. Valid values: <li>VOD: domain name distributed by the VOD product;</li> <li>EdgeOne: domain name distributed by the EdgeOne product.</li> The default value is VOD. 
     * @return Type Domain type. Valid values: <li>VOD: domain name distributed by the VOD product;</li> <li>EdgeOne: domain name distributed by the EdgeOne product.</li> The default value is VOD.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Domain type. Valid values: <li>VOD: domain name distributed by the VOD product;</li> <li>EdgeOne: domain name distributed by the EdgeOne product.</li> The default value is VOD.
     * @param Type Domain type. Valid values: <li>VOD: domain name distributed by the VOD product;</li> <li>EdgeOne: domain name distributed by the EdgeOne product.</li> The default value is VOD.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateVodDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVodDomainRequest(CreateVodDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.AccelerateArea != null) {
            this.AccelerateArea = new String(source.AccelerateArea);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AccelerateArea", this.AccelerateArea);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

