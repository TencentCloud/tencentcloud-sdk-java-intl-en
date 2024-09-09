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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentCruiseDialingCampaignRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Task Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Agent Account
    */
    @SerializedName("Agent")
    @Expose
    private String Agent;

    /**
    * Single-round Concurrent Call Volume 1-20
    */
    @SerializedName("ConcurrencyNumber")
    @Expose
    private Long ConcurrencyNumber;

    /**
    * Task start time. Unix timestamp. The task will automatically start after this time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Task termination time. Unix timestamp. The task will automatically terminate after this time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Called list supporting E.164 or number formats without country code.
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * Calling list using the number formats displayed on the management side.
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * Being called sequence: 0 for random 1 for in order.
    */
    @SerializedName("CallOrder")
    @Expose
    private Long CallOrder;

    /**
    * Caller Custom Data, Maximum Length 1024
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
     * Get Application ID (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Task Name 
     * @return Name Task Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task Name
     * @param Name Task Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Agent Account 
     * @return Agent Agent Account
     */
    public String getAgent() {
        return this.Agent;
    }

    /**
     * Set Agent Account
     * @param Agent Agent Account
     */
    public void setAgent(String Agent) {
        this.Agent = Agent;
    }

    /**
     * Get Single-round Concurrent Call Volume 1-20 
     * @return ConcurrencyNumber Single-round Concurrent Call Volume 1-20
     */
    public Long getConcurrencyNumber() {
        return this.ConcurrencyNumber;
    }

    /**
     * Set Single-round Concurrent Call Volume 1-20
     * @param ConcurrencyNumber Single-round Concurrent Call Volume 1-20
     */
    public void setConcurrencyNumber(Long ConcurrencyNumber) {
        this.ConcurrencyNumber = ConcurrencyNumber;
    }

    /**
     * Get Task start time. Unix timestamp. The task will automatically start after this time. 
     * @return StartTime Task start time. Unix timestamp. The task will automatically start after this time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time. Unix timestamp. The task will automatically start after this time.
     * @param StartTime Task start time. Unix timestamp. The task will automatically start after this time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task termination time. Unix timestamp. The task will automatically terminate after this time. 
     * @return EndTime Task termination time. Unix timestamp. The task will automatically terminate after this time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task termination time. Unix timestamp. The task will automatically terminate after this time.
     * @param EndTime Task termination time. Unix timestamp. The task will automatically terminate after this time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Called list supporting E.164 or number formats without country code. 
     * @return Callees Called list supporting E.164 or number formats without country code.
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set Called list supporting E.164 or number formats without country code.
     * @param Callees Called list supporting E.164 or number formats without country code.
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get Calling list using the number formats displayed on the management side. 
     * @return Callers Calling list using the number formats displayed on the management side.
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set Calling list using the number formats displayed on the management side.
     * @param Callers Calling list using the number formats displayed on the management side.
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get Being called sequence: 0 for random 1 for in order. 
     * @return CallOrder Being called sequence: 0 for random 1 for in order.
     */
    public Long getCallOrder() {
        return this.CallOrder;
    }

    /**
     * Set Being called sequence: 0 for random 1 for in order.
     * @param CallOrder Being called sequence: 0 for random 1 for in order.
     */
    public void setCallOrder(Long CallOrder) {
        this.CallOrder = CallOrder;
    }

    /**
     * Get Caller Custom Data, Maximum Length 1024 
     * @return UUI Caller Custom Data, Maximum Length 1024
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set Caller Custom Data, Maximum Length 1024
     * @param UUI Caller Custom Data, Maximum Length 1024
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    public CreateAgentCruiseDialingCampaignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentCruiseDialingCampaignRequest(CreateAgentCruiseDialingCampaignRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Agent != null) {
            this.Agent = new String(source.Agent);
        }
        if (source.ConcurrencyNumber != null) {
            this.ConcurrencyNumber = new Long(source.ConcurrencyNumber);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Callees != null) {
            this.Callees = new String[source.Callees.length];
            for (int i = 0; i < source.Callees.length; i++) {
                this.Callees[i] = new String(source.Callees[i]);
            }
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.CallOrder != null) {
            this.CallOrder = new Long(source.CallOrder);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Agent", this.Agent);
        this.setParamSimple(map, prefix + "ConcurrencyNumber", this.ConcurrencyNumber);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Callees.", this.Callees);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "CallOrder", this.CallOrder);
        this.setParamSimple(map, prefix + "UUI", this.UUI);

    }
}

