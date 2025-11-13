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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBandwidthPackagesRequest extends AbstractModel {

    /**
    * The unique ID list of bandwidth packages.
    */
    @SerializedName("BandwidthPackageIds")
    @Expose
    private String [] BandwidthPackageIds;

    /**
    * Each request can have up to 10 `Filters`. parameters do not support specifying `BandwidthPackageIds` and `Filters` at the same time. detailed filter criteria are as follows:.
<li>bandwidth-package-id - String - required: no - (filter condition) filter by the unique id of the bandwidth package.</li>.
<li>bandwidth-package-name - String - required: no - (filter criteria) filter by bandwidth package name. fuzzy filtering is not supported.</li>.
<li>network-type - String - required: no - (filter condition) filter by bandwidth package type. network type can be found in [BandwidthPackage](https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>- charge-type - String - required: no - (filter condition) filter by the billing type of the bandwidth package. the billing type can be found in BandwidthPackage (https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>resource.resource-type - String - required: no - (filter criteria) filter by bandwidth package resource type. resource types include 'Address' and 'LoadBalance'.</li>.
<li>resource.resource-id - String - required: no - (filter criteria) filter by bandwidth package resource id. resource id is in the format of 'eip-xxxx','lb-xxxx'.</li>.
<li>resource.address-ip - String - required: no - filter by bandwidth package resource ip.</li>.
<li>tag-key - String - required: no - (filter condition) filter according to the tag key.</li>.
<li>`tag-value` - String - Optional - Filter by the tag value.</li>

<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. This value defaults to 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of bandwidth packages returned. This value defaults to 20. The maximum is 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The unique ID list of bandwidth packages. 
     * @return BandwidthPackageIds The unique ID list of bandwidth packages.
     */
    public String [] getBandwidthPackageIds() {
        return this.BandwidthPackageIds;
    }

    /**
     * Set The unique ID list of bandwidth packages.
     * @param BandwidthPackageIds The unique ID list of bandwidth packages.
     */
    public void setBandwidthPackageIds(String [] BandwidthPackageIds) {
        this.BandwidthPackageIds = BandwidthPackageIds;
    }

    /**
     * Get Each request can have up to 10 `Filters`. parameters do not support specifying `BandwidthPackageIds` and `Filters` at the same time. detailed filter criteria are as follows:.
<li>bandwidth-package-id - String - required: no - (filter condition) filter by the unique id of the bandwidth package.</li>.
<li>bandwidth-package-name - String - required: no - (filter criteria) filter by bandwidth package name. fuzzy filtering is not supported.</li>.
<li>network-type - String - required: no - (filter condition) filter by bandwidth package type. network type can be found in [BandwidthPackage](https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>- charge-type - String - required: no - (filter condition) filter by the billing type of the bandwidth package. the billing type can be found in BandwidthPackage (https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>resource.resource-type - String - required: no - (filter criteria) filter by bandwidth package resource type. resource types include 'Address' and 'LoadBalance'.</li>.
<li>resource.resource-id - String - required: no - (filter criteria) filter by bandwidth package resource id. resource id is in the format of 'eip-xxxx','lb-xxxx'.</li>.
<li>resource.address-ip - String - required: no - filter by bandwidth package resource ip.</li>.
<li>tag-key - String - required: no - (filter condition) filter according to the tag key.</li>.
<li>`tag-value` - String - Optional - Filter by the tag value.</li>

<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.</li>. 
     * @return Filters Each request can have up to 10 `Filters`. parameters do not support specifying `BandwidthPackageIds` and `Filters` at the same time. detailed filter criteria are as follows:.
<li>bandwidth-package-id - String - required: no - (filter condition) filter by the unique id of the bandwidth package.</li>.
<li>bandwidth-package-name - String - required: no - (filter criteria) filter by bandwidth package name. fuzzy filtering is not supported.</li>.
<li>network-type - String - required: no - (filter condition) filter by bandwidth package type. network type can be found in [BandwidthPackage](https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>- charge-type - String - required: no - (filter condition) filter by the billing type of the bandwidth package. the billing type can be found in BandwidthPackage (https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>resource.resource-type - String - required: no - (filter criteria) filter by bandwidth package resource type. resource types include 'Address' and 'LoadBalance'.</li>.
<li>resource.resource-id - String - required: no - (filter criteria) filter by bandwidth package resource id. resource id is in the format of 'eip-xxxx','lb-xxxx'.</li>.
<li>resource.address-ip - String - required: no - filter by bandwidth package resource ip.</li>.
<li>tag-key - String - required: no - (filter condition) filter according to the tag key.</li>.
<li>`tag-value` - String - Optional - Filter by the tag value.</li>

<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can have up to 10 `Filters`. parameters do not support specifying `BandwidthPackageIds` and `Filters` at the same time. detailed filter criteria are as follows:.
<li>bandwidth-package-id - String - required: no - (filter condition) filter by the unique id of the bandwidth package.</li>.
<li>bandwidth-package-name - String - required: no - (filter criteria) filter by bandwidth package name. fuzzy filtering is not supported.</li>.
<li>network-type - String - required: no - (filter condition) filter by bandwidth package type. network type can be found in [BandwidthPackage](https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>- charge-type - String - required: no - (filter condition) filter by the billing type of the bandwidth package. the billing type can be found in BandwidthPackage (https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>resource.resource-type - String - required: no - (filter criteria) filter by bandwidth package resource type. resource types include 'Address' and 'LoadBalance'.</li>.
<li>resource.resource-id - String - required: no - (filter criteria) filter by bandwidth package resource id. resource id is in the format of 'eip-xxxx','lb-xxxx'.</li>.
<li>resource.address-ip - String - required: no - filter by bandwidth package resource ip.</li>.
<li>tag-key - String - required: no - (filter condition) filter according to the tag key.</li>.
<li>`tag-value` - String - Optional - Filter by the tag value.</li>

<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.</li>.
     * @param Filters Each request can have up to 10 `Filters`. parameters do not support specifying `BandwidthPackageIds` and `Filters` at the same time. detailed filter criteria are as follows:.
<li>bandwidth-package-id - String - required: no - (filter condition) filter by the unique id of the bandwidth package.</li>.
<li>bandwidth-package-name - String - required: no - (filter criteria) filter by bandwidth package name. fuzzy filtering is not supported.</li>.
<li>network-type - String - required: no - (filter condition) filter by bandwidth package type. network type can be found in [BandwidthPackage](https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>- charge-type - String - required: no - (filter condition) filter by the billing type of the bandwidth package. the billing type can be found in BandwidthPackage (https://intl.cloud.tencent.com/document/api/215/15824?from_cn_redirect=1#BandwidthPackage).</li>.
<li>resource.resource-type - String - required: no - (filter criteria) filter by bandwidth package resource type. resource types include 'Address' and 'LoadBalance'.</li>.
<li>resource.resource-id - String - required: no - (filter criteria) filter by bandwidth package resource id. resource id is in the format of 'eip-xxxx','lb-xxxx'.</li>.
<li>resource.address-ip - String - required: no - filter by bandwidth package resource ip.</li>.
<li>tag-key - String - required: no - (filter condition) filter according to the tag key.</li>.
<li>`tag-value` - String - Optional - Filter by the tag value.</li>

<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.</li>.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. This value defaults to 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688). 
     * @return Offset Offset. This value defaults to 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. This value defaults to 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     * @param Offset Offset. This value defaults to 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of bandwidth packages returned. This value defaults to 20. The maximum is 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688). 
     * @return Limit Number of bandwidth packages returned. This value defaults to 20. The maximum is 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of bandwidth packages returned. This value defaults to 20. The maximum is 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     * @param Limit Number of bandwidth packages returned. This value defaults to 20. The maximum is 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeBandwidthPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBandwidthPackagesRequest(DescribeBandwidthPackagesRequest source) {
        if (source.BandwidthPackageIds != null) {
            this.BandwidthPackageIds = new String[source.BandwidthPackageIds.length];
            for (int i = 0; i < source.BandwidthPackageIds.length; i++) {
                this.BandwidthPackageIds[i] = new String(source.BandwidthPackageIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BandwidthPackageIds.", this.BandwidthPackageIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

