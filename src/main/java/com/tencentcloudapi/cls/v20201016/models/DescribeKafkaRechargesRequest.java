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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKafkaRechargesRequest extends AbstractModel {

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Import configuration ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Status. Valid values: 1 (running) and 2 (suspended).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Import configuration ID 
     * @return Id Import configuration ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Import configuration ID
     * @param Id Import configuration ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Status. Valid values: 1 (running) and 2 (suspended). 
     * @return Status Status. Valid values: 1 (running) and 2 (suspended).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values: 1 (running) and 2 (suspended).
     * @param Status Status. Valid values: 1 (running) and 2 (suspended).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeKafkaRechargesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKafkaRechargesRequest(DescribeKafkaRechargesRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

