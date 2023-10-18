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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOriginProtectionRequest extends AbstractModel {

    /**
    * List of sites to be queried. All sites will be selected if this field is not specified.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Filter conditions. Each filter condition can have up to 20 entries. See below for details:
<li>`need-update`:<br>   Whether <strong>the intermediate IP update is needed for the site</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Update needed.<br>   `false`: Update not needed.<br></li>
<li>`plan-support`:<br>   Whether <strong>origin protection is supported in the plan</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Origin protection supported.<br>   `false`: Origin protection not supported.<br></li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset for paginated queries. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get List of sites to be queried. All sites will be selected if this field is not specified. 
     * @return ZoneIds List of sites to be queried. All sites will be selected if this field is not specified.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of sites to be queried. All sites will be selected if this field is not specified.
     * @param ZoneIds List of sites to be queried. All sites will be selected if this field is not specified.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Filter conditions. Each filter condition can have up to 20 entries. See below for details:
<li>`need-update`:<br>   Whether <strong>the intermediate IP update is needed for the site</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Update needed.<br>   `false`: Update not needed.<br></li>
<li>`plan-support`:<br>   Whether <strong>origin protection is supported in the plan</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Origin protection supported.<br>   `false`: Origin protection not supported.<br></li> 
     * @return Filters Filter conditions. Each filter condition can have up to 20 entries. See below for details:
<li>`need-update`:<br>   Whether <strong>the intermediate IP update is needed for the site</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Update needed.<br>   `false`: Update not needed.<br></li>
<li>`plan-support`:<br>   Whether <strong>origin protection is supported in the plan</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Origin protection supported.<br>   `false`: Origin protection not supported.<br></li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. Each filter condition can have up to 20 entries. See below for details:
<li>`need-update`:<br>   Whether <strong>the intermediate IP update is needed for the site</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Update needed.<br>   `false`: Update not needed.<br></li>
<li>`plan-support`:<br>   Whether <strong>origin protection is supported in the plan</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Origin protection supported.<br>   `false`: Origin protection not supported.<br></li>
     * @param Filters Filter conditions. Each filter condition can have up to 20 entries. See below for details:
<li>`need-update`:<br>   Whether <strong>the intermediate IP update is needed for the site</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Update needed.<br>   `false`: Update not needed.<br></li>
<li>`plan-support`:<br>   Whether <strong>origin protection is supported in the plan</strong>.<br>   Type: String<br>   Required: No<br>   Values:<br>   `true`: Origin protection supported.<br>   `false`: Origin protection not supported.<br></li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset for paginated queries. Default value: 0. 
     * @return Offset Offset for paginated queries. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: 0.
     * @param Offset Offset for paginated queries. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. Default value: 20. Maximum value: 1000. 
     * @return Limit Limit on paginated queries. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: 20. Maximum value: 1000.
     * @param Limit Limit on paginated queries. Default value: 20. Maximum value: 1000.
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

