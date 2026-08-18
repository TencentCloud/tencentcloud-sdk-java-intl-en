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

public class DashboardTopicInfo extends AbstractModel {

    /**
    * Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Region of the topic.
- 1: Guangzhou
-4: Shanghai
- 5: Hong Kong (China)
- 7: Shanghai Finance
-8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
-16: Chengdu
-17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Topic ID 
     * @return TopicId Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID
     * @param TopicId Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Region of the topic.
- 1: Guangzhou
-4: Shanghai
- 5: Hong Kong (China)
- 7: Shanghai Finance
-8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
-16: Chengdu
-17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud 
     * @return Region Region of the topic.
- 1: Guangzhou
-4: Shanghai
- 5: Hong Kong (China)
- 7: Shanghai Finance
-8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
-16: Chengdu
-17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the topic.
- 1: Guangzhou
-4: Shanghai
- 5: Hong Kong (China)
- 7: Shanghai Finance
-8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
-16: Chengdu
-17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud
     * @param Region Region of the topic.
- 1: Guangzhou
-4: Shanghai
- 5: Hong Kong (China)
- 7: Shanghai Finance
-8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
-16: Chengdu
-17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DashboardTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardTopicInfo(DashboardTopicInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

