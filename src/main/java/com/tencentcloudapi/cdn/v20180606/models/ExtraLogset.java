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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraLogset extends AbstractModel {

    /**
    * Logset information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Logset")
    @Expose
    private LogSetInfo Logset;

    /**
    * Log topic information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Topics")
    @Expose
    private TopicInfo [] Topics;

    /**
     * Get Logset information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Logset Logset information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public LogSetInfo getLogset() {
        return this.Logset;
    }

    /**
     * Set Logset information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Logset Logset information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogset(LogSetInfo Logset) {
        this.Logset = Logset;
    }

    /**
     * Get Log topic information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Topics Log topic information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TopicInfo [] getTopics() {
        return this.Topics;
    }

    /**
     * Set Log topic information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Topics Log topic information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTopics(TopicInfo [] Topics) {
        this.Topics = Topics;
    }

    public ExtraLogset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraLogset(ExtraLogset source) {
        if (source.Logset != null) {
            this.Logset = new LogSetInfo(source.Logset);
        }
        if (source.Topics != null) {
            this.Topics = new TopicInfo[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new TopicInfo(source.Topics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Logset.", this.Logset);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);

    }
}

