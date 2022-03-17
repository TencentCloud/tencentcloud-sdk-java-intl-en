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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListBGPInstancesRequest extends AbstractModel{

    /**
    * Starting offset of the page. Value: (number of pages – 1) * items per page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * IP filter
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * Anti-DDoS instance ID filter. For example, `bgp-00000001`.
    */
    @SerializedName("FilterInstanceId")
    @Expose
    private String FilterInstanceId;

    /**
    * Region filter. For example, `ap-guangzhou`.
    */
    @SerializedName("FilterRegion")
    @Expose
    private String FilterRegion;

    /**
    * Name filter
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

    /**
    * Line filter. Valid values: 1: BGP; 2: Non-BGP.
    */
    @SerializedName("FilterLine")
    @Expose
    private Long FilterLine;

    /**
    * Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked.
    */
    @SerializedName("FilterStatus")
    @Expose
    private String FilterStatus;

    /**
    * Filters by binding status. `bounding`: the instance is bound; `failed`: the binding failed.
    */
    @SerializedName("FilterBoundStatus")
    @Expose
    private String FilterBoundStatus;

    /**
     * Get Starting offset of the page. Value: (number of pages – 1) * items per page. 
     * @return Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of the page. Value: (number of pages – 1) * items per page.
     * @param Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100. 
     * @return Limit Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100.
     * @param Limit Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get IP filter 
     * @return FilterIp IP filter
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set IP filter
     * @param FilterIp IP filter
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get Anti-DDoS instance ID filter. For example, `bgp-00000001`. 
     * @return FilterInstanceId Anti-DDoS instance ID filter. For example, `bgp-00000001`.
     */
    public String getFilterInstanceId() {
        return this.FilterInstanceId;
    }

    /**
     * Set Anti-DDoS instance ID filter. For example, `bgp-00000001`.
     * @param FilterInstanceId Anti-DDoS instance ID filter. For example, `bgp-00000001`.
     */
    public void setFilterInstanceId(String FilterInstanceId) {
        this.FilterInstanceId = FilterInstanceId;
    }

    /**
     * Get Region filter. For example, `ap-guangzhou`. 
     * @return FilterRegion Region filter. For example, `ap-guangzhou`.
     */
    public String getFilterRegion() {
        return this.FilterRegion;
    }

    /**
     * Set Region filter. For example, `ap-guangzhou`.
     * @param FilterRegion Region filter. For example, `ap-guangzhou`.
     */
    public void setFilterRegion(String FilterRegion) {
        this.FilterRegion = FilterRegion;
    }

    /**
     * Get Name filter 
     * @return FilterName Name filter
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set Name filter
     * @param FilterName Name filter
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    /**
     * Get Line filter. Valid values: 1: BGP; 2: Non-BGP. 
     * @return FilterLine Line filter. Valid values: 1: BGP; 2: Non-BGP.
     */
    public Long getFilterLine() {
        return this.FilterLine;
    }

    /**
     * Set Line filter. Valid values: 1: BGP; 2: Non-BGP.
     * @param FilterLine Line filter. Valid values: 1: BGP; 2: Non-BGP.
     */
    public void setFilterLine(Long FilterLine) {
        this.FilterLine = FilterLine;
    }

    /**
     * Get Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked. 
     * @return FilterStatus Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked.
     */
    public String getFilterStatus() {
        return this.FilterStatus;
    }

    /**
     * Set Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked.
     * @param FilterStatus Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked.
     */
    public void setFilterStatus(String FilterStatus) {
        this.FilterStatus = FilterStatus;
    }

    /**
     * Get Filters by binding status. `bounding`: the instance is bound; `failed`: the binding failed. 
     * @return FilterBoundStatus Filters by binding status. `bounding`: the instance is bound; `failed`: the binding failed.
     */
    public String getFilterBoundStatus() {
        return this.FilterBoundStatus;
    }

    /**
     * Set Filters by binding status. `bounding`: the instance is bound; `failed`: the binding failed.
     * @param FilterBoundStatus Filters by binding status. `bounding`: the instance is bound; `failed`: the binding failed.
     */
    public void setFilterBoundStatus(String FilterBoundStatus) {
        this.FilterBoundStatus = FilterBoundStatus;
    }

    public DescribeListBGPInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListBGPInstancesRequest(DescribeListBGPInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
        }
        if (source.FilterInstanceId != null) {
            this.FilterInstanceId = new String(source.FilterInstanceId);
        }
        if (source.FilterRegion != null) {
            this.FilterRegion = new String(source.FilterRegion);
        }
        if (source.FilterName != null) {
            this.FilterName = new String(source.FilterName);
        }
        if (source.FilterLine != null) {
            this.FilterLine = new Long(source.FilterLine);
        }
        if (source.FilterStatus != null) {
            this.FilterStatus = new String(source.FilterStatus);
        }
        if (source.FilterBoundStatus != null) {
            this.FilterBoundStatus = new String(source.FilterBoundStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);
        this.setParamSimple(map, prefix + "FilterInstanceId", this.FilterInstanceId);
        this.setParamSimple(map, prefix + "FilterRegion", this.FilterRegion);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);
        this.setParamSimple(map, prefix + "FilterLine", this.FilterLine);
        this.setParamSimple(map, prefix + "FilterStatus", this.FilterStatus);
        this.setParamSimple(map, prefix + "FilterBoundStatus", this.FilterBoundStatus);

    }
}

