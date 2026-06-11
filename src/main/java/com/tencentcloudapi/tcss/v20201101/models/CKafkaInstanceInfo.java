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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CKafkaInstanceInfo extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Topic list
    */
    @SerializedName("TopicList")
    @Expose
    private CKafkaTopicInfo [] TopicList;

    /**
    * Routing List
    */
    @SerializedName("RouteList")
    @Expose
    private CkafkaRouteInfo [] RouteList;

    /**
    * Kafka Version Number
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
     * Get Instance ID. 
     * @return InstanceID Instance ID.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID.
     * @param InstanceID Instance ID.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Topic list 
     * @return TopicList Topic list
     */
    public CKafkaTopicInfo [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set Topic list
     * @param TopicList Topic list
     */
    public void setTopicList(CKafkaTopicInfo [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get Routing List 
     * @return RouteList Routing List
     */
    public CkafkaRouteInfo [] getRouteList() {
        return this.RouteList;
    }

    /**
     * Set Routing List
     * @param RouteList Routing List
     */
    public void setRouteList(CkafkaRouteInfo [] RouteList) {
        this.RouteList = RouteList;
    }

    /**
     * Get Kafka Version Number 
     * @return KafkaVersion Kafka Version Number
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set Kafka Version Number
     * @param KafkaVersion Kafka Version Number
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    public CKafkaInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CKafkaInstanceInfo(CKafkaInstanceInfo source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicList != null) {
            this.TopicList = new CKafkaTopicInfo[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new CKafkaTopicInfo(source.TopicList[i]);
            }
        }
        if (source.RouteList != null) {
            this.RouteList = new CkafkaRouteInfo[source.RouteList.length];
            for (int i = 0; i < source.RouteList.length; i++) {
                this.RouteList[i] = new CkafkaRouteInfo(source.RouteList[i]);
            }
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamArrayObj(map, prefix + "RouteList.", this.RouteList);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);

    }
}

