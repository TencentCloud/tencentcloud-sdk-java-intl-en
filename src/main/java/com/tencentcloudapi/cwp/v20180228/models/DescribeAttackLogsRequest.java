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

public class DescribeAttackLogsRequest extends AbstractModel {

    /**
    * Number of returns. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria
<li>HttpMethod - String - required: no - attack method (POST|GET)</li>
<li>DateRange - String - required: no - timeframe (store data from the past 3 months), such as the last month ["2019-11-17", "2019-12-17"]</li>
<li>VulType - String threat type - required: no</li>
<li>SrcIp - String attack source IP - required: no</li>
<li>DstIp - String attack target IP - required: no</li>
<li>SrcPort - String attack source port - required: no</li>
<li>DstPort - String attack target port - required: no</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * CWPP client ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * CVM machine ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get Number of returns. The maximum value is 100. 
     * @return Limit Number of returns. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns. The maximum value is 100.
     * @param Limit Number of returns. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criteria
<li>HttpMethod - String - required: no - attack method (POST|GET)</li>
<li>DateRange - String - required: no - timeframe (store data from the past 3 months), such as the last month ["2019-11-17", "2019-12-17"]</li>
<li>VulType - String threat type - required: no</li>
<li>SrcIp - String attack source IP - required: no</li>
<li>DstIp - String attack target IP - required: no</li>
<li>SrcPort - String attack source port - required: no</li>
<li>DstPort - String attack target port - required: no</li> 
     * @return Filters Filter criteria
<li>HttpMethod - String - required: no - attack method (POST|GET)</li>
<li>DateRange - String - required: no - timeframe (store data from the past 3 months), such as the last month ["2019-11-17", "2019-12-17"]</li>
<li>VulType - String threat type - required: no</li>
<li>SrcIp - String attack source IP - required: no</li>
<li>DstIp - String attack target IP - required: no</li>
<li>SrcPort - String attack source port - required: no</li>
<li>DstPort - String attack target port - required: no</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>HttpMethod - String - required: no - attack method (POST|GET)</li>
<li>DateRange - String - required: no - timeframe (store data from the past 3 months), such as the last month ["2019-11-17", "2019-12-17"]</li>
<li>VulType - String threat type - required: no</li>
<li>SrcIp - String attack source IP - required: no</li>
<li>DstIp - String attack target IP - required: no</li>
<li>SrcPort - String attack source port - required: no</li>
<li>DstPort - String attack target port - required: no</li>
     * @param Filters Filter criteria
<li>HttpMethod - String - required: no - attack method (POST|GET)</li>
<li>DateRange - String - required: no - timeframe (store data from the past 3 months), such as the last month ["2019-11-17", "2019-12-17"]</li>
<li>VulType - String threat type - required: no</li>
<li>SrcIp - String attack source IP - required: no</li>
<li>DstIp - String attack target IP - required: no</li>
<li>SrcPort - String attack source port - required: no</li>
<li>DstPort - String attack target port - required: no</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get CWPP client ID 
     * @return Uuid CWPP client ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP client ID
     * @param Uuid CWPP client ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get CVM machine ID 
     * @return Quuid CVM machine ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM machine ID
     * @param Quuid CVM machine ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public DescribeAttackLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackLogsRequest(DescribeAttackLogsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

