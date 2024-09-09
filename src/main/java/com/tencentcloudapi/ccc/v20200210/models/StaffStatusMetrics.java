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

public class StaffStatusMetrics extends AbstractModel {

    /**
    * Agent email.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Supplementary Information on Agent Status
    */
    @SerializedName("StatusExtra")
    @Expose
    private StaffStatusExtra StatusExtra;

    /**
    * Total Online duration of the day.
    */
    @SerializedName("OnlineDuration")
    @Expose
    private Long OnlineDuration;

    /**
    * Total Available duration of the day.
    */
    @SerializedName("FreeDuration")
    @Expose
    private Long FreeDuration;

    /**
    * Total Busy duration of the day.
    */
    @SerializedName("BusyDuration")
    @Expose
    private Long BusyDuration;

    /**
    * Total Not Ready status duration of the day.
    */
    @SerializedName("NotReadyDuration")
    @Expose
    private Long NotReadyDuration;

    /**
    * Total Break duration of the day.
    */
    @SerializedName("RestDuration")
    @Expose
    private Long RestDuration;

    /**
    * Total After Call Work duration of the day.
    */
    @SerializedName("AfterCallWorkDuration")
    @Expose
    private Long AfterCallWorkDuration;

    /**
    * Reason for Break.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Whether to reserve Break status.
    */
    @SerializedName("ReserveRest")
    @Expose
    private Boolean ReserveRest;

    /**
    * Whether to reserve Not Ready status.
    */
    @SerializedName("ReserveNotReady")
    @Expose
    private Boolean ReserveNotReady;

    /**
    * Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always.
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastOnlineTimestamp")
    @Expose
    private Long LastOnlineTimestamp;

    /**
    * Last status timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastStatusTimestamp")
    @Expose
    private Long LastStatusTimestamp;

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
     * Get Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline 
     * @return Status Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline
     * @param Status Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Supplementary Information on Agent Status 
     * @return StatusExtra Supplementary Information on Agent Status
     */
    public StaffStatusExtra getStatusExtra() {
        return this.StatusExtra;
    }

    /**
     * Set Supplementary Information on Agent Status
     * @param StatusExtra Supplementary Information on Agent Status
     */
    public void setStatusExtra(StaffStatusExtra StatusExtra) {
        this.StatusExtra = StatusExtra;
    }

    /**
     * Get Total Online duration of the day. 
     * @return OnlineDuration Total Online duration of the day.
     */
    public Long getOnlineDuration() {
        return this.OnlineDuration;
    }

    /**
     * Set Total Online duration of the day.
     * @param OnlineDuration Total Online duration of the day.
     */
    public void setOnlineDuration(Long OnlineDuration) {
        this.OnlineDuration = OnlineDuration;
    }

    /**
     * Get Total Available duration of the day. 
     * @return FreeDuration Total Available duration of the day.
     */
    public Long getFreeDuration() {
        return this.FreeDuration;
    }

    /**
     * Set Total Available duration of the day.
     * @param FreeDuration Total Available duration of the day.
     */
    public void setFreeDuration(Long FreeDuration) {
        this.FreeDuration = FreeDuration;
    }

    /**
     * Get Total Busy duration of the day. 
     * @return BusyDuration Total Busy duration of the day.
     */
    public Long getBusyDuration() {
        return this.BusyDuration;
    }

    /**
     * Set Total Busy duration of the day.
     * @param BusyDuration Total Busy duration of the day.
     */
    public void setBusyDuration(Long BusyDuration) {
        this.BusyDuration = BusyDuration;
    }

    /**
     * Get Total Not Ready status duration of the day. 
     * @return NotReadyDuration Total Not Ready status duration of the day.
     */
    public Long getNotReadyDuration() {
        return this.NotReadyDuration;
    }

    /**
     * Set Total Not Ready status duration of the day.
     * @param NotReadyDuration Total Not Ready status duration of the day.
     */
    public void setNotReadyDuration(Long NotReadyDuration) {
        this.NotReadyDuration = NotReadyDuration;
    }

    /**
     * Get Total Break duration of the day. 
     * @return RestDuration Total Break duration of the day.
     */
    public Long getRestDuration() {
        return this.RestDuration;
    }

    /**
     * Set Total Break duration of the day.
     * @param RestDuration Total Break duration of the day.
     */
    public void setRestDuration(Long RestDuration) {
        this.RestDuration = RestDuration;
    }

    /**
     * Get Total After Call Work duration of the day. 
     * @return AfterCallWorkDuration Total After Call Work duration of the day.
     */
    public Long getAfterCallWorkDuration() {
        return this.AfterCallWorkDuration;
    }

    /**
     * Set Total After Call Work duration of the day.
     * @param AfterCallWorkDuration Total After Call Work duration of the day.
     */
    public void setAfterCallWorkDuration(Long AfterCallWorkDuration) {
        this.AfterCallWorkDuration = AfterCallWorkDuration;
    }

    /**
     * Get Reason for Break. 
     * @return Reason Reason for Break.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for Break.
     * @param Reason Reason for Break.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Whether to reserve Break status. 
     * @return ReserveRest Whether to reserve Break status.
     */
    public Boolean getReserveRest() {
        return this.ReserveRest;
    }

    /**
     * Set Whether to reserve Break status.
     * @param ReserveRest Whether to reserve Break status.
     */
    public void setReserveRest(Boolean ReserveRest) {
        this.ReserveRest = ReserveRest;
    }

    /**
     * Get Whether to reserve Not Ready status. 
     * @return ReserveNotReady Whether to reserve Not Ready status.
     */
    public Boolean getReserveNotReady() {
        return this.ReserveNotReady;
    }

    /**
     * Set Whether to reserve Not Ready status.
     * @param ReserveNotReady Whether to reserve Not Ready status.
     */
    public void setReserveNotReady(Boolean ReserveNotReady) {
        this.ReserveNotReady = ReserveNotReady;
    }

    /**
     * Get Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always. 
     * @return UseMobileAccept Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always.
     */
    public Long getUseMobileAccept() {
        return this.UseMobileAccept;
    }

    /**
     * Set Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always.
     * @param UseMobileAccept Cell phone answering pattern: 0 - Off | 1 - Only when Offline | 2 - Always.
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastOnlineTimestamp Last online timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastOnlineTimestamp() {
        return this.LastOnlineTimestamp;
    }

    /**
     * Set Last online timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastOnlineTimestamp Last online timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastOnlineTimestamp(Long LastOnlineTimestamp) {
        this.LastOnlineTimestamp = LastOnlineTimestamp;
    }

    /**
     * Get Last status timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastStatusTimestamp Last status timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastStatusTimestamp() {
        return this.LastStatusTimestamp;
    }

    /**
     * Set Last status timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastStatusTimestamp Last status timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastStatusTimestamp(Long LastStatusTimestamp) {
        this.LastStatusTimestamp = LastStatusTimestamp;
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

    }
}

