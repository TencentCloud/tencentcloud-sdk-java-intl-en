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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCDNDomainsRequest extends AbstractModel {

    /**
    * List of domain. If this field is left blank, all domain information will be listed by default.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * The maximum number of returned results for pagination fetching. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The starting offset of paged pull. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * VOD [Subapplication](https://www.tencentcloud.com/zh/document/product/266/33987?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get List of domain. If this field is left blank, all domain information will be listed by default. 
     * @return Domains List of domain. If this field is left blank, all domain information will be listed by default.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of domain. If this field is left blank, all domain information will be listed by default.
     * @param Domains List of domain. If this field is left blank, all domain information will be listed by default.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The maximum number of returned results for pagination fetching. Default value: 20. 
     * @return Limit The maximum number of returned results for pagination fetching. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of returned results for pagination fetching. Default value: 20.
     * @param Limit The maximum number of returned results for pagination fetching. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The starting offset of paged pull. Default value: 0. 
     * @return Offset The starting offset of paged pull. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The starting offset of paged pull. Default value: 0.
     * @param Offset The starting offset of paged pull. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get VOD [Subapplication](https://www.tencentcloud.com/zh/document/product/266/33987?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field. 
     * @return SubAppId VOD [Subapplication](https://www.tencentcloud.com/zh/document/product/266/33987?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD [Subapplication](https://www.tencentcloud.com/zh/document/product/266/33987?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.
     * @param SubAppId VOD [Subapplication](https://www.tencentcloud.com/zh/document/product/266/33987?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeCDNDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCDNDomainsRequest(DescribeCDNDomainsRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
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

