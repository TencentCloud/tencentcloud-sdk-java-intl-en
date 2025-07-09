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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageAutoAuthorizedTaskListRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Filter field
`Status` (licensing result). Valid values: `ALLSUCCSESS` (licensing succeeded); `PARTIALFAIL` (failed to license some images); `ALLFAIL` (failed to license all images).
Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

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
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Filter field
`Status` (licensing result). Valid values: `ALLSUCCSESS` (licensing succeeded); `PARTIALFAIL` (failed to license some images); `ALLFAIL` (failed to license all images).
Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image). 
     * @return Filters Filter field
`Status` (licensing result). Valid values: `ALLSUCCSESS` (licensing succeeded); `PARTIALFAIL` (failed to license some images); `ALLFAIL` (failed to license all images).
Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter field
`Status` (licensing result). Valid values: `ALLSUCCSESS` (licensing succeeded); `PARTIALFAIL` (failed to license some images); `ALLFAIL` (failed to license all images).
Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     * @param Filters Filter field
`Status` (licensing result). Valid values: `ALLSUCCSESS` (licensing succeeded); `PARTIALFAIL` (failed to license some images); `ALLFAIL` (failed to license all images).
Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     */
    public void setFilters(AssetFilters [] Filters) {
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

    public DescribeImageAutoAuthorizedTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageAutoAuthorizedTaskListRequest(DescribeImageAutoAuthorizedTaskListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

