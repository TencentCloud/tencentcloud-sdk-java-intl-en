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

public class DescribeBillBandwidthAndFluxListRequest extends AbstractModel{

    /**
    * Start time point in the format of yyyy-mm-dd HH:MM:SS.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * LVB playback domain name. If it is left blank, the full data will be queried.
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * Value range:
Mainland: Query data for Mainland China,
Oversea: Query data for regions outside Mainland China.
Default: Query data for all regions.
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * Data granularity. Supported granularity:
5: 5-minute granularity (the query interval should be within 1 day),
60: 1-hour granularity (the query interval should be within one month),
1440: 1-day granularity (the query interval should be within one month).
Default value: 5.
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get Start time point in the format of yyyy-mm-dd HH:MM:SS. 
     * @return StartTime Start time point in the format of yyyy-mm-dd HH:MM:SS.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time point in the format of yyyy-mm-dd HH:MM:SS.
     * @param StartTime Start time point in the format of yyyy-mm-dd HH:MM:SS.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days. 
     * @return EndTime End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days.
     * @param EndTime End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get LVB playback domain name. If it is left blank, the full data will be queried. 
     * @return PlayDomains LVB playback domain name. If it is left blank, the full data will be queried.
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set LVB playback domain name. If it is left blank, the full data will be queried.
     * @param PlayDomains LVB playback domain name. If it is left blank, the full data will be queried.
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Get Value range:
Mainland: Query data for Mainland China,
Oversea: Query data for regions outside Mainland China.
Default: Query data for all regions. 
     * @return MainlandOrOversea Value range:
Mainland: Query data for Mainland China,
Oversea: Query data for regions outside Mainland China.
Default: Query data for all regions.
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set Value range:
Mainland: Query data for Mainland China,
Oversea: Query data for regions outside Mainland China.
Default: Query data for all regions.
     * @param MainlandOrOversea Value range:
Mainland: Query data for Mainland China,
Oversea: Query data for regions outside Mainland China.
Default: Query data for all regions.
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Get Data granularity. Supported granularity:
5: 5-minute granularity (the query interval should be within 1 day),
60: 1-hour granularity (the query interval should be within one month),
1440: 1-day granularity (the query interval should be within one month).
Default value: 5. 
     * @return Granularity Data granularity. Supported granularity:
5: 5-minute granularity (the query interval should be within 1 day),
60: 1-hour granularity (the query interval should be within one month),
1440: 1-day granularity (the query interval should be within one month).
Default value: 5.
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Data granularity. Supported granularity:
5: 5-minute granularity (the query interval should be within 1 day),
60: 1-hour granularity (the query interval should be within one month),
1440: 1-day granularity (the query interval should be within one month).
Default value: 5.
     * @param Granularity Data granularity. Supported granularity:
5: 5-minute granularity (the query interval should be within 1 day),
60: 1-hour granularity (the query interval should be within one month),
1440: 1-day granularity (the query interval should be within one month).
Default value: 5.
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

