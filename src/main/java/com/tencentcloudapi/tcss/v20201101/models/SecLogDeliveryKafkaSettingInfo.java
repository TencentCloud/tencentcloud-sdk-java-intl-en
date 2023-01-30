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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogDeliveryKafkaSettingInfo extends AbstractModel{

    /**
    * Log type
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Topic ID
    */
    @SerializedName("TopicID")
    @Expose
    private String TopicID;

    /**
    * Topic name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Delivery status. Valid values: `false` (disabled); `true` (enabled).
    */
    @SerializedName("State")
    @Expose
    private Boolean State;

    /**
     * Get Log type 
     * @return LogType Log type
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type
     * @param LogType Log type
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Topic ID 
     * @return TopicID Topic ID
     */
    public String getTopicID() {
        return this.TopicID;
    }

    /**
     * Set Topic ID
     * @param TopicID Topic ID
     */
    public void setTopicID(String TopicID) {
        this.TopicID = TopicID;
    }

    /**
     * Get Topic name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicName Topic name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicName Topic name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Delivery status. Valid values: `false` (disabled); `true` (enabled). 
     * @return State Delivery status. Valid values: `false` (disabled); `true` (enabled).
     */
    public Boolean getState() {
        return this.State;
    }

    /**
     * Set Delivery status. Valid values: `false` (disabled); `true` (enabled).
     * @param State Delivery status. Valid values: `false` (disabled); `true` (enabled).
     */
    public void setState(Boolean State) {
        this.State = State;
    }

    public SecLogDeliveryKafkaSettingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogDeliveryKafkaSettingInfo(SecLogDeliveryKafkaSettingInfo source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.TopicID != null) {
            this.TopicID = new String(source.TopicID);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.State != null) {
            this.State = new Boolean(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "TopicID", this.TopicID);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

