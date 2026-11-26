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

public class DescribeInferenceDomainsRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Inference service ID.</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Sorting field.</p><p>Enumeration values:</p><ul><li>CreateTime: domain name creation time;</li><li>UpdateTime: domain modification time.</li></ul><p>Default value: CreateTime.</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>Sorting method.</p><p>Enumeration values:</p><ul><li>Asc: in ascending order;</li><li>Desc: in descending order.</li></ul><p>Default value: Desc.</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * <p>Paginated query offset.</p><p>Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Paginated query limit.</p><p>Default value: 20.</p><p>Maximum value: 200.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Inference service ID.</p> 
     * @return ServiceId <p>Inference service ID.</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>Inference service ID.</p>
     * @param ServiceId <p>Inference service ID.</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Sorting field.</p><p>Enumeration values:</p><ul><li>CreateTime: domain name creation time;</li><li>UpdateTime: domain modification time.</li></ul><p>Default value: CreateTime.</p> 
     * @return SortBy <p>Sorting field.</p><p>Enumeration values:</p><ul><li>CreateTime: domain name creation time;</li><li>UpdateTime: domain modification time.</li></ul><p>Default value: CreateTime.</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>Sorting field.</p><p>Enumeration values:</p><ul><li>CreateTime: domain name creation time;</li><li>UpdateTime: domain modification time.</li></ul><p>Default value: CreateTime.</p>
     * @param SortBy <p>Sorting field.</p><p>Enumeration values:</p><ul><li>CreateTime: domain name creation time;</li><li>UpdateTime: domain modification time.</li></ul><p>Default value: CreateTime.</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>Sorting method.</p><p>Enumeration values:</p><ul><li>Asc: in ascending order;</li><li>Desc: in descending order.</li></ul><p>Default value: Desc.</p> 
     * @return SortOrder <p>Sorting method.</p><p>Enumeration values:</p><ul><li>Asc: in ascending order;</li><li>Desc: in descending order.</li></ul><p>Default value: Desc.</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>Sorting method.</p><p>Enumeration values:</p><ul><li>Asc: in ascending order;</li><li>Desc: in descending order.</li></ul><p>Default value: Desc.</p>
     * @param SortOrder <p>Sorting method.</p><p>Enumeration values:</p><ul><li>Asc: in ascending order;</li><li>Desc: in descending order.</li></ul><p>Default value: Desc.</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>Paginated query offset.</p><p>Default value: 0.</p> 
     * @return Offset <p>Paginated query offset.</p><p>Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paginated query offset.</p><p>Default value: 0.</p>
     * @param Offset <p>Paginated query offset.</p><p>Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Paginated query limit.</p><p>Default value: 20.</p><p>Maximum value: 200.</p> 
     * @return Limit <p>Paginated query limit.</p><p>Default value: 20.</p><p>Maximum value: 200.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Paginated query limit.</p><p>Default value: 20.</p><p>Maximum value: 200.</p>
     * @param Limit <p>Paginated query limit.</p><p>Default value: 20.</p><p>Maximum value: 200.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInferenceDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferenceDomainsRequest(DescribeInferenceDomainsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

