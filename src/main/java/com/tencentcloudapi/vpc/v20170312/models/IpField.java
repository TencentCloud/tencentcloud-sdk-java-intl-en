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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpField extends AbstractModel {

    /**
    * Country/region of the IP
    */
    @SerializedName("Country")
    @Expose
    private Boolean Country;

    /**
    * Province/municipality/state of the IP
    */
    @SerializedName("Province")
    @Expose
    private Boolean Province;

    /**
    * City of the IP
    */
    @SerializedName("City")
    @Expose
    private Boolean City;

    /**
    * City district of the IP
    */
    @SerializedName("Region")
    @Expose
    private Boolean Region;

    /**
    * Access ISP field
    */
    @SerializedName("Isp")
    @Expose
    private Boolean Isp;

    /**
    * ISP backbone network’s AS field
    */
    @SerializedName("AsName")
    @Expose
    private Boolean AsName;

    /**
    * Backbone AS ID
    */
    @SerializedName("AsId")
    @Expose
    private Boolean AsId;

    /**
    * Comment
    */
    @SerializedName("Comment")
    @Expose
    private Boolean Comment;

    /**
     * Get Country/region of the IP 
     * @return Country Country/region of the IP
     */
    public Boolean getCountry() {
        return this.Country;
    }

    /**
     * Set Country/region of the IP
     * @param Country Country/region of the IP
     */
    public void setCountry(Boolean Country) {
        this.Country = Country;
    }

    /**
     * Get Province/municipality/state of the IP 
     * @return Province Province/municipality/state of the IP
     */
    public Boolean getProvince() {
        return this.Province;
    }

    /**
     * Set Province/municipality/state of the IP
     * @param Province Province/municipality/state of the IP
     */
    public void setProvince(Boolean Province) {
        this.Province = Province;
    }

    /**
     * Get City of the IP 
     * @return City City of the IP
     */
    public Boolean getCity() {
        return this.City;
    }

    /**
     * Set City of the IP
     * @param City City of the IP
     */
    public void setCity(Boolean City) {
        this.City = City;
    }

    /**
     * Get City district of the IP 
     * @return Region City district of the IP
     */
    public Boolean getRegion() {
        return this.Region;
    }

    /**
     * Set City district of the IP
     * @param Region City district of the IP
     */
    public void setRegion(Boolean Region) {
        this.Region = Region;
    }

    /**
     * Get Access ISP field 
     * @return Isp Access ISP field
     */
    public Boolean getIsp() {
        return this.Isp;
    }

    /**
     * Set Access ISP field
     * @param Isp Access ISP field
     */
    public void setIsp(Boolean Isp) {
        this.Isp = Isp;
    }

    /**
     * Get ISP backbone network’s AS field 
     * @return AsName ISP backbone network’s AS field
     */
    public Boolean getAsName() {
        return this.AsName;
    }

    /**
     * Set ISP backbone network’s AS field
     * @param AsName ISP backbone network’s AS field
     */
    public void setAsName(Boolean AsName) {
        this.AsName = AsName;
    }

    /**
     * Get Backbone AS ID 
     * @return AsId Backbone AS ID
     */
    public Boolean getAsId() {
        return this.AsId;
    }

    /**
     * Set Backbone AS ID
     * @param AsId Backbone AS ID
     */
    public void setAsId(Boolean AsId) {
        this.AsId = AsId;
    }

    /**
     * Get Comment 
     * @return Comment Comment
     */
    public Boolean getComment() {
        return this.Comment;
    }

    /**
     * Set Comment
     * @param Comment Comment
     */
    public void setComment(Boolean Comment) {
        this.Comment = Comment;
    }

    public IpField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpField(IpField source) {
        if (source.Country != null) {
            this.Country = new Boolean(source.Country);
        }
        if (source.Province != null) {
            this.Province = new Boolean(source.Province);
        }
        if (source.City != null) {
            this.City = new Boolean(source.City);
        }
        if (source.Region != null) {
            this.Region = new Boolean(source.Region);
        }
        if (source.Isp != null) {
            this.Isp = new Boolean(source.Isp);
        }
        if (source.AsName != null) {
            this.AsName = new Boolean(source.AsName);
        }
        if (source.AsId != null) {
            this.AsId = new Boolean(source.AsId);
        }
        if (source.Comment != null) {
            this.Comment = new Boolean(source.Comment);
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

    }
}

