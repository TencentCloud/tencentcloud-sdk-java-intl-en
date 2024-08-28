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

public class CKafkaTopicInfo extends AbstractModel {

    /**
    * Topic ID
    */
    @SerializedName("TopicID")
    @Expose
    private String TopicID;

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Topic ID 
     * @return TopicID Topic ID
     */
    public String getTopicID() {
        return this.TopicID;
    }

    /**
     * Set Topic ID
     * @param TopicID Topic ID
     */
    public void setTopicID(String TopicID) {
        this.TopicID = TopicID;
    }

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public CKafkaTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CKafkaTopicInfo(CKafkaTopicInfo source) {
        if (source.TopicID != null) {
            this.TopicID = new String(source.TopicID);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicID", this.TopicID);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

