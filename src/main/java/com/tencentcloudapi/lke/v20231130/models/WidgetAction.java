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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WidgetAction extends AbstractModel {

    /**
    * Widget configuration ID
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * Widget instance ID
    */
    @SerializedName("WidgetRunId")
    @Expose
    private String WidgetRunId;

    /**
    * Widget action
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Data submitted by the Widget action
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
     * Get Widget configuration ID 
     * @return WidgetId Widget configuration ID
     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set Widget configuration ID
     * @param WidgetId Widget configuration ID
     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get Widget instance ID 
     * @return WidgetRunId Widget instance ID
     */
    public String getWidgetRunId() {
        return this.WidgetRunId;
    }

    /**
     * Set Widget instance ID
     * @param WidgetRunId Widget instance ID
     */
    public void setWidgetRunId(String WidgetRunId) {
        this.WidgetRunId = WidgetRunId;
    }

    /**
     * Get Widget action 
     * @return ActionType Widget action
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Widget action
     * @param ActionType Widget action
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Data submitted by the Widget action 
     * @return Payload Data submitted by the Widget action
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set Data submitted by the Widget action
     * @param Payload Data submitted by the Widget action
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    public WidgetAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WidgetAction(WidgetAction source) {
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetRunId != null) {
            this.WidgetRunId = new String(source.WidgetRunId);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "WidgetRunId", this.WidgetRunId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Payload", this.Payload);

    }
}

