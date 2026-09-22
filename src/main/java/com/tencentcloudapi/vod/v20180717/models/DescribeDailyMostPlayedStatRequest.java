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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDailyMostPlayedStatRequest extends AbstractModel {

    /**
    * Query date, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). This parameter is only valid for the date part.
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Domain name. Query playback stats of the Top 100 media files for that domain name. Query playback stats of all domain names by default.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Statistical metrics for Top data. Valid values:
<li>Traffic: playback traffic. The data of Top 100 is collected by playback traffic.</li>
<li>PlayTimes: number of plays, the data of the Top 100 by playback count.</li>
Default value: Traffic.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Query date, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). This parameter is only valid for the date part. 
     * @return Date Query date, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). This parameter is only valid for the date part.
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Query date, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). This parameter is only valid for the date part.
     * @param Date Query date, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). This parameter is only valid for the date part.
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Domain name. Query playback stats of the Top 100 media files for that domain name. Query playback stats of all domain names by default. 
     * @return DomainName Domain name. Query playback stats of the Top 100 media files for that domain name. Query playback stats of all domain names by default.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name. Query playback stats of the Top 100 media files for that domain name. Query playback stats of all domain names by default.
     * @param DomainName Domain name. Query playback stats of the Top 100 media files for that domain name. Query playback stats of all domain names by default.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Statistical metrics for Top data. Valid values:
<li>Traffic: playback traffic. The data of Top 100 is collected by playback traffic.</li>
<li>PlayTimes: number of plays, the data of the Top 100 by playback count.</li>
Default value: Traffic. 
     * @return Metric Statistical metrics for Top data. Valid values:
<li>Traffic: playback traffic. The data of Top 100 is collected by playback traffic.</li>
<li>PlayTimes: number of plays, the data of the Top 100 by playback count.</li>
Default value: Traffic.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Statistical metrics for Top data. Valid values:
<li>Traffic: playback traffic. The data of Top 100 is collected by playback traffic.</li>
<li>PlayTimes: number of plays, the data of the Top 100 by playback count.</li>
Default value: Traffic.
     * @param Metric Statistical metrics for Top data. Valid values:
<li>Traffic: playback traffic. The data of Top 100 is collected by playback traffic.</li>
<li>PlayTimes: number of plays, the data of the Top 100 by playback count.</li>
Default value: Traffic.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeDailyMostPlayedStatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDailyMostPlayedStatRequest(DescribeDailyMostPlayedStatRequest source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

