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

public class IpField extends AbstractModel{

    /**
    * Country/region field
    */
    @SerializedName("Country")
    @Expose
    private Boolean Country;

    /**
    * Province/municipality field
    */
    @SerializedName("Province")
    @Expose
    private Boolean Province;

    /**
    * City field
    */
    @SerializedName("City")
    @Expose
    private Boolean City;

    /**
    * Urban area field
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
    * AS ID
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
     * Get Country/region field 
     * @return Country Country/region field
     */
    public Boolean getCountry() {
        return this.Country;
    }

    /**
     * Set Country/region field
     * @param Country Country/region field
     */
    public void setCountry(Boolean Country) {
        this.Country = Country;
    }

    /**
     * Get Province/municipality field 
     * @return Province Province/municipality field
     */
    public Boolean getProvince() {
        return this.Province;
    }

    /**
     * Set Province/municipality field
     * @param Province Province/municipality field
     */
    public void setProvince(Boolean Province) {
        this.Province = Province;
    }

    /**
     * Get City field 
     * @return City City field
     */
    public Boolean getCity() {
        return this.City;
    }

    /**
     * Set City field
     * @param City City field
     */
    public void setCity(Boolean City) {
        this.City = City;
    }

    /**
     * Get Urban area field 
     * @return Region Urban area field
     */
    public Boolean getRegion() {
        return this.Region;
    }

    /**
     * Set Urban area field
     * @param Region Urban area field
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
     * Get AS ID 
     * @return AsId AS ID
     */
    public Boolean getAsId() {
        return this.AsId;
    }

    /**
     * Set AS ID
     * @param AsId AS ID
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

