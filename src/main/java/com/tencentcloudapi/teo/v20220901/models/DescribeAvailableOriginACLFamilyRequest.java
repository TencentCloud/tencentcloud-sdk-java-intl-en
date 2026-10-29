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

public class DescribeAvailableOriginACLFamilyRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all available versions under the current site are returned. The IP range control domain of origin protection includes the standard control domain and the streamlined control domain. The main difference between the standard control domain and the streamlined control domain is the quantity difference of origin IP ranges provided. The latter has fewer IP ranges, however it is limited in use. Contact technical support if needed. Specific values are as follows:<br>Detailed filter criteria are as follows:<br>OriginACLFamily: filter by control domain;</p><li>gaz: standard global availability zone control domain;</li><li>mlc: standard Chinese mainland availability zone control domain;</li><li>emc: standard global (excluding Chinese mainland) availability zone control domain;</li><li>plat-gaz: streamlined global availability zone control domain;</li><li>plat-mlc: streamlined Chinese mainland availability zone control domain;</li><li>plat-emc: streamlined global (excluding Chinese mainland) availability zone control domain;</li><li>plat-specific-gaz: custom edition global availability zone control domain;</li><li>plat-specific-mlc: custom edition Chinese mainland availability zone control domain;</li><li>plat-specific-emc: custom edition global (excluding Chinese mainland) availability zone control domain.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>The offset of paginated query. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number limit of paginated query. Default value: 20. Maximum value: 100.</p>
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
     * Get <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all available versions under the current site are returned. The IP range control domain of origin protection includes the standard control domain and the streamlined control domain. The main difference between the standard control domain and the streamlined control domain is the quantity difference of origin IP ranges provided. The latter has fewer IP ranges, however it is limited in use. Contact technical support if needed. Specific values are as follows:<br>Detailed filter criteria are as follows:<br>OriginACLFamily: filter by control domain;</p><li>gaz: standard global availability zone control domain;</li><li>mlc: standard Chinese mainland availability zone control domain;</li><li>emc: standard global (excluding Chinese mainland) availability zone control domain;</li><li>plat-gaz: streamlined global availability zone control domain;</li><li>plat-mlc: streamlined Chinese mainland availability zone control domain;</li><li>plat-emc: streamlined global (excluding Chinese mainland) availability zone control domain;</li><li>plat-specific-gaz: custom edition global availability zone control domain;</li><li>plat-specific-mlc: custom edition Chinese mainland availability zone control domain;</li><li>plat-specific-emc: custom edition global (excluding Chinese mainland) availability zone control domain.</li> 
     * @return Filters <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all available versions under the current site are returned. The IP range control domain of origin protection includes the standard control domain and the streamlined control domain. The main difference between the standard control domain and the streamlined control domain is the quantity difference of origin IP ranges provided. The latter has fewer IP ranges, however it is limited in use. Contact technical support if needed. Specific values are as follows:<br>Detailed filter criteria are as follows:<br>OriginACLFamily: filter by control domain;</p><li>gaz: standard global availability zone control domain;</li><li>mlc: standard Chinese mainland availability zone control domain;</li><li>emc: standard global (excluding Chinese mainland) availability zone control domain;</li><li>plat-gaz: streamlined global availability zone control domain;</li><li>plat-mlc: streamlined Chinese mainland availability zone control domain;</li><li>plat-emc: streamlined global (excluding Chinese mainland) availability zone control domain;</li><li>plat-specific-gaz: custom edition global availability zone control domain;</li><li>plat-specific-mlc: custom edition Chinese mainland availability zone control domain;</li><li>plat-specific-emc: custom edition global (excluding Chinese mainland) availability zone control domain.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all available versions under the current site are returned. The IP range control domain of origin protection includes the standard control domain and the streamlined control domain. The main difference between the standard control domain and the streamlined control domain is the quantity difference of origin IP ranges provided. The latter has fewer IP ranges, however it is limited in use. Contact technical support if needed. Specific values are as follows:<br>Detailed filter criteria are as follows:<br>OriginACLFamily: filter by control domain;</p><li>gaz: standard global availability zone control domain;</li><li>mlc: standard Chinese mainland availability zone control domain;</li><li>emc: standard global (excluding Chinese mainland) availability zone control domain;</li><li>plat-gaz: streamlined global availability zone control domain;</li><li>plat-mlc: streamlined Chinese mainland availability zone control domain;</li><li>plat-emc: streamlined global (excluding Chinese mainland) availability zone control domain;</li><li>plat-specific-gaz: custom edition global availability zone control domain;</li><li>plat-specific-mlc: custom edition Chinese mainland availability zone control domain;</li><li>plat-specific-emc: custom edition global (excluding Chinese mainland) availability zone control domain.</li>
     * @param Filters <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all available versions under the current site are returned. The IP range control domain of origin protection includes the standard control domain and the streamlined control domain. The main difference between the standard control domain and the streamlined control domain is the quantity difference of origin IP ranges provided. The latter has fewer IP ranges, however it is limited in use. Contact technical support if needed. Specific values are as follows:<br>Detailed filter criteria are as follows:<br>OriginACLFamily: filter by control domain;</p><li>gaz: standard global availability zone control domain;</li><li>mlc: standard Chinese mainland availability zone control domain;</li><li>emc: standard global (excluding Chinese mainland) availability zone control domain;</li><li>plat-gaz: streamlined global availability zone control domain;</li><li>plat-mlc: streamlined Chinese mainland availability zone control domain;</li><li>plat-emc: streamlined global (excluding Chinese mainland) availability zone control domain;</li><li>plat-specific-gaz: custom edition global availability zone control domain;</li><li>plat-specific-mlc: custom edition Chinese mainland availability zone control domain;</li><li>plat-specific-emc: custom edition global (excluding Chinese mainland) availability zone control domain.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>The offset of paginated query. Default value: 0.</p> 
     * @return Offset <p>The offset of paginated query. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>The offset of paginated query. Default value: 0.</p>
     * @param Offset <p>The offset of paginated query. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number limit of paginated query. Default value: 20. Maximum value: 100.</p> 
     * @return Limit <p>Number limit of paginated query. Default value: 20. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number limit of paginated query. Default value: 20. Maximum value: 100.</p>
     * @param Limit <p>Number limit of paginated query. Default value: 20. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAvailableOriginACLFamilyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableOriginACLFamilyRequest(DescribeAvailableOriginACLFamilyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

