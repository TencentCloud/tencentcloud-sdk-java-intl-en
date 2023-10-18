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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakNetwork extends AbstractModel {

    /**
    * Recording time.
    */
    @SerializedName("RecordTime")
    @Expose
    private String RecordTime;

    /**
    * Inbound bandwidth data.
    */
    @SerializedName("PeakInNetwork")
    @Expose
    private String PeakInNetwork;

    /**
    * Outbound bandwidth data.
    */
    @SerializedName("PeakOutNetwork")
    @Expose
    private String PeakOutNetwork;

    /**
    * Billable bandwidth in bps
    */
    @SerializedName("ChargeNetwork")
    @Expose
    private String ChargeNetwork;

    /**
     * Get Recording time. 
     * @return RecordTime Recording time.
     */
    public String getRecordTime() {
        return this.RecordTime;
    }

    /**
     * Set Recording time.
     * @param RecordTime Recording time.
     */
    public void setRecordTime(String RecordTime) {
        this.RecordTime = RecordTime;
    }

    /**
     * Get Inbound bandwidth data. 
     * @return PeakInNetwork Inbound bandwidth data.
     */
    public String getPeakInNetwork() {
        return this.PeakInNetwork;
    }

    /**
     * Set Inbound bandwidth data.
     * @param PeakInNetwork Inbound bandwidth data.
     */
    public void setPeakInNetwork(String PeakInNetwork) {
        this.PeakInNetwork = PeakInNetwork;
    }

    /**
     * Get Outbound bandwidth data. 
     * @return PeakOutNetwork Outbound bandwidth data.
     */
    public String getPeakOutNetwork() {
        return this.PeakOutNetwork;
    }

    /**
     * Set Outbound bandwidth data.
     * @param PeakOutNetwork Outbound bandwidth data.
     */
    public void setPeakOutNetwork(String PeakOutNetwork) {
        this.PeakOutNetwork = PeakOutNetwork;
    }

    /**
     * Get Billable bandwidth in bps 
     * @return ChargeNetwork Billable bandwidth in bps
     */
    public String getChargeNetwork() {
        return this.ChargeNetwork;
    }

    /**
     * Set Billable bandwidth in bps
     * @param ChargeNetwork Billable bandwidth in bps
     */
    public void setChargeNetwork(String ChargeNetwork) {
        this.ChargeNetwork = ChargeNetwork;
    }

    public PeakNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakNetwork(PeakNetwork source) {
        if (source.RecordTime != null) {
            this.RecordTime = new String(source.RecordTime);
        }
        if (source.PeakInNetwork != null) {
            this.PeakInNetwork = new String(source.PeakInNetwork);
        }
        if (source.PeakOutNetwork != null) {
            this.PeakOutNetwork = new String(source.PeakOutNetwork);
        }
        if (source.ChargeNetwork != null) {
            this.ChargeNetwork = new String(source.ChargeNetwork);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordTime", this.RecordTime);
        this.setParamSimple(map, prefix + "PeakInNetwork", this.PeakInNetwork);
        this.setParamSimple(map, prefix + "PeakOutNetwork", this.PeakOutNetwork);
        this.setParamSimple(map, prefix + "ChargeNetwork", this.ChargeNetwork);

    }
}

