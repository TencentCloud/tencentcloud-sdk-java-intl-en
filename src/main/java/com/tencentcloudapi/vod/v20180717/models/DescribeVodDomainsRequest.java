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

public class DescribeVodDomainsRequest extends AbstractModel{

    /**
    * List of domain names. If this parameter is left empty, all domain names will be listed.
<li>Maximum number of domain names listed: 20</li>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Maximum results to return for pulling paginated queries. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number offset from the beginning of paginated queries. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get List of domain names. If this parameter is left empty, all domain names will be listed.
<li>Maximum number of domain names listed: 20</li> 
     * @return Domains List of domain names. If this parameter is left empty, all domain names will be listed.
<li>Maximum number of domain names listed: 20</li>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of domain names. If this parameter is left empty, all domain names will be listed.
<li>Maximum number of domain names listed: 20</li>
     * @param Domains List of domain names. If this parameter is left empty, all domain names will be listed.
<li>Maximum number of domain names listed: 20</li>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Maximum results to return for pulling paginated queries. Default value: 20 
     * @return Limit Maximum results to return for pulling paginated queries. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum results to return for pulling paginated queries. Default value: 20
     * @param Limit Maximum results to return for pulling paginated queries. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number offset from the beginning of paginated queries. Default value: 0 
     * @return Offset Page number offset from the beginning of paginated queries. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number offset from the beginning of paginated queries. Default value: 0
     * @param Offset Page number offset from the beginning of paginated queries. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

