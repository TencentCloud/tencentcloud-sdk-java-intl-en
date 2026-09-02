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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogSearchInfos extends AbstractModel {

    /**
    * <p>Topic</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Time interval</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>context</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get <p>Topic</p> 
     * @return TopicId <p>Topic</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Topic</p>
     * @param TopicId <p>Topic</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Time interval</p> 
     * @return Period <p>Time interval</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Time interval</p>
     * @param Period <p>Time interval</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>context</p> 
     * @return Context <p>context</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>context</p>
     * @param Context <p>context</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public LogSearchInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSearchInfos(LogSearchInfos source) {
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

