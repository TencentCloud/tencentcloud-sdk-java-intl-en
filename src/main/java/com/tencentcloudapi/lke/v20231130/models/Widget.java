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

public class Widget extends AbstractModel {

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
    * Widget display data
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * Widget status information
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Widget position
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * Base64-encoded Widget information.
    */
    @SerializedName("EncodedWidget")
    @Expose
    private String EncodedWidget;

    /**
    * payload of the user's last submission
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
     * Get Widget display data 
     * @return View Widget display data
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set Widget display data
     * @param View Widget display data
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get Widget status information 
     * @return State Widget status information
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Widget status information
     * @param State Widget status information
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Widget position 
     * @return Position Widget position
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set Widget position
     * @param Position Widget position
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get Base64-encoded Widget information. 
     * @return EncodedWidget Base64-encoded Widget information.
     */
    public String getEncodedWidget() {
        return this.EncodedWidget;
    }

    /**
     * Set Base64-encoded Widget information.
     * @param EncodedWidget Base64-encoded Widget information.
     */
    public void setEncodedWidget(String EncodedWidget) {
        this.EncodedWidget = EncodedWidget;
    }

    /**
     * Get payload of the user's last submission 
     * @return Payload payload of the user's last submission
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set payload of the user's last submission
     * @param Payload payload of the user's last submission
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    public Widget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Widget(Widget source) {
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetRunId != null) {
            this.WidgetRunId = new String(source.WidgetRunId);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.EncodedWidget != null) {
            this.EncodedWidget = new String(source.EncodedWidget);
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
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "EncodedWidget", this.EncodedWidget);
        this.setParamSimple(map, prefix + "Payload", this.Payload);

    }
}

