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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeeklyReportNonlocalLoginPlace extends AbstractModel {

    /**
    * Server IP.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Username.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Source IP.
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Country/Region ID.
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * Province/State ID.
    */
    @SerializedName("Province")
    @Expose
    private Long Province;

    /**
    * City ID.
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * Login time.
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
     * Get Server IP. 
     * @return MachineIp Server IP.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Server IP.
     * @param MachineIp Server IP.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Username. 
     * @return Username Username.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username.
     * @param Username Username.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Source IP. 
     * @return SrcIp Source IP.
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Source IP.
     * @param SrcIp Source IP.
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Country/Region ID. 
     * @return Country Country/Region ID.
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set Country/Region ID.
     * @param Country Country/Region ID.
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get Province/State ID. 
     * @return Province Province/State ID.
     */
    public Long getProvince() {
        return this.Province;
    }

    /**
     * Set Province/State ID.
     * @param Province Province/State ID.
     */
    public void setProvince(Long Province) {
        this.Province = Province;
    }

    /**
     * Get City ID. 
     * @return City City ID.
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set City ID.
     * @param City City ID.
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get Login time. 
     * @return LoginTime Login time.
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set Login time.
     * @param LoginTime Login time.
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    public WeeklyReportNonlocalLoginPlace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeeklyReportNonlocalLoginPlace(WeeklyReportNonlocalLoginPlace source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.Country != null) {
            this.Country = new Long(source.Country);
        }
        if (source.Province != null) {
            this.Province = new Long(source.Province);
        }
        if (source.City != null) {
            this.City = new Long(source.City);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new String(source.LoginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);

    }
}

