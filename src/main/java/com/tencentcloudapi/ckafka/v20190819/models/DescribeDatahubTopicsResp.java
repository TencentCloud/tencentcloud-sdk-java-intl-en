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

public class DescribeDatahubTopicsResp extends AbstractModel {

    /**
    * Total count
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Topic list.
    */
    @SerializedName("TopicList")
    @Expose
    private DatahubTopicDTO [] TopicList;

    /**
     * Get Total count 
     * @return TotalCount Total count
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total count
     * @param TotalCount Total count
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Topic list. 
     * @return TopicList Topic list.
     */
    public DatahubTopicDTO [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set Topic list.
     * @param TopicList Topic list.
     */
    public void setTopicList(DatahubTopicDTO [] TopicList) {
        this.TopicList = TopicList;
    }

    public DescribeDatahubTopicsResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTopicsResp(DescribeDatahubTopicsResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TopicList != null) {
            this.TopicList = new DatahubTopicDTO[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new DatahubTopicDTO(source.TopicList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);

    }
}

