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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDefencePluginDetailRequest extends AbstractModel {

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filter criterion. Keywords: IP address or host name. Exception and Status support precise match.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Data offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Data limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Filter criterion. Keywords: IP address or host name. Exception and Status support precise match. 
     * @return Filters Filter criterion. Keywords: IP address or host name. Exception and Status support precise match.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criterion. Keywords: IP address or host name. Exception and Status support precise match.
     * @param Filters Filter criterion. Keywords: IP address or host name. Exception and Status support precise match.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Data offset 
     * @return Offset Data offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset
     * @param Offset Data offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Data limit 
     * @return Limit Data limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Data limit
     * @param Limit Data limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeVulDefencePluginDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefencePluginDetailRequest(DescribeVulDefencePluginDetailRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

