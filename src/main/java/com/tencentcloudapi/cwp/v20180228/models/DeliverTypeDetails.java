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

public class DeliverTypeDetails extends AbstractModel {

    /**
    * Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint; 7: host list; 8: client reporting.
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * Type of logs of the security module
    */
    @SerializedName("LogType")
    @Expose
    private Long [] LogType;

    /**
    * Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Shipping enabling status. 0: disabled; 1: enabled.
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * Shipping status. 0: disabled; 1: normal; 2: abnormal.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Error message
    */
    @SerializedName("ErrInfo")
    @Expose
    private String ErrInfo;

    /**
    * Timestamp of last status reporting
    */
    @SerializedName("StatusTime")
    @Expose
    private Long StatusTime;

    /**
    * Logset name
    */
    @SerializedName("LogName")
    @Expose
    private String LogName;

    /**
    * Logset ID
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Logset region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint; 7: host list; 8: client reporting. 
     * @return SecurityType Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint; 7: host list; 8: client reporting.
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint; 7: host list; 8: client reporting.
     * @param SecurityType Security module type. 1: intrusion detection; 2: vulnerability management; 3: baseline management; 4: advanced defense; 5: client security; 6: asset fingerprint; 7: host list; 8: client reporting.
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get Type of logs of the security module 
     * @return LogType Type of logs of the security module
     */
    public Long [] getLogType() {
        return this.LogType;
    }

    /**
     * Set Type of logs of the security module
     * @param LogType Type of logs of the security module
     */
    public void setLogType(Long [] LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Topic ID 
     * @return TopicId Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID
     * @param TopicId Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Shipping enabling status. 0: disabled; 1: enabled. 
     * @return Switch Shipping enabling status. 0: disabled; 1: enabled.
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set Shipping enabling status. 0: disabled; 1: enabled.
     * @param Switch Shipping enabling status. 0: disabled; 1: enabled.
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Shipping status. 0: disabled; 1: normal; 2: abnormal. 
     * @return Status Shipping status. 0: disabled; 1: normal; 2: abnormal.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Shipping status. 0: disabled; 1: normal; 2: abnormal.
     * @param Status Shipping status. 0: disabled; 1: normal; 2: abnormal.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Error message 
     * @return ErrInfo Error message
     */
    public String getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set Error message
     * @param ErrInfo Error message
     */
    public void setErrInfo(String ErrInfo) {
        this.ErrInfo = ErrInfo;
    }

    /**
     * Get Timestamp of last status reporting 
     * @return StatusTime Timestamp of last status reporting
     */
    public Long getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set Timestamp of last status reporting
     * @param StatusTime Timestamp of last status reporting
     */
    public void setStatusTime(Long StatusTime) {
        this.StatusTime = StatusTime;
    }

    /**
     * Get Logset name 
     * @return LogName Logset name
     */
    public String getLogName() {
        return this.LogName;
    }

    /**
     * Set Logset name
     * @param LogName Logset name
     */
    public void setLogName(String LogName) {
        this.LogName = LogName;
    }

    /**
     * Get Logset ID 
     * @return LogSetId Logset ID
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set Logset ID
     * @param LogSetId Logset ID
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Logset region 
     * @return Region Logset region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Logset region
     * @param Region Logset region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DeliverTypeDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverTypeDetails(DeliverTypeDetails source) {
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.LogType != null) {
            this.LogType = new Long[source.LogType.length];
            for (int i = 0; i < source.LogType.length; i++) {
                this.LogType[i] = new Long(source.LogType[i]);
            }
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Switch != null) {
            this.Switch = new Long(source.Switch);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new String(source.ErrInfo);
        }
        if (source.StatusTime != null) {
            this.StatusTime = new Long(source.StatusTime);
        }
        if (source.LogName != null) {
            this.LogName = new String(source.LogName);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamArraySimple(map, prefix + "LogType.", this.LogType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrInfo", this.ErrInfo);
        this.setParamSimple(map, prefix + "StatusTime", this.StatusTime);
        this.setParamSimple(map, prefix + "LogName", this.LogName);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

