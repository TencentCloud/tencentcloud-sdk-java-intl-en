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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulScanLocalImageListRequest extends AbstractModel{

    /**
    * Vulnerability scan task ID
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

    /**
    * Filter
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus- string - Required: No - Check status. Valid values: `WAIT_SCAN` (pending); `SCANNING` (checking); `SCANNED` (checked); `SCAN_ERR` (failed to check); `CANCELED` (check ended).</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Number of results to be returned. Default value: `10`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Vulnerability scan task ID 
     * @return TaskID Vulnerability scan task ID
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set Vulnerability scan task ID
     * @param TaskID Vulnerability scan task ID
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get Filter
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus- string - Required: No - Check status. Valid values: `WAIT_SCAN` (pending); `SCANNING` (checking); `SCANNED` (checked); `SCAN_ERR` (failed to check); `CANCELED` (check ended).</li> 
     * @return Filters Filter
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus- string - Required: No - Check status. Valid values: `WAIT_SCAN` (pending); `SCANNING` (checking); `SCANNED` (checked); `SCAN_ERR` (failed to check); `CANCELED` (check ended).</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus- string - Required: No - Check status. Valid values: `WAIT_SCAN` (pending); `SCANNING` (checking); `SCANNED` (checked); `SCAN_ERR` (failed to check); `CANCELED` (check ended).</li>
     * @param Filters Filter
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus- string - Required: No - Check status. Valid values: `WAIT_SCAN` (pending); `SCANNING` (checking); `SCANNED` (checked); `SCAN_ERR` (failed to check); `CANCELED` (check ended).</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of results to be returned. Default value: `10`. Maximum value: `100`. 
     * @return Limit Number of results to be returned. Default value: `10`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: `10`. Maximum value: `100`.
     * @param Limit Number of results to be returned. Default value: `10`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting order 
     * @return Order Sorting order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order
     * @param Order Sorting order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field 
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulScanLocalImageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanLocalImageListRequest(DescribeVulScanLocalImageListRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

