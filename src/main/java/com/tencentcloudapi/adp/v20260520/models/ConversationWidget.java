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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationWidget extends AbstractModel {

    /**
    * <p>Base64-encoded original widget data</p>
    */
    @SerializedName("EncodedWidget")
    @Expose
    private String EncodedWidget;

    /**
    * <p>payload from the user's last submission</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>Location of the widget in the text</p>
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * <p>widget status JSON data</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>widget view data</p>
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * <p>component_ID</p>
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * <p>Component operation ID</p>
    */
    @SerializedName("WidgetRunId")
    @Expose
    private String WidgetRunId;

    /**
     * Get <p>Base64-encoded original widget data</p> 
     * @return EncodedWidget <p>Base64-encoded original widget data</p>
     */
    public String getEncodedWidget() {
        return this.EncodedWidget;
    }

    /**
     * Set <p>Base64-encoded original widget data</p>
     * @param EncodedWidget <p>Base64-encoded original widget data</p>
     */
    public void setEncodedWidget(String EncodedWidget) {
        this.EncodedWidget = EncodedWidget;
    }

    /**
     * Get <p>payload from the user's last submission</p> 
     * @return Payload <p>payload from the user's last submission</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>payload from the user's last submission</p>
     * @param Payload <p>payload from the user's last submission</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>Location of the widget in the text</p> 
     * @return Position <p>Location of the widget in the text</p>
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set <p>Location of the widget in the text</p>
     * @param Position <p>Location of the widget in the text</p>
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get <p>widget status JSON data</p> 
     * @return State <p>widget status JSON data</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>widget status JSON data</p>
     * @param State <p>widget status JSON data</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>widget view data</p> 
     * @return View <p>widget view data</p>
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set <p>widget view data</p>
     * @param View <p>widget view data</p>
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get <p>component_ID</p> 
     * @return WidgetId <p>component_ID</p>
     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set <p>component_ID</p>
     * @param WidgetId <p>component_ID</p>
     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get <p>Component operation ID</p> 
     * @return WidgetRunId <p>Component operation ID</p>
     */
    public String getWidgetRunId() {
        return this.WidgetRunId;
    }

    /**
     * Set <p>Component operation ID</p>
     * @param WidgetRunId <p>Component operation ID</p>
     */
    public void setWidgetRunId(String WidgetRunId) {
        this.WidgetRunId = WidgetRunId;
    }

    public ConversationWidget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationWidget(ConversationWidget source) {
        if (source.EncodedWidget != null) {
            this.EncodedWidget = new String(source.EncodedWidget);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetRunId != null) {
            this.WidgetRunId = new String(source.WidgetRunId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncodedWidget", this.EncodedWidget);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "WidgetRunId", this.WidgetRunId);

    }
}

