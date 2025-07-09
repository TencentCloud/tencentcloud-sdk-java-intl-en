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

public class TopicInSyncReplicaResult extends AbstractModel {

    /**
    * Set of topic details and replicas
    */
    @SerializedName("TopicInSyncReplicaList")
    @Expose
    private TopicInSyncReplicaInfo [] TopicInSyncReplicaList;

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get Set of topic details and replicas 
     * @return TopicInSyncReplicaList Set of topic details and replicas
     */
    public TopicInSyncReplicaInfo [] getTopicInSyncReplicaList() {
        return this.TopicInSyncReplicaList;
    }

    /**
     * Set Set of topic details and replicas
     * @param TopicInSyncReplicaList Set of topic details and replicas
     */
    public void setTopicInSyncReplicaList(TopicInSyncReplicaInfo [] TopicInSyncReplicaList) {
        this.TopicInSyncReplicaList = TopicInSyncReplicaList;
    }

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public TopicInSyncReplicaResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicInSyncReplicaResult(TopicInSyncReplicaResult source) {
        if (source.TopicInSyncReplicaList != null) {
            this.TopicInSyncReplicaList = new TopicInSyncReplicaInfo[source.TopicInSyncReplicaList.length];
            for (int i = 0; i < source.TopicInSyncReplicaList.length; i++) {
                this.TopicInSyncReplicaList[i] = new TopicInSyncReplicaInfo(source.TopicInSyncReplicaList[i]);
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
        this.setParamArrayObj(map, prefix + "TopicInSyncReplicaList.", this.TopicInSyncReplicaList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

