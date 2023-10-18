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

public class BruteAttack extends AbstractModel {

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
    * Brute force attack event status
<li>BRUTEATTACK_FAIL_ACCOUNT: brute force attack event - failure (the account exists)</li>
<li>BRUTEATTACK_FAIL_NOACCOUNT: brute force attack event - failure (the account does not exist)</li>
<li>BRUTEATTACK_SUCCESS: brute force attack event - success </li>
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
    * Source IP.
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Number of attempts.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Occurrence time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * CWP agent `UUID`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Whether the server enables CWP Pro.
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * Whether the server is banned.
    */
    @SerializedName("BanStatus")
    @Expose
    private String BanStatus;

    /**
    * Server `UUID`
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

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
     * Get Brute force attack event status
<li>BRUTEATTACK_FAIL_ACCOUNT: brute force attack event - failure (the account exists)</li>
<li>BRUTEATTACK_FAIL_NOACCOUNT: brute force attack event - failure (the account does not exist)</li>
<li>BRUTEATTACK_SUCCESS: brute force attack event - success </li> 
     * @return Status Brute force attack event status
<li>BRUTEATTACK_FAIL_ACCOUNT: brute force attack event - failure (the account exists)</li>
<li>BRUTEATTACK_FAIL_NOACCOUNT: brute force attack event - failure (the account does not exist)</li>
<li>BRUTEATTACK_SUCCESS: brute force attack event - success </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Brute force attack event status
<li>BRUTEATTACK_FAIL_ACCOUNT: brute force attack event - failure (the account exists)</li>
<li>BRUTEATTACK_FAIL_NOACCOUNT: brute force attack event - failure (the account does not exist)</li>
<li>BRUTEATTACK_SUCCESS: brute force attack event - success </li>
     * @param Status Brute force attack event status
<li>BRUTEATTACK_FAIL_ACCOUNT: brute force attack event - failure (the account exists)</li>
<li>BRUTEATTACK_FAIL_NOACCOUNT: brute force attack event - failure (the account does not exist)</li>
<li>BRUTEATTACK_SUCCESS: brute force attack event - success </li>
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
     * Get Number of attempts. 
     * @return Count Number of attempts.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of attempts.
     * @param Count Number of attempts.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Occurrence time. 
     * @return CreateTime Occurrence time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Occurrence time.
     * @param CreateTime Occurrence time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get CWP agent `UUID`. 
     * @return Uuid CWP agent `UUID`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `UUID`.
     * @param Uuid CWP agent `UUID`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Whether the server enables CWP Pro. 
     * @return IsProVersion Whether the server enables CWP Pro.
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set Whether the server enables CWP Pro.
     * @param IsProVersion Whether the server enables CWP Pro.
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get Whether the server is banned. 
     * @return BanStatus Whether the server is banned.
     */
    public String getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set Whether the server is banned.
     * @param BanStatus Whether the server is banned.
     */
    public void setBanStatus(String BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get Server `UUID` 
     * @return Quuid Server `UUID`
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server `UUID`
     * @param Quuid Server `UUID`
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public BruteAttack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BruteAttack(BruteAttack source) {
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
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new String(source.BanStatus);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

