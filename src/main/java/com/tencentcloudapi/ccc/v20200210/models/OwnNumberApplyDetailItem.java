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

public class OwnNumberApplyDetailItem extends AbstractModel {

    /**
    * Number type: 0 - inbound | 1 - outbound | 2 - inbound and outbound.
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * Line number.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Maximum concurrent call number.
    */
    @SerializedName("MaxCallCount")
    @Expose
    private Long MaxCallCount;

    /**
    * Maximum number of concurrencies per second.
    */
    @SerializedName("MaxCallPSec")
    @Expose
    private Long MaxCallPSec;

    /**
    * Outbound called number format, use {+e.164} or {e.164}. 
    */
    @SerializedName("OutboundCalleeFormat")
    @Expose
    private String OutboundCalleeFormat;

    /**
     * Get Number type: 0 - inbound | 1 - outbound | 2 - inbound and outbound. 
     * @return CallType Number type: 0 - inbound | 1 - outbound | 2 - inbound and outbound.
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set Number type: 0 - inbound | 1 - outbound | 2 - inbound and outbound.
     * @param CallType Number type: 0 - inbound | 1 - outbound | 2 - inbound and outbound.
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get Line number. 
     * @return PhoneNumber Line number.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Line number.
     * @param PhoneNumber Line number.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Maximum concurrent call number. 
     * @return MaxCallCount Maximum concurrent call number.
     */
    public Long getMaxCallCount() {
        return this.MaxCallCount;
    }

    /**
     * Set Maximum concurrent call number.
     * @param MaxCallCount Maximum concurrent call number.
     */
    public void setMaxCallCount(Long MaxCallCount) {
        this.MaxCallCount = MaxCallCount;
    }

    /**
     * Get Maximum number of concurrencies per second. 
     * @return MaxCallPSec Maximum number of concurrencies per second.
     */
    public Long getMaxCallPSec() {
        return this.MaxCallPSec;
    }

    /**
     * Set Maximum number of concurrencies per second.
     * @param MaxCallPSec Maximum number of concurrencies per second.
     */
    public void setMaxCallPSec(Long MaxCallPSec) {
        this.MaxCallPSec = MaxCallPSec;
    }

    /**
     * Get Outbound called number format, use {+e.164} or {e.164}.  
     * @return OutboundCalleeFormat Outbound called number format, use {+e.164} or {e.164}. 
     */
    public String getOutboundCalleeFormat() {
        return this.OutboundCalleeFormat;
    }

    /**
     * Set Outbound called number format, use {+e.164} or {e.164}. 
     * @param OutboundCalleeFormat Outbound called number format, use {+e.164} or {e.164}. 
     */
    public void setOutboundCalleeFormat(String OutboundCalleeFormat) {
        this.OutboundCalleeFormat = OutboundCalleeFormat;
    }

    public OwnNumberApplyDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnNumberApplyDetailItem(OwnNumberApplyDetailItem source) {
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.MaxCallCount != null) {
            this.MaxCallCount = new Long(source.MaxCallCount);
        }
        if (source.MaxCallPSec != null) {
            this.MaxCallPSec = new Long(source.MaxCallPSec);
        }
        if (source.OutboundCalleeFormat != null) {
            this.OutboundCalleeFormat = new String(source.OutboundCalleeFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "MaxCallCount", this.MaxCallCount);
        this.setParamSimple(map, prefix + "MaxCallPSec", this.MaxCallPSec);
        this.setParamSimple(map, prefix + "OutboundCalleeFormat", this.OutboundCalleeFormat);

    }
}

