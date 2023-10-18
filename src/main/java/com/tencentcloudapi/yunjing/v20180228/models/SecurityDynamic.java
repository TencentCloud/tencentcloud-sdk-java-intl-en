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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityDynamic extends AbstractModel {

    /**
    * CWP agent `UUID`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Security event occurrence time.
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * Security event type.
<li>MALWARE: trojan event</li>
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>BRUTEATTACK_SUCCESS: brute force attack succeeded</li>
<li>VUL: vulnerability</li>
<li>BASELINE: security baseline</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Security event message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Security event level.
<li>RISK: severe</li>
<li>HIGH: high</li>
<li>NORMAL: medium</li>
<li>LOW: low</li>
    */
    @SerializedName("SecurityLevel")
    @Expose
    private String SecurityLevel;

    /**
     * Get CWP agent `UUID`. 
     * @return Uuid CWP agent `UUID`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `UUID`.
     * @param Uuid CWP agent `UUID`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Security event occurrence time. 
     * @return EventTime Security event occurrence time.
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set Security event occurrence time.
     * @param EventTime Security event occurrence time.
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get Security event type.
<li>MALWARE: trojan event</li>
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>BRUTEATTACK_SUCCESS: brute force attack succeeded</li>
<li>VUL: vulnerability</li>
<li>BASELINE: security baseline</li> 
     * @return EventType Security event type.
<li>MALWARE: trojan event</li>
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>BRUTEATTACK_SUCCESS: brute force attack succeeded</li>
<li>VUL: vulnerability</li>
<li>BASELINE: security baseline</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Security event type.
<li>MALWARE: trojan event</li>
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>BRUTEATTACK_SUCCESS: brute force attack succeeded</li>
<li>VUL: vulnerability</li>
<li>BASELINE: security baseline</li>
     * @param EventType Security event type.
<li>MALWARE: trojan event</li>
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>BRUTEATTACK_SUCCESS: brute force attack succeeded</li>
<li>VUL: vulnerability</li>
<li>BASELINE: security baseline</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Security event message. 
     * @return Message Security event message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Security event message.
     * @param Message Security event message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Security event level.
<li>RISK: severe</li>
<li>HIGH: high</li>
<li>NORMAL: medium</li>
<li>LOW: low</li> 
     * @return SecurityLevel Security event level.
<li>RISK: severe</li>
<li>HIGH: high</li>
<li>NORMAL: medium</li>
<li>LOW: low</li>
     */
    public String getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set Security event level.
<li>RISK: severe</li>
<li>HIGH: high</li>
<li>NORMAL: medium</li>
<li>LOW: low</li>
     * @param SecurityLevel Security event level.
<li>RISK: severe</li>
<li>HIGH: high</li>
<li>NORMAL: medium</li>
<li>LOW: low</li>
     */
    public void setSecurityLevel(String SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    public SecurityDynamic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityDynamic(SecurityDynamic source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.SecurityLevel != null) {
            this.SecurityLevel = new String(source.SecurityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "SecurityLevel", this.SecurityLevel);

    }
}

