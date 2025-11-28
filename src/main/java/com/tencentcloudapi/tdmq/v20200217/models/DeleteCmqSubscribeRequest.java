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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCmqSubscribeRequest extends AbstractModel {

    /**
    * Topic name, which must be unique under the same account in a single region. the name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-).
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Subscription name, uniquely identifies under the same topic of the same account in a single region. subscription name is a string of no more than 64 characters, beginning with a letter, the remaining part can contain letters, digits, and hyphens (-).
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
     * Get Topic name, which must be unique under the same account in a single region. the name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-). 
     * @return TopicName Topic name, which must be unique under the same account in a single region. the name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-).
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name, which must be unique under the same account in a single region. the name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-).
     * @param TopicName Topic name, which must be unique under the same account in a single region. the name is a string of no more than 64 characters, starting with a letter, and the remaining part may include letters, numbers, and hyphens (-).
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Subscription name, uniquely identifies under the same topic of the same account in a single region. subscription name is a string of no more than 64 characters, beginning with a letter, the remaining part can contain letters, digits, and hyphens (-). 
     * @return SubscriptionName Subscription name, uniquely identifies under the same topic of the same account in a single region. subscription name is a string of no more than 64 characters, beginning with a letter, the remaining part can contain letters, digits, and hyphens (-).
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Subscription name, uniquely identifies under the same topic of the same account in a single region. subscription name is a string of no more than 64 characters, beginning with a letter, the remaining part can contain letters, digits, and hyphens (-).
     * @param SubscriptionName Subscription name, uniquely identifies under the same topic of the same account in a single region. subscription name is a string of no more than 64 characters, beginning with a letter, the remaining part can contain letters, digits, and hyphens (-).
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    public DeleteCmqSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCmqSubscribeRequest(DeleteCmqSubscribeRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);

    }
}

