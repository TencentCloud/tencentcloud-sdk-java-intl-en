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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddEditReverseShellWhiteListRequest extends AbstractModel {

    /**
    * Information of the allowed item to be added or edited. When an allowed item is added, `WhiteListInfo.id` can be empty; when an allowed item is edited, `WhiteListInfo.id` cannot be empty.
    */
    @SerializedName("WhiteListInfo")
    @Expose
    private ReverseShellWhiteListInfo WhiteListInfo;

    /**
    * Used only when an event is added to the allowlist
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get Information of the allowed item to be added or edited. When an allowed item is added, `WhiteListInfo.id` can be empty; when an allowed item is edited, `WhiteListInfo.id` cannot be empty. 
     * @return WhiteListInfo Information of the allowed item to be added or edited. When an allowed item is added, `WhiteListInfo.id` can be empty; when an allowed item is edited, `WhiteListInfo.id` cannot be empty.
     */
    public ReverseShellWhiteListInfo getWhiteListInfo() {
        return this.WhiteListInfo;
    }

    /**
     * Set Information of the allowed item to be added or edited. When an allowed item is added, `WhiteListInfo.id` can be empty; when an allowed item is edited, `WhiteListInfo.id` cannot be empty.
     * @param WhiteListInfo Information of the allowed item to be added or edited. When an allowed item is added, `WhiteListInfo.id` can be empty; when an allowed item is edited, `WhiteListInfo.id` cannot be empty.
     */
    public void setWhiteListInfo(ReverseShellWhiteListInfo WhiteListInfo) {
        this.WhiteListInfo = WhiteListInfo;
    }

    /**
     * Get Used only when an event is added to the allowlist 
     * @return EventId Used only when an event is added to the allowlist
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Used only when an event is added to the allowlist
     * @param EventId Used only when an event is added to the allowlist
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public AddEditReverseShellWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEditReverseShellWhiteListRequest(AddEditReverseShellWhiteListRequest source) {
        if (source.WhiteListInfo != null) {
            this.WhiteListInfo = new ReverseShellWhiteListInfo(source.WhiteListInfo);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WhiteListInfo.", this.WhiteListInfo);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

