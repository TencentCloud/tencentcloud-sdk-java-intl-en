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

public class DescribeWindowsPatchListRequest extends AbstractModel {

    /**
    * Pagination parameter
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting order: desc. Default value: asc.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Selectable sorting field
<li>PublishTime</li>
<li>LastScanTime</li>
<li>HostCount</li>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria. <li>Status: string type optional processing status 0-pending, 1-ignored, 3-fixed</li><li>ShowNew: int type optional show latest version 1-enable 0-disable</li><li>Name: string type optional patch name</li><li>KbNo: string type optional Patch Number</li><li>VulName: string type optional vulnerability name</li><li>CVEId: string type optional CVE number</li><li>Uuid: string type optional host uuid</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Pagination parameter 
     * @return Limit Pagination parameter
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter
     * @param Limit Pagination parameter
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting order: desc. Default value: asc. 
     * @return Order Sorting order: desc. Default value: asc.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order: desc. Default value: asc.
     * @param Order Sorting order: desc. Default value: asc.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Selectable sorting field
<li>PublishTime</li>
<li>LastScanTime</li>
<li>HostCount</li> 
     * @return By Selectable sorting field
<li>PublishTime</li>
<li>LastScanTime</li>
<li>HostCount</li>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Selectable sorting field
<li>PublishTime</li>
<li>LastScanTime</li>
<li>HostCount</li>
     * @param By Selectable sorting field
<li>PublishTime</li>
<li>LastScanTime</li>
<li>HostCount</li>
     */
    public void setBy(String By) {
        this.By = By;
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
     * Get Filter criteria. <li>Status: string type optional processing status 0-pending, 1-ignored, 3-fixed</li><li>ShowNew: int type optional show latest version 1-enable 0-disable</li><li>Name: string type optional patch name</li><li>KbNo: string type optional Patch Number</li><li>VulName: string type optional vulnerability name</li><li>CVEId: string type optional CVE number</li><li>Uuid: string type optional host uuid</li> 
     * @return Filters Filter criteria. <li>Status: string type optional processing status 0-pending, 1-ignored, 3-fixed</li><li>ShowNew: int type optional show latest version 1-enable 0-disable</li><li>Name: string type optional patch name</li><li>KbNo: string type optional Patch Number</li><li>VulName: string type optional vulnerability name</li><li>CVEId: string type optional CVE number</li><li>Uuid: string type optional host uuid</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. <li>Status: string type optional processing status 0-pending, 1-ignored, 3-fixed</li><li>ShowNew: int type optional show latest version 1-enable 0-disable</li><li>Name: string type optional patch name</li><li>KbNo: string type optional Patch Number</li><li>VulName: string type optional vulnerability name</li><li>CVEId: string type optional CVE number</li><li>Uuid: string type optional host uuid</li>
     * @param Filters Filter criteria. <li>Status: string type optional processing status 0-pending, 1-ignored, 3-fixed</li><li>ShowNew: int type optional show latest version 1-enable 0-disable</li><li>Name: string type optional patch name</li><li>KbNo: string type optional Patch Number</li><li>VulName: string type optional vulnerability name</li><li>CVEId: string type optional CVE number</li><li>Uuid: string type optional host uuid</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeWindowsPatchListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWindowsPatchListRequest(DescribeWindowsPatchListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

