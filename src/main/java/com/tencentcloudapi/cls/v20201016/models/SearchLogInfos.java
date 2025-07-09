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

public class SearchLogInfos extends AbstractModel {

    /**
    * Log Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log storage lifetime
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * You can pass through the Context value returned by this API to continue to get more logs. Expire time: 1 hour.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get Log Topic ID 
     * @return TopicId Log Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log Topic ID
     * @param TopicId Log Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log storage lifetime 
     * @return Period Log storage lifetime
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Log storage lifetime
     * @param Period Log storage lifetime
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get You can pass through the Context value returned by this API to continue to get more logs. Expire time: 1 hour.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Context You can pass through the Context value returned by this API to continue to get more logs. Expire time: 1 hour.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set You can pass through the Context value returned by this API to continue to get more logs. Expire time: 1 hour.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Context You can pass through the Context value returned by this API to continue to get more logs. Expire time: 1 hour.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public SearchLogInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogInfos(SearchLogInfos source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

