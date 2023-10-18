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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainAccessRegionDict extends AbstractModel {

    /**
    * Nearest access region
    */
    @SerializedName("NationCountryInnerList")
    @Expose
    private NationCountryInnerInfo [] NationCountryInnerList;

    /**
    * Acceleration region connection list
    */
    @SerializedName("ProxyList")
    @Expose
    private ProxyIdDict [] ProxyList;

    /**
    * Acceleration region ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Acceleration region internal code
    */
    @SerializedName("GeographicalZoneInnerCode")
    @Expose
    private String GeographicalZoneInnerCode;

    /**
    * Internal code of the continent to which the acceleration region belongs
    */
    @SerializedName("ContinentInnerCode")
    @Expose
    private String ContinentInnerCode;

    /**
    * Acceleration region alias
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get Nearest access region 
     * @return NationCountryInnerList Nearest access region
     */
    public NationCountryInnerInfo [] getNationCountryInnerList() {
        return this.NationCountryInnerList;
    }

    /**
     * Set Nearest access region
     * @param NationCountryInnerList Nearest access region
     */
    public void setNationCountryInnerList(NationCountryInnerInfo [] NationCountryInnerList) {
        this.NationCountryInnerList = NationCountryInnerList;
    }

    /**
     * Get Acceleration region connection list 
     * @return ProxyList Acceleration region connection list
     */
    public ProxyIdDict [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set Acceleration region connection list
     * @param ProxyList Acceleration region connection list
     */
    public void setProxyList(ProxyIdDict [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get Acceleration region ID 
     * @return RegionId Acceleration region ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Acceleration region ID
     * @param RegionId Acceleration region ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Acceleration region internal code 
     * @return GeographicalZoneInnerCode Acceleration region internal code
     */
    public String getGeographicalZoneInnerCode() {
        return this.GeographicalZoneInnerCode;
    }

    /**
     * Set Acceleration region internal code
     * @param GeographicalZoneInnerCode Acceleration region internal code
     */
    public void setGeographicalZoneInnerCode(String GeographicalZoneInnerCode) {
        this.GeographicalZoneInnerCode = GeographicalZoneInnerCode;
    }

    /**
     * Get Internal code of the continent to which the acceleration region belongs 
     * @return ContinentInnerCode Internal code of the continent to which the acceleration region belongs
     */
    public String getContinentInnerCode() {
        return this.ContinentInnerCode;
    }

    /**
     * Set Internal code of the continent to which the acceleration region belongs
     * @param ContinentInnerCode Internal code of the continent to which the acceleration region belongs
     */
    public void setContinentInnerCode(String ContinentInnerCode) {
        this.ContinentInnerCode = ContinentInnerCode;
    }

    /**
     * Get Acceleration region alias 
     * @return RegionName Acceleration region alias
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Acceleration region alias
     * @param RegionName Acceleration region alias
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public DomainAccessRegionDict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAccessRegionDict(DomainAccessRegionDict source) {
        if (source.NationCountryInnerList != null) {
            this.NationCountryInnerList = new NationCountryInnerInfo[source.NationCountryInnerList.length];
            for (int i = 0; i < source.NationCountryInnerList.length; i++) {
                this.NationCountryInnerList[i] = new NationCountryInnerInfo(source.NationCountryInnerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new ProxyIdDict[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new ProxyIdDict(source.ProxyList[i]);
            }
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.GeographicalZoneInnerCode != null) {
            this.GeographicalZoneInnerCode = new String(source.GeographicalZoneInnerCode);
        }
        if (source.ContinentInnerCode != null) {
            this.ContinentInnerCode = new String(source.ContinentInnerCode);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NationCountryInnerList.", this.NationCountryInnerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "GeographicalZoneInnerCode", this.GeographicalZoneInnerCode);
        this.setParamSimple(map, prefix + "ContinentInnerCode", this.ContinentInnerCode);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

