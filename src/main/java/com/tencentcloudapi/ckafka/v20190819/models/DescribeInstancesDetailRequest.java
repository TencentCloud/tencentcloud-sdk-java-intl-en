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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesDetailRequest extends AbstractModel {

    /**
    * <p>(Filtering Conditions) Filter by instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>(Filtering Conditions) Filter by instance name, instance Id, availability zone, VPC Id, or subnet Id. Fuzzy query is supported.</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>(Filtering Conditions) Instance status. Return all by default if left blank.</p><p>Enumeration values:</p><ul><li>-1: Creation failed</li><li>0:Creating</li><li>1:Running</li><li>2:Deleting</li><li>3:Deleted</li><li>4:Deletion failure</li><li>5:Isolated</li><li>7:Upgrading</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>Offset, which is 0 by default.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned results. Default value: 10. Maximum value: 20.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Match the tag key.</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>Filter. filter.Name supports ('Ip', 'VpcId', 'SubNetId', 'InstanceType', 'InstanceId'). filter.Values can transmit up to 10 values.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Deprecated. Use InstanceIdList.</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String InstanceIds;

    /**
    * <p>Filter by instance ID</p>
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * <p>Filter instances based on tag list (take the intersection)</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get <p>(Filtering Conditions) Filter by instance ID</p> 
     * @return InstanceId <p>(Filtering Conditions) Filter by instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>(Filtering Conditions) Filter by instance ID</p>
     * @param InstanceId <p>(Filtering Conditions) Filter by instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>(Filtering Conditions) Filter by instance name, instance Id, availability zone, VPC Id, or subnet Id. Fuzzy query is supported.</p> 
     * @return SearchWord <p>(Filtering Conditions) Filter by instance name, instance Id, availability zone, VPC Id, or subnet Id. Fuzzy query is supported.</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>(Filtering Conditions) Filter by instance name, instance Id, availability zone, VPC Id, or subnet Id. Fuzzy query is supported.</p>
     * @param SearchWord <p>(Filtering Conditions) Filter by instance name, instance Id, availability zone, VPC Id, or subnet Id. Fuzzy query is supported.</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>(Filtering Conditions) Instance status. Return all by default if left blank.</p><p>Enumeration values:</p><ul><li>-1: Creation failed</li><li>0:Creating</li><li>1:Running</li><li>2:Deleting</li><li>3:Deleted</li><li>4:Deletion failure</li><li>5:Isolated</li><li>7:Upgrading</li></ul> 
     * @return Status <p>(Filtering Conditions) Instance status. Return all by default if left blank.</p><p>Enumeration values:</p><ul><li>-1: Creation failed</li><li>0:Creating</li><li>1:Running</li><li>2:Deleting</li><li>3:Deleted</li><li>4:Deletion failure</li><li>5:Isolated</li><li>7:Upgrading</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>(Filtering Conditions) Instance status. Return all by default if left blank.</p><p>Enumeration values:</p><ul><li>-1: Creation failed</li><li>0:Creating</li><li>1:Running</li><li>2:Deleting</li><li>3:Deleted</li><li>4:Deletion failure</li><li>5:Isolated</li><li>7:Upgrading</li></ul>
     * @param Status <p>(Filtering Conditions) Instance status. Return all by default if left blank.</p><p>Enumeration values:</p><ul><li>-1: Creation failed</li><li>0:Creating</li><li>1:Running</li><li>2:Deleting</li><li>3:Deleted</li><li>4:Deletion failure</li><li>5:Isolated</li><li>7:Upgrading</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Offset, which is 0 by default.</p> 
     * @return Offset <p>Offset, which is 0 by default.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset, which is 0 by default.</p>
     * @param Offset <p>Offset, which is 0 by default.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned results. Default value: 10. Maximum value: 20.</p> 
     * @return Limit <p>Number of returned results. Default value: 10. Maximum value: 20.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned results. Default value: 10. Maximum value: 20.</p>
     * @param Limit <p>Number of returned results. Default value: 10. Maximum value: 20.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Match the tag key.</p> 
     * @return TagKey <p>Match the tag key.</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>Match the tag key.</p>
     * @param TagKey <p>Match the tag key.</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>Filter. filter.Name supports ('Ip', 'VpcId', 'SubNetId', 'InstanceType', 'InstanceId'). filter.Values can transmit up to 10 values.</p> 
     * @return Filters <p>Filter. filter.Name supports ('Ip', 'VpcId', 'SubNetId', 'InstanceType', 'InstanceId'). filter.Values can transmit up to 10 values.</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter. filter.Name supports ('Ip', 'VpcId', 'SubNetId', 'InstanceType', 'InstanceId'). filter.Values can transmit up to 10 values.</p>
     * @param Filters <p>Filter. filter.Name supports ('Ip', 'VpcId', 'SubNetId', 'InstanceType', 'InstanceId'). filter.Values can transmit up to 10 values.</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Deprecated. Use InstanceIdList.</p> 
     * @return InstanceIds <p>Deprecated. Use InstanceIdList.</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Deprecated. Use InstanceIdList.</p>
     * @param InstanceIds <p>Deprecated. Use InstanceIdList.</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceIds(String InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Filter by instance ID</p> 
     * @return InstanceIdList <p>Filter by instance ID</p>
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set <p>Filter by instance ID</p>
     * @param InstanceIdList <p>Filter by instance ID</p>
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get <p>Filter instances based on tag list (take the intersection)</p> 
     * @return TagList <p>Filter instances based on tag list (take the intersection)</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Filter instances based on tag list (take the intersection)</p>
     * @param TagList <p>Filter instances based on tag list (take the intersection)</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
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
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
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
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

