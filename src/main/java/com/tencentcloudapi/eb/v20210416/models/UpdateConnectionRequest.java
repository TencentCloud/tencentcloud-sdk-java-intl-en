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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateConnectionRequest extends AbstractModel {

    /**
    * Connector ID
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Switch
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Connector name
    */
    @SerializedName("ConnectionName")
    @Expose
    private String ConnectionName;

    /**
     * Get Connector ID 
     * @return ConnectionId Connector ID
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set Connector ID
     * @param ConnectionId Connector ID
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    /**
     * Get Event bus ID 
     * @return EventBusId Event bus ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID
     * @param EventBusId Event bus ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Switch 
     * @return Enable Switch
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Switch
     * @param Enable Switch
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Connector name 
     * @return ConnectionName Connector name
     */
    public String getConnectionName() {
        return this.ConnectionName;
    }

    /**
     * Set Connector name
     * @param ConnectionName Connector name
     */
    public void setConnectionName(String ConnectionName) {
        this.ConnectionName = ConnectionName;
    }

    public UpdateConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateConnectionRequest(UpdateConnectionRequest source) {
        if (source.ConnectionId != null) {
            this.ConnectionId = new String(source.ConnectionId);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConnectionName != null) {
            this.ConnectionName = new String(source.ConnectionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConnectionName", this.ConnectionName);

    }
}

