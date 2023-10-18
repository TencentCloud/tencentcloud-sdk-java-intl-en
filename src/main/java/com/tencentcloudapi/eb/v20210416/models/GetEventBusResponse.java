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

public class GetEventBusResponse extends AbstractModel {

    /**
    * Update time
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * Event bus description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Log topic ID
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * Creation time.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Logset ID
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * Event bus name
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
    * (Disused) Event bus type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Billing mode
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * EventBridge log storage period
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * EventBridge log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * Whether to enable log storage
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableStore")
    @Expose
    private Boolean EnableStore;

    /**
    * Whether to sort the message
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LinkMode")
    @Expose
    private String LinkMode;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Event bus description 
     * @return Description Event bus description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event bus description
     * @param Description Event bus description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Log topic ID 
     * @return ClsTopicId Log topic ID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set Log topic ID
     * @param ClsTopicId Log topic ID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get Creation time. 
     * @return AddTime Creation time.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time.
     * @param AddTime Creation time.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Logset ID 
     * @return ClsLogsetId Logset ID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set Logset ID
     * @param ClsLogsetId Logset ID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get Event bus name 
     * @return EventBusName Event bus name
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set Event bus name
     * @param EventBusName Event bus name
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
     * Get (Disused) Event bus type 
     * @return Type (Disused) Event bus type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set (Disused) Event bus type
     * @param Type (Disused) Event bus type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Billing mode 
     * @return PayMode Billing mode
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode
     * @param PayMode Billing mode
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get EventBridge log storage period
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SaveDays EventBridge log storage period
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set EventBridge log storage period
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SaveDays EventBridge log storage period
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get EventBridge log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LogTopicId EventBridge log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set EventBridge log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LogTopicId EventBridge log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get Whether to enable log storage
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnableStore Whether to enable log storage
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getEnableStore() {
        return this.EnableStore;
    }

    /**
     * Set Whether to enable log storage
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnableStore Whether to enable log storage
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnableStore(Boolean EnableStore) {
        this.EnableStore = EnableStore;
    }

    /**
     * Get Whether to sort the message
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LinkMode Whether to sort the message
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLinkMode() {
        return this.LinkMode;
    }

    /**
     * Set Whether to sort the message
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LinkMode Whether to sort the message
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLinkMode(String LinkMode) {
        this.LinkMode = LinkMode;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetEventBusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEventBusResponse(GetEventBusResponse source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
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
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.EnableStore != null) {
            this.EnableStore = new Boolean(source.EnableStore);
        }
        if (source.LinkMode != null) {
            this.LinkMode = new String(source.LinkMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "EventBusName", this.EventBusName);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "EnableStore", this.EnableStore);
        this.setParamSimple(map, prefix + "LinkMode", this.LinkMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

