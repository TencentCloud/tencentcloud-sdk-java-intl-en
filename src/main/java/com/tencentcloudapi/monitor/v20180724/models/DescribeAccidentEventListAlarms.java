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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccidentEventListAlarms extends AbstractModel{

    /**
    * Event type.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("BusinessTypeDesc")
    @Expose
    private String BusinessTypeDesc;

    /**
    * Event type.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AccidentTypeDesc")
    @Expose
    private String AccidentTypeDesc;

    /**
    * ID of the event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("BusinessID")
    @Expose
    private Long BusinessID;

    /**
    * Event status ID. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EventStatus")
    @Expose
    private Long EventStatus;

    /**
    * Affected object.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AffectResource")
    @Expose
    private String AffectResource;

    /**
    * Region where the event occurs.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Time when the event occurs.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("OccurTime")
    @Expose
    private String OccurTime;

    /**
    * Update time.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Event type.
Note: This field may return null, indicating that no valid value was found. 
     * @return BusinessTypeDesc Event type.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getBusinessTypeDesc() {
        return this.BusinessTypeDesc;
    }

    /**
     * Set Event type.
Note: This field may return null, indicating that no valid value was found.
     * @param BusinessTypeDesc Event type.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setBusinessTypeDesc(String BusinessTypeDesc) {
        this.BusinessTypeDesc = BusinessTypeDesc;
    }

    /**
     * Get Event type.
Note: This field may return null, indicating that no valid value was found. 
     * @return AccidentTypeDesc Event type.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAccidentTypeDesc() {
        return this.AccidentTypeDesc;
    }

    /**
     * Set Event type.
Note: This field may return null, indicating that no valid value was found.
     * @param AccidentTypeDesc Event type.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAccidentTypeDesc(String AccidentTypeDesc) {
        this.AccidentTypeDesc = AccidentTypeDesc;
    }

    /**
     * Get ID of the event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
Note: This field may return null, indicating that no valid value was found. 
     * @return BusinessID ID of the event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getBusinessID() {
        return this.BusinessID;
    }

    /**
     * Set ID of the event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
Note: This field may return null, indicating that no valid value was found.
     * @param BusinessID ID of the event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setBusinessID(Long BusinessID) {
        this.BusinessID = BusinessID;
    }

    /**
     * Get Event status ID. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
Note: This field may return null, indicating that no valid value was found. 
     * @return EventStatus Event status ID. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set Event status ID. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
Note: This field may return null, indicating that no valid value was found.
     * @param EventStatus Event status ID. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEventStatus(Long EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get Affected object.
Note: This field may return null, indicating that no valid value was found. 
     * @return AffectResource Affected object.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAffectResource() {
        return this.AffectResource;
    }

    /**
     * Set Affected object.
Note: This field may return null, indicating that no valid value was found.
     * @param AffectResource Affected object.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAffectResource(String AffectResource) {
        this.AffectResource = AffectResource;
    }

    /**
     * Get Region where the event occurs.
Note: This field may return null, indicating that no valid value was found. 
     * @return Region Region where the event occurs.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region where the event occurs.
Note: This field may return null, indicating that no valid value was found.
     * @param Region Region where the event occurs.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Time when the event occurs.
Note: This field may return null, indicating that no valid value was found. 
     * @return OccurTime Time when the event occurs.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getOccurTime() {
        return this.OccurTime;
    }

    /**
     * Set Time when the event occurs.
Note: This field may return null, indicating that no valid value was found.
     * @param OccurTime Time when the event occurs.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setOccurTime(String OccurTime) {
        this.OccurTime = OccurTime;
    }

    /**
     * Get Update time.
Note: This field may return null, indicating that no valid value was found. 
     * @return UpdateTime Update time.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
Note: This field may return null, indicating that no valid value was found.
     * @param UpdateTime Update time.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DescribeAccidentEventListAlarms() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccidentEventListAlarms(DescribeAccidentEventListAlarms source) {
        if (source.BusinessTypeDesc != null) {
            this.BusinessTypeDesc = new String(source.BusinessTypeDesc);
        }
        if (source.AccidentTypeDesc != null) {
            this.AccidentTypeDesc = new String(source.AccidentTypeDesc);
        }
        if (source.BusinessID != null) {
            this.BusinessID = new Long(source.BusinessID);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long(source.EventStatus);
        }
        if (source.AffectResource != null) {
            this.AffectResource = new String(source.AffectResource);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.OccurTime != null) {
            this.OccurTime = new String(source.OccurTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessTypeDesc", this.BusinessTypeDesc);
        this.setParamSimple(map, prefix + "AccidentTypeDesc", this.AccidentTypeDesc);
        this.setParamSimple(map, prefix + "BusinessID", this.BusinessID);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "AffectResource", this.AffectResource);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "OccurTime", this.OccurTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

