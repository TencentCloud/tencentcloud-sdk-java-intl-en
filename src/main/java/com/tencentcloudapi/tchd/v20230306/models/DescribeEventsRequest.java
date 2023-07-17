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
package com.tencentcloudapi.tchd.v20230306.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventsRequest extends AbstractModel{

    /**
    * event occurrence date
    */
    @SerializedName("EventDate")
    @Expose
    private String EventDate;

    /**
    * Query by Product ID(s). Product ID examples: cvm, lb, cdb, cdn, crs.
    */
    @SerializedName("ProductIds")
    @Expose
    private String [] ProductIds;

    /**
    *  1. Query by Region ID(s). Region ID examples: ap-guangzhou、ap-shanghai、ap-singapore.
2. The region ID for non-region-specific products should be set to non-regional.
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
     * Get event occurrence date 
     * @return EventDate event occurrence date
     */
    public String getEventDate() {
        return this.EventDate;
    }

    /**
     * Set event occurrence date
     * @param EventDate event occurrence date
     */
    public void setEventDate(String EventDate) {
        this.EventDate = EventDate;
    }

    /**
     * Get Query by Product ID(s). Product ID examples: cvm, lb, cdb, cdn, crs. 
     * @return ProductIds Query by Product ID(s). Product ID examples: cvm, lb, cdb, cdn, crs.
     */
    public String [] getProductIds() {
        return this.ProductIds;
    }

    /**
     * Set Query by Product ID(s). Product ID examples: cvm, lb, cdb, cdn, crs.
     * @param ProductIds Query by Product ID(s). Product ID examples: cvm, lb, cdb, cdn, crs.
     */
    public void setProductIds(String [] ProductIds) {
        this.ProductIds = ProductIds;
    }

    /**
     * Get  1. Query by Region ID(s). Region ID examples: ap-guangzhou、ap-shanghai、ap-singapore.
2. The region ID for non-region-specific products should be set to non-regional. 
     * @return RegionIds  1. Query by Region ID(s). Region ID examples: ap-guangzhou、ap-shanghai、ap-singapore.
2. The region ID for non-region-specific products should be set to non-regional.
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set  1. Query by Region ID(s). Region ID examples: ap-guangzhou、ap-shanghai、ap-singapore.
2. The region ID for non-region-specific products should be set to non-regional.
     * @param RegionIds  1. Query by Region ID(s). Region ID examples: ap-guangzhou、ap-shanghai、ap-singapore.
2. The region ID for non-region-specific products should be set to non-regional.
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    public DescribeEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventsRequest(DescribeEventsRequest source) {
        if (source.EventDate != null) {
            this.EventDate = new String(source.EventDate);
        }
        if (source.ProductIds != null) {
            this.ProductIds = new String[source.ProductIds.length];
            for (int i = 0; i < source.ProductIds.length; i++) {
                this.ProductIds[i] = new String(source.ProductIds[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new String[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new String(source.RegionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventDate", this.EventDate);
        this.setParamArraySimple(map, prefix + "ProductIds.", this.ProductIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);

    }
}

