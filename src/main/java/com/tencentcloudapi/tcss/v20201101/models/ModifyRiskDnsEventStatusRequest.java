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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRiskDnsEventStatusRequest extends AbstractModel {

    /**
    * Array of malicious request event IDs. It is required for adding to the allowlist. Otherwise, choose Filters or EventIDSet.
    */
    @SerializedName("EventIDSet")
    @Expose
    private Long [] EventIDSet;

    /**
    * Mark the status of the event.
EVENT_UNDEAL: Unprocessed (unignore)
EVENT_DEALED: Processed
EVENT_IGNORE: Ignore
EVENT_DELETE: Deleted
EVENT_ADD_WHITE: Add to whitelist
EVENT_ISOLATE_CONTAINER: Isolate container
EVENT_RESTORE_CONTAINER: Restore CONTAINER.
    */
    @SerializedName("EventStatus")
    @Expose
    private String EventStatus;

    /**
    * Allowlist Domain/IP
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Adding Identical Request Domain Name/IP Events to Allowlist
    */
    @SerializedName("AllSameEventAddWhite")
    @Expose
    private Boolean AllSameEventAddWhite;

    /**
    * Allowlist Adding Event Type. DOMAIN: Malicious Domain Request; IP: Malicious IP Request
    */
    @SerializedName("AddWhiteEventType")
    @Expose
    private String AddWhiteEventType;

    /**
     * Get Array of malicious request event IDs. It is required for adding to the allowlist. Otherwise, choose Filters or EventIDSet. 
     * @return EventIDSet Array of malicious request event IDs. It is required for adding to the allowlist. Otherwise, choose Filters or EventIDSet.
     */
    public Long [] getEventIDSet() {
        return this.EventIDSet;
    }

    /**
     * Set Array of malicious request event IDs. It is required for adding to the allowlist. Otherwise, choose Filters or EventIDSet.
     * @param EventIDSet Array of malicious request event IDs. It is required for adding to the allowlist. Otherwise, choose Filters or EventIDSet.
     */
    public void setEventIDSet(Long [] EventIDSet) {
        this.EventIDSet = EventIDSet;
    }

    /**
     * Get Mark the status of the event.
EVENT_UNDEAL: Unprocessed (unignore)
EVENT_DEALED: Processed
EVENT_IGNORE: Ignore
EVENT_DELETE: Deleted
EVENT_ADD_WHITE: Add to whitelist
EVENT_ISOLATE_CONTAINER: Isolate container
EVENT_RESTORE_CONTAINER: Restore CONTAINER. 
     * @return EventStatus Mark the status of the event.
EVENT_UNDEAL: Unprocessed (unignore)
EVENT_DEALED: Processed
EVENT_IGNORE: Ignore
EVENT_DELETE: Deleted
EVENT_ADD_WHITE: Add to whitelist
EVENT_ISOLATE_CONTAINER: Isolate container
EVENT_RESTORE_CONTAINER: Restore CONTAINER.
     */
    public String getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set Mark the status of the event.
EVENT_UNDEAL: Unprocessed (unignore)
EVENT_DEALED: Processed
EVENT_IGNORE: Ignore
EVENT_DELETE: Deleted
EVENT_ADD_WHITE: Add to whitelist
EVENT_ISOLATE_CONTAINER: Isolate container
EVENT_RESTORE_CONTAINER: Restore CONTAINER.
     * @param EventStatus Mark the status of the event.
EVENT_UNDEAL: Unprocessed (unignore)
EVENT_DEALED: Processed
EVENT_IGNORE: Ignore
EVENT_DELETE: Deleted
EVENT_ADD_WHITE: Add to whitelist
EVENT_ISOLATE_CONTAINER: Isolate container
EVENT_RESTORE_CONTAINER: Restore CONTAINER.
     */
    public void setEventStatus(String EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get Allowlist Domain/IP 
     * @return Address Allowlist Domain/IP
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Allowlist Domain/IP
     * @param Address Allowlist Domain/IP
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Adding Identical Request Domain Name/IP Events to Allowlist 
     * @return AllSameEventAddWhite Adding Identical Request Domain Name/IP Events to Allowlist
     */
    public Boolean getAllSameEventAddWhite() {
        return this.AllSameEventAddWhite;
    }

    /**
     * Set Adding Identical Request Domain Name/IP Events to Allowlist
     * @param AllSameEventAddWhite Adding Identical Request Domain Name/IP Events to Allowlist
     */
    public void setAllSameEventAddWhite(Boolean AllSameEventAddWhite) {
        this.AllSameEventAddWhite = AllSameEventAddWhite;
    }

    /**
     * Get Allowlist Adding Event Type. DOMAIN: Malicious Domain Request; IP: Malicious IP Request 
     * @return AddWhiteEventType Allowlist Adding Event Type. DOMAIN: Malicious Domain Request; IP: Malicious IP Request
     */
    public String getAddWhiteEventType() {
        return this.AddWhiteEventType;
    }

    /**
     * Set Allowlist Adding Event Type. DOMAIN: Malicious Domain Request; IP: Malicious IP Request
     * @param AddWhiteEventType Allowlist Adding Event Type. DOMAIN: Malicious Domain Request; IP: Malicious IP Request
     */
    public void setAddWhiteEventType(String AddWhiteEventType) {
        this.AddWhiteEventType = AddWhiteEventType;
    }

    public ModifyRiskDnsEventStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskDnsEventStatusRequest(ModifyRiskDnsEventStatusRequest source) {
        if (source.EventIDSet != null) {
            this.EventIDSet = new Long[source.EventIDSet.length];
            for (int i = 0; i < source.EventIDSet.length; i++) {
                this.EventIDSet[i] = new Long(source.EventIDSet[i]);
            }
        }
        if (source.EventStatus != null) {
            this.EventStatus = new String(source.EventStatus);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AllSameEventAddWhite != null) {
            this.AllSameEventAddWhite = new Boolean(source.AllSameEventAddWhite);
        }
        if (source.AddWhiteEventType != null) {
            this.AddWhiteEventType = new String(source.AddWhiteEventType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIDSet.", this.EventIDSet);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AllSameEventAddWhite", this.AllSameEventAddWhite);
        this.setParamSimple(map, prefix + "AddWhiteEventType", this.AddWhiteEventType);

    }
}

