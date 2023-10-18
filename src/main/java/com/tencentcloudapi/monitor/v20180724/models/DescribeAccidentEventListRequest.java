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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccidentEventListRequest extends AbstractModel {

    /**
    * API component name. The value for the current API is monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Start time, which is the timestamp one day prior by default.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time, which is the current timestamp by default.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Parameter offset on each page. The value starts from 0 and the default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting rule by UpdateTime. Valid values: asc and desc.
    */
    @SerializedName("UpdateTimeOrder")
    @Expose
    private String UpdateTimeOrder;

    /**
    * Sorting rule by OccurTime. Valid values: asc or desc. Sorting by UpdateTimeOrder takes priority.
    */
    @SerializedName("OccurTimeOrder")
    @Expose
    private String OccurTimeOrder;

    /**
    * Filter by event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
    */
    @SerializedName("AccidentType")
    @Expose
    private Long [] AccidentType;

    /**
    * Filter by event. The value 1 indicates CVM storage issues. The value 2 indicates CVM network connection issues. The value 3 indicates that the CVM has an exception. The value 202 indicates that an ISP network jitter occurs.
    */
    @SerializedName("AccidentEvent")
    @Expose
    private Long [] AccidentEvent;

    /**
    * Filter by event status. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
    */
    @SerializedName("AccidentStatus")
    @Expose
    private Long [] AccidentStatus;

    /**
    * Filter by region where the event occurs. The value gz indicates Guangzhou. The value sh indicates Shanghai.
    */
    @SerializedName("AccidentRegion")
    @Expose
    private String [] AccidentRegion;

    /**
    * Filter by affected resource, such as ins-19a06bka.
    */
    @SerializedName("AffectResource")
    @Expose
    private String AffectResource;

    /**
     * Get API component name. The value for the current API is monitor. 
     * @return Module API component name. The value for the current API is monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set API component name. The value for the current API is monitor.
     * @param Module API component name. The value for the current API is monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Start time, which is the timestamp one day prior by default. 
     * @return StartTime Start time, which is the timestamp one day prior by default.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, which is the timestamp one day prior by default.
     * @param StartTime Start time, which is the timestamp one day prior by default.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, which is the current timestamp by default. 
     * @return EndTime End time, which is the current timestamp by default.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, which is the current timestamp by default.
     * @param EndTime End time, which is the current timestamp by default.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20. 
     * @return Limit Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     * @param Limit Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Parameter offset on each page. The value starts from 0 and the default value is 0. 
     * @return Offset Parameter offset on each page. The value starts from 0 and the default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Parameter offset on each page. The value starts from 0 and the default value is 0.
     * @param Offset Parameter offset on each page. The value starts from 0 and the default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting rule by UpdateTime. Valid values: asc and desc. 
     * @return UpdateTimeOrder Sorting rule by UpdateTime. Valid values: asc and desc.
     */
    public String getUpdateTimeOrder() {
        return this.UpdateTimeOrder;
    }

    /**
     * Set Sorting rule by UpdateTime. Valid values: asc and desc.
     * @param UpdateTimeOrder Sorting rule by UpdateTime. Valid values: asc and desc.
     */
    public void setUpdateTimeOrder(String UpdateTimeOrder) {
        this.UpdateTimeOrder = UpdateTimeOrder;
    }

    /**
     * Get Sorting rule by OccurTime. Valid values: asc or desc. Sorting by UpdateTimeOrder takes priority. 
     * @return OccurTimeOrder Sorting rule by OccurTime. Valid values: asc or desc. Sorting by UpdateTimeOrder takes priority.
     */
    public String getOccurTimeOrder() {
        return this.OccurTimeOrder;
    }

    /**
     * Set Sorting rule by OccurTime. Valid values: asc or desc. Sorting by UpdateTimeOrder takes priority.
     * @param OccurTimeOrder Sorting rule by OccurTime. Valid values: asc or desc. Sorting by UpdateTimeOrder takes priority.
     */
    public void setOccurTimeOrder(String OccurTimeOrder) {
        this.OccurTimeOrder = OccurTimeOrder;
    }

    /**
     * Get Filter by event type. The value 1 indicates service issues. The value 2 indicates other subscriptions. 
     * @return AccidentType Filter by event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
     */
    public Long [] getAccidentType() {
        return this.AccidentType;
    }

    /**
     * Set Filter by event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
     * @param AccidentType Filter by event type. The value 1 indicates service issues. The value 2 indicates other subscriptions.
     */
    public void setAccidentType(Long [] AccidentType) {
        this.AccidentType = AccidentType;
    }

    /**
     * Get Filter by event. The value 1 indicates CVM storage issues. The value 2 indicates CVM network connection issues. The value 3 indicates that the CVM has an exception. The value 202 indicates that an ISP network jitter occurs. 
     * @return AccidentEvent Filter by event. The value 1 indicates CVM storage issues. The value 2 indicates CVM network connection issues. The value 3 indicates that the CVM has an exception. The value 202 indicates that an ISP network jitter occurs.
     */
    public Long [] getAccidentEvent() {
        return this.AccidentEvent;
    }

    /**
     * Set Filter by event. The value 1 indicates CVM storage issues. The value 2 indicates CVM network connection issues. The value 3 indicates that the CVM has an exception. The value 202 indicates that an ISP network jitter occurs.
     * @param AccidentEvent Filter by event. The value 1 indicates CVM storage issues. The value 2 indicates CVM network connection issues. The value 3 indicates that the CVM has an exception. The value 202 indicates that an ISP network jitter occurs.
     */
    public void setAccidentEvent(Long [] AccidentEvent) {
        this.AccidentEvent = AccidentEvent;
    }

    /**
     * Get Filter by event status. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered. 
     * @return AccidentStatus Filter by event status. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
     */
    public Long [] getAccidentStatus() {
        return this.AccidentStatus;
    }

    /**
     * Set Filter by event status. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
     * @param AccidentStatus Filter by event status. The value 0 indicates that the event has been recovered. The value 1 indicates that the event has not been recovered.
     */
    public void setAccidentStatus(Long [] AccidentStatus) {
        this.AccidentStatus = AccidentStatus;
    }

    /**
     * Get Filter by region where the event occurs. The value gz indicates Guangzhou. The value sh indicates Shanghai. 
     * @return AccidentRegion Filter by region where the event occurs. The value gz indicates Guangzhou. The value sh indicates Shanghai.
     */
    public String [] getAccidentRegion() {
        return this.AccidentRegion;
    }

    /**
     * Set Filter by region where the event occurs. The value gz indicates Guangzhou. The value sh indicates Shanghai.
     * @param AccidentRegion Filter by region where the event occurs. The value gz indicates Guangzhou. The value sh indicates Shanghai.
     */
    public void setAccidentRegion(String [] AccidentRegion) {
        this.AccidentRegion = AccidentRegion;
    }

    /**
     * Get Filter by affected resource, such as ins-19a06bka. 
     * @return AffectResource Filter by affected resource, such as ins-19a06bka.
     */
    public String getAffectResource() {
        return this.AffectResource;
    }

    /**
     * Set Filter by affected resource, such as ins-19a06bka.
     * @param AffectResource Filter by affected resource, such as ins-19a06bka.
     */
    public void setAffectResource(String AffectResource) {
        this.AffectResource = AffectResource;
    }

    public DescribeAccidentEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccidentEventListRequest(DescribeAccidentEventListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.UpdateTimeOrder != null) {
            this.UpdateTimeOrder = new String(source.UpdateTimeOrder);
        }
        if (source.OccurTimeOrder != null) {
            this.OccurTimeOrder = new String(source.OccurTimeOrder);
        }
        if (source.AccidentType != null) {
            this.AccidentType = new Long[source.AccidentType.length];
            for (int i = 0; i < source.AccidentType.length; i++) {
                this.AccidentType[i] = new Long(source.AccidentType[i]);
            }
        }
        if (source.AccidentEvent != null) {
            this.AccidentEvent = new Long[source.AccidentEvent.length];
            for (int i = 0; i < source.AccidentEvent.length; i++) {
                this.AccidentEvent[i] = new Long(source.AccidentEvent[i]);
            }
        }
        if (source.AccidentStatus != null) {
            this.AccidentStatus = new Long[source.AccidentStatus.length];
            for (int i = 0; i < source.AccidentStatus.length; i++) {
                this.AccidentStatus[i] = new Long(source.AccidentStatus[i]);
            }
        }
        if (source.AccidentRegion != null) {
            this.AccidentRegion = new String[source.AccidentRegion.length];
            for (int i = 0; i < source.AccidentRegion.length; i++) {
                this.AccidentRegion[i] = new String(source.AccidentRegion[i]);
            }
        }
        if (source.AffectResource != null) {
            this.AffectResource = new String(source.AffectResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "UpdateTimeOrder", this.UpdateTimeOrder);
        this.setParamSimple(map, prefix + "OccurTimeOrder", this.OccurTimeOrder);
        this.setParamArraySimple(map, prefix + "AccidentType.", this.AccidentType);
        this.setParamArraySimple(map, prefix + "AccidentEvent.", this.AccidentEvent);
        this.setParamArraySimple(map, prefix + "AccidentStatus.", this.AccidentStatus);
        this.setParamArraySimple(map, prefix + "AccidentRegion.", this.AccidentRegion);
        this.setParamSimple(map, prefix + "AffectResource", this.AffectResource);

    }
}

