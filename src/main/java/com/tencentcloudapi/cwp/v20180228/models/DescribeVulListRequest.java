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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulListRequest extends AbstractModel {

    /**
    * Number of returns, with the maximum value being 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which defaults to 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria
<li>Status - String - required: no - processing status: 0: pending; 1: allowlisted; 2: deleted; 3: ignored</li>
<li>ModifyTime - String - required: no - last occurrence time</li>
<li>Uuid- String - required: no - query by host UUID</li>
<li>VulName- string -</li>
<li>VulCategory- string - required: no - vulnerability category: 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability</li>
<li>IsSupportDefense - int - required: no - support for defense: 0: not supported; 1: supported</li>
<li>Labels - string - required: no - tag for search</li>
<li>IsSupportAutoFix - string - required: no - whether automatic fixing is supported: 0: not supported; 1: supported</li>
<li>CvssScore - string - required: no - lower limit of CVSS score</li>
<li>AttackLevel - string - required: no - lower limit of attack level</li>


    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting field: Level, LastTime, and HostCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting order: desc and asc. Default value: asc.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Number of returns, with the maximum value being 100. 
     * @return Limit Number of returns, with the maximum value being 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns, with the maximum value being 100.
     * @param Limit Number of returns, with the maximum value being 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which defaults to 0 
     * @return Offset Offset, which defaults to 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which defaults to 0
     * @param Offset Offset, which defaults to 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criteria
<li>Status - String - required: no - processing status: 0: pending; 1: allowlisted; 2: deleted; 3: ignored</li>
<li>ModifyTime - String - required: no - last occurrence time</li>
<li>Uuid- String - required: no - query by host UUID</li>
<li>VulName- string -</li>
<li>VulCategory- string - required: no - vulnerability category: 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability</li>
<li>IsSupportDefense - int - required: no - support for defense: 0: not supported; 1: supported</li>
<li>Labels - string - required: no - tag for search</li>
<li>IsSupportAutoFix - string - required: no - whether automatic fixing is supported: 0: not supported; 1: supported</li>
<li>CvssScore - string - required: no - lower limit of CVSS score</li>
<li>AttackLevel - string - required: no - lower limit of attack level</li>

 
     * @return Filters Filter criteria
<li>Status - String - required: no - processing status: 0: pending; 1: allowlisted; 2: deleted; 3: ignored</li>
<li>ModifyTime - String - required: no - last occurrence time</li>
<li>Uuid- String - required: no - query by host UUID</li>
<li>VulName- string -</li>
<li>VulCategory- string - required: no - vulnerability category: 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability</li>
<li>IsSupportDefense - int - required: no - support for defense: 0: not supported; 1: supported</li>
<li>Labels - string - required: no - tag for search</li>
<li>IsSupportAutoFix - string - required: no - whether automatic fixing is supported: 0: not supported; 1: supported</li>
<li>CvssScore - string - required: no - lower limit of CVSS score</li>
<li>AttackLevel - string - required: no - lower limit of attack level</li>


     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Status - String - required: no - processing status: 0: pending; 1: allowlisted; 2: deleted; 3: ignored</li>
<li>ModifyTime - String - required: no - last occurrence time</li>
<li>Uuid- String - required: no - query by host UUID</li>
<li>VulName- string -</li>
<li>VulCategory- string - required: no - vulnerability category: 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability</li>
<li>IsSupportDefense - int - required: no - support for defense: 0: not supported; 1: supported</li>
<li>Labels - string - required: no - tag for search</li>
<li>IsSupportAutoFix - string - required: no - whether automatic fixing is supported: 0: not supported; 1: supported</li>
<li>CvssScore - string - required: no - lower limit of CVSS score</li>
<li>AttackLevel - string - required: no - lower limit of attack level</li>


     * @param Filters Filter criteria
<li>Status - String - required: no - processing status: 0: pending; 1: allowlisted; 2: deleted; 3: ignored</li>
<li>ModifyTime - String - required: no - last occurrence time</li>
<li>Uuid- String - required: no - query by host UUID</li>
<li>VulName- string -</li>
<li>VulCategory- string - required: no - vulnerability category: 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability</li>
<li>IsSupportDefense - int - required: no - support for defense: 0: not supported; 1: supported</li>
<li>Labels - string - required: no - tag for search</li>
<li>IsSupportAutoFix - string - required: no - whether automatic fixing is supported: 0: not supported; 1: supported</li>
<li>CvssScore - string - required: no - lower limit of CVSS score</li>
<li>AttackLevel - string - required: no - lower limit of attack level</li>


     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field: Level, LastTime, and HostCount 
     * @return By Sorting field: Level, LastTime, and HostCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: Level, LastTime, and HostCount
     * @param By Sorting field: Level, LastTime, and HostCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting order: desc and asc. Default value: asc. 
     * @return Order Sorting order: desc and asc. Default value: asc.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order: desc and asc. Default value: asc.
     * @param Order Sorting order: desc and asc. Default value: asc.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeVulListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulListRequest(DescribeVulListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

