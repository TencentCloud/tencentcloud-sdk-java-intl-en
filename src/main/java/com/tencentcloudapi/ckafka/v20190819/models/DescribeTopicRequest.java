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

public class DescribeTopicRequest extends AbstractModel{

    /**
    * Instance ID
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
    * Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
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
     * Get Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20 
     * @return Limit Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20
     * @param Limit Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

