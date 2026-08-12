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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulItemListRequest extends AbstractModel {

    /**
    * <p>Filter condition array. Multi-condition with each other is AND relationship<br>SUPPORTED Filter.Name:<br>Keyword: Fuzzy search by Keyword (fuzzy matching for vulnerability Name/CVE/VulID)<br>Category: Vulnerability Category (LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY)<br>Level: Threat Level<br>VPRLevel: VPR rating<br>Label: Risk tag<br>CheckMethod: Detection mode (VERSION_COMPARE/POC/VERSION_COMPARE_POC)<br>DefendStatus: Vulnerability defense status (ENABLED/NOT_SUPPORTED/NOT_ENABLED)<br>SupportFix: Whether one-click repair is SUPPORTED (true/false)<br>EMERGENCY: EMERGENCY vulnerability query (0/1)<br>Top5HotVul: Top 5 hotspot vulnerabilities (0/1)</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field<br>Enumeration value:<br>PublishTime: vulnerability disclosure time<br>Default value: PublishTime</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Filter condition array. Multi-condition with each other is AND relationship<br>SUPPORTED Filter.Name:<br>Keyword: Fuzzy search by Keyword (fuzzy matching for vulnerability Name/CVE/VulID)<br>Category: Vulnerability Category (LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY)<br>Level: Threat Level<br>VPRLevel: VPR rating<br>Label: Risk tag<br>CheckMethod: Detection mode (VERSION_COMPARE/POC/VERSION_COMPARE_POC)<br>DefendStatus: Vulnerability defense status (ENABLED/NOT_SUPPORTED/NOT_ENABLED)<br>SupportFix: Whether one-click repair is SUPPORTED (true/false)<br>EMERGENCY: EMERGENCY vulnerability query (0/1)<br>Top5HotVul: Top 5 hotspot vulnerabilities (0/1)</p> 
     * @return Filters <p>Filter condition array. Multi-condition with each other is AND relationship<br>SUPPORTED Filter.Name:<br>Keyword: Fuzzy search by Keyword (fuzzy matching for vulnerability Name/CVE/VulID)<br>Category: Vulnerability Category (LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY)<br>Level: Threat Level<br>VPRLevel: VPR rating<br>Label: Risk tag<br>CheckMethod: Detection mode (VERSION_COMPARE/POC/VERSION_COMPARE_POC)<br>DefendStatus: Vulnerability defense status (ENABLED/NOT_SUPPORTED/NOT_ENABLED)<br>SupportFix: Whether one-click repair is SUPPORTED (true/false)<br>EMERGENCY: EMERGENCY vulnerability query (0/1)<br>Top5HotVul: Top 5 hotspot vulnerabilities (0/1)</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter condition array. Multi-condition with each other is AND relationship<br>SUPPORTED Filter.Name:<br>Keyword: Fuzzy search by Keyword (fuzzy matching for vulnerability Name/CVE/VulID)<br>Category: Vulnerability Category (LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY)<br>Level: Threat Level<br>VPRLevel: VPR rating<br>Label: Risk tag<br>CheckMethod: Detection mode (VERSION_COMPARE/POC/VERSION_COMPARE_POC)<br>DefendStatus: Vulnerability defense status (ENABLED/NOT_SUPPORTED/NOT_ENABLED)<br>SupportFix: Whether one-click repair is SUPPORTED (true/false)<br>EMERGENCY: EMERGENCY vulnerability query (0/1)<br>Top5HotVul: Top 5 hotspot vulnerabilities (0/1)</p>
     * @param Filters <p>Filter condition array. Multi-condition with each other is AND relationship<br>SUPPORTED Filter.Name:<br>Keyword: Fuzzy search by Keyword (fuzzy matching for vulnerability Name/CVE/VulID)<br>Category: Vulnerability Category (LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY)<br>Level: Threat Level<br>VPRLevel: VPR rating<br>Label: Risk tag<br>CheckMethod: Detection mode (VERSION_COMPARE/POC/VERSION_COMPARE_POC)<br>DefendStatus: Vulnerability defense status (ENABLED/NOT_SUPPORTED/NOT_ENABLED)<br>SupportFix: Whether one-click repair is SUPPORTED (true/false)<br>EMERGENCY: EMERGENCY vulnerability query (0/1)<br>Top5HotVul: Top 5 hotspot vulnerabilities (0/1)</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p> 
     * @return Limit <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     * @param Limit <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p> 
     * @return Offset <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     * @param Offset <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p> 
     * @return Order <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p>
     * @param Order <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field<br>Enumeration value:<br>PublishTime: vulnerability disclosure time<br>Default value: PublishTime</p> 
     * @return By <p>Sorting field<br>Enumeration value:<br>PublishTime: vulnerability disclosure time<br>Default value: PublishTime</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field<br>Enumeration value:<br>PublishTime: vulnerability disclosure time<br>Default value: PublishTime</p>
     * @param By <p>Sorting field<br>Enumeration value:<br>PublishTime: vulnerability disclosure time<br>Default value: PublishTime</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulItemListRequest(DescribeVulItemListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

