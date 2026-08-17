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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInstance extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Log status, create: creating; normal: enabled; close: turning off.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Is it possible to switch log query - Value: yes - allowed, no - not allowed. This parameter mainly controls migration of existing logs to the log platform for query usage. Only when the status is yes can you call the log API.</p>
    */
    @SerializedName("EnableQuery")
    @Expose
    private String EnableQuery;

    /**
    * <p>Start time</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>High frequency storage days</p>
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * <p>Infrequent storage days</p>
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * <p>Total storage duration</p>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>High-frequency storage volume (in MB)</p>
    */
    @SerializedName("HighStorage")
    @Expose
    private Float HighStorage;

    /**
    * <p>Infrequent access storage, unit: MB</p>
    */
    @SerializedName("LowStorage")
    @Expose
    private Float LowStorage;

    /**
    * <p>Total storage</p>
    */
    @SerializedName("LogStorage")
    @Expose
    private Float LogStorage;

    /**
    * <p>Whether to enable delivery: ON, OFF</p>
    */
    @SerializedName("Deliver")
    @Expose
    private String Deliver;

    /**
    * <p>Log shipping information</p>
    */
    @SerializedName("DeliverSummary")
    @Expose
    private DeliverSummary [] DeliverSummary;

    /**
    * <p>Instance-related information on the business side varies according to business and returns different information.</p>
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceInfo InstanceInfo;

    /**
    * <p>Audit sub-type.</p>
    */
    @SerializedName("LogSubType")
    @Expose
    private String LogSubType;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Log status, create: creating; normal: enabled; close: turning off.</p> 
     * @return Status <p>Log status, create: creating; normal: enabled; close: turning off.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Log status, create: creating; normal: enabled; close: turning off.</p>
     * @param Status <p>Log status, create: creating; normal: enabled; close: turning off.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Is it possible to switch log query - Value: yes - allowed, no - not allowed. This parameter mainly controls migration of existing logs to the log platform for query usage. Only when the status is yes can you call the log API.</p> 
     * @return EnableQuery <p>Is it possible to switch log query - Value: yes - allowed, no - not allowed. This parameter mainly controls migration of existing logs to the log platform for query usage. Only when the status is yes can you call the log API.</p>
     */
    public String getEnableQuery() {
        return this.EnableQuery;
    }

    /**
     * Set <p>Is it possible to switch log query - Value: yes - allowed, no - not allowed. This parameter mainly controls migration of existing logs to the log platform for query usage. Only when the status is yes can you call the log API.</p>
     * @param EnableQuery <p>Is it possible to switch log query - Value: yes - allowed, no - not allowed. This parameter mainly controls migration of existing logs to the log platform for query usage. Only when the status is yes can you call the log API.</p>
     */
    public void setEnableQuery(String EnableQuery) {
        this.EnableQuery = EnableQuery;
    }

    /**
     * Get <p>Start time</p> 
     * @return CreateAt <p>Start time</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>Start time</p>
     * @param CreateAt <p>Start time</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>High frequency storage days</p> 
     * @return HighLogExpireDay <p>High frequency storage days</p>
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set <p>High frequency storage days</p>
     * @param HighLogExpireDay <p>High frequency storage days</p>
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get <p>Infrequent storage days</p> 
     * @return LowLogExpireDay <p>Infrequent storage days</p>
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set <p>Infrequent storage days</p>
     * @param LowLogExpireDay <p>Infrequent storage days</p>
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get <p>Total storage duration</p> 
     * @return LogExpireDay <p>Total storage duration</p>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>Total storage duration</p>
     * @param LogExpireDay <p>Total storage duration</p>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>High-frequency storage volume (in MB)</p> 
     * @return HighStorage <p>High-frequency storage volume (in MB)</p>
     */
    public Float getHighStorage() {
        return this.HighStorage;
    }

    /**
     * Set <p>High-frequency storage volume (in MB)</p>
     * @param HighStorage <p>High-frequency storage volume (in MB)</p>
     */
    public void setHighStorage(Float HighStorage) {
        this.HighStorage = HighStorage;
    }

    /**
     * Get <p>Infrequent access storage, unit: MB</p> 
     * @return LowStorage <p>Infrequent access storage, unit: MB</p>
     */
    public Float getLowStorage() {
        return this.LowStorage;
    }

    /**
     * Set <p>Infrequent access storage, unit: MB</p>
     * @param LowStorage <p>Infrequent access storage, unit: MB</p>
     */
    public void setLowStorage(Float LowStorage) {
        this.LowStorage = LowStorage;
    }

    /**
     * Get <p>Total storage</p> 
     * @return LogStorage <p>Total storage</p>
     */
    public Float getLogStorage() {
        return this.LogStorage;
    }

    /**
     * Set <p>Total storage</p>
     * @param LogStorage <p>Total storage</p>
     */
    public void setLogStorage(Float LogStorage) {
        this.LogStorage = LogStorage;
    }

    /**
     * Get <p>Whether to enable delivery: ON, OFF</p> 
     * @return Deliver <p>Whether to enable delivery: ON, OFF</p>
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set <p>Whether to enable delivery: ON, OFF</p>
     * @param Deliver <p>Whether to enable delivery: ON, OFF</p>
     */
    public void setDeliver(String Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get <p>Log shipping information</p> 
     * @return DeliverSummary <p>Log shipping information</p>
     */
    public DeliverSummary [] getDeliverSummary() {
        return this.DeliverSummary;
    }

    /**
     * Set <p>Log shipping information</p>
     * @param DeliverSummary <p>Log shipping information</p>
     */
    public void setDeliverSummary(DeliverSummary [] DeliverSummary) {
        this.DeliverSummary = DeliverSummary;
    }

    /**
     * Get <p>Instance-related information on the business side varies according to business and returns different information.</p> 
     * @return InstanceInfo <p>Instance-related information on the business side varies according to business and returns different information.</p>
     */
    public InstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set <p>Instance-related information on the business side varies according to business and returns different information.</p>
     * @param InstanceInfo <p>Instance-related information on the business side varies according to business and returns different information.</p>
     */
    public void setInstanceInfo(InstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get <p>Audit sub-type.</p> 
     * @return LogSubType <p>Audit sub-type.</p>
     */
    public String getLogSubType() {
        return this.LogSubType;
    }

    /**
     * Set <p>Audit sub-type.</p>
     * @param LogSubType <p>Audit sub-type.</p>
     */
    public void setLogSubType(String LogSubType) {
        this.LogSubType = LogSubType;
    }

    public LogInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInstance(LogInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EnableQuery != null) {
            this.EnableQuery = new String(source.EnableQuery);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
        if (source.LowLogExpireDay != null) {
            this.LowLogExpireDay = new Long(source.LowLogExpireDay);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HighStorage != null) {
            this.HighStorage = new Float(source.HighStorage);
        }
        if (source.LowStorage != null) {
            this.LowStorage = new Float(source.LowStorage);
        }
        if (source.LogStorage != null) {
            this.LogStorage = new Float(source.LogStorage);
        }
        if (source.Deliver != null) {
            this.Deliver = new String(source.Deliver);
        }
        if (source.DeliverSummary != null) {
            this.DeliverSummary = new DeliverSummary[source.DeliverSummary.length];
            for (int i = 0; i < source.DeliverSummary.length; i++) {
                this.DeliverSummary[i] = new DeliverSummary(source.DeliverSummary[i]);
            }
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new InstanceInfo(source.InstanceInfo);
        }
        if (source.LogSubType != null) {
            this.LogSubType = new String(source.LogSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableQuery", this.EnableQuery);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamSimple(map, prefix + "LowLogExpireDay", this.LowLogExpireDay);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighStorage", this.HighStorage);
        this.setParamSimple(map, prefix + "LowStorage", this.LowStorage);
        this.setParamSimple(map, prefix + "LogStorage", this.LogStorage);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);
        this.setParamArrayObj(map, prefix + "DeliverSummary.", this.DeliverSummary);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "LogSubType", this.LogSubType);

    }
}

