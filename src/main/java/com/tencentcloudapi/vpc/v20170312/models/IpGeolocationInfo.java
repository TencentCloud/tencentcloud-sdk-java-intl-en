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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpGeolocationInfo extends AbstractModel{

    /**
    * Country/region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * Province- or municipality-level administrative region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * Municipal administrative region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Urban area
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Access ISP
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * ISP backbone network’s AS name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AsName")
    @Expose
    private String AsName;

    /**
    * ISP backbone network’s AS ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AsId")
    @Expose
    private String AsId;

    /**
    * Comment. The APN value of mobile users is entered currently. If there is no APN attribute, this is `null`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * IP address
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
     * Get Country/region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Country Country/region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Country/region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Country Country/region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get Province- or municipality-level administrative region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Province Province- or municipality-level administrative region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province- or municipality-level administrative region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Province Province- or municipality-level administrative region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get Municipal administrative region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return City Municipal administrative region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set Municipal administrative region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param City Municipal administrative region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Urban area
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Region Urban area
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Urban area
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Region Urban area
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Access ISP
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Isp Access ISP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set Access ISP
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Isp Access ISP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get ISP backbone network’s AS name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AsName ISP backbone network’s AS name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAsName() {
        return this.AsName;
    }

    /**
     * Set ISP backbone network’s AS name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AsName ISP backbone network’s AS name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAsName(String AsName) {
        this.AsName = AsName;
    }

    /**
     * Get ISP backbone network’s AS ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AsId ISP backbone network’s AS ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAsId() {
        return this.AsId;
    }

    /**
     * Set ISP backbone network’s AS ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AsId ISP backbone network’s AS ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAsId(String AsId) {
        this.AsId = AsId;
    }

    /**
     * Get Comment. The APN value of mobile users is entered currently. If there is no APN attribute, this is `null`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Comment Comment. The APN value of mobile users is entered currently. If there is no APN attribute, this is `null`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Comment. The APN value of mobile users is entered currently. If there is no APN attribute, this is `null`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Comment Comment. The APN value of mobile users is entered currently. If there is no APN attribute, this is `null`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get IP address
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AddressIp IP address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set IP address
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AddressIp IP address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    public IpGeolocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpGeolocationInfo(IpGeolocationInfo source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.AsName != null) {
            this.AsName = new String(source.AsName);
        }
        if (source.AsId != null) {
            this.AsId = new String(source.AsId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "AsName", this.AsName);
        this.setParamSimple(map, prefix + "AsId", this.AsId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);

    }
}

