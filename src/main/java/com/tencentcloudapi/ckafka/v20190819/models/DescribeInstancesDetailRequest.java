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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesDetailRequest extends AbstractModel{

    /**
    * (Filter) filter by instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * (Filter) filter by instance name. Fuzzy search is supported
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * (Filter) instance status. 0: creating, 1: running, 2: deleting. If this parameter is left empty, all instances will be returned by default
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Offset. If this parameter is left empty, `0` will be used by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. If this parameter is left empty, `10` will be used by default. The maximum value is `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Tag key match.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Filter. Valid values of `filter.Name` include `Ip`, `VpcId`, `SubNetId`, `InstanceType`, and `InstanceId`. Up to 10 values can be passed for `filter.Values`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * This parameter has been deprecated and replaced with `InstanceIdList`.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String InstanceIds;

    /**
    * Filter by instance ID.
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
     * Get (Filter) filter by instance ID 
     * @return InstanceId (Filter) filter by instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set (Filter) filter by instance ID
     * @param InstanceId (Filter) filter by instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get (Filter) filter by instance name. Fuzzy search is supported 
     * @return SearchWord (Filter) filter by instance name. Fuzzy search is supported
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set (Filter) filter by instance name. Fuzzy search is supported
     * @param SearchWord (Filter) filter by instance name. Fuzzy search is supported
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get (Filter) instance status. 0: creating, 1: running, 2: deleting. If this parameter is left empty, all instances will be returned by default 
     * @return Status (Filter) instance status. 0: creating, 1: running, 2: deleting. If this parameter is left empty, all instances will be returned by default
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set (Filter) instance status. 0: creating, 1: running, 2: deleting. If this parameter is left empty, all instances will be returned by default
     * @param Status (Filter) instance status. 0: creating, 1: running, 2: deleting. If this parameter is left empty, all instances will be returned by default
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Offset. If this parameter is left empty, `0` will be used by default. 
     * @return Offset Offset. If this parameter is left empty, `0` will be used by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. If this parameter is left empty, `0` will be used by default.
     * @param Offset Offset. If this parameter is left empty, `0` will be used by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. If this parameter is left empty, `10` will be used by default. The maximum value is `20`. 
     * @return Limit Number of returned results. If this parameter is left empty, `10` will be used by default. The maximum value is `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. If this parameter is left empty, `10` will be used by default. The maximum value is `20`.
     * @param Limit Number of returned results. If this parameter is left empty, `10` will be used by default. The maximum value is `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Tag key match. 
     * @return TagKey Tag key match.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key match.
     * @param TagKey Tag key match.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Filter. Valid values of `filter.Name` include `Ip`, `VpcId`, `SubNetId`, `InstanceType`, and `InstanceId`. Up to 10 values can be passed for `filter.Values`. 
     * @return Filters Filter. Valid values of `filter.Name` include `Ip`, `VpcId`, `SubNetId`, `InstanceType`, and `InstanceId`. Up to 10 values can be passed for `filter.Values`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Valid values of `filter.Name` include `Ip`, `VpcId`, `SubNetId`, `InstanceType`, and `InstanceId`. Up to 10 values can be passed for `filter.Values`.
     * @param Filters Filter. Valid values of `filter.Name` include `Ip`, `VpcId`, `SubNetId`, `InstanceType`, and `InstanceId`. Up to 10 values can be passed for `filter.Values`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get This parameter has been deprecated and replaced with `InstanceIdList`. 
     * @return InstanceIds This parameter has been deprecated and replaced with `InstanceIdList`.
     */
    public String getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set This parameter has been deprecated and replaced with `InstanceIdList`.
     * @param InstanceIds This parameter has been deprecated and replaced with `InstanceIdList`.
     */
    public void setInstanceIds(String InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Filter by instance ID. 
     * @return InstanceIdList Filter by instance ID.
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set Filter by instance ID.
     * @param InstanceIdList Filter by instance ID.
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    public DescribeInstancesDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesDetailRequest(DescribeInstancesDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String(source.InstanceIds);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "InstanceIds", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);

    }
}

