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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleInfoData extends AbstractModel {

    /**
    * Priority
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * Access source
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * Access destination
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * Protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Policy. 0: observe; 1: block; 2: allow
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * Access source type. 1: IP; 3: domain name; 4: IP address template; 5: domain name address template
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Direction. 0: outbound; 1: inbound
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Description
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Access destination type. 1: IP, 3: domain name; 4: IP address template; 5: domain name address template
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * ID value
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Log ID, required when an alert log is created
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * City code
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * Country code
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * Cloud vendor. Multiple vendors are supported and separated with commas. 1: Tencent Cloud (only in Hong Kong, China and overseas); 2: Alibaba Cloud; 3: Amazon Cloud; 4: Huawei Cloud; 5: Microsoft Cloud
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
    * Indicates whether it is a region
    */
    @SerializedName("IsRegion")
    @Expose
    private Long IsRegion;

    /**
    * City name
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * Country name
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
     * Get Priority 
     * @return OrderIndex Priority
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set Priority
     * @param OrderIndex Priority
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get Access source 
     * @return SourceIp Access source
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set Access source
     * @param SourceIp Access source
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get Access destination 
     * @return TargetIp Access destination
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set Access destination
     * @param TargetIp Access destination
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get Protocol 
     * @return Protocol Protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
     * @param Protocol Protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Policy. 0: observe; 1: block; 2: allow 
     * @return Strategy Policy. 0: observe; 1: block; 2: allow
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Policy. 0: observe; 1: block; 2: allow
     * @param Strategy Policy. 0: observe; 1: block; 2: allow
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Access source type. 1: IP; 3: domain name; 4: IP address template; 5: domain name address template 
     * @return SourceType Access source type. 1: IP; 3: domain name; 4: IP address template; 5: domain name address template
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Access source type. 1: IP; 3: domain name; 4: IP address template; 5: domain name address template
     * @param SourceType Access source type. 1: IP; 3: domain name; 4: IP address template; 5: domain name address template
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Direction. 0: outbound; 1: inbound 
     * @return Direction Direction. 0: outbound; 1: inbound
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. 0: outbound; 1: inbound
     * @param Direction Direction. 0: outbound; 1: inbound
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Description 
     * @return Detail Description
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Description
     * @param Detail Description
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Access destination type. 1: IP, 3: domain name; 4: IP address template; 5: domain name address template 
     * @return TargetType Access destination type. 1: IP, 3: domain name; 4: IP address template; 5: domain name address template
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Access destination type. 1: IP, 3: domain name; 4: IP address template; 5: domain name address template
     * @param TargetType Access destination type. 1: IP, 3: domain name; 4: IP address template; 5: domain name address template
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Port 
     * @return Port Port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get ID value 
     * @return Id ID value
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID value
     * @param Id ID value
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Log ID, required when an alert log is created 
     * @return LogId Log ID, required when an alert log is created
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set Log ID, required when an alert log is created
     * @param LogId Log ID, required when an alert log is created
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get City code 
     * @return City City code
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set City code
     * @param City City code
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get Country code 
     * @return Country Country code
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set Country code
     * @param Country Country code
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get Cloud vendor. Multiple vendors are supported and separated with commas. 1: Tencent Cloud (only in Hong Kong, China and overseas); 2: Alibaba Cloud; 3: Amazon Cloud; 4: Huawei Cloud; 5: Microsoft Cloud 
     * @return CloudCode Cloud vendor. Multiple vendors are supported and separated with commas. 1: Tencent Cloud (only in Hong Kong, China and overseas); 2: Alibaba Cloud; 3: Amazon Cloud; 4: Huawei Cloud; 5: Microsoft Cloud
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set Cloud vendor. Multiple vendors are supported and separated with commas. 1: Tencent Cloud (only in Hong Kong, China and overseas); 2: Alibaba Cloud; 3: Amazon Cloud; 4: Huawei Cloud; 5: Microsoft Cloud
     * @param CloudCode Cloud vendor. Multiple vendors are supported and separated with commas. 1: Tencent Cloud (only in Hong Kong, China and overseas); 2: Alibaba Cloud; 3: Amazon Cloud; 4: Huawei Cloud; 5: Microsoft Cloud
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    /**
     * Get Indicates whether it is a region 
     * @return IsRegion Indicates whether it is a region
     */
    public Long getIsRegion() {
        return this.IsRegion;
    }

    /**
     * Set Indicates whether it is a region
     * @param IsRegion Indicates whether it is a region
     */
    public void setIsRegion(Long IsRegion) {
        this.IsRegion = IsRegion;
    }

    /**
     * Get City name 
     * @return CityName City name
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set City name
     * @param CityName City name
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get Country name 
     * @return CountryName Country name
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set Country name
     * @param CountryName Country name
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public RuleInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInfoData(RuleInfoData source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.City != null) {
            this.City = new Long(source.City);
        }
        if (source.Country != null) {
            this.Country = new Long(source.Country);
        }
        if (source.CloudCode != null) {
            this.CloudCode = new String(source.CloudCode);
        }
        if (source.IsRegion != null) {
            this.IsRegion = new Long(source.IsRegion);
        }
        if (source.CityName != null) {
            this.CityName = new String(source.CityName);
        }
        if (source.CountryName != null) {
            this.CountryName = new String(source.CountryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "CloudCode", this.CloudCode);
        this.setParamSimple(map, prefix + "IsRegion", this.IsRegion);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "CountryName", this.CountryName);

    }
}

