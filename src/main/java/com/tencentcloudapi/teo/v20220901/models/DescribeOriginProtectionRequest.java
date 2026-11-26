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

public class DescribeOriginProtectionRequest extends AbstractModel {

    /**
    * Site ID set to be queried. This parameter is required.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>need-update<br>        Filter by <strong>whether the site needs to update the origin protection IP allowlist</strong>.<br>       Type: String<br>       Required: No<br>       Option:<br>       true: needs to be updated<br>       false: no update required<br></li>
<li>plan-support<br>   Filter by [<strong>whether the site package supports origin protection</strong>].<br>   Type: String<br>   Required: No<br>   Options:<br>   true: supported<br>   false: not supported<br></li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Paginated query offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The limit of paginated query. Default value: 20. Maximum value: 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Site ID set to be queried. This parameter is required. 
     * @return ZoneIds Site ID set to be queried. This parameter is required.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set to be queried. This parameter is required.
     * @param ZoneIds Site ID set to be queried. This parameter is required.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>need-update<br>        Filter by <strong>whether the site needs to update the origin protection IP allowlist</strong>.<br>       Type: String<br>       Required: No<br>       Option:<br>       true: needs to be updated<br>       false: no update required<br></li>
<li>plan-support<br>   Filter by [<strong>whether the site package supports origin protection</strong>].<br>   Type: String<br>   Required: No<br>   Options:<br>   true: supported<br>   false: not supported<br></li> 
     * @return Filters Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>need-update<br>        Filter by <strong>whether the site needs to update the origin protection IP allowlist</strong>.<br>       Type: String<br>       Required: No<br>       Option:<br>       true: needs to be updated<br>       false: no update required<br></li>
<li>plan-support<br>   Filter by [<strong>whether the site package supports origin protection</strong>].<br>   Type: String<br>   Required: No<br>   Options:<br>   true: supported<br>   false: not supported<br></li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>need-update<br>        Filter by <strong>whether the site needs to update the origin protection IP allowlist</strong>.<br>       Type: String<br>       Required: No<br>       Option:<br>       true: needs to be updated<br>       false: no update required<br></li>
<li>plan-support<br>   Filter by [<strong>whether the site package supports origin protection</strong>].<br>   Type: String<br>   Required: No<br>   Options:<br>   true: supported<br>   false: not supported<br></li>
     * @param Filters Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>need-update<br>        Filter by <strong>whether the site needs to update the origin protection IP allowlist</strong>.<br>       Type: String<br>       Required: No<br>       Option:<br>       true: needs to be updated<br>       false: no update required<br></li>
<li>plan-support<br>   Filter by [<strong>whether the site package supports origin protection</strong>].<br>   Type: String<br>   Required: No<br>   Options:<br>   true: supported<br>   false: not supported<br></li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Paginated query offset. Default value: 0. 
     * @return Offset Paginated query offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paginated query offset. Default value: 0.
     * @param Offset Paginated query offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The limit of paginated query. Default value: 20. Maximum value: 1,000. 
     * @return Limit The limit of paginated query. Default value: 20. Maximum value: 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The limit of paginated query. Default value: 20. Maximum value: 1,000.
     * @param Limit The limit of paginated query. Default value: 20. Maximum value: 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeOriginProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginProtectionRequest(DescribeOriginProtectionRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
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
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

