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

public class TopicResult extends AbstractModel {

    /**
    * List of returned topic information.
    */
    @SerializedName("TopicList")
    @Expose
    private Topic [] TopicList;

    /**
    * Number of eligible topics.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get List of returned topic information. 
     * @return TopicList List of returned topic information.
     */
    public Topic [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set List of returned topic information.
     * @param TopicList List of returned topic information.
     */
    public void setTopicList(Topic [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get Number of eligible topics. 
     * @return TotalCount Number of eligible topics.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible topics.
     * @param TotalCount Number of eligible topics.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public TopicResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicResult(TopicResult source) {
        if (source.TopicList != null) {
            this.TopicList = new Topic[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new Topic(source.TopicList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

