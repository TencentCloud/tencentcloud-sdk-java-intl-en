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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLogKafkaDeliverTypeRequest extends AbstractModel {

    /**
    * Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint.
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * Log type of the security module
    */
    @SerializedName("LogType")
    @Expose
    private Long [] LogType;

    /**
    * Shipping enabling status. 0: disabled; 1: enabled.
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * kafka topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * kafka topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint. 
     * @return SecurityType Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint.
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint.
     * @param SecurityType Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint.
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get Log type of the security module 
     * @return LogType Log type of the security module
     */
    public Long [] getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type of the security module
     * @param LogType Log type of the security module
     */
    public void setLogType(Long [] LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Shipping enabling status. 0: disabled; 1: enabled. 
     * @return Switch Shipping enabling status. 0: disabled; 1: enabled.
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set Shipping enabling status. 0: disabled; 1: enabled.
     * @param Switch Shipping enabling status. 0: disabled; 1: enabled.
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get kafka topic id 
     * @return TopicId kafka topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set kafka topic id
     * @param TopicId kafka topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get kafka topic name 
     * @return TopicName kafka topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set kafka topic name
     * @param TopicName kafka topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public ModifyLogKafkaDeliverTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogKafkaDeliverTypeRequest(ModifyLogKafkaDeliverTypeRequest source) {
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.LogType != null) {
            this.LogType = new Long[source.LogType.length];
            for (int i = 0; i < source.LogType.length; i++) {
                this.LogType[i] = new Long(source.LogType[i]);
            }
        }
        if (source.Switch != null) {
            this.Switch = new Long(source.Switch);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamArraySimple(map, prefix + "LogType.", this.LogType);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

