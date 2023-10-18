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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventBus extends AbstractModel {

    /**
    * Update time
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * Event bus description, which can contain up to 200 characters of any type
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Event bus type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Billing Mode
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Connector basic information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectionBriefs")
    @Expose
    private ConnectionBrief [] ConnectionBriefs;

    /**
    * Target information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetBriefs")
    @Expose
    private TargetBrief [] TargetBriefs;

    /**
     * Get Update time 
     * @return ModTime Update time
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Update time
     * @param ModTime Update time
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get Event bus description, which can contain up to 200 characters of any type 
     * @return Description Event bus description, which can contain up to 200 characters of any type
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event bus description, which can contain up to 200 characters of any type
     * @param Description Event bus description, which can contain up to 200 characters of any type
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time 
     * @return AddTime Creation time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time
     * @param AddTime Creation time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter 
     * @return EventBusName Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     * @param EventBusName Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
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
     * Get Event bus type 
     * @return Type Event bus type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Event bus type
     * @param Type Event bus type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Billing Mode
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PayMode Billing Mode
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing Mode
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PayMode Billing Mode
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Connector basic information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ConnectionBriefs Connector basic information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ConnectionBrief [] getConnectionBriefs() {
        return this.ConnectionBriefs;
    }

    /**
     * Set Connector basic information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ConnectionBriefs Connector basic information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setConnectionBriefs(ConnectionBrief [] ConnectionBriefs) {
        this.ConnectionBriefs = ConnectionBriefs;
    }

    /**
     * Get Target information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TargetBriefs Target information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public TargetBrief [] getTargetBriefs() {
        return this.TargetBriefs;
    }

    /**
     * Set Target information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TargetBriefs Target information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTargetBriefs(TargetBrief [] TargetBriefs) {
        this.TargetBriefs = TargetBriefs;
    }

    public EventBus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventBus(EventBus source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.EventBusName != null) {
            this.EventBusName = new String(source.EventBusName);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ConnectionBriefs != null) {
            this.ConnectionBriefs = new ConnectionBrief[source.ConnectionBriefs.length];
            for (int i = 0; i < source.ConnectionBriefs.length; i++) {
                this.ConnectionBriefs[i] = new ConnectionBrief(source.ConnectionBriefs[i]);
            }
        }
        if (source.TargetBriefs != null) {
            this.TargetBriefs = new TargetBrief[source.TargetBriefs.length];
            for (int i = 0; i < source.TargetBriefs.length; i++) {
                this.TargetBriefs[i] = new TargetBrief(source.TargetBriefs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "EventBusName", this.EventBusName);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "ConnectionBriefs.", this.ConnectionBriefs);
        this.setParamArrayObj(map, prefix + "TargetBriefs.", this.TargetBriefs);

    }
}

