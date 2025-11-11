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

public class DescribeTypeInstancesRequest extends AbstractModel {

    /**
    * (Filter condition) filter by instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * (Filter condition) filter by instance name. fuzzy query is supported.
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Instance status (filter condition). valid values: 0: creating, 1: running, 2: deleting. default return: all.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Offset. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. default: 10. maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Matches the Tag key.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
     * Get (Filter condition) filter by instance ID. 
     * @return InstanceId (Filter condition) filter by instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set (Filter condition) filter by instance ID.
     * @param InstanceId (Filter condition) filter by instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get (Filter condition) filter by instance name. fuzzy query is supported. 
     * @return SearchWord (Filter condition) filter by instance name. fuzzy query is supported.
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set (Filter condition) filter by instance name. fuzzy query is supported.
     * @param SearchWord (Filter condition) filter by instance name. fuzzy query is supported.
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Instance status (filter condition). valid values: 0: creating, 1: running, 2: deleting. default return: all. 
     * @return Status Instance status (filter condition). valid values: 0: creating, 1: running, 2: deleting. default return: all.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status (filter condition). valid values: 0: creating, 1: running, 2: deleting. default return: all.
     * @param Status Instance status (filter condition). valid values: 0: creating, 1: running, 2: deleting. default return: all.
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Offset. default value: 0. 
     * @return Offset Offset. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. default value: 0.
     * @param Offset Offset. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. default: 10. maximum value: 100. 
     * @return Limit Number of returned results. default: 10. maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. default: 10. maximum value: 100.
     * @param Limit Number of returned results. default: 10. maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Matches the Tag key. 
     * @return TagKey Matches the Tag key.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Matches the Tag key.
     * @param TagKey Matches the Tag key.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    public DescribeTypeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTypeInstancesRequest(DescribeTypeInstancesRequest source) {
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

    }
}

