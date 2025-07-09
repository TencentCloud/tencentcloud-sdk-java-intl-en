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

public class CreateNetAttackWhiteListRequest extends AbstractModel {

    /**
    * Whether the allowlist applies to all hosts. 0: no; 1: yes.
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24 
    */
    @SerializedName("SrcIp")
    @Expose
    private String [] SrcIp;

    /**
    * QUUID list
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * Event ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Whether to allowlist all alarms that match this rule: 1: Yes, 0: No.
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Whether the allowlist applies to all hosts. 0: no; 1: yes. 
     * @return Scope Whether the allowlist applies to all hosts. 0: no; 1: yes.
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set Whether the allowlist applies to all hosts. 0: no; 1: yes.
     * @param Scope Whether the allowlist applies to all hosts. 0: no; 1: yes.
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24  
     * @return SrcIp Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24 
     */
    public String [] getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24 
     * @param SrcIp Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24 
     */
    public void setSrcIp(String [] SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get QUUID list 
     * @return QuuidList QUUID list
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set QUUID list
     * @param QuuidList QUUID list
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get Event ID 
     * @return EventId Event ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
     * @param EventId Event ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Whether to allowlist all alarms that match this rule: 1: Yes, 0: No. 
     * @return DealOldEvents Whether to allowlist all alarms that match this rule: 1: Yes, 0: No.
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set Whether to allowlist all alarms that match this rule: 1: Yes, 0: No.
     * @param DealOldEvents Whether to allowlist all alarms that match this rule: 1: Yes, 0: No.
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
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

    public CreateNetAttackWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNetAttackWhiteListRequest(CreateNetAttackWhiteListRequest source) {
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String[source.SrcIp.length];
            for (int i = 0; i < source.SrcIp.length; i++) {
                this.SrcIp[i] = new String(source.SrcIp[i]);
            }
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "SrcIp.", this.SrcIp);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

