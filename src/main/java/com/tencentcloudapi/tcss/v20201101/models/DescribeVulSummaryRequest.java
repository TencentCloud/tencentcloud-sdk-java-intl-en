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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulSummaryRequest extends AbstractModel {

    /**
    * Filter
<li>OnlyAffectedNewestImage- string- Required: No - Show only vulnerabilities that affect the latest image tags. Valid values: `true`, `false`.</li>
<li>OnlyAffectedContainer-string- Required: No - Show only vulnerabilities that affect containers. Valid values: `true`, `false`.</li>
<li>CategoryType- string - Required: No - Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `ALL` (all vulnerabilities).</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
     * Get Filter
<li>OnlyAffectedNewestImage- string- Required: No - Show only vulnerabilities that affect the latest image tags. Valid values: `true`, `false`.</li>
<li>OnlyAffectedContainer-string- Required: No - Show only vulnerabilities that affect containers. Valid values: `true`, `false`.</li>
<li>CategoryType- string - Required: No - Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `ALL` (all vulnerabilities).</li> 
     * @return Filters Filter
<li>OnlyAffectedNewestImage- string- Required: No - Show only vulnerabilities that affect the latest image tags. Valid values: `true`, `false`.</li>
<li>OnlyAffectedContainer-string- Required: No - Show only vulnerabilities that affect containers. Valid values: `true`, `false`.</li>
<li>CategoryType- string - Required: No - Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `ALL` (all vulnerabilities).</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>OnlyAffectedNewestImage- string- Required: No - Show only vulnerabilities that affect the latest image tags. Valid values: `true`, `false`.</li>
<li>OnlyAffectedContainer-string- Required: No - Show only vulnerabilities that affect containers. Valid values: `true`, `false`.</li>
<li>CategoryType- string - Required: No - Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `ALL` (all vulnerabilities).</li>
     * @param Filters Filter
<li>OnlyAffectedNewestImage- string- Required: No - Show only vulnerabilities that affect the latest image tags. Valid values: `true`, `false`.</li>
<li>OnlyAffectedContainer-string- Required: No - Show only vulnerabilities that affect containers. Valid values: `true`, `false`.</li>
<li>CategoryType- string - Required: No - Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `ALL` (all vulnerabilities).</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVulSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulSummaryRequest(DescribeVulSummaryRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

