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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrentRecordStreamNumRequest extends AbstractModel{

    /**
    * Live streaming type. SlowLive: LCB.
NormalLive: LVB.
    */
    @SerializedName("LiveType")
    @Expose
    private String LiveType;

    /**
    * Start time in the format of `yyyy-mm-dd HH:MM:SS`.
Data for the last 180 days can be queried.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format of `yyyy-mm-dd HH:MM:SS`.
The maximum time span supported is 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China). If this parameter is left empty, data for all regions will be queried.
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * Playback domain name list. If this parameter is left empty, full data will be queried.
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
     * Get Live streaming type. SlowLive: LCB.
NormalLive: LVB. 
     * @return LiveType Live streaming type. SlowLive: LCB.
NormalLive: LVB.
     */
    public String getLiveType() {
        return this.LiveType;
    }

    /**
     * Set Live streaming type. SlowLive: LCB.
NormalLive: LVB.
     * @param LiveType Live streaming type. SlowLive: LCB.
NormalLive: LVB.
     */
    public void setLiveType(String LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get Start time in the format of `yyyy-mm-dd HH:MM:SS`.
Data for the last 180 days can be queried. 
     * @return StartTime Start time in the format of `yyyy-mm-dd HH:MM:SS`.
Data for the last 180 days can be queried.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of `yyyy-mm-dd HH:MM:SS`.
Data for the last 180 days can be queried.
     * @param StartTime Start time in the format of `yyyy-mm-dd HH:MM:SS`.
Data for the last 180 days can be queried.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of `yyyy-mm-dd HH:MM:SS`.
The maximum time span supported is 31 days. 
     * @return EndTime End time in the format of `yyyy-mm-dd HH:MM:SS`.
The maximum time span supported is 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of `yyyy-mm-dd HH:MM:SS`.
The maximum time span supported is 31 days.
     * @param EndTime End time in the format of `yyyy-mm-dd HH:MM:SS`.
The maximum time span supported is 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China). If this parameter is left empty, data for all regions will be queried. 
     * @return MainlandOrOversea Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China). If this parameter is left empty, data for all regions will be queried.
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China). If this parameter is left empty, data for all regions will be queried.
     * @param MainlandOrOversea Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China). If this parameter is left empty, data for all regions will be queried.
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Get Playback domain name list. If this parameter is left empty, full data will be queried. 
     * @return PushDomains Playback domain name list. If this parameter is left empty, full data will be queried.
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set Playback domain name list. If this parameter is left empty, full data will be queried.
     * @param PushDomains Playback domain name list. If this parameter is left empty, full data will be queried.
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveType", this.LiveType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamArraySimple(map, prefix + "PushDomains.", this.PushDomains);

    }
}

