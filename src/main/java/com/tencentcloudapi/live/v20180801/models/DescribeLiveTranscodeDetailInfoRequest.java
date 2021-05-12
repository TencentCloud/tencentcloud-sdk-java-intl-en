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

public class DescribeLiveTranscodeDetailInfoRequest extends AbstractModel{

    /**
    * Push domain name.
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Start time (Beijing time).
In the format of `yyyymmdd`.
Note: details for a specified day in the last month can be queried.
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * Number of pages. Default value: 1.
Up to 100 pages.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page. Default value: 20,
Value range: [10,1000].
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Start day time (Beijing time),
In the format of `yyyymmdd`.
Note: details for the last month can be queried.
    */
    @SerializedName("StartDayTime")
    @Expose
    private String StartDayTime;

    /**
    * End day time (Beijing time),
In the format of `yyyymmdd`.
Note: detailed data for the last month can be queried. Either `DayTime` or `(StartDayTime,EndDayTime)` must be passed in. If both are passed in, `DayTime` shall prevail.
    */
    @SerializedName("EndDayTime")
    @Expose
    private String EndDayTime;

    /**
     * Get Push domain name. 
     * @return PushDomain Push domain name.
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set Push domain name.
     * @param PushDomain Push domain name.
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Start time (Beijing time).
In the format of `yyyymmdd`.
Note: details for a specified day in the last month can be queried. 
     * @return DayTime Start time (Beijing time).
In the format of `yyyymmdd`.
Note: details for a specified day in the last month can be queried.
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * Set Start time (Beijing time).
In the format of `yyyymmdd`.
Note: details for a specified day in the last month can be queried.
     * @param DayTime Start time (Beijing time).
In the format of `yyyymmdd`.
Note: details for a specified day in the last month can be queried.
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * Get Number of pages. Default value: 1.
Up to 100 pages. 
     * @return PageNum Number of pages. Default value: 1.
Up to 100 pages.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Number of pages. Default value: 1.
Up to 100 pages.
     * @param PageNum Number of pages. Default value: 1.
Up to 100 pages.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page. Default value: 20,
Value range: [10,1000]. 
     * @return PageSize Number of entries per page. Default value: 20,
Value range: [10,1000].
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Default value: 20,
Value range: [10,1000].
     * @param PageSize Number of entries per page. Default value: 20,
Value range: [10,1000].
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Start day time (Beijing time),
In the format of `yyyymmdd`.
Note: details for the last month can be queried. 
     * @return StartDayTime Start day time (Beijing time),
In the format of `yyyymmdd`.
Note: details for the last month can be queried.
     */
    public String getStartDayTime() {
        return this.StartDayTime;
    }

    /**
     * Set Start day time (Beijing time),
In the format of `yyyymmdd`.
Note: details for the last month can be queried.
     * @param StartDayTime Start day time (Beijing time),
In the format of `yyyymmdd`.
Note: details for the last month can be queried.
     */
    public void setStartDayTime(String StartDayTime) {
        this.StartDayTime = StartDayTime;
    }

    /**
     * Get End day time (Beijing time),
In the format of `yyyymmdd`.
Note: detailed data for the last month can be queried. Either `DayTime` or `(StartDayTime,EndDayTime)` must be passed in. If both are passed in, `DayTime` shall prevail. 
     * @return EndDayTime End day time (Beijing time),
In the format of `yyyymmdd`.
Note: detailed data for the last month can be queried. Either `DayTime` or `(StartDayTime,EndDayTime)` must be passed in. If both are passed in, `DayTime` shall prevail.
     */
    public String getEndDayTime() {
        return this.EndDayTime;
    }

    /**
     * Set End day time (Beijing time),
In the format of `yyyymmdd`.
Note: detailed data for the last month can be queried. Either `DayTime` or `(StartDayTime,EndDayTime)` must be passed in. If both are passed in, `DayTime` shall prevail.
     * @param EndDayTime End day time (Beijing time),
In the format of `yyyymmdd`.
Note: detailed data for the last month can be queried. Either `DayTime` or `(StartDayTime,EndDayTime)` must be passed in. If both are passed in, `DayTime` shall prevail.
     */
    public void setEndDayTime(String EndDayTime) {
        this.EndDayTime = EndDayTime;
    }

    public DescribeLiveTranscodeDetailInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeDetailInfoRequest(DescribeLiveTranscodeDetailInfoRequest source) {
        if (source.PushDomain != null) {
            this.PushDomain = new String(source.PushDomain);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.DayTime != null) {
            this.DayTime = new String(source.DayTime);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StartDayTime != null) {
            this.StartDayTime = new String(source.StartDayTime);
        }
        if (source.EndDayTime != null) {
            this.EndDayTime = new String(source.EndDayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StartDayTime", this.StartDayTime);
        this.setParamSimple(map, prefix + "EndDayTime", this.EndDayTime);

    }
}

