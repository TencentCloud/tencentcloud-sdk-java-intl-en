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

public class ExpertServiceOrderInfo extends AbstractModel {

    /**
    * Order ID
    */
    @SerializedName("OrderId")
    @Expose
    private Long OrderId;

    /**
    * Order type. 1: emergency; 2: Ultimate Edition important period guarantee; 3: security manager.
    */
    @SerializedName("InquireType")
    @Expose
    private Long InquireType;

    /**
    * Number of services
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * Service start time
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Service end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Service duration, in months
    */
    @SerializedName("ServiceTime")
    @Expose
    private Long ServiceTime;

    /**
    * Order status. 0: not started; 1: in service; 2: expired; 3: completed; 4: refunded and terminated.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Order ID 
     * @return OrderId Order ID
     */
    public Long getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order ID
     * @param OrderId Order ID
     */
    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Order type. 1: emergency; 2: Ultimate Edition important period guarantee; 3: security manager. 
     * @return InquireType Order type. 1: emergency; 2: Ultimate Edition important period guarantee; 3: security manager.
     */
    public Long getInquireType() {
        return this.InquireType;
    }

    /**
     * Set Order type. 1: emergency; 2: Ultimate Edition important period guarantee; 3: security manager.
     * @param InquireType Order type. 1: emergency; 2: Ultimate Edition important period guarantee; 3: security manager.
     */
    public void setInquireType(Long InquireType) {
        this.InquireType = InquireType;
    }

    /**
     * Get Number of services 
     * @return InquireNum Number of services
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set Number of services
     * @param InquireNum Number of services
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get Service start time 
     * @return BeginTime Service start time
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Service start time
     * @param BeginTime Service start time
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Service end time 
     * @return EndTime Service end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Service end time
     * @param EndTime Service end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Service duration, in months 
     * @return ServiceTime Service duration, in months
     */
    public Long getServiceTime() {
        return this.ServiceTime;
    }

    /**
     * Set Service duration, in months
     * @param ServiceTime Service duration, in months
     */
    public void setServiceTime(Long ServiceTime) {
        this.ServiceTime = ServiceTime;
    }

    /**
     * Get Order status. 0: not started; 1: in service; 2: expired; 3: completed; 4: refunded and terminated. 
     * @return Status Order status. 0: not started; 1: in service; 2: expired; 3: completed; 4: refunded and terminated.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Order status. 0: not started; 1: in service; 2: expired; 3: completed; 4: refunded and terminated.
     * @param Status Order status. 0: not started; 1: in service; 2: expired; 3: completed; 4: refunded and terminated.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ExpertServiceOrderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpertServiceOrderInfo(ExpertServiceOrderInfo source) {
        if (source.OrderId != null) {
            this.OrderId = new Long(source.OrderId);
        }
        if (source.InquireType != null) {
            this.InquireType = new Long(source.InquireType);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ServiceTime != null) {
            this.ServiceTime = new Long(source.ServiceTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "InquireType", this.InquireType);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ServiceTime", this.ServiceTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

