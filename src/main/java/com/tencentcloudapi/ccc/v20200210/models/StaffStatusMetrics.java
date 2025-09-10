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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffStatusMetrics extends AbstractModel {

    /**
    * Agent email.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Agent status free available | busy busy | rest on break | notready not ready | aftercallwork post-call adjustment | offline offline.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Supplementary information on agent status.
    */
    @SerializedName("StatusExtra")
    @Expose
    private StaffStatusExtra StatusExtra;

    /**
    * Total online duration of the day.
    */
    @SerializedName("OnlineDuration")
    @Expose
    private Long OnlineDuration;

    /**
    * Total available duration of the day.
    */
    @SerializedName("FreeDuration")
    @Expose
    private Long FreeDuration;

    /**
    * Total busy duration of the day.
    */
    @SerializedName("BusyDuration")
    @Expose
    private Long BusyDuration;

    /**
    * Total not ready status duration of the day.
    */
    @SerializedName("NotReadyDuration")
    @Expose
    private Long NotReadyDuration;

    /**
    * Total break duration of the day.
    */
    @SerializedName("RestDuration")
    @Expose
    private Long RestDuration;

    /**
    * Adjust the total duration of after-call work for the day.
    */
    @SerializedName("AfterCallWorkDuration")
    @Expose
    private Long AfterCallWorkDuration;

    /**
    * Reason for break.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Whether to reserve break status.
    */
    @SerializedName("ReserveRest")
    @Expose
    private Boolean ReserveRest;

    /**
    * Whether to reserve not ready status.
    */
    @SerializedName("ReserveNotReady")
    @Expose
    private Boolean ReserveNotReady;

    /**
    * Cell phone answering pattern: 0 - off | 1 - only when offline | 2 - always.
    */
    @SerializedName("UseMobileAccept")
    @Expose
    private Long UseMobileAccept;

    /**
    * Cell phone outbound call switch.
    */
    @SerializedName("UseMobileCallOut")
    @Expose
    private Boolean UseMobileCallOut;

    /**
    * Last online timestamp.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastOnlineTimestamp")
    @Expose
    private Long LastOnlineTimestamp;

    /**
    * Last status timestamp.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastStatusTimestamp")
    @Expose
    private Long LastStatusTimestamp;

    /**
    * Specifies the endpoint information for customer service logon.
    */
    @SerializedName("ClientInfo")
    @Expose
    private ClientInfo [] ClientInfo;

    /**
     * Get Agent email. 
     * @return Email Agent email.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Agent email.
     * @param Email Agent email.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Agent status free available | busy busy | rest on break | notready not ready | aftercallwork post-call adjustment | offline offline. 
     * @return Status Agent status free available | busy busy | rest on break | notready not ready | aftercallwork post-call adjustment | offline offline.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent status free available | busy busy | rest on break | notready not ready | aftercallwork post-call adjustment | offline offline.
     * @param Status Agent status free available | busy busy | rest on break | notready not ready | aftercallwork post-call adjustment | offline offline.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Supplementary information on agent status. 
     * @return StatusExtra Supplementary information on agent status.
     */
    public StaffStatusExtra getStatusExtra() {
        return this.StatusExtra;
    }

    /**
     * Set Supplementary information on agent status.
     * @param StatusExtra Supplementary information on agent status.
     */
    public void setStatusExtra(StaffStatusExtra StatusExtra) {
        this.StatusExtra = StatusExtra;
    }

    /**
     * Get Total online duration of the day. 
     * @return OnlineDuration Total online duration of the day.
     */
    public Long getOnlineDuration() {
        return this.OnlineDuration;
    }

    /**
     * Set Total online duration of the day.
     * @param OnlineDuration Total online duration of the day.
     */
    public void setOnlineDuration(Long OnlineDuration) {
        this.OnlineDuration = OnlineDuration;
    }

    /**
     * Get Total available duration of the day. 
     * @return FreeDuration Total available duration of the day.
     */
    public Long getFreeDuration() {
        return this.FreeDuration;
    }

    /**
     * Set Total available duration of the day.
     * @param FreeDuration Total available duration of the day.
     */
    public void setFreeDuration(Long FreeDuration) {
        this.FreeDuration = FreeDuration;
    }

    /**
     * Get Total busy duration of the day. 
     * @return BusyDuration Total busy duration of the day.
     */
    public Long getBusyDuration() {
        return this.BusyDuration;
    }

    /**
     * Set Total busy duration of the day.
     * @param BusyDuration Total busy duration of the day.
     */
    public void setBusyDuration(Long BusyDuration) {
        this.BusyDuration = BusyDuration;
    }

    /**
     * Get Total not ready status duration of the day. 
     * @return NotReadyDuration Total not ready status duration of the day.
     */
    public Long getNotReadyDuration() {
        return this.NotReadyDuration;
    }

    /**
     * Set Total not ready status duration of the day.
     * @param NotReadyDuration Total not ready status duration of the day.
     */
    public void setNotReadyDuration(Long NotReadyDuration) {
        this.NotReadyDuration = NotReadyDuration;
    }

    /**
     * Get Total break duration of the day. 
     * @return RestDuration Total break duration of the day.
     */
    public Long getRestDuration() {
        return this.RestDuration;
    }

    /**
     * Set Total break duration of the day.
     * @param RestDuration Total break duration of the day.
     */
    public void setRestDuration(Long RestDuration) {
        this.RestDuration = RestDuration;
    }

    /**
     * Get Adjust the total duration of after-call work for the day. 
     * @return AfterCallWorkDuration Adjust the total duration of after-call work for the day.
     */
    public Long getAfterCallWorkDuration() {
        return this.AfterCallWorkDuration;
    }

    /**
     * Set Adjust the total duration of after-call work for the day.
     * @param AfterCallWorkDuration Adjust the total duration of after-call work for the day.
     */
    public void setAfterCallWorkDuration(Long AfterCallWorkDuration) {
        this.AfterCallWorkDuration = AfterCallWorkDuration;
    }

    /**
     * Get Reason for break. 
     * @return Reason Reason for break.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for break.
     * @param Reason Reason for break.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Whether to reserve break status. 
     * @return ReserveRest Whether to reserve break status.
     */
    public Boolean getReserveRest() {
        return this.ReserveRest;
    }

    /**
     * Set Whether to reserve break status.
     * @param ReserveRest Whether to reserve break status.
     */
    public void setReserveRest(Boolean ReserveRest) {
        this.ReserveRest = ReserveRest;
    }

    /**
     * Get Whether to reserve not ready status. 
     * @return ReserveNotReady Whether to reserve not ready status.
     */
    public Boolean getReserveNotReady() {
        return this.ReserveNotReady;
    }

    /**
     * Set Whether to reserve not ready status.
     * @param ReserveNotReady Whether to reserve not ready status.
     */
    public void setReserveNotReady(Boolean ReserveNotReady) {
        this.ReserveNotReady = ReserveNotReady;
    }

    /**
     * Get Cell phone answering pattern: 0 - off | 1 - only when offline | 2 - always. 
     * @return UseMobileAccept Cell phone answering pattern: 0 - off | 1 - only when offline | 2 - always.
     */
    public Long getUseMobileAccept() {
        return this.UseMobileAccept;
    }

    /**
     * Set Cell phone answering pattern: 0 - off | 1 - only when offline | 2 - always.
     * @param UseMobileAccept Cell phone answering pattern: 0 - off | 1 - only when offline | 2 - always.
     */
    public void setUseMobileAccept(Long UseMobileAccept) {
        this.UseMobileAccept = UseMobileAccept;
    }

    /**
     * Get Cell phone outbound call switch. 
     * @return UseMobileCallOut Cell phone outbound call switch.
     */
    public Boolean getUseMobileCallOut() {
        return this.UseMobileCallOut;
    }

    /**
     * Set Cell phone outbound call switch.
     * @param UseMobileCallOut Cell phone outbound call switch.
     */
    public void setUseMobileCallOut(Boolean UseMobileCallOut) {
        this.UseMobileCallOut = UseMobileCallOut;
    }

    /**
     * Get Last online timestamp.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastOnlineTimestamp Last online timestamp.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastOnlineTimestamp() {
        return this.LastOnlineTimestamp;
    }

    /**
     * Set Last online timestamp.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastOnlineTimestamp Last online timestamp.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastOnlineTimestamp(Long LastOnlineTimestamp) {
        this.LastOnlineTimestamp = LastOnlineTimestamp;
    }

    /**
     * Get Last status timestamp.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastStatusTimestamp Last status timestamp.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastStatusTimestamp() {
        return this.LastStatusTimestamp;
    }

    /**
     * Set Last status timestamp.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastStatusTimestamp Last status timestamp.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastStatusTimestamp(Long LastStatusTimestamp) {
        this.LastStatusTimestamp = LastStatusTimestamp;
    }

    /**
     * Get Specifies the endpoint information for customer service logon. 
     * @return ClientInfo Specifies the endpoint information for customer service logon.
     */
    public ClientInfo [] getClientInfo() {
        return this.ClientInfo;
    }

    /**
     * Set Specifies the endpoint information for customer service logon.
     * @param ClientInfo Specifies the endpoint information for customer service logon.
     */
    public void setClientInfo(ClientInfo [] ClientInfo) {
        this.ClientInfo = ClientInfo;
    }

    public StaffStatusMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffStatusMetrics(StaffStatusMetrics source) {
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusExtra != null) {
            this.StatusExtra = new StaffStatusExtra(source.StatusExtra);
        }
        if (source.OnlineDuration != null) {
            this.OnlineDuration = new Long(source.OnlineDuration);
        }
        if (source.FreeDuration != null) {
            this.FreeDuration = new Long(source.FreeDuration);
        }
        if (source.BusyDuration != null) {
            this.BusyDuration = new Long(source.BusyDuration);
        }
        if (source.NotReadyDuration != null) {
            this.NotReadyDuration = new Long(source.NotReadyDuration);
        }
        if (source.RestDuration != null) {
            this.RestDuration = new Long(source.RestDuration);
        }
        if (source.AfterCallWorkDuration != null) {
            this.AfterCallWorkDuration = new Long(source.AfterCallWorkDuration);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ReserveRest != null) {
            this.ReserveRest = new Boolean(source.ReserveRest);
        }
        if (source.ReserveNotReady != null) {
            this.ReserveNotReady = new Boolean(source.ReserveNotReady);
        }
        if (source.UseMobileAccept != null) {
            this.UseMobileAccept = new Long(source.UseMobileAccept);
        }
        if (source.UseMobileCallOut != null) {
            this.UseMobileCallOut = new Boolean(source.UseMobileCallOut);
        }
        if (source.LastOnlineTimestamp != null) {
            this.LastOnlineTimestamp = new Long(source.LastOnlineTimestamp);
        }
        if (source.LastStatusTimestamp != null) {
            this.LastStatusTimestamp = new Long(source.LastStatusTimestamp);
        }
        if (source.ClientInfo != null) {
            this.ClientInfo = new ClientInfo[source.ClientInfo.length];
            for (int i = 0; i < source.ClientInfo.length; i++) {
                this.ClientInfo[i] = new ClientInfo(source.ClientInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "StatusExtra.", this.StatusExtra);
        this.setParamSimple(map, prefix + "OnlineDuration", this.OnlineDuration);
        this.setParamSimple(map, prefix + "FreeDuration", this.FreeDuration);
        this.setParamSimple(map, prefix + "BusyDuration", this.BusyDuration);
        this.setParamSimple(map, prefix + "NotReadyDuration", this.NotReadyDuration);
        this.setParamSimple(map, prefix + "RestDuration", this.RestDuration);
        this.setParamSimple(map, prefix + "AfterCallWorkDuration", this.AfterCallWorkDuration);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ReserveRest", this.ReserveRest);
        this.setParamSimple(map, prefix + "ReserveNotReady", this.ReserveNotReady);
        this.setParamSimple(map, prefix + "UseMobileAccept", this.UseMobileAccept);
        this.setParamSimple(map, prefix + "UseMobileCallOut", this.UseMobileCallOut);
        this.setParamSimple(map, prefix + "LastOnlineTimestamp", this.LastOnlineTimestamp);
        this.setParamSimple(map, prefix + "LastStatusTimestamp", this.LastStatusTimestamp);
        this.setParamArrayObj(map, prefix + "ClientInfo.", this.ClientInfo);

    }
}

