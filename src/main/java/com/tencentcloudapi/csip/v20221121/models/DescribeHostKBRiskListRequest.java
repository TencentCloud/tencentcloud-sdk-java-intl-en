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

public class DescribeHostKBRiskListRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Filter criteria array. Multiple conditions have an AND relationship with each other<br>Supported Filter.Name:<br>Keyword: fuzzy search by keyword (fuzzy matching on KB ID/name)<br>RiskStatus: remediation status<br>InstanceID: instance ID<br>NewestKB: latest patch (0/1)</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Number of results per page<br>Value range: [1, 100]<br>Default value: 10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting order<br>Enumeration values:<br>ASC: Ascending<br>DESC: Descending<br>Default value: DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field<br>Enumeration values:<br>LatestScanTime: latest scan time<br>Default value: LatestScanTime</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Filter criteria array. Multiple conditions have an AND relationship with each other<br>Supported Filter.Name:<br>Keyword: fuzzy search by keyword (fuzzy matching on KB ID/name)<br>RiskStatus: remediation status<br>InstanceID: instance ID<br>NewestKB: latest patch (0/1)</p> 
     * @return Filters <p>Filter criteria array. Multiple conditions have an AND relationship with each other<br>Supported Filter.Name:<br>Keyword: fuzzy search by keyword (fuzzy matching on KB ID/name)<br>RiskStatus: remediation status<br>InstanceID: instance ID<br>NewestKB: latest patch (0/1)</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria array. Multiple conditions have an AND relationship with each other<br>Supported Filter.Name:<br>Keyword: fuzzy search by keyword (fuzzy matching on KB ID/name)<br>RiskStatus: remediation status<br>InstanceID: instance ID<br>NewestKB: latest patch (0/1)</p>
     * @param Filters <p>Filter criteria array. Multiple conditions have an AND relationship with each other<br>Supported Filter.Name:<br>Keyword: fuzzy search by keyword (fuzzy matching on KB ID/name)<br>RiskStatus: remediation status<br>InstanceID: instance ID<br>NewestKB: latest patch (0/1)</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Number of results per page<br>Value range: [1, 100]<br>Default value: 10</p> 
     * @return Limit <p>Number of results per page<br>Value range: [1, 100]<br>Default value: 10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results per page<br>Value range: [1, 100]<br>Default value: 10</p>
     * @param Limit <p>Number of results per page<br>Value range: [1, 100]<br>Default value: 10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p> 
     * @return Offset <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p>
     * @param Offset <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting order<br>Enumeration values:<br>ASC: Ascending<br>DESC: Descending<br>Default value: DESC</p> 
     * @return Order <p>Sorting order<br>Enumeration values:<br>ASC: Ascending<br>DESC: Descending<br>Default value: DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order<br>Enumeration values:<br>ASC: Ascending<br>DESC: Descending<br>Default value: DESC</p>
     * @param Order <p>Sorting order<br>Enumeration values:<br>ASC: Ascending<br>DESC: Descending<br>Default value: DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field<br>Enumeration values:<br>LatestScanTime: latest scan time<br>Default value: LatestScanTime</p> 
     * @return By <p>Sorting field<br>Enumeration values:<br>LatestScanTime: latest scan time<br>Default value: LatestScanTime</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field<br>Enumeration values:<br>LatestScanTime: latest scan time<br>Default value: LatestScanTime</p>
     * @param By <p>Sorting field<br>Enumeration values:<br>LatestScanTime: latest scan time<br>Default value: LatestScanTime</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeHostKBRiskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostKBRiskListRequest(DescribeHostKBRiskListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
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
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

