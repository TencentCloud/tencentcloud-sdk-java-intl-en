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
package com.tencentcloudapi.message.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendType extends AbstractModel {

    /**
    * Message type.
    */
    @SerializedName("MsgType")
    @Expose
    private Long MsgType;

    /**
    * Delivery channel.
    */
    @SerializedName("SendChannel")
    @Expose
    private Long SendChannel;

    /**
     * Get Message type. 
     * @return MsgType Message type.
     */
    public Long getMsgType() {
        return this.MsgType;
    }

    /**
     * Set Message type.
     * @param MsgType Message type.
     */
    public void setMsgType(Long MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get Delivery channel. 
     * @return SendChannel Delivery channel.
     */
    public Long getSendChannel() {
        return this.SendChannel;
    }

    /**
     * Set Delivery channel.
     * @param SendChannel Delivery channel.
     */
    public void setSendChannel(Long SendChannel) {
        this.SendChannel = SendChannel;
    }

    public SendType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendType(SendType source) {
        if (source.MsgType != null) {
            this.MsgType = new Long(source.MsgType);
        }
        if (source.SendChannel != null) {
            this.SendChannel = new Long(source.SendChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "SendChannel", this.SendChannel);

    }
}

