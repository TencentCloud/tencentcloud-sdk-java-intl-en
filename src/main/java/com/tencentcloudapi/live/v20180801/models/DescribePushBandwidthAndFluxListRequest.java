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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePushBandwidthAndFluxListRequest extends AbstractModel {

    /**
    * Query start time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Domain name, you can fill in multiple. If left blank, it represents the overall data.
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
    * Optional values: Mainland: Query data for Mainland China (domestic). Oversea: Query data for international/regions such as Hong Kong, Macao, Taiwan (overseas). If left blank, it defaults to querying global data (domestic + overseas).
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * Data granularity, supports the following granularities: 5: 5-minute granularity (span cannot exceed 1 day), 60: 1-hour granularity (span cannot exceed 1 month), 1440: daily granularity (span cannot exceed 1 month). Default value: 5.
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * Region, mapping table as follows: China Mainland: Mainland China, Asia Pacific I: Asia Pacific Region 1, Asia Pacific II: Asia Pacific Region 2, Asia Pacific III: Asia Pacific Region 3, Europe: Europe, North America: North America, South America: South America, Middle East: Middle East, Africa: Africa.
    */
    @SerializedName("RegionNames")
    @Expose
    private String [] RegionNames;

    /**
    * Country, the mapping table is referenced as follows in the document: https://cloud.tencent.com/document/product/267/34019.
    */
    @SerializedName("CountryNames")
    @Expose
    private String [] CountryNames;

    /**
     * Get Query start time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days. 
     * @return StartTime Query start time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days.
     * @param StartTime Query start time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days. 
     * @return EndTime Query end time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days.
     * @param EndTime Query end time point, accurate to minute granularity. The interface query supports two time formats:

YYYY-MM-DDThh:mm:ssZ: UTC time format, refer to ISO date format descriptionfor details.

YYYY-MM-DD hh:mm:ss: When using this format, it represents Beijing time by default.

Queries for the most recent two months are supported. The span between query start and end time cannot exceed 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Domain name, you can fill in multiple. If left blank, it represents the overall data. 
     * @return PushDomains Domain name, you can fill in multiple. If left blank, it represents the overall data.
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set Domain name, you can fill in multiple. If left blank, it represents the overall data.
     * @param PushDomains Domain name, you can fill in multiple. If left blank, it represents the overall data.
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    /**
     * Get Optional values: Mainland: Query data for Mainland China (domestic). Oversea: Query data for international/regions such as Hong Kong, Macao, Taiwan (overseas). If left blank, it defaults to querying global data (domestic + overseas). 
     * @return MainlandOrOversea Optional values: Mainland: Query data for Mainland China (domestic). Oversea: Query data for international/regions such as Hong Kong, Macao, Taiwan (overseas). If left blank, it defaults to querying global data (domestic + overseas).
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set Optional values: Mainland: Query data for Mainland China (domestic). Oversea: Query data for international/regions such as Hong Kong, Macao, Taiwan (overseas). If left blank, it defaults to querying global data (domestic + overseas).
     * @param MainlandOrOversea Optional values: Mainland: Query data for Mainland China (domestic). Oversea: Query data for international/regions such as Hong Kong, Macao, Taiwan (overseas). If left blank, it defaults to querying global data (domestic + overseas).
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Get Data granularity, supports the following granularities: 5: 5-minute granularity (span cannot exceed 1 day), 60: 1-hour granularity (span cannot exceed 1 month), 1440: daily granularity (span cannot exceed 1 month). Default value: 5. 
     * @return Granularity Data granularity, supports the following granularities: 5: 5-minute granularity (span cannot exceed 1 day), 60: 1-hour granularity (span cannot exceed 1 month), 1440: daily granularity (span cannot exceed 1 month). Default value: 5.
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Data granularity, supports the following granularities: 5: 5-minute granularity (span cannot exceed 1 day), 60: 1-hour granularity (span cannot exceed 1 month), 1440: daily granularity (span cannot exceed 1 month). Default value: 5.
     * @param Granularity Data granularity, supports the following granularities: 5: 5-minute granularity (span cannot exceed 1 day), 60: 1-hour granularity (span cannot exceed 1 month), 1440: daily granularity (span cannot exceed 1 month). Default value: 5.
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get Region, mapping table as follows: China Mainland: Mainland China, Asia Pacific I: Asia Pacific Region 1, Asia Pacific II: Asia Pacific Region 2, Asia Pacific III: Asia Pacific Region 3, Europe: Europe, North America: North America, South America: South America, Middle East: Middle East, Africa: Africa. 
     * @return RegionNames Region, mapping table as follows: China Mainland: Mainland China, Asia Pacific I: Asia Pacific Region 1, Asia Pacific II: Asia Pacific Region 2, Asia Pacific III: Asia Pacific Region 3, Europe: Europe, North America: North America, South America: South America, Middle East: Middle East, Africa: Africa.
     */
    public String [] getRegionNames() {
        return this.RegionNames;
    }

    /**
     * Set Region, mapping table as follows: China Mainland: Mainland China, Asia Pacific I: Asia Pacific Region 1, Asia Pacific II: Asia Pacific Region 2, Asia Pacific III: Asia Pacific Region 3, Europe: Europe, North America: North America, South America: South America, Middle East: Middle East, Africa: Africa.
     * @param RegionNames Region, mapping table as follows: China Mainland: Mainland China, Asia Pacific I: Asia Pacific Region 1, Asia Pacific II: Asia Pacific Region 2, Asia Pacific III: Asia Pacific Region 3, Europe: Europe, North America: North America, South America: South America, Middle East: Middle East, Africa: Africa.
     */
    public void setRegionNames(String [] RegionNames) {
        this.RegionNames = RegionNames;
    }

    /**
     * Get Country, the mapping table is referenced as follows in the document: https://cloud.tencent.com/document/product/267/34019. 
     * @return CountryNames Country, the mapping table is referenced as follows in the document: https://cloud.tencent.com/document/product/267/34019.
     */
    public String [] getCountryNames() {
        return this.CountryNames;
    }

    /**
     * Set Country, the mapping table is referenced as follows in the document: https://cloud.tencent.com/document/product/267/34019.
     * @param CountryNames Country, the mapping table is referenced as follows in the document: https://cloud.tencent.com/document/product/267/34019.
     */
    public void setCountryNames(String [] CountryNames) {
        this.CountryNames = CountryNames;
    }

    public DescribePushBandwidthAndFluxListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePushBandwidthAndFluxListRequest(DescribePushBandwidthAndFluxListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PushDomains != null) {
            this.PushDomains = new String[source.PushDomains.length];
            for (int i = 0; i < source.PushDomains.length; i++) {
                this.PushDomains[i] = new String(source.PushDomains[i]);
            }
        }
        if (source.MainlandOrOversea != null) {
            this.MainlandOrOversea = new String(source.MainlandOrOversea);
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
        if (source.RegionNames != null) {
            this.RegionNames = new String[source.RegionNames.length];
            for (int i = 0; i < source.RegionNames.length; i++) {
                this.RegionNames[i] = new String(source.RegionNames[i]);
            }
        }
        if (source.CountryNames != null) {
            this.CountryNames = new String[source.CountryNames.length];
            for (int i = 0; i < source.CountryNames.length; i++) {
                this.CountryNames[i] = new String(source.CountryNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PushDomains.", this.PushDomains);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamArraySimple(map, prefix + "RegionNames.", this.RegionNames);
        this.setParamArraySimple(map, prefix + "CountryNames.", this.CountryNames);

    }
}

