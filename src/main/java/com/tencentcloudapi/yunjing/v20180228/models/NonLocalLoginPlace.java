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

public class NonLocalLoginPlace extends AbstractModel {

    /**
    * Event ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Server IP.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Login status
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>NORMAL_LOGIN: intended login</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * City ID.
    */
    @SerializedName("City")
    @Expose
    private Long City;

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
    * Login IP.
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Login time.
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * CWP agent `Uuid`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get Event ID. 
     * @return Id Event ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID.
     * @param Id Event ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get Login status
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>NORMAL_LOGIN: intended login</li> 
     * @return Status Login status
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>NORMAL_LOGIN: intended login</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Login status
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>NORMAL_LOGIN: intended login</li>
     * @param Status Login status
<li>NON_LOCAL_LOGIN: unusual login location</li>
<li>NORMAL_LOGIN: intended login</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
     * Get Login IP. 
     * @return SrcIp Login IP.
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Login IP.
     * @param SrcIp Login IP.
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Server name. 
     * @return MachineName Server name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name.
     * @param MachineName Server name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
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

    /**
     * Get CWP agent `Uuid`. 
     * @return Uuid CWP agent `Uuid`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `Uuid`.
     * @param Uuid CWP agent `Uuid`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public NonLocalLoginPlace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NonLocalLoginPlace(NonLocalLoginPlace source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.City != null) {
            this.City = new Long(source.City);
        }
        if (source.Country != null) {
            this.Country = new Long(source.Country);
        }
        if (source.Province != null) {
            this.Province = new Long(source.Province);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new String(source.LoginTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

