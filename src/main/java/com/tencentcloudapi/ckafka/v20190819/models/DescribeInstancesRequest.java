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

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * (Query condition) filter by the ckafka cluster instance Id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Search term. example: (query condition) filter by instance name. fuzzy query is supported.
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Instance status (query condition). valid values: 0: creating, 1: running, 2: deleting, 5: isolated, 7: upgrading. default return: all.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Offset. If this parameter is left empty, 0 will be used by default
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Tag key value (this field has been deprecated).
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * (Query condition) VPC Id.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get (Query condition) filter by the ckafka cluster instance Id. 
     * @return InstanceId (Query condition) filter by the ckafka cluster instance Id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set (Query condition) filter by the ckafka cluster instance Id.
     * @param InstanceId (Query condition) filter by the ckafka cluster instance Id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Search term. example: (query condition) filter by instance name. fuzzy query is supported. 
     * @return SearchWord Search term. example: (query condition) filter by instance name. fuzzy query is supported.
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Search term. example: (query condition) filter by instance name. fuzzy query is supported.
     * @param SearchWord Search term. example: (query condition) filter by instance name. fuzzy query is supported.
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Instance status (query condition). valid values: 0: creating, 1: running, 2: deleting, 5: isolated, 7: upgrading. default return: all. 
     * @return Status Instance status (query condition). valid values: 0: creating, 1: running, 2: deleting, 5: isolated, 7: upgrading. default return: all.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status (query condition). valid values: 0: creating, 1: running, 2: deleting, 5: isolated, 7: upgrading. default return: all.
     * @param Status Instance status (query condition). valid values: 0: creating, 1: running, 2: deleting, 5: isolated, 7: upgrading. default return: all.
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Offset. If this parameter is left empty, 0 will be used by default 
     * @return Offset Offset. If this parameter is left empty, 0 will be used by default
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. If this parameter is left empty, 0 will be used by default
     * @param Offset Offset. If this parameter is left empty, 0 will be used by default
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 100. 
     * @return Limit Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 100.
     * @param Limit Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Tag key value (this field has been deprecated). 
     * @return TagKey Tag key value (this field has been deprecated).
     * @deprecated
     */
    @Deprecated
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key value (this field has been deprecated).
     * @param TagKey Tag key value (this field has been deprecated).
     * @deprecated
     */
    @Deprecated
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get (Query condition) VPC Id. 
     * @return VpcId (Query condition) VPC Id.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set (Query condition) VPC Id.
     * @param VpcId (Query condition) VPC Id.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
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
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
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
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

