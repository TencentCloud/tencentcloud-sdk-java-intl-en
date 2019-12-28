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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CountryAreaMap extends AbstractModel{

    /**
    * Country name.
    */
    @SerializedName("NationCountryName")
    @Expose
    private String NationCountryName;

    /**
    * Country code.
    */
    @SerializedName("NationCountryInnerCode")
    @Expose
    private String NationCountryInnerCode;

    /**
    * Region name.
    */
    @SerializedName("GeographicalZoneName")
    @Expose
    private String GeographicalZoneName;

    /**
    * Region code.
    */
    @SerializedName("GeographicalZoneInnerCode")
    @Expose
    private String GeographicalZoneInnerCode;

    /**
    * Continent name.
    */
    @SerializedName("ContinentName")
    @Expose
    private String ContinentName;

    /**
    * Continent code.
    */
    @SerializedName("ContinentInnerCode")
    @Expose
    private String ContinentInnerCode;

    /**
     * Get Country name. 
     * @return NationCountryName Country name.
     */
    public String getNationCountryName() {
        return this.NationCountryName;
    }

    /**
     * Set Country name.
     * @param NationCountryName Country name.
     */
    public void setNationCountryName(String NationCountryName) {
        this.NationCountryName = NationCountryName;
    }

    /**
     * Get Country code. 
     * @return NationCountryInnerCode Country code.
     */
    public String getNationCountryInnerCode() {
        return this.NationCountryInnerCode;
    }

    /**
     * Set Country code.
     * @param NationCountryInnerCode Country code.
     */
    public void setNationCountryInnerCode(String NationCountryInnerCode) {
        this.NationCountryInnerCode = NationCountryInnerCode;
    }

    /**
     * Get Region name. 
     * @return GeographicalZoneName Region name.
     */
    public String getGeographicalZoneName() {
        return this.GeographicalZoneName;
    }

    /**
     * Set Region name.
     * @param GeographicalZoneName Region name.
     */
    public void setGeographicalZoneName(String GeographicalZoneName) {
        this.GeographicalZoneName = GeographicalZoneName;
    }

    /**
     * Get Region code. 
     * @return GeographicalZoneInnerCode Region code.
     */
    public String getGeographicalZoneInnerCode() {
        return this.GeographicalZoneInnerCode;
    }

    /**
     * Set Region code.
     * @param GeographicalZoneInnerCode Region code.
     */
    public void setGeographicalZoneInnerCode(String GeographicalZoneInnerCode) {
        this.GeographicalZoneInnerCode = GeographicalZoneInnerCode;
    }

    /**
     * Get Continent name. 
     * @return ContinentName Continent name.
     */
    public String getContinentName() {
        return this.ContinentName;
    }

    /**
     * Set Continent name.
     * @param ContinentName Continent name.
     */
    public void setContinentName(String ContinentName) {
        this.ContinentName = ContinentName;
    }

    /**
     * Get Continent code. 
     * @return ContinentInnerCode Continent code.
     */
    public String getContinentInnerCode() {
        return this.ContinentInnerCode;
    }

    /**
     * Set Continent code.
     * @param ContinentInnerCode Continent code.
     */
    public void setContinentInnerCode(String ContinentInnerCode) {
        this.ContinentInnerCode = ContinentInnerCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NationCountryName", this.NationCountryName);
        this.setParamSimple(map, prefix + "NationCountryInnerCode", this.NationCountryInnerCode);
        this.setParamSimple(map, prefix + "GeographicalZoneName", this.GeographicalZoneName);
        this.setParamSimple(map, prefix + "GeographicalZoneInnerCode", this.GeographicalZoneInnerCode);
        this.setParamSimple(map, prefix + "ContinentName", this.ContinentName);
        this.setParamSimple(map, prefix + "ContinentInnerCode", this.ContinentInnerCode);

    }
}

