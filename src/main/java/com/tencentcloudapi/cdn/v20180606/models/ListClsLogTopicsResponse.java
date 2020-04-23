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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListClsLogTopicsResponse extends AbstractModel{

    /**
    * Logset information
    */
    @SerializedName("Logset")
    @Expose
    private LogSetInfo Logset;

    /**
    * Log topic information list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Topics")
    @Expose
    private TopicInfo [] Topics;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Logset information 
     * @return Logset Logset information
     */
    public LogSetInfo getLogset() {
        return this.Logset;
    }

    /**
     * Set Logset information
     * @param Logset Logset information
     */
    public void setLogset(LogSetInfo Logset) {
        this.Logset = Logset;
    }

    /**
     * Get Log topic information list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Topics Log topic information list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TopicInfo [] getTopics() {
        return this.Topics;
    }

    /**
     * Set Log topic information list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Topics Log topic information list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopics(TopicInfo [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Logset.", this.Logset);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

