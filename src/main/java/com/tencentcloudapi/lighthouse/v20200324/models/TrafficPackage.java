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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficPackage extends AbstractModel {

    /**
    * Traffic package ID.
    */
    @SerializedName("TrafficPackageId")
    @Expose
    private String TrafficPackageId;

    /**
    * Used traffic in bytes during traffic package validity period.
    */
    @SerializedName("TrafficUsed")
    @Expose
    private Long TrafficUsed;

    /**
    * Total traffic in bytes during traffic package validity period.
    */
    @SerializedName("TrafficPackageTotal")
    @Expose
    private Long TrafficPackageTotal;

    /**
    * Remaining traffic in bytes during traffic package validity period.
    */
    @SerializedName("TrafficPackageRemaining")
    @Expose
    private Long TrafficPackageRemaining;

    /**
    * Traffic exceeding package amount in bytes during traffic package validity period.
    */
    @SerializedName("TrafficOverflow")
    @Expose
    private Long TrafficOverflow;

    /**
    * Start time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Traffic package expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * Traffic package status:
<li>NETWORK_NORMAL: normal</li>
<li>OVERDUE_NETWORK_DISABLED: the network is disconnected due to overdue payments</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Traffic package ID. 
     * @return TrafficPackageId Traffic package ID.
     */
    public String getTrafficPackageId() {
        return this.TrafficPackageId;
    }

    /**
     * Set Traffic package ID.
     * @param TrafficPackageId Traffic package ID.
     */
    public void setTrafficPackageId(String TrafficPackageId) {
        this.TrafficPackageId = TrafficPackageId;
    }

    /**
     * Get Used traffic in bytes during traffic package validity period. 
     * @return TrafficUsed Used traffic in bytes during traffic package validity period.
     */
    public Long getTrafficUsed() {
        return this.TrafficUsed;
    }

    /**
     * Set Used traffic in bytes during traffic package validity period.
     * @param TrafficUsed Used traffic in bytes during traffic package validity period.
     */
    public void setTrafficUsed(Long TrafficUsed) {
        this.TrafficUsed = TrafficUsed;
    }

    /**
     * Get Total traffic in bytes during traffic package validity period. 
     * @return TrafficPackageTotal Total traffic in bytes during traffic package validity period.
     */
    public Long getTrafficPackageTotal() {
        return this.TrafficPackageTotal;
    }

    /**
     * Set Total traffic in bytes during traffic package validity period.
     * @param TrafficPackageTotal Total traffic in bytes during traffic package validity period.
     */
    public void setTrafficPackageTotal(Long TrafficPackageTotal) {
        this.TrafficPackageTotal = TrafficPackageTotal;
    }

    /**
     * Get Remaining traffic in bytes during traffic package validity period. 
     * @return TrafficPackageRemaining Remaining traffic in bytes during traffic package validity period.
     */
    public Long getTrafficPackageRemaining() {
        return this.TrafficPackageRemaining;
    }

    /**
     * Set Remaining traffic in bytes during traffic package validity period.
     * @param TrafficPackageRemaining Remaining traffic in bytes during traffic package validity period.
     */
    public void setTrafficPackageRemaining(Long TrafficPackageRemaining) {
        this.TrafficPackageRemaining = TrafficPackageRemaining;
    }

    /**
     * Get Traffic exceeding package amount in bytes during traffic package validity period. 
     * @return TrafficOverflow Traffic exceeding package amount in bytes during traffic package validity period.
     */
    public Long getTrafficOverflow() {
        return this.TrafficOverflow;
    }

    /**
     * Set Traffic exceeding package amount in bytes during traffic package validity period.
     * @param TrafficOverflow Traffic exceeding package amount in bytes during traffic package validity period.
     */
    public void setTrafficOverflow(Long TrafficOverflow) {
        this.TrafficOverflow = TrafficOverflow;
    }

    /**
     * Get Start time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time of traffic package validity period according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Traffic package expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Deadline Traffic package expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Traffic package expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Deadline Traffic package expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get Traffic package status:
<li>NETWORK_NORMAL: normal</li>
<li>OVERDUE_NETWORK_DISABLED: the network is disconnected due to overdue payments</li> 
     * @return Status Traffic package status:
<li>NETWORK_NORMAL: normal</li>
<li>OVERDUE_NETWORK_DISABLED: the network is disconnected due to overdue payments</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Traffic package status:
<li>NETWORK_NORMAL: normal</li>
<li>OVERDUE_NETWORK_DISABLED: the network is disconnected due to overdue payments</li>
     * @param Status Traffic package status:
<li>NETWORK_NORMAL: normal</li>
<li>OVERDUE_NETWORK_DISABLED: the network is disconnected due to overdue payments</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public TrafficPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPackage(TrafficPackage source) {
        if (source.TrafficPackageId != null) {
            this.TrafficPackageId = new String(source.TrafficPackageId);
        }
        if (source.TrafficUsed != null) {
            this.TrafficUsed = new Long(source.TrafficUsed);
        }
        if (source.TrafficPackageTotal != null) {
            this.TrafficPackageTotal = new Long(source.TrafficPackageTotal);
        }
        if (source.TrafficPackageRemaining != null) {
            this.TrafficPackageRemaining = new Long(source.TrafficPackageRemaining);
        }
        if (source.TrafficOverflow != null) {
            this.TrafficOverflow = new Long(source.TrafficOverflow);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficPackageId", this.TrafficPackageId);
        this.setParamSimple(map, prefix + "TrafficUsed", this.TrafficUsed);
        this.setParamSimple(map, prefix + "TrafficPackageTotal", this.TrafficPackageTotal);
        this.setParamSimple(map, prefix + "TrafficPackageRemaining", this.TrafficPackageRemaining);
        this.setParamSimple(map, prefix + "TrafficOverflow", this.TrafficOverflow);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

