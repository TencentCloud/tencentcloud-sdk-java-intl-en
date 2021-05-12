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

public class DescribeScreenShotSheetNumListRequest extends AbstractModel{

    /**
    * Start time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`. Data for the last year can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Region information. Valid values: Mainland, Oversea. The former is to query data within Mainland China, while the latter outside Mainland China. If this parameter is left empty, data of all regions will be queried.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Push domain name (data at the domain name level after November 1, 2019 can be queried).
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
    * Data dimension. The data has a delay of one and a half hours. Valid values: 1. Minute (5-minute granularity, which supports a maximum query time range of 31 days); 2. Day (1-day granularity, which is the default value and supports a maximum query time range of 186 days).
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
     * Get Start time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`. 
     * @return StartTime Start time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`.
     * @param StartTime Start time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`. Data for the last year can be queried. 
     * @return EndTime End time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`. Data for the last year can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`. Data for the last year can be queried.
     * @param EndTime End time in UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`. Data for the last year can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Region information. Valid values: Mainland, Oversea. The former is to query data within Mainland China, while the latter outside Mainland China. If this parameter is left empty, data of all regions will be queried. 
     * @return Zone Region information. Valid values: Mainland, Oversea. The former is to query data within Mainland China, while the latter outside Mainland China. If this parameter is left empty, data of all regions will be queried.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region information. Valid values: Mainland, Oversea. The former is to query data within Mainland China, while the latter outside Mainland China. If this parameter is left empty, data of all regions will be queried.
     * @param Zone Region information. Valid values: Mainland, Oversea. The former is to query data within Mainland China, while the latter outside Mainland China. If this parameter is left empty, data of all regions will be queried.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Push domain name (data at the domain name level after November 1, 2019 can be queried). 
     * @return PushDomains Push domain name (data at the domain name level after November 1, 2019 can be queried).
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set Push domain name (data at the domain name level after November 1, 2019 can be queried).
     * @param PushDomains Push domain name (data at the domain name level after November 1, 2019 can be queried).
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    /**
     * Get Data dimension. The data has a delay of one and a half hours. Valid values: 1. Minute (5-minute granularity, which supports a maximum query time range of 31 days); 2. Day (1-day granularity, which is the default value and supports a maximum query time range of 186 days). 
     * @return Granularity Data dimension. The data has a delay of one and a half hours. Valid values: 1. Minute (5-minute granularity, which supports a maximum query time range of 31 days); 2. Day (1-day granularity, which is the default value and supports a maximum query time range of 186 days).
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Data dimension. The data has a delay of one and a half hours. Valid values: 1. Minute (5-minute granularity, which supports a maximum query time range of 31 days); 2. Day (1-day granularity, which is the default value and supports a maximum query time range of 186 days).
     * @param Granularity Data dimension. The data has a delay of one and a half hours. Valid values: 1. Minute (5-minute granularity, which supports a maximum query time range of 31 days); 2. Day (1-day granularity, which is the default value and supports a maximum query time range of 186 days).
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    public DescribeScreenShotSheetNumListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScreenShotSheetNumListRequest(DescribeScreenShotSheetNumListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PushDomains != null) {
            this.PushDomains = new String[source.PushDomains.length];
            for (int i = 0; i < source.PushDomains.length; i++) {
                this.PushDomains[i] = new String(source.PushDomains[i]);
            }
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "PushDomains.", this.PushDomains);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

