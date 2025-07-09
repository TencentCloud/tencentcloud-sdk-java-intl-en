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
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Instance name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Topic list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicList")
    @Expose
    private CKafkaTopicInfo [] TopicList;

    /**
    * Route list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteList")
    @Expose
    private CkafkaRouteInfo [] RouteList;

    /**
    * Kafka version number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceID Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceID Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Topic list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicList Topic list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CKafkaTopicInfo [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set Topic list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicList Topic list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicList(CKafkaTopicInfo [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get Route list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RouteList Route list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CkafkaRouteInfo [] getRouteList() {
        return this.RouteList;
    }

    /**
     * Set Route list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RouteList Route list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteList(CkafkaRouteInfo [] RouteList) {
        this.RouteList = RouteList;
    }

    /**
     * Get Kafka version number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KafkaVersion Kafka version number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set Kafka version number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KafkaVersion Kafka version number
Note: This field may return null, indicating that no valid values can be obtained.
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

