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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnLogInfo extends AbstractModel{

    /**
    * Log date in the format of `yyyy-MM-dd`, such as 2018-03-01.
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Log name in the format of date and time-domain name,
such as 2018120101-test.vod2.mqcloud.com.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Log download link, which is valid for 24 hours.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Log start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log end time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Log date in the format of `yyyy-MM-dd`, such as 2018-03-01. 
     * @return Date Log date in the format of `yyyy-MM-dd`, such as 2018-03-01.
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Log date in the format of `yyyy-MM-dd`, such as 2018-03-01.
     * @param Date Log date in the format of `yyyy-MM-dd`, such as 2018-03-01.
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Log name in the format of date and time-domain name,
such as 2018120101-test.vod2.mqcloud.com. 
     * @return Name Log name in the format of date and time-domain name,
such as 2018120101-test.vod2.mqcloud.com.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Log name in the format of date and time-domain name,
such as 2018120101-test.vod2.mqcloud.com.
     * @param Name Log name in the format of date and time-domain name,
such as 2018120101-test.vod2.mqcloud.com.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Log download link, which is valid for 24 hours. 
     * @return Url Log download link, which is valid for 24 hours.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Log download link, which is valid for 24 hours.
     * @param Url Log download link, which is valid for 24 hours.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Log start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=) 
     * @return StartTime Log start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=)
     * @param StartTime Log start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log end time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=) 
     * @return EndTime Log end time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log end time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=)
     * @param EndTime Log end time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public CdnLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdnLogInfo(CdnLogInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

