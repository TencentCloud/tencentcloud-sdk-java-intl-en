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

public class DescribeTopicRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Filter by `topicName`. Fuzzy search is supported
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Offset. If this parameter is left empty, 0 will be used by default
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of results to be returned, which defaults to 20 if left empty. The maximum value is 50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Name of the preset ACL rule.
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
     * Get The ckafka cluster instance Id. 
     * @return InstanceId The ckafka cluster instance Id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id.
     * @param InstanceId The ckafka cluster instance Id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Filter by `topicName`. Fuzzy search is supported 
     * @return SearchWord Filter by `topicName`. Fuzzy search is supported
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Filter by `topicName`. Fuzzy search is supported
     * @param SearchWord Filter by `topicName`. Fuzzy search is supported
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
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
     * Get The number of results to be returned, which defaults to 20 if left empty. The maximum value is 50. 
     * @return Limit The number of results to be returned, which defaults to 20 if left empty. The maximum value is 50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results to be returned, which defaults to 20 if left empty. The maximum value is 50.
     * @param Limit The number of results to be returned, which defaults to 20 if left empty. The maximum value is 50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Name of the preset ACL rule. 
     * @return AclRuleName Name of the preset ACL rule.
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set Name of the preset ACL rule.
     * @param AclRuleName Name of the preset ACL rule.
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    public DescribeTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicRequest(DescribeTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AclRuleName != null) {
            this.AclRuleName = new String(source.AclRuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "AclRuleName", this.AclRuleName);

    }
}

