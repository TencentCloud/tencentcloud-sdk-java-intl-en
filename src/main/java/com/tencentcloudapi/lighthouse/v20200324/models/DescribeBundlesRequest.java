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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBundlesRequest extends AbstractModel {

    /**
    * List of bundle ids. the maximum is 100 per request for batch packages. you can get the BundleId in the return value from the API [DescribeBundles](https://www.tencentcloud.comom/document/product/1207/47575?from_cn_redirect=1).
    */
    @SerializedName("BundleIds")
    @Expose
    private String [] BundleIds;

    /**
    * Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter list.
<li>bundle-id</li>Filter by [bundle id].
Type: String.
Required: No
<li>`support-platform-type`</li>Filter by the system type.
Value: LINUX_UNIX (LINUX/UNIX system); WINDOWS (WINDOWS systems).
Type: String.
Required: No
<li>bundle-type</li>Filter by [package type].
Valid values: GENERAL_BUNDLE (GENERAL BUNDLE); STORAGE_BUNDLE (STORAGE BUNDLE); ENTERPRISE_BUNDLE (ENTERPRISE BUNDLE); EXCLUSIVE_BUNDLE (dedicated BUNDLE); BEFAST_BUNDLE (SPEED BUNDLE); STARTER_BUNDLE (STARTER BUNDLE); CAREFREE_BUNDLE (CAREFREE BUNDLE); RAZOR_SPEED_BUNDLE (RAZOR SPEED BUNDLE).
Type: String.
Required: No
<li>bundle-state</li>Filter by [package status].
Valid values: ONLINE, OFFLINE.
Type: String.
Required: No
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. the parameter does not support specifying both `BundleIds` and `Filters`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * AZ list. default to all availability zones.
<li>AZs can be queried through the API [DescribeZones](https://www.tencentcloud.comom/document/product/1207/57513?from_cn_redirect=1)</li>.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
     * Get List of bundle ids. the maximum is 100 per request for batch packages. you can get the BundleId in the return value from the API [DescribeBundles](https://www.tencentcloud.comom/document/product/1207/47575?from_cn_redirect=1). 
     * @return BundleIds List of bundle ids. the maximum is 100 per request for batch packages. you can get the BundleId in the return value from the API [DescribeBundles](https://www.tencentcloud.comom/document/product/1207/47575?from_cn_redirect=1).
     */
    public String [] getBundleIds() {
        return this.BundleIds;
    }

    /**
     * Set List of bundle ids. the maximum is 100 per request for batch packages. you can get the BundleId in the return value from the API [DescribeBundles](https://www.tencentcloud.comom/document/product/1207/47575?from_cn_redirect=1).
     * @param BundleIds List of bundle ids. the maximum is 100 per request for batch packages. you can get the BundleId in the return value from the API [DescribeBundles](https://www.tencentcloud.comom/document/product/1207/47575?from_cn_redirect=1).
     */
    public void setBundleIds(String [] BundleIds) {
        this.BundleIds = BundleIds;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter list.
<li>bundle-id</li>Filter by [bundle id].
Type: String.
Required: No
<li>`support-platform-type`</li>Filter by the system type.
Value: LINUX_UNIX (LINUX/UNIX system); WINDOWS (WINDOWS systems).
Type: String.
Required: No
<li>bundle-type</li>Filter by [package type].
Valid values: GENERAL_BUNDLE (GENERAL BUNDLE); STORAGE_BUNDLE (STORAGE BUNDLE); ENTERPRISE_BUNDLE (ENTERPRISE BUNDLE); EXCLUSIVE_BUNDLE (dedicated BUNDLE); BEFAST_BUNDLE (SPEED BUNDLE); STARTER_BUNDLE (STARTER BUNDLE); CAREFREE_BUNDLE (CAREFREE BUNDLE); RAZOR_SPEED_BUNDLE (RAZOR SPEED BUNDLE).
Type: String.
Required: No
<li>bundle-state</li>Filter by [package status].
Valid values: ONLINE, OFFLINE.
Type: String.
Required: No
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. the parameter does not support specifying both `BundleIds` and `Filters`. 
     * @return Filters Filter list.
<li>bundle-id</li>Filter by [bundle id].
Type: String.
Required: No
<li>`support-platform-type`</li>Filter by the system type.
Value: LINUX_UNIX (LINUX/UNIX system); WINDOWS (WINDOWS systems).
Type: String.
Required: No
<li>bundle-type</li>Filter by [package type].
Valid values: GENERAL_BUNDLE (GENERAL BUNDLE); STORAGE_BUNDLE (STORAGE BUNDLE); ENTERPRISE_BUNDLE (ENTERPRISE BUNDLE); EXCLUSIVE_BUNDLE (dedicated BUNDLE); BEFAST_BUNDLE (SPEED BUNDLE); STARTER_BUNDLE (STARTER BUNDLE); CAREFREE_BUNDLE (CAREFREE BUNDLE); RAZOR_SPEED_BUNDLE (RAZOR SPEED BUNDLE).
Type: String.
Required: No
<li>bundle-state</li>Filter by [package status].
Valid values: ONLINE, OFFLINE.
Type: String.
Required: No
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. the parameter does not support specifying both `BundleIds` and `Filters`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter list.
<li>bundle-id</li>Filter by [bundle id].
Type: String.
Required: No
<li>`support-platform-type`</li>Filter by the system type.
Value: LINUX_UNIX (LINUX/UNIX system); WINDOWS (WINDOWS systems).
Type: String.
Required: No
<li>bundle-type</li>Filter by [package type].
Valid values: GENERAL_BUNDLE (GENERAL BUNDLE); STORAGE_BUNDLE (STORAGE BUNDLE); ENTERPRISE_BUNDLE (ENTERPRISE BUNDLE); EXCLUSIVE_BUNDLE (dedicated BUNDLE); BEFAST_BUNDLE (SPEED BUNDLE); STARTER_BUNDLE (STARTER BUNDLE); CAREFREE_BUNDLE (CAREFREE BUNDLE); RAZOR_SPEED_BUNDLE (RAZOR SPEED BUNDLE).
Type: String.
Required: No
<li>bundle-state</li>Filter by [package status].
Valid values: ONLINE, OFFLINE.
Type: String.
Required: No
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. the parameter does not support specifying both `BundleIds` and `Filters`.
     * @param Filters Filter list.
<li>bundle-id</li>Filter by [bundle id].
Type: String.
Required: No
<li>`support-platform-type`</li>Filter by the system type.
Value: LINUX_UNIX (LINUX/UNIX system); WINDOWS (WINDOWS systems).
Type: String.
Required: No
<li>bundle-type</li>Filter by [package type].
Valid values: GENERAL_BUNDLE (GENERAL BUNDLE); STORAGE_BUNDLE (STORAGE BUNDLE); ENTERPRISE_BUNDLE (ENTERPRISE BUNDLE); EXCLUSIVE_BUNDLE (dedicated BUNDLE); BEFAST_BUNDLE (SPEED BUNDLE); STARTER_BUNDLE (STARTER BUNDLE); CAREFREE_BUNDLE (CAREFREE BUNDLE); RAZOR_SPEED_BUNDLE (RAZOR SPEED BUNDLE).
Type: String.
Required: No
<li>bundle-state</li>Filter by [package status].
Valid values: ONLINE, OFFLINE.
Type: String.
Required: No
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. the parameter does not support specifying both `BundleIds` and `Filters`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get AZ list. default to all availability zones.
<li>AZs can be queried through the API [DescribeZones](https://www.tencentcloud.comom/document/product/1207/57513?from_cn_redirect=1)</li>. 
     * @return Zones AZ list. default to all availability zones.
<li>AZs can be queried through the API [DescribeZones](https://www.tencentcloud.comom/document/product/1207/57513?from_cn_redirect=1)</li>.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set AZ list. default to all availability zones.
<li>AZs can be queried through the API [DescribeZones](https://www.tencentcloud.comom/document/product/1207/57513?from_cn_redirect=1)</li>.
     * @param Zones AZ list. default to all availability zones.
<li>AZs can be queried through the API [DescribeZones](https://www.tencentcloud.comom/document/product/1207/57513?from_cn_redirect=1)</li>.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    public DescribeBundlesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBundlesRequest(DescribeBundlesRequest source) {
        if (source.BundleIds != null) {
            this.BundleIds = new String[source.BundleIds.length];
            for (int i = 0; i < source.BundleIds.length; i++) {
                this.BundleIds[i] = new String(source.BundleIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BundleIds.", this.BundleIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);

    }
}

