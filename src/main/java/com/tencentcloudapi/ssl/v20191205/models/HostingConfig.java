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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostingConfig extends AbstractModel {

    /**
    * Hosted resource replacement time, defaults to 30 days before the certificate expiration if there is a renewal certificate, then replace.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplaceTime")
    @Expose
    private Long ReplaceTime;

    /**
    * Hosted send message type: 0, reminder message before hosted starts (you will receive this reminder message even if there is no renewal certificate); 1, reminder message when hosted starts (you will receive the message reminder only if there is a renewal certificate); 2, reminder message when hosted resource replacement fails; 3 reminder message when hosted resource replacement succeeds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageTypes")
    @Expose
    private Long [] MessageTypes;

    /**
    * Resource replacement start time.
    */
    @SerializedName("ReplaceStartTime")
    @Expose
    private String ReplaceStartTime;

    /**
    * Resource replacement end time.
    */
    @SerializedName("ReplaceEndTime")
    @Expose
    private String ReplaceEndTime;

    /**
     * Get Hosted resource replacement time, defaults to 30 days before the certificate expiration if there is a renewal certificate, then replace.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReplaceTime Hosted resource replacement time, defaults to 30 days before the certificate expiration if there is a renewal certificate, then replace.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getReplaceTime() {
        return this.ReplaceTime;
    }

    /**
     * Set Hosted resource replacement time, defaults to 30 days before the certificate expiration if there is a renewal certificate, then replace.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReplaceTime Hosted resource replacement time, defaults to 30 days before the certificate expiration if there is a renewal certificate, then replace.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReplaceTime(Long ReplaceTime) {
        this.ReplaceTime = ReplaceTime;
    }

    /**
     * Get Hosted send message type: 0, reminder message before hosted starts (you will receive this reminder message even if there is no renewal certificate); 1, reminder message when hosted starts (you will receive the message reminder only if there is a renewal certificate); 2, reminder message when hosted resource replacement fails; 3 reminder message when hosted resource replacement succeeds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MessageTypes Hosted send message type: 0, reminder message before hosted starts (you will receive this reminder message even if there is no renewal certificate); 1, reminder message when hosted starts (you will receive the message reminder only if there is a renewal certificate); 2, reminder message when hosted resource replacement fails; 3 reminder message when hosted resource replacement succeeds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getMessageTypes() {
        return this.MessageTypes;
    }

    /**
     * Set Hosted send message type: 0, reminder message before hosted starts (you will receive this reminder message even if there is no renewal certificate); 1, reminder message when hosted starts (you will receive the message reminder only if there is a renewal certificate); 2, reminder message when hosted resource replacement fails; 3 reminder message when hosted resource replacement succeeds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MessageTypes Hosted send message type: 0, reminder message before hosted starts (you will receive this reminder message even if there is no renewal certificate); 1, reminder message when hosted starts (you will receive the message reminder only if there is a renewal certificate); 2, reminder message when hosted resource replacement fails; 3 reminder message when hosted resource replacement succeeds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageTypes(Long [] MessageTypes) {
        this.MessageTypes = MessageTypes;
    }

    /**
     * Get Resource replacement start time. 
     * @return ReplaceStartTime Resource replacement start time.
     */
    public String getReplaceStartTime() {
        return this.ReplaceStartTime;
    }

    /**
     * Set Resource replacement start time.
     * @param ReplaceStartTime Resource replacement start time.
     */
    public void setReplaceStartTime(String ReplaceStartTime) {
        this.ReplaceStartTime = ReplaceStartTime;
    }

    /**
     * Get Resource replacement end time. 
     * @return ReplaceEndTime Resource replacement end time.
     */
    public String getReplaceEndTime() {
        return this.ReplaceEndTime;
    }

    /**
     * Set Resource replacement end time.
     * @param ReplaceEndTime Resource replacement end time.
     */
    public void setReplaceEndTime(String ReplaceEndTime) {
        this.ReplaceEndTime = ReplaceEndTime;
    }

    public HostingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostingConfig(HostingConfig source) {
        if (source.ReplaceTime != null) {
            this.ReplaceTime = new Long(source.ReplaceTime);
        }
        if (source.MessageTypes != null) {
            this.MessageTypes = new Long[source.MessageTypes.length];
            for (int i = 0; i < source.MessageTypes.length; i++) {
                this.MessageTypes[i] = new Long(source.MessageTypes[i]);
            }
        }
        if (source.ReplaceStartTime != null) {
            this.ReplaceStartTime = new String(source.ReplaceStartTime);
        }
        if (source.ReplaceEndTime != null) {
            this.ReplaceEndTime = new String(source.ReplaceEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplaceTime", this.ReplaceTime);
        this.setParamArraySimple(map, prefix + "MessageTypes.", this.MessageTypes);
        this.setParamSimple(map, prefix + "ReplaceStartTime", this.ReplaceStartTime);
        this.setParamSimple(map, prefix + "ReplaceEndTime", this.ReplaceEndTime);

    }
}

