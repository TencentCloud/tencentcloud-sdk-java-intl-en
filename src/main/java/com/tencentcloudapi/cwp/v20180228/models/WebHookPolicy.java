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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebHookPolicy extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event type
    */
    @SerializedName("Events")
    @Expose
    private WebHookEventKv [] Events;

    /**
    * Host scope
    */
    @SerializedName("HostLabels")
    @Expose
    private WebHookHostLabel [] HostLabels;

    /**
    * Recipient
    */
    @SerializedName("Receivers")
    @Expose
    private WebHookReceiver [] Receivers;

    /**
    * Format. 0: text; 1: JSON.
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * Custom passthrough field
    */
    @SerializedName("CustomFields")
    @Expose
    private WebHookCustomField [] CustomFields;

    /**
    * Whether it is disabled [1: disabled|0: enabled]
    */
    @SerializedName("IsDisabled")
    @Expose
    private Long IsDisabled;

    /**
    * List of hosts
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * Number of hosts
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * List of machines to be excluded.
    */
    @SerializedName("ExcludedQuuids")
    @Expose
    private String [] ExcludedQuuids;

    /**
    * Push language type, Chinese zh, English en	
    */
    @SerializedName("MsgLanguage")
    @Expose
    private String MsgLanguage;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Policy name 
     * @return Name Policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name
     * @param Name Policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event type 
     * @return Events Event type
     */
    public WebHookEventKv [] getEvents() {
        return this.Events;
    }

    /**
     * Set Event type
     * @param Events Event type
     */
    public void setEvents(WebHookEventKv [] Events) {
        this.Events = Events;
    }

    /**
     * Get Host scope 
     * @return HostLabels Host scope
     */
    public WebHookHostLabel [] getHostLabels() {
        return this.HostLabels;
    }

    /**
     * Set Host scope
     * @param HostLabels Host scope
     */
    public void setHostLabels(WebHookHostLabel [] HostLabels) {
        this.HostLabels = HostLabels;
    }

    /**
     * Get Recipient 
     * @return Receivers Recipient
     */
    public WebHookReceiver [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Recipient
     * @param Receivers Recipient
     */
    public void setReceivers(WebHookReceiver [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Format. 0: text; 1: JSON. 
     * @return Format Format. 0: text; 1: JSON.
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set Format. 0: text; 1: JSON.
     * @param Format Format. 0: text; 1: JSON.
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get Custom passthrough field 
     * @return CustomFields Custom passthrough field
     */
    public WebHookCustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set Custom passthrough field
     * @param CustomFields Custom passthrough field
     */
    public void setCustomFields(WebHookCustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get Whether it is disabled [1: disabled|0: enabled] 
     * @return IsDisabled Whether it is disabled [1: disabled|0: enabled]
     */
    public Long getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set Whether it is disabled [1: disabled|0: enabled]
     * @param IsDisabled Whether it is disabled [1: disabled|0: enabled]
     */
    public void setIsDisabled(Long IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    /**
     * Get List of hosts 
     * @return Quuids List of hosts
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set List of hosts
     * @param Quuids List of hosts
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get Number of hosts 
     * @return HostCount Number of hosts
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of hosts
     * @param HostCount Number of hosts
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get List of machines to be excluded. 
     * @return ExcludedQuuids List of machines to be excluded.
     */
    public String [] getExcludedQuuids() {
        return this.ExcludedQuuids;
    }

    /**
     * Set List of machines to be excluded.
     * @param ExcludedQuuids List of machines to be excluded.
     */
    public void setExcludedQuuids(String [] ExcludedQuuids) {
        this.ExcludedQuuids = ExcludedQuuids;
    }

    /**
     * Get Push language type, Chinese zh, English en	 
     * @return MsgLanguage Push language type, Chinese zh, English en	
     */
    public String getMsgLanguage() {
        return this.MsgLanguage;
    }

    /**
     * Set Push language type, Chinese zh, English en	
     * @param MsgLanguage Push language type, Chinese zh, English en	
     */
    public void setMsgLanguage(String MsgLanguage) {
        this.MsgLanguage = MsgLanguage;
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
        if (source.ExcludedQuuids != null) {
            this.ExcludedQuuids = new String[source.ExcludedQuuids.length];
            for (int i = 0; i < source.ExcludedQuuids.length; i++) {
                this.ExcludedQuuids[i] = new String(source.ExcludedQuuids[i]);
            }
        }
        if (source.MsgLanguage != null) {
            this.MsgLanguage = new String(source.MsgLanguage);
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
        this.setParamArraySimple(map, prefix + "ExcludedQuuids.", this.ExcludedQuuids);
        this.setParamSimple(map, prefix + "MsgLanguage", this.MsgLanguage);

    }
}

