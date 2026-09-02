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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddLoginWhiteListsRequest extends AbstractModel {

    /**
    * <p>Cross-region log-in allowlist entity</p>
    */
    @SerializedName("HostLoginWhiteObj")
    @Expose
    private HostLoginWhiteObj HostLoginWhiteObj;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Event synchronization method: "" -- no operation. "All" -- add All event records that meet this configuration to the allowlist. "Id" -- add the event record corresponding to the EventId to the allowlist.</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * <p>Cross-region log-in event ID. This parameter is required when ProcessType is set to Id.</p>
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get <p>Cross-region log-in allowlist entity</p> 
     * @return HostLoginWhiteObj <p>Cross-region log-in allowlist entity</p>
     */
    public HostLoginWhiteObj getHostLoginWhiteObj() {
        return this.HostLoginWhiteObj;
    }

    /**
     * Set <p>Cross-region log-in allowlist entity</p>
     * @param HostLoginWhiteObj <p>Cross-region log-in allowlist entity</p>
     */
    public void setHostLoginWhiteObj(HostLoginWhiteObj HostLoginWhiteObj) {
        this.HostLoginWhiteObj = HostLoginWhiteObj;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Event synchronization method: "" -- no operation. "All" -- add All event records that meet this configuration to the allowlist. "Id" -- add the event record corresponding to the EventId to the allowlist.</p> 
     * @return ProcessType <p>Event synchronization method: "" -- no operation. "All" -- add All event records that meet this configuration to the allowlist. "Id" -- add the event record corresponding to the EventId to the allowlist.</p>
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>Event synchronization method: "" -- no operation. "All" -- add All event records that meet this configuration to the allowlist. "Id" -- add the event record corresponding to the EventId to the allowlist.</p>
     * @param ProcessType <p>Event synchronization method: "" -- no operation. "All" -- add All event records that meet this configuration to the allowlist. "Id" -- add the event record corresponding to the EventId to the allowlist.</p>
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>Cross-region log-in event ID. This parameter is required when ProcessType is set to Id.</p> 
     * @return EventId <p>Cross-region log-in event ID. This parameter is required when ProcessType is set to Id.</p>
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>Cross-region log-in event ID. This parameter is required when ProcessType is set to Id.</p>
     * @param EventId <p>Cross-region log-in event ID. This parameter is required when ProcessType is set to Id.</p>
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public AddLoginWhiteListsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLoginWhiteListsRequest(AddLoginWhiteListsRequest source) {
        if (source.HostLoginWhiteObj != null) {
            this.HostLoginWhiteObj = new HostLoginWhiteObj(source.HostLoginWhiteObj);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HostLoginWhiteObj.", this.HostLoginWhiteObj);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

