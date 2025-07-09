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

public class DescribeAttackSourceEventsRequest extends AbstractModel {

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Start date
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * End date
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * EventInfoParam returned by DescribeAttackSource API
    */
    @SerializedName("EventInfoParam")
    @Expose
    private String EventInfoParam;

    /**
    * Maximum number of paginations, which is 10 by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting step size, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Start date 
     * @return BeginDate Start date
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set Start date
     * @param BeginDate Start date
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get End date 
     * @return EndDate End date
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End date
     * @param EndDate End date
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get EventInfoParam returned by DescribeAttackSource API 
     * @return EventInfoParam EventInfoParam returned by DescribeAttackSource API
     */
    public String getEventInfoParam() {
        return this.EventInfoParam;
    }

    /**
     * Set EventInfoParam returned by DescribeAttackSource API
     * @param EventInfoParam EventInfoParam returned by DescribeAttackSource API
     */
    public void setEventInfoParam(String EventInfoParam) {
        this.EventInfoParam = EventInfoParam;
    }

    /**
     * Get Maximum number of paginations, which is 10 by default. 
     * @return Limit Maximum number of paginations, which is 10 by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of paginations, which is 10 by default.
     * @param Limit Maximum number of paginations, which is 10 by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Starting step size, which is 0 by default. 
     * @return Offset Starting step size, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting step size, which is 0 by default.
     * @param Offset Starting step size, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAttackSourceEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackSourceEventsRequest(DescribeAttackSourceEventsRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.EventInfoParam != null) {
            this.EventInfoParam = new String(source.EventInfoParam);
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
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "EventInfoParam", this.EventInfoParam);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

