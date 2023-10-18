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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventList extends AbstractModel {

    /**
    * The event information.
    */
    @SerializedName("Content")
    @Expose
    private EventMessage [] Content;

    /**
    * The user ID of the sender.
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
     * Get The event information. 
     * @return Content The event information.
     */
    public EventMessage [] getContent() {
        return this.Content;
    }

    /**
     * Set The event information.
     * @param Content The event information.
     */
    public void setContent(EventMessage [] Content) {
        this.Content = Content;
    }

    /**
     * Get The user ID of the sender. 
     * @return PeerId The user ID of the sender.
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set The user ID of the sender.
     * @param PeerId The user ID of the sender.
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    public EventList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventList(EventList source) {
        if (source.Content != null) {
            this.Content = new EventMessage[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new EventMessage(source.Content[i]);
            }
        }
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);

    }
}

