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

public class ConsumerGroup extends AbstractModel{

    /**
    * User group name
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * Subscribed message entity
    */
    @SerializedName("SubscribedInfo")
    @Expose
    private SubscribedInfo [] SubscribedInfo;

    /**
     * Get User group name 
     * @return ConsumerGroupName User group name
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set User group name
     * @param ConsumerGroupName User group name
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get Subscribed message entity 
     * @return SubscribedInfo Subscribed message entity
     */
    public SubscribedInfo [] getSubscribedInfo() {
        return this.SubscribedInfo;
    }

    /**
     * Set Subscribed message entity
     * @param SubscribedInfo Subscribed message entity
     */
    public void setSubscribedInfo(SubscribedInfo [] SubscribedInfo) {
        this.SubscribedInfo = SubscribedInfo;
    }

    public ConsumerGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerGroup(ConsumerGroup source) {
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.SubscribedInfo != null) {
            this.SubscribedInfo = new SubscribedInfo[source.SubscribedInfo.length];
            for (int i = 0; i < source.SubscribedInfo.length; i++) {
                this.SubscribedInfo[i] = new SubscribedInfo(source.SubscribedInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamArrayObj(map, prefix + "SubscribedInfo.", this.SubscribedInfo);

    }
}

