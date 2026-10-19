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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcFwIpStatRequest extends AbstractModel {

    /**
    * <p>Entries per page</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset value</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Firewall group ID</p>
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * <p>Instance id of the firewall</p>
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * <p>Selected time interval 1: within an hour, 2: 24 hours, 3: 7 days, 4: 1 month</p>
    */
    @SerializedName("TimeType")
    @Expose
    private Long TimeType;

    /**
    * <p>Filter condition composite</p>
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * <p>Start time of retrieval. Can be omitted.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time of retrieval. Can be omitted.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>desc: descending order; asc: ascending order. Sort by the value of the By field. If any parameters are loaded, by must have a value.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Fields used for sorting</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Entries per page</p> 
     * @return Limit <p>Entries per page</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Entries per page</p>
     * @param Limit <p>Entries per page</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset value</p> 
     * @return Offset <p>Offset value</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset value</p>
     * @param Offset <p>Offset value</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Firewall group ID</p> 
     * @return FwGroupId <p>Firewall group ID</p>
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set <p>Firewall group ID</p>
     * @param FwGroupId <p>Firewall group ID</p>
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get <p>Instance id of the firewall</p> 
     * @return FwInsId <p>Instance id of the firewall</p>
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set <p>Instance id of the firewall</p>
     * @param FwInsId <p>Instance id of the firewall</p>
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get <p>Selected time interval 1: within an hour, 2: 24 hours, 3: 7 days, 4: 1 month</p> 
     * @return TimeType <p>Selected time interval 1: within an hour, 2: 24 hours, 3: 7 days, 4: 1 month</p>
     */
    public Long getTimeType() {
        return this.TimeType;
    }

    /**
     * Set <p>Selected time interval 1: within an hour, 2: 24 hours, 3: 7 days, 4: 1 month</p>
     * @param TimeType <p>Selected time interval 1: within an hour, 2: 24 hours, 3: 7 days, 4: 1 month</p>
     */
    public void setTimeType(Long TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get <p>Filter condition composite</p> 
     * @return Filters <p>Filter condition composite</p>
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter condition composite</p>
     * @param Filters <p>Filter condition composite</p>
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Start time of retrieval. Can be omitted.</p> 
     * @return StartTime <p>Start time of retrieval. Can be omitted.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time of retrieval. Can be omitted.</p>
     * @param StartTime <p>Start time of retrieval. Can be omitted.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time of retrieval. Can be omitted.</p> 
     * @return EndTime <p>End time of retrieval. Can be omitted.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time of retrieval. Can be omitted.</p>
     * @param EndTime <p>End time of retrieval. Can be omitted.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>desc: descending order; asc: ascending order. Sort by the value of the By field. If any parameters are loaded, by must have a value.</p> 
     * @return Order <p>desc: descending order; asc: ascending order. Sort by the value of the By field. If any parameters are loaded, by must have a value.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>desc: descending order; asc: ascending order. Sort by the value of the By field. If any parameters are loaded, by must have a value.</p>
     * @param Order <p>desc: descending order; asc: ascending order. Sort by the value of the By field. If any parameters are loaded, by must have a value.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Fields used for sorting</p> 
     * @return By <p>Fields used for sorting</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Fields used for sorting</p>
     * @param By <p>Fields used for sorting</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVpcFwIpStatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcFwIpStatRequest(DescribeVpcFwIpStatRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.TimeType != null) {
            this.TimeType = new Long(source.TimeType);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

