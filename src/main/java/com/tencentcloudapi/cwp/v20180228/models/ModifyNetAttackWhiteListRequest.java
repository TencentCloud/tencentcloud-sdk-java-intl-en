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

public class ModifyNetAttackWhiteListRequest extends AbstractModel {

    /**
    * Whether applies all hosts: 0: no; 1: yes
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
    * Whether to allowlist all alarms that match this rule: 1: Yes, 0: No.
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * QUUID list
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * Rule description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Whether applies all hosts: 0: no; 1: yes 
     * @return Scope Whether applies all hosts: 0: no; 1: yes
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set Whether applies all hosts: 0: no; 1: yes
     * @param Scope Whether applies all hosts: 0: no; 1: yes
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
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get Rule description 
     * @return Description Rule description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description
     * @param Description Rule description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyNetAttackWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetAttackWhiteListRequest(ModifyNetAttackWhiteListRequest source) {
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String[source.SrcIp.length];
            for (int i = 0; i < source.SrcIp.length; i++) {
                this.SrcIp[i] = new String(source.SrcIp[i]);
            }
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
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
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

