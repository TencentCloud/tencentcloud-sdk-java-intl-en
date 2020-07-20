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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCcnRegionBandwidthLimitsRequest extends AbstractModel{

    /**
    * The CCN instance ID, such as `ccn-f49l6u0z`.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The filter condition.
<li>sregion - String - (Filter condition) Filter by the source region, such as 'ap-guangzhou'.</li>
<li>dregion - String - (Filter condition) Filter by the destination region, such as 'ap-shanghai-bm'.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The sorting condition. Valid values: `BandwidthLimit` and `ExpireTime`.
    */
    @SerializedName("SortedBy")
    @Expose
    private String SortedBy;

    /**
    * The offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The returned quantity.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * In ascending or descending order. Valid values: 'ASC' and 'DESC'.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get The CCN instance ID, such as `ccn-f49l6u0z`. 
     * @return CcnId The CCN instance ID, such as `ccn-f49l6u0z`.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The CCN instance ID, such as `ccn-f49l6u0z`.
     * @param CcnId The CCN instance ID, such as `ccn-f49l6u0z`.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The filter condition.
<li>sregion - String - (Filter condition) Filter by the source region, such as 'ap-guangzhou'.</li>
<li>dregion - String - (Filter condition) Filter by the destination region, such as 'ap-shanghai-bm'.</li> 
     * @return Filters The filter condition.
<li>sregion - String - (Filter condition) Filter by the source region, such as 'ap-guangzhou'.</li>
<li>dregion - String - (Filter condition) Filter by the destination region, such as 'ap-shanghai-bm'.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The filter condition.
<li>sregion - String - (Filter condition) Filter by the source region, such as 'ap-guangzhou'.</li>
<li>dregion - String - (Filter condition) Filter by the destination region, such as 'ap-shanghai-bm'.</li>
     * @param Filters The filter condition.
<li>sregion - String - (Filter condition) Filter by the source region, such as 'ap-guangzhou'.</li>
<li>dregion - String - (Filter condition) Filter by the destination region, such as 'ap-shanghai-bm'.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The sorting condition. Valid values: `BandwidthLimit` and `ExpireTime`. 
     * @return SortedBy The sorting condition. Valid values: `BandwidthLimit` and `ExpireTime`.
     */
    public String getSortedBy() {
        return this.SortedBy;
    }

    /**
     * Set The sorting condition. Valid values: `BandwidthLimit` and `ExpireTime`.
     * @param SortedBy The sorting condition. Valid values: `BandwidthLimit` and `ExpireTime`.
     */
    public void setSortedBy(String SortedBy) {
        this.SortedBy = SortedBy;
    }

    /**
     * Get The offset. 
     * @return Offset The offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset.
     * @param Offset The offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The returned quantity. 
     * @return Limit The returned quantity.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The returned quantity.
     * @param Limit The returned quantity.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get In ascending or descending order. Valid values: 'ASC' and 'DESC'. 
     * @return OrderBy In ascending or descending order. Valid values: 'ASC' and 'DESC'.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set In ascending or descending order. Valid values: 'ASC' and 'DESC'.
     * @param OrderBy In ascending or descending order. Valid values: 'ASC' and 'DESC'.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortedBy", this.SortedBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

