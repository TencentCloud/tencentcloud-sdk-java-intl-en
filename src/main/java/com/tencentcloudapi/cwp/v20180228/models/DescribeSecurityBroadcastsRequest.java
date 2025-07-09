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

public class DescribeSecurityBroadcastsRequest extends AbstractModel {

    /**
    * Offset, which defaults to 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of records to return, which is 10 by default, and 0 = all.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter release date: start time
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * Filter release date: end time
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Filter security report type: 0 - emergency notification; 1 - feature update; 2 - industry honor; 3 - version release
    */
    @SerializedName("BroadcastType")
    @Expose
    private String BroadcastType;

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
     * Get Number of records to return, which is 10 by default, and 0 = all. 
     * @return Limit Number of records to return, which is 10 by default, and 0 = all.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of records to return, which is 10 by default, and 0 = all.
     * @param Limit Number of records to return, which is 10 by default, and 0 = all.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter release date: start time 
     * @return BeginDate Filter release date: start time
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set Filter release date: start time
     * @param BeginDate Filter release date: start time
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get Filter release date: end time 
     * @return EndDate Filter release date: end time
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set Filter release date: end time
     * @param EndDate Filter release date: end time
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Filter security report type: 0 - emergency notification; 1 - feature update; 2 - industry honor; 3 - version release 
     * @return BroadcastType Filter security report type: 0 - emergency notification; 1 - feature update; 2 - industry honor; 3 - version release
     */
    public String getBroadcastType() {
        return this.BroadcastType;
    }

    /**
     * Set Filter security report type: 0 - emergency notification; 1 - feature update; 2 - industry honor; 3 - version release
     * @param BroadcastType Filter security report type: 0 - emergency notification; 1 - feature update; 2 - industry honor; 3 - version release
     */
    public void setBroadcastType(String BroadcastType) {
        this.BroadcastType = BroadcastType;
    }

    public DescribeSecurityBroadcastsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityBroadcastsRequest(DescribeSecurityBroadcastsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.BroadcastType != null) {
            this.BroadcastType = new String(source.BroadcastType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "BroadcastType", this.BroadcastType);

    }
}

