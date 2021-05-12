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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetConfigurationItemsRequest extends AbstractModel{

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Chronological order. Valid values: Reverse, Forward (default).
    */
    @SerializedName("ChronologicalOrder")
    @Expose
    private String ChronologicalOrder;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Whether to enable `DiffMode`. Valid values: true, false (default).
    */
    @SerializedName("DiffMode")
    @Expose
    private Boolean DiffMode;

    /**
    * Returned number. default: 10, maximum: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Chronological order. Valid values: Reverse, Forward (default). 
     * @return ChronologicalOrder Chronological order. Valid values: Reverse, Forward (default).
     */
    public String getChronologicalOrder() {
        return this.ChronologicalOrder;
    }

    /**
     * Set Chronological order. Valid values: Reverse, Forward (default).
     * @param ChronologicalOrder Chronological order. Valid values: Reverse, Forward (default).
     */
    public void setChronologicalOrder(String ChronologicalOrder) {
        this.ChronologicalOrder = ChronologicalOrder;
    }

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
     * Get Whether to enable `DiffMode`. Valid values: true, false (default). 
     * @return DiffMode Whether to enable `DiffMode`. Valid values: true, false (default).
     */
    public Boolean getDiffMode() {
        return this.DiffMode;
    }

    /**
     * Set Whether to enable `DiffMode`. Valid values: true, false (default).
     * @param DiffMode Whether to enable `DiffMode`. Valid values: true, false (default).
     */
    public void setDiffMode(Boolean DiffMode) {
        this.DiffMode = DiffMode;
    }

    /**
     * Get Returned number. default: 10, maximum: 100. 
     * @return Limit Returned number. default: 10, maximum: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Returned number. default: 10, maximum: 100.
     * @param Limit Returned number. default: 10, maximum: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    public GetConfigurationItemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetConfigurationItemsRequest(GetConfigurationItemsRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ChronologicalOrder != null) {
            this.ChronologicalOrder = new String(source.ChronologicalOrder);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DiffMode != null) {
            this.DiffMode = new Boolean(source.DiffMode);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ChronologicalOrder", this.ChronologicalOrder);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DiffMode", this.DiffMode);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

