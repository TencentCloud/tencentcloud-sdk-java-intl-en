/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVodDomainRequest extends AbstractModel{

    /**
    * Domain name to add to VOD. Note: a wildcard domain name is not supported.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not set, VOD will enable acceleration in `Chinese Mainland` or `Outside Chinese Mainland` according to the region set under the user’s Tencent Cloud account. To enable acceleration in Chinese mainland for a domain name, please finish [ICP filing](https://intl.cloud.tencent.com/document/product/243/18905?from_cn_redirect=1) for it first.
    */
    @SerializedName("AccelerateArea")
    @Expose
    private String AccelerateArea;

    /**
    * VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Domain name to add to VOD. Note: a wildcard domain name is not supported. 
     * @return Domain Domain name to add to VOD. Note: a wildcard domain name is not supported.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name to add to VOD. Note: a wildcard domain name is not supported.
     * @param Domain Domain name to add to VOD. Note: a wildcard domain name is not supported.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not set, VOD will enable acceleration in `Chinese Mainland` or `Outside Chinese Mainland` according to the region set under the user’s Tencent Cloud account. To enable acceleration in Chinese mainland for a domain name, please finish [ICP filing](https://intl.cloud.tencent.com/document/product/243/18905?from_cn_redirect=1) for it first. 
     * @return AccelerateArea Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not set, VOD will enable acceleration in `Chinese Mainland` or `Outside Chinese Mainland` according to the region set under the user’s Tencent Cloud account. To enable acceleration in Chinese mainland for a domain name, please finish [ICP filing](https://intl.cloud.tencent.com/document/product/243/18905?from_cn_redirect=1) for it first.
     */
    public String getAccelerateArea() {
        return this.AccelerateArea;
    }

    /**
     * Set Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not set, VOD will enable acceleration in `Chinese Mainland` or `Outside Chinese Mainland` according to the region set under the user’s Tencent Cloud account. To enable acceleration in Chinese mainland for a domain name, please finish [ICP filing](https://intl.cloud.tencent.com/document/product/243/18905?from_cn_redirect=1) for it first.
     * @param AccelerateArea Region to enable acceleration. Valid values:
<li>`Chinese Mainland`</li>
<li>`Outside Chinese Mainland`</li>
<li>`Global`</li>
If `AccelerateArea` is not set, VOD will enable acceleration in `Chinese Mainland` or `Outside Chinese Mainland` according to the region set under the user’s Tencent Cloud account. To enable acceleration in Chinese mainland for a domain name, please finish [ICP filing](https://intl.cloud.tencent.com/document/product/243/18905?from_cn_redirect=1) for it first.
     */
    public void setAccelerateArea(String AccelerateArea) {
        this.AccelerateArea = AccelerateArea;
    }

    /**
     * Get VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty. 
     * @return SubAppId VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     * @param SubAppId VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
        if (source.AccelerateArea != null) {
            this.AccelerateArea = new String(source.AccelerateArea);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AccelerateArea", this.AccelerateArea);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

