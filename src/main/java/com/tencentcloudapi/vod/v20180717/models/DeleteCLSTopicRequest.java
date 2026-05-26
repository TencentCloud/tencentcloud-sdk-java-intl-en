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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCLSTopicRequest extends AbstractModel {

    /**
    * The region to which the log set belongs, the values are: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> < li>ap-chongqing: Chongqing; </li> <li>ap-nanjing: Nanjing; </li> <li>ap-shanghai: Shanghai; </li> <li>ap-singapore: Singapore. </li>
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * Log topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get The region to which the log set belongs, the values are: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> < li>ap-chongqing: Chongqing; </li> <li>ap-nanjing: Nanjing; </li> <li>ap-shanghai: Shanghai; </li> <li>ap-singapore: Singapore. </li> 
     * @return CLSRegion The region to which the log set belongs, the values are: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> < li>ap-chongqing: Chongqing; </li> <li>ap-nanjing: Nanjing; </li> <li>ap-shanghai: Shanghai; </li> <li>ap-singapore: Singapore. </li>
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set The region to which the log set belongs, the values are: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> < li>ap-chongqing: Chongqing; </li> <li>ap-nanjing: Nanjing; </li> <li>ap-shanghai: Shanghai; </li> <li>ap-singapore: Singapore. </li>
     * @param CLSRegion The region to which the log set belongs, the values are: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> < li>ap-chongqing: Chongqing; </li> <li>ap-nanjing: Nanjing; </li> <li>ap-shanghai: Shanghai; </li> <li>ap-singapore: Singapore. </li>
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get Log topic ID. 
     * @return TopicId Log topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
     * @param TopicId Log topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public DeleteCLSTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCLSTopicRequest(DeleteCLSTopicRequest source) {
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

