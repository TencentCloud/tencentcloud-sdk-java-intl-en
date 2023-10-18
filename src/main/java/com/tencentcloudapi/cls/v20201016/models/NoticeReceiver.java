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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeReceiver extends AbstractModel {

    /**
    * Recipient type. Valid values:
<br><li> `Uin`: user ID
<br><li> `Group`: user group ID
Currently, other recipient types are not supported.
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Recipient
    */
    @SerializedName("ReceiverIds")
    @Expose
    private Long [] ReceiverIds;

    /**
    * Notification method
<br><li> `Email`: email
<br><li> `Sms`: SMS
<br><li> `WeChat`: WeChat
<br><li> `Phone`: phone
    */
    @SerializedName("ReceiverChannels")
    @Expose
    private String [] ReceiverChannels;

    /**
    * Start time for allowed message receipt
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time for allowed message receipt
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Index
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get Recipient type. Valid values:
<br><li> `Uin`: user ID
<br><li> `Group`: user group ID
Currently, other recipient types are not supported. 
     * @return ReceiverType Recipient type. Valid values:
<br><li> `Uin`: user ID
<br><li> `Group`: user group ID
Currently, other recipient types are not supported.
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Recipient type. Valid values:
<br><li> `Uin`: user ID
<br><li> `Group`: user group ID
Currently, other recipient types are not supported.
     * @param ReceiverType Recipient type. Valid values:
<br><li> `Uin`: user ID
<br><li> `Group`: user group ID
Currently, other recipient types are not supported.
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get Recipient 
     * @return ReceiverIds Recipient
     */
    public Long [] getReceiverIds() {
        return this.ReceiverIds;
    }

    /**
     * Set Recipient
     * @param ReceiverIds Recipient
     */
    public void setReceiverIds(Long [] ReceiverIds) {
        this.ReceiverIds = ReceiverIds;
    }

    /**
     * Get Notification method
<br><li> `Email`: email
<br><li> `Sms`: SMS
<br><li> `WeChat`: WeChat
<br><li> `Phone`: phone 
     * @return ReceiverChannels Notification method
<br><li> `Email`: email
<br><li> `Sms`: SMS
<br><li> `WeChat`: WeChat
<br><li> `Phone`: phone
     */
    public String [] getReceiverChannels() {
        return this.ReceiverChannels;
    }

    /**
     * Set Notification method
<br><li> `Email`: email
<br><li> `Sms`: SMS
<br><li> `WeChat`: WeChat
<br><li> `Phone`: phone
     * @param ReceiverChannels Notification method
<br><li> `Email`: email
<br><li> `Sms`: SMS
<br><li> `WeChat`: WeChat
<br><li> `Phone`: phone
     */
    public void setReceiverChannels(String [] ReceiverChannels) {
        this.ReceiverChannels = ReceiverChannels;
    }

    /**
     * Get Start time for allowed message receipt 
     * @return StartTime Start time for allowed message receipt
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for allowed message receipt
     * @param StartTime Start time for allowed message receipt
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for allowed message receipt 
     * @return EndTime End time for allowed message receipt
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for allowed message receipt
     * @param EndTime End time for allowed message receipt
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Index 
     * @return Index Index
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Index
     * @param Index Index
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public NoticeReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeReceiver(NoticeReceiver source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.ReceiverIds != null) {
            this.ReceiverIds = new Long[source.ReceiverIds.length];
            for (int i = 0; i < source.ReceiverIds.length; i++) {
                this.ReceiverIds[i] = new Long(source.ReceiverIds[i]);
            }
        }
        if (source.ReceiverChannels != null) {
            this.ReceiverChannels = new String[source.ReceiverChannels.length];
            for (int i = 0; i < source.ReceiverChannels.length; i++) {
                this.ReceiverChannels[i] = new String(source.ReceiverChannels[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "ReceiverIds.", this.ReceiverIds);
        this.setParamArraySimple(map, prefix + "ReceiverChannels.", this.ReceiverChannels);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

