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

public class StaffBuyInfo extends AbstractModel {

    /**
    * Number of agents purchased
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * Purchased timestamp.
    */
    @SerializedName("BuyTime")
    @Expose
    private Long BuyTime;

    /**
    * End timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Number of office telephones purchased.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SipNum")
    @Expose
    private Long SipNum;

    /**
     * Get Number of agents purchased 
     * @return Num Number of agents purchased
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Number of agents purchased
     * @param Num Number of agents purchased
     */
    public void setNum(Long Num) {
        this.Num = Num;
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
     * Get End timestamp. 
     * @return EndTime End timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp.
     * @param EndTime End timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of office telephones purchased.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SipNum Number of office telephones purchased.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSipNum() {
        return this.SipNum;
    }

    /**
     * Set Number of office telephones purchased.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SipNum Number of office telephones purchased.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSipNum(Long SipNum) {
        this.SipNum = SipNum;
    }

    public StaffBuyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffBuyInfo(StaffBuyInfo source) {
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new Long(source.BuyTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SipNum != null) {
            this.SipNum = new Long(source.SipNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SipNum", this.SipNum);

    }
}

