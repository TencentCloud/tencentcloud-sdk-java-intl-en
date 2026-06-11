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

public class DescribeConsumerGroupsRequest extends AbstractModel {

    /**
    * Logset ID (the logset to which a log topic belongs).
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * topic list
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
     * Get Logset ID (the logset to which a log topic belongs). 
     * @return LogsetId Logset ID (the logset to which a log topic belongs).
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID (the logset to which a log topic belongs).
     * @param LogsetId Logset ID (the logset to which a log topic belongs).
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get topic list 
     * @return Topics topic list
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set topic list
     * @param Topics topic list
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    public DescribeConsumerGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerGroupsRequest(DescribeConsumerGroupsRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Topics != null) {
            this.Topics = new String[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new String(source.Topics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArraySimple(map, prefix + "Topics.", this.Topics);

    }
}

