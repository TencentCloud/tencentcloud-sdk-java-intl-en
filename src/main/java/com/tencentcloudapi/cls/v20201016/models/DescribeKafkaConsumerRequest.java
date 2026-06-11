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

public class DescribeKafkaConsumerRequest extends AbstractModel {

    /**
    * <p>Log topic Id.</p><ul><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">create log topic</a>.</li></ul>
    */
    @SerializedName("FromTopicId")
    @Expose
    private String FromTopicId;

    /**
     * Get <p>Log topic Id.</p><ul><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">create log topic</a>.</li></ul> 
     * @return FromTopicId <p>Log topic Id.</p><ul><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">create log topic</a>.</li></ul>
     */
    public String getFromTopicId() {
        return this.FromTopicId;
    }

    /**
     * Set <p>Log topic Id.</p><ul><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">create log topic</a>.</li></ul>
     * @param FromTopicId <p>Log topic Id.</p><ul><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li><li>Get log topic Id by <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">create log topic</a>.</li></ul>
     */
    public void setFromTopicId(String FromTopicId) {
        this.FromTopicId = FromTopicId;
    }

    public DescribeKafkaConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKafkaConsumerRequest(DescribeKafkaConsumerRequest source) {
        if (source.FromTopicId != null) {
            this.FromTopicId = new String(source.FromTopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTopicId", this.FromTopicId);

    }
}

