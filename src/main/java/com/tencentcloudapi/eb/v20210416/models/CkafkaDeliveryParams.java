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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CkafkaDeliveryParams extends AbstractModel {

    /**
    * ckafka topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Six-Segment QCS description of CKafka resource
    */
    @SerializedName("ResourceDescription")
    @Expose
    private String ResourceDescription;

    /**
     * Get ckafka topic name 
     * @return TopicName ckafka topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set ckafka topic name
     * @param TopicName ckafka topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Six-Segment QCS description of CKafka resource 
     * @return ResourceDescription Six-Segment QCS description of CKafka resource
     */
    public String getResourceDescription() {
        return this.ResourceDescription;
    }

    /**
     * Set Six-Segment QCS description of CKafka resource
     * @param ResourceDescription Six-Segment QCS description of CKafka resource
     */
    public void setResourceDescription(String ResourceDescription) {
        this.ResourceDescription = ResourceDescription;
    }

    public CkafkaDeliveryParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CkafkaDeliveryParams(CkafkaDeliveryParams source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.ResourceDescription != null) {
            this.ResourceDescription = new String(source.ResourceDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "ResourceDescription", this.ResourceDescription);

    }
}

