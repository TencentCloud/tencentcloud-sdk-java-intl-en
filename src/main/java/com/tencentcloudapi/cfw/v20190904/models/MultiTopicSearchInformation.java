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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiTopicSearchInformation extends AbstractModel {

    /**
    * ID of the log topic to be searched and analyzed
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get ID of the log topic to be searched and analyzed 
     * @return TopicId ID of the log topic to be searched and analyzed
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the log topic to be searched and analyzed
     * @param TopicId ID of the log topic to be searched and analyzed
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour. 
     * @return Context Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour.
     * @param Context Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public MultiTopicSearchInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiTopicSearchInformation(MultiTopicSearchInformation source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
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
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

