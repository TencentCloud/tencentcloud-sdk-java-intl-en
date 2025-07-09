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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReservedInstancesRequest extends AbstractModel {

    /**
    * Trial run. Default value: false.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned instances. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>availability zones</strong>] in which reserved instances can be purchased. For example, ap-guangzhou-1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">availability zone list</a>.</p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>validity periods</strong>] of reserved instances, which is the instance purchase duration. For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer.</p><p style="padding-left: 30px;">Unit: Second.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years).</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>specifications of reserved instances</strong>]. For example, S3.MEDIUM4.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance specification list</a>.</p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>types of reserved instances</strong>]. For example, S3.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance type list</a>.</p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filter by <strong>payment types</strong>]. For example, All Upfront (fully prepaid).</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: All Upfront (fully prepaid) | Partial Upfront (partially prepaid) | No Upfront (non-prepaid).</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>platform descriptions</strong>] (operating system) of reserved instances. For example, linux.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid value: linux.</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>IDs of purchased reserved instances</strong>]. For example, 650c138f-ae7e-4750-952a-96841d6e9fc1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>statuses of purchased reserved instances</strong>]. For example, active.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: active (created) | pending (waiting to be created) | retired (expired).</p>
Each request can have up to 10 filters, and each filter can have up to 5 values.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Trial run. Default value: false. 
     * @return DryRun Trial run. Default value: false.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Trial run. Default value: false.
     * @param DryRun Trial run. Default value: false.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned instances. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned instances. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned instances. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned instances. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>availability zones</strong>] in which reserved instances can be purchased. For example, ap-guangzhou-1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">availability zone list</a>.</p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>validity periods</strong>] of reserved instances, which is the instance purchase duration. For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer.</p><p style="padding-left: 30px;">Unit: Second.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years).</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>specifications of reserved instances</strong>]. For example, S3.MEDIUM4.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance specification list</a>.</p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>types of reserved instances</strong>]. For example, S3.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance type list</a>.</p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filter by <strong>payment types</strong>]. For example, All Upfront (fully prepaid).</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: All Upfront (fully prepaid) | Partial Upfront (partially prepaid) | No Upfront (non-prepaid).</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>platform descriptions</strong>] (operating system) of reserved instances. For example, linux.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid value: linux.</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>IDs of purchased reserved instances</strong>]. For example, 650c138f-ae7e-4750-952a-96841d6e9fc1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>statuses of purchased reserved instances</strong>]. For example, active.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: active (created) | pending (waiting to be created) | retired (expired).</p>
Each request can have up to 10 filters, and each filter can have up to 5 values. 
     * @return Filters <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>availability zones</strong>] in which reserved instances can be purchased. For example, ap-guangzhou-1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">availability zone list</a>.</p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>validity periods</strong>] of reserved instances, which is the instance purchase duration. For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer.</p><p style="padding-left: 30px;">Unit: Second.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years).</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>specifications of reserved instances</strong>]. For example, S3.MEDIUM4.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance specification list</a>.</p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>types of reserved instances</strong>]. For example, S3.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance type list</a>.</p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filter by <strong>payment types</strong>]. For example, All Upfront (fully prepaid).</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: All Upfront (fully prepaid) | Partial Upfront (partially prepaid) | No Upfront (non-prepaid).</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>platform descriptions</strong>] (operating system) of reserved instances. For example, linux.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid value: linux.</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>IDs of purchased reserved instances</strong>]. For example, 650c138f-ae7e-4750-952a-96841d6e9fc1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>statuses of purchased reserved instances</strong>]. For example, active.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: active (created) | pending (waiting to be created) | retired (expired).</p>
Each request can have up to 10 filters, and each filter can have up to 5 values.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>availability zones</strong>] in which reserved instances can be purchased. For example, ap-guangzhou-1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">availability zone list</a>.</p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>validity periods</strong>] of reserved instances, which is the instance purchase duration. For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer.</p><p style="padding-left: 30px;">Unit: Second.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years).</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>specifications of reserved instances</strong>]. For example, S3.MEDIUM4.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance specification list</a>.</p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>types of reserved instances</strong>]. For example, S3.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance type list</a>.</p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filter by <strong>payment types</strong>]. For example, All Upfront (fully prepaid).</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: All Upfront (fully prepaid) | Partial Upfront (partially prepaid) | No Upfront (non-prepaid).</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>platform descriptions</strong>] (operating system) of reserved instances. For example, linux.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid value: linux.</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>IDs of purchased reserved instances</strong>]. For example, 650c138f-ae7e-4750-952a-96841d6e9fc1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>statuses of purchased reserved instances</strong>]. For example, active.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: active (created) | pending (waiting to be created) | retired (expired).</p>
Each request can have up to 10 filters, and each filter can have up to 5 values.
     * @param Filters <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>availability zones</strong>] in which reserved instances can be purchased. For example, ap-guangzhou-1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1">availability zone list</a>.</p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>validity periods</strong>] of reserved instances, which is the instance purchase duration. For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer.</p><p style="padding-left: 30px;">Unit: Second.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years).</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>specifications of reserved instances</strong>]. For example, S3.MEDIUM4.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance specification list</a>.</p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>types of reserved instances</strong>]. For example, S3.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: See the <a href="https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1">reserved instance type list</a>.</p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filter by <strong>payment types</strong>]. For example, All Upfront (fully prepaid).</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: All Upfront (fully prepaid) | Partial Upfront (partially prepaid) | No Upfront (non-prepaid).</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>platform descriptions</strong>] (operating system) of reserved instances. For example, linux.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid value: linux.</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>IDs of purchased reserved instances</strong>]. For example, 650c138f-ae7e-4750-952a-96841d6e9fc1.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filter by [<strong>statuses of purchased reserved instances</strong>]. For example, active.</p><p style="padding-left: 30px;">Type: String.</p><p style="padding-left: 30px;">Required: No.</p><p style="padding-left: 30px;">Valid values: active (created) | pending (waiting to be created) | retired (expired).</p>
Each request can have up to 10 filters, and each filter can have up to 5 values.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeReservedInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReservedInstancesRequest(DescribeReservedInstancesRequest source) {
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

