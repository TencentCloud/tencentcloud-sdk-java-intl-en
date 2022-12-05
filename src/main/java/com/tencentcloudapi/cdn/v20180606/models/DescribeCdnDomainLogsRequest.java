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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdnDomainLogsRequest extends AbstractModel{

    /**
    * Specifies a domain name for the query
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Starting time, such as `2019-09-04 00:00:00`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, such as `2019-09-04 12:00:00`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Offset for paginated queries. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Default value: 100. Maximum value: 1,000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies a region for the query.
`mainland`: specifies to return the download link of logs on acceleration within Mainland China;
`overseas`: specifies to return the download link of logs on acceleration outside Mainland China;
`global`: specifies to return a download link of logs on acceleration within Mainland China and a link of logs on acceleration outside Mainland China.
Default value: `mainland`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Specifies the type of logs to download (only access logs supported).
`access`: Access logs.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get Specifies a domain name for the query 
     * @return Domain Specifies a domain name for the query
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Specifies a domain name for the query
     * @param Domain Specifies a domain name for the query
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Starting time, such as `2019-09-04 00:00:00` 
     * @return StartTime Starting time, such as `2019-09-04 00:00:00`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Starting time, such as `2019-09-04 00:00:00`
     * @param StartTime Starting time, such as `2019-09-04 00:00:00`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, such as `2019-09-04 12:00:00` 
     * @return EndTime End time, such as `2019-09-04 12:00:00`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, such as `2019-09-04 12:00:00`
     * @param EndTime End time, such as `2019-09-04 12:00:00`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Offset for paginated queries. Default value: 0 
     * @return Offset Offset for paginated queries. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: 0
     * @param Offset Offset for paginated queries. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. Default value: 100. Maximum value: 1,000 
     * @return Limit Limit on paginated queries. Default value: 100. Maximum value: 1,000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: 100. Maximum value: 1,000
     * @param Limit Limit on paginated queries. Default value: 100. Maximum value: 1,000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies a region for the query.
`mainland`: specifies to return the download link of logs on acceleration within Mainland China;
`overseas`: specifies to return the download link of logs on acceleration outside Mainland China;
`global`: specifies to return a download link of logs on acceleration within Mainland China and a link of logs on acceleration outside Mainland China.
Default value: `mainland`. 
     * @return Area Specifies a region for the query.
`mainland`: specifies to return the download link of logs on acceleration within Mainland China;
`overseas`: specifies to return the download link of logs on acceleration outside Mainland China;
`global`: specifies to return a download link of logs on acceleration within Mainland China and a link of logs on acceleration outside Mainland China.
Default value: `mainland`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies a region for the query.
`mainland`: specifies to return the download link of logs on acceleration within Mainland China;
`overseas`: specifies to return the download link of logs on acceleration outside Mainland China;
`global`: specifies to return a download link of logs on acceleration within Mainland China and a link of logs on acceleration outside Mainland China.
Default value: `mainland`.
     * @param Area Specifies a region for the query.
`mainland`: specifies to return the download link of logs on acceleration within Mainland China;
`overseas`: specifies to return the download link of logs on acceleration outside Mainland China;
`global`: specifies to return a download link of logs on acceleration within Mainland China and a link of logs on acceleration outside Mainland China.
Default value: `mainland`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Specifies the type of logs to download (only access logs supported).
`access`: Access logs. 
     * @return LogType Specifies the type of logs to download (only access logs supported).
`access`: Access logs.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Specifies the type of logs to download (only access logs supported).
`access`: Access logs.
     * @param LogType Specifies the type of logs to download (only access logs supported).
`access`: Access logs.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public DescribeCdnDomainLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdnDomainLogsRequest(DescribeCdnDomainLogsRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

