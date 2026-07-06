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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelsReceivers extends AbstractModel {

    /**
    * Notification channel name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Recipient.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * Sending result. Valid values: 0, (invalid), 1 (successful), 2 (failed), and 3 (no sending required).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SendStatus")
    @Expose
    private String SendStatus;

    /**
     * Get Notification channel name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChannelName Notification channel name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Notification channel name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChannelName Notification channel name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Recipient.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Receivers Recipient.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Recipient.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Receivers Recipient.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Sending result. Valid values: 0, (invalid), 1 (successful), 2 (failed), and 3 (no sending required).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SendStatus Sending result. Valid values: 0, (invalid), 1 (successful), 2 (failed), and 3 (no sending required).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSendStatus() {
        return this.SendStatus;
    }

    /**
     * Set Sending result. Valid values: 0, (invalid), 1 (successful), 2 (failed), and 3 (no sending required).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SendStatus Sending result. Valid values: 0, (invalid), 1 (successful), 2 (failed), and 3 (no sending required).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSendStatus(String SendStatus) {
        this.SendStatus = SendStatus;
    }

    public ChannelsReceivers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelsReceivers(ChannelsReceivers source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.SendStatus != null) {
            this.SendStatus = new String(source.SendStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "SendStatus", this.SendStatus);

    }
}

