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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamDayPlayInfoListRequest extends AbstractModel {

    /**
    * Date in the format of YYYY-mm-dd
Data is available at 3am Beijing Time the next day. You are recommended to query the latest data after this time point. Data in the last 3 months can be queried.
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * Playback domain name.
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * Page number. Value range: [1,1000]. Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page. Value range: [100,1000]. Default value: 1,000.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Valid values:
Mainland: query data for Mainland China,
Oversea: query data for regions outside Mainland China,
Default: query data for all regions.
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get Date in the format of YYYY-mm-dd
Data is available at 3am Beijing Time the next day. You are recommended to query the latest data after this time point. Data in the last 3 months can be queried. 
     * @return DayTime Date in the format of YYYY-mm-dd
Data is available at 3am Beijing Time the next day. You are recommended to query the latest data after this time point. Data in the last 3 months can be queried.
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * Set Date in the format of YYYY-mm-dd
Data is available at 3am Beijing Time the next day. You are recommended to query the latest data after this time point. Data in the last 3 months can be queried.
     * @param DayTime Date in the format of YYYY-mm-dd
Data is available at 3am Beijing Time the next day. You are recommended to query the latest data after this time point. Data in the last 3 months can be queried.
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * Get Playback domain name. 
     * @return PlayDomain Playback domain name.
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set Playback domain name.
     * @param PlayDomain Playback domain name.
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get Page number. Value range: [1,1000]. Default value: 1. 
     * @return PageNum Page number. Value range: [1,1000]. Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number. Value range: [1,1000]. Default value: 1.
     * @param PageNum Page number. Value range: [1,1000]. Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page. Value range: [100,1000]. Default value: 1,000. 
     * @return PageSize Number of entries per page. Value range: [100,1000]. Default value: 1,000.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Value range: [100,1000]. Default value: 1,000.
     * @param PageSize Number of entries per page. Value range: [100,1000]. Default value: 1,000.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Valid values:
Mainland: query data for Mainland China,
Oversea: query data for regions outside Mainland China,
Default: query data for all regions. 
     * @return MainlandOrOversea Valid values:
Mainland: query data for Mainland China,
Oversea: query data for regions outside Mainland China,
Default: query data for all regions.
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set Valid values:
Mainland: query data for Mainland China,
Oversea: query data for regions outside Mainland China,
Default: query data for all regions.
     * @param MainlandOrOversea Valid values:
Mainland: query data for Mainland China,
Oversea: query data for regions outside Mainland China,
Default: query data for all regions.
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Get Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried. 
     * @return ServiceName Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried.
     * @param ServiceName Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public DescribeStreamDayPlayInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamDayPlayInfoListRequest(DescribeStreamDayPlayInfoListRequest source) {
        if (source.DayTime != null) {
            this.DayTime = new String(source.DayTime);
        }
        if (source.PlayDomain != null) {
            this.PlayDomain = new String(source.PlayDomain);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.MainlandOrOversea != null) {
            this.MainlandOrOversea = new String(source.MainlandOrOversea);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

