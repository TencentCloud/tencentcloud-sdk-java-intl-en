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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAsyncEventsRequest extends AbstractModel{

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Filter (function version)
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Filter (invocation type list)
    */
    @SerializedName("InvokeType")
    @Expose
    private String [] InvokeType;

    /**
    * Filter (event status list)
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Filter (left-closed-right-open range of execution start time)
    */
    @SerializedName("StartTimeInterval")
    @Expose
    private TimeInterval StartTimeInterval;

    /**
    * Filter (left-closed-right-open range of execution end time)
    */
    @SerializedName("EndTimeInterval")
    @Expose
    private TimeInterval EndTimeInterval;

    /**
    * Valid values: ASC, DESC. Default value: DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Valid values: StartTime, EndTime. Default value: StartTime
    */
    @SerializedName("Orderby")
    @Expose
    private String Orderby;

    /**
    * Data offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. Default value: 20. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter (event invocation request ID)
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
     * Get Function name 
     * @return FunctionName Function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name
     * @param FunctionName Function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Filter (function version) 
     * @return Qualifier Filter (function version)
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Filter (function version)
     * @param Qualifier Filter (function version)
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Filter (invocation type list) 
     * @return InvokeType Filter (invocation type list)
     */
    public String [] getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set Filter (invocation type list)
     * @param InvokeType Filter (invocation type list)
     */
    public void setInvokeType(String [] InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get Filter (event status list) 
     * @return Status Filter (event status list)
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Filter (event status list)
     * @param Status Filter (event status list)
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Filter (left-closed-right-open range of execution start time) 
     * @return StartTimeInterval Filter (left-closed-right-open range of execution start time)
     */
    public TimeInterval getStartTimeInterval() {
        return this.StartTimeInterval;
    }

    /**
     * Set Filter (left-closed-right-open range of execution start time)
     * @param StartTimeInterval Filter (left-closed-right-open range of execution start time)
     */
    public void setStartTimeInterval(TimeInterval StartTimeInterval) {
        this.StartTimeInterval = StartTimeInterval;
    }

    /**
     * Get Filter (left-closed-right-open range of execution end time) 
     * @return EndTimeInterval Filter (left-closed-right-open range of execution end time)
     */
    public TimeInterval getEndTimeInterval() {
        return this.EndTimeInterval;
    }

    /**
     * Set Filter (left-closed-right-open range of execution end time)
     * @param EndTimeInterval Filter (left-closed-right-open range of execution end time)
     */
    public void setEndTimeInterval(TimeInterval EndTimeInterval) {
        this.EndTimeInterval = EndTimeInterval;
    }

    /**
     * Get Valid values: ASC, DESC. Default value: DESC 
     * @return Order Valid values: ASC, DESC. Default value: DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Valid values: ASC, DESC. Default value: DESC
     * @param Order Valid values: ASC, DESC. Default value: DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Valid values: StartTime, EndTime. Default value: StartTime 
     * @return Orderby Valid values: StartTime, EndTime. Default value: StartTime
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * Set Valid values: StartTime, EndTime. Default value: StartTime
     * @param Orderby Valid values: StartTime, EndTime. Default value: StartTime
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * Get Data offset. Default value: 0 
     * @return Offset Data offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. Default value: 0
     * @param Offset Data offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. Default value: 20. Maximum value: 100 
     * @return Limit Number of results to be returned. Default value: 20. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: 20. Maximum value: 100
     * @param Limit Number of results to be returned. Default value: 20. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter (event invocation request ID) 
     * @return InvokeRequestId Filter (event invocation request ID)
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set Filter (event invocation request ID)
     * @param InvokeRequestId Filter (event invocation request ID)
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
    }

    public ListAsyncEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAsyncEventsRequest(ListAsyncEventsRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.InvokeType != null) {
            this.InvokeType = new String[source.InvokeType.length];
            for (int i = 0; i < source.InvokeType.length; i++) {
                this.InvokeType[i] = new String(source.InvokeType[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.StartTimeInterval != null) {
            this.StartTimeInterval = new TimeInterval(source.StartTimeInterval);
        }
        if (source.EndTimeInterval != null) {
            this.EndTimeInterval = new TimeInterval(source.EndTimeInterval);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Orderby != null) {
            this.Orderby = new String(source.Orderby);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamArraySimple(map, prefix + "InvokeType.", this.InvokeType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamObj(map, prefix + "StartTimeInterval.", this.StartTimeInterval);
        this.setParamObj(map, prefix + "EndTimeInterval.", this.EndTimeInterval);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);

    }
}

