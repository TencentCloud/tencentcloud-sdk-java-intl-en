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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLSTopic extends AbstractModel {

    /**
    * Tencent Cloud CLS log set ID.	
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Tencent Cloud CLS log topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Region of the Tencent Cloud CLS log set.
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
     * Get Tencent Cloud CLS log set ID.	 
     * @return LogSetId Tencent Cloud CLS log set ID.	
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set Tencent Cloud CLS log set ID.	
     * @param LogSetId Tencent Cloud CLS log set ID.	
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Tencent Cloud CLS log topic ID. 
     * @return TopicId Tencent Cloud CLS log topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Tencent Cloud CLS log topic ID.
     * @param TopicId Tencent Cloud CLS log topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Region of the Tencent Cloud CLS log set. 
     * @return LogSetRegion Region of the Tencent Cloud CLS log set.
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set Region of the Tencent Cloud CLS log set.
     * @param LogSetRegion Region of the Tencent Cloud CLS log set.
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    public CLSTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSTopic(CLSTopic source) {
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);

    }
}

