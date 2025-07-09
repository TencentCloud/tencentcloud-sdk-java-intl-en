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

public class PhoneNumBuyInfo extends AbstractModel {

    /**
    * Telephone number.
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Number type, 0 - landline | 1 - virtual business number | 2 - ISP number | 3 - 400 number.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Call type of the number, 1 - inbound | 2 - outbound | 3 - inbound and outbound.
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * Purchased timestamp.
    */
    @SerializedName("BuyTime")
    @Expose
    private Long BuyTime;

    /**
    * Deadline timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Number status, 1-normal | 2-suspended due to non-payment | 4-admin suspended | 5-suspended due to violation.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get Telephone number. 
     * @return PhoneNum Telephone number.
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Telephone number.
     * @param PhoneNum Telephone number.
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get Number type, 0 - landline | 1 - virtual business number | 2 - ISP number | 3 - 400 number. 
     * @return Type Number type, 0 - landline | 1 - virtual business number | 2 - ISP number | 3 - 400 number.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Number type, 0 - landline | 1 - virtual business number | 2 - ISP number | 3 - 400 number.
     * @param Type Number type, 0 - landline | 1 - virtual business number | 2 - ISP number | 3 - 400 number.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Call type of the number, 1 - inbound | 2 - outbound | 3 - inbound and outbound. 
     * @return CallType Call type of the number, 1 - inbound | 2 - outbound | 3 - inbound and outbound.
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set Call type of the number, 1 - inbound | 2 - outbound | 3 - inbound and outbound.
     * @param CallType Call type of the number, 1 - inbound | 2 - outbound | 3 - inbound and outbound.
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get Purchased timestamp. 
     * @return BuyTime Purchased timestamp.
     */
    public Long getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set Purchased timestamp.
     * @param BuyTime Purchased timestamp.
     */
    public void setBuyTime(Long BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get Deadline timestamp. 
     * @return EndTime Deadline timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Deadline timestamp.
     * @param EndTime Deadline timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number status, 1-normal | 2-suspended due to non-payment | 4-admin suspended | 5-suspended due to violation. 
     * @return State Number status, 1-normal | 2-suspended due to non-payment | 4-admin suspended | 5-suspended due to violation.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Number status, 1-normal | 2-suspended due to non-payment | 4-admin suspended | 5-suspended due to violation.
     * @param State Number status, 1-normal | 2-suspended due to non-payment | 4-admin suspended | 5-suspended due to violation.
     */
    public void setState(Long State) {
        this.State = State;
    }

    public PhoneNumBuyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneNumBuyInfo(PhoneNumBuyInfo source) {
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new Long(source.BuyTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

