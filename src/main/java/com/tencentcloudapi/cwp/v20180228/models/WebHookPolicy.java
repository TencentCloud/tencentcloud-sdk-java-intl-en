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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebHookPolicy extends AbstractModel {

    /**
    * id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Policy name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Events")
    @Expose
    private WebHookEventKv [] Events;

    /**
    * Host range
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostLabels")
    @Expose
    private WebHookHostLabel [] HostLabels;

    /**
    * Recipient
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Receivers")
    @Expose
    private WebHookReceiver [] Receivers;

    /**
    * Format. 0: text; 1: JSON.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * Custom passthrough field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomFields")
    @Expose
    private WebHookCustomField [] CustomFields;

    /**
    * Enable/Disable [1-Disable, 0-Enable]
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDisabled")
    @Expose
    private Long IsDisabled;

    /**
    * Host list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * Number of hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
     * Get id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Policy name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Events Event type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WebHookEventKv [] getEvents() {
        return this.Events;
    }

    /**
     * Set Event type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Events Event type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEvents(WebHookEventKv [] Events) {
        this.Events = Events;
    }

    /**
     * Get Host range
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostLabels Host range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WebHookHostLabel [] getHostLabels() {
        return this.HostLabels;
    }

    /**
     * Set Host range
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostLabels Host range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostLabels(WebHookHostLabel [] HostLabels) {
        this.HostLabels = HostLabels;
    }

    /**
     * Get Recipient
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Receivers Recipient
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WebHookReceiver [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Recipient
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Receivers Recipient
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceivers(WebHookReceiver [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Format. 0: text; 1: JSON.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Format Format. 0: text; 1: JSON.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set Format. 0: text; 1: JSON.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Format Format. 0: text; 1: JSON.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get Custom passthrough field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomFields Custom passthrough field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WebHookCustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set Custom passthrough field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomFields Custom passthrough field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomFields(WebHookCustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get Enable/Disable [1-Disable, 0-Enable]
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDisabled Enable/Disable [1-Disable, 0-Enable]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set Enable/Disable [1-Disable, 0-Enable]
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDisabled Enable/Disable [1-Disable, 0-Enable]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDisabled(Long IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    /**
     * Get Host list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuids Host list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Host list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuids Host list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get Number of hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostCount Number of hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostCount Number of hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    public WebHookPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebHookPolicy(WebHookPolicy source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Events != null) {
            this.Events = new WebHookEventKv[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new WebHookEventKv(source.Events[i]);
            }
        }
        if (source.HostLabels != null) {
            this.HostLabels = new WebHookHostLabel[source.HostLabels.length];
            for (int i = 0; i < source.HostLabels.length; i++) {
                this.HostLabels[i] = new WebHookHostLabel(source.HostLabels[i]);
            }
        }
        if (source.Receivers != null) {
            this.Receivers = new WebHookReceiver[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new WebHookReceiver(source.Receivers[i]);
            }
        }
        if (source.Format != null) {
            this.Format = new Long(source.Format);
        }
        if (source.CustomFields != null) {
            this.CustomFields = new WebHookCustomField[source.CustomFields.length];
            for (int i = 0; i < source.CustomFields.length; i++) {
                this.CustomFields[i] = new WebHookCustomField(source.CustomFields[i]);
            }
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Long(source.IsDisabled);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamArrayObj(map, prefix + "HostLabels.", this.HostLabels);
        this.setParamArrayObj(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);

    }
}

