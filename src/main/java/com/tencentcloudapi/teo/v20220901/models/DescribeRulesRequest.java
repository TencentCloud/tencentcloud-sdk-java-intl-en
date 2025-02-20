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

public class DescribeRulesRequest extends AbstractModel {

    /**
    * ID of the site
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filter criteria. the maximum value of filters.values is 20. the detailed filter criteria are as follows:
.
<Li>Rule-Id: filter by rule id.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get ID of the site 
     * @return ZoneId ID of the site
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site
     * @param ZoneId ID of the site
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filter criteria. the maximum value of filters.values is 20. the detailed filter criteria are as follows:
.
<Li>Rule-Id: filter by rule id.</li>. 
     * @return Filters Filter criteria. the maximum value of filters.values is 20. the detailed filter criteria are as follows:
.
<Li>Rule-Id: filter by rule id.</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. the maximum value of filters.values is 20. the detailed filter criteria are as follows:
.
<Li>Rule-Id: filter by rule id.</li>.
     * @param Filters Filter criteria. the maximum value of filters.values is 20. the detailed filter criteria are as follows:
.
<Li>Rule-Id: filter by rule id.</li>.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRulesRequest(DescribeRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

