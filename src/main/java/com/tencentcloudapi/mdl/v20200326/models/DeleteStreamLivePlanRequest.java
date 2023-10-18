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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteStreamLivePlanRequest extends AbstractModel {

    /**
    * ID of the channel whose event is to be deleted
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Name of the event to delete
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
     * Get ID of the channel whose event is to be deleted 
     * @return ChannelId ID of the channel whose event is to be deleted
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set ID of the channel whose event is to be deleted
     * @param ChannelId ID of the channel whose event is to be deleted
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Name of the event to delete 
     * @return EventName Name of the event to delete
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Name of the event to delete
     * @param EventName Name of the event to delete
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public DeleteStreamLivePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStreamLivePlanRequest(DeleteStreamLivePlanRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "EventName", this.EventName);

    }
}

