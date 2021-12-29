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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Producer extends AbstractModel{

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Number of connections.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CountConnect")
    @Expose
    private Long CountConnect;

    /**
    * Set of connections.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectionSets")
    @Expose
    private Connection [] ConnectionSets;

    /**
     * Get Environment (namespace) name. 
     * @return EnvironmentId Environment (namespace) name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
     * @param EnvironmentId Environment (namespace) name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic name. 
     * @return TopicName Topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
     * @param TopicName Topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Number of connections.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CountConnect Number of connections.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCountConnect() {
        return this.CountConnect;
    }

    /**
     * Set Number of connections.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CountConnect Number of connections.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCountConnect(Long CountConnect) {
        this.CountConnect = CountConnect;
    }

    /**
     * Get Set of connections.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConnectionSets Set of connections.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Connection [] getConnectionSets() {
        return this.ConnectionSets;
    }

    /**
     * Set Set of connections.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConnectionSets Set of connections.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectionSets(Connection [] ConnectionSets) {
        this.ConnectionSets = ConnectionSets;
    }

    public Producer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Producer(Producer source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.CountConnect != null) {
            this.CountConnect = new Long(source.CountConnect);
        }
        if (source.ConnectionSets != null) {
            this.ConnectionSets = new Connection[source.ConnectionSets.length];
            for (int i = 0; i < source.ConnectionSets.length; i++) {
                this.ConnectionSets[i] = new Connection(source.ConnectionSets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "CountConnect", this.CountConnect);
        this.setParamArrayObj(map, prefix + "ConnectionSets.", this.ConnectionSets);

    }
}

