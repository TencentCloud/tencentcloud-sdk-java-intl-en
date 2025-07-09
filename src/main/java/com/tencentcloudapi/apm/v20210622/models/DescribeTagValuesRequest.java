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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagValuesRequest extends AbstractModel {

    /**
    * Dimension name.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Business system id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Filter criteria.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Start time (unit: sec).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time (unit: seconds).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Or filter criteria.
    */
    @SerializedName("OrFilters")
    @Expose
    private Filter [] OrFilters;

    /**
    * Usage type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Dimension name. 
     * @return TagKey Dimension name.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Dimension name.
     * @param TagKey Dimension name.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Business system id. 
     * @return InstanceId Business system id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system id.
     * @param InstanceId Business system id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Filter criteria. 
     * @return Filters Filter criteria.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria.
     * @param Filters Filter criteria.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Start time (unit: sec). 
     * @return StartTime Start time (unit: sec).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (unit: sec).
     * @param StartTime Start time (unit: sec).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (unit: seconds). 
     * @return EndTime End time (unit: seconds).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (unit: seconds).
     * @param EndTime End time (unit: seconds).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Or filter criteria. 
     * @return OrFilters Or filter criteria.
     */
    public Filter [] getOrFilters() {
        return this.OrFilters;
    }

    /**
     * Set Or filter criteria.
     * @param OrFilters Or filter criteria.
     */
    public void setOrFilters(Filter [] OrFilters) {
        this.OrFilters = OrFilters;
    }

    /**
     * Get Usage type. 
     * @return Type Usage type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Usage type.
     * @param Type Usage type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeTagValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagValuesRequest(DescribeTagValuesRequest source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.OrFilters != null) {
            this.OrFilters = new Filter[source.OrFilters.length];
            for (int i = 0; i < source.OrFilters.length; i++) {
                this.OrFilters[i] = new Filter(source.OrFilters[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "OrFilters.", this.OrFilters);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

