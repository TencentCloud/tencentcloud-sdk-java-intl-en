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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAccessKeyAlarmStatusRequest extends AbstractModel {

    /**
    * Status  0: unprocessed 1: fixed 2: ignored.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Alarm ID list.
    */
    @SerializedName("AlarmIDList")
    @Expose
    private Long [] AlarmIDList;

    /**
    * Risk ID list.
    */
    @SerializedName("RiskIDList")
    @Expose
    private Long [] RiskIDList;

    /**
     * Get Status  0: unprocessed 1: fixed 2: ignored. 
     * @return Status Status  0: unprocessed 1: fixed 2: ignored.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status  0: unprocessed 1: fixed 2: ignored.
     * @param Status Status  0: unprocessed 1: fixed 2: ignored.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Alarm ID list. 
     * @return AlarmIDList Alarm ID list.
     */
    public Long [] getAlarmIDList() {
        return this.AlarmIDList;
    }

    /**
     * Set Alarm ID list.
     * @param AlarmIDList Alarm ID list.
     */
    public void setAlarmIDList(Long [] AlarmIDList) {
        this.AlarmIDList = AlarmIDList;
    }

    /**
     * Get Risk ID list. 
     * @return RiskIDList Risk ID list.
     */
    public Long [] getRiskIDList() {
        return this.RiskIDList;
    }

    /**
     * Set Risk ID list.
     * @param RiskIDList Risk ID list.
     */
    public void setRiskIDList(Long [] RiskIDList) {
        this.RiskIDList = RiskIDList;
    }

    public UpdateAccessKeyAlarmStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAccessKeyAlarmStatusRequest(UpdateAccessKeyAlarmStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AlarmIDList != null) {
            this.AlarmIDList = new Long[source.AlarmIDList.length];
            for (int i = 0; i < source.AlarmIDList.length; i++) {
                this.AlarmIDList[i] = new Long(source.AlarmIDList[i]);
            }
        }
        if (source.RiskIDList != null) {
            this.RiskIDList = new Long[source.RiskIDList.length];
            for (int i = 0; i < source.RiskIDList.length; i++) {
                this.RiskIDList[i] = new Long(source.RiskIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "AlarmIDList.", this.AlarmIDList);
        this.setParamArraySimple(map, prefix + "RiskIDList.", this.RiskIDList);

    }
}

