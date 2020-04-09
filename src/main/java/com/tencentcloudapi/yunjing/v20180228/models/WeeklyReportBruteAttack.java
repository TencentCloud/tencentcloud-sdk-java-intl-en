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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeeklyReportBruteAttack extends AbstractModel{

    /**
    * Server IP.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Hacked username.
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
    * Number of attempts.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Attack time.
    */
    @SerializedName("AttackTime")
    @Expose
    private String AttackTime;

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
     * Get Hacked username. 
     * @return Username Hacked username.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Hacked username.
     * @param Username Hacked username.
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
     * Get Attack time. 
     * @return AttackTime Attack time.
     */
    public String getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set Attack time.
     * @param AttackTime Attack time.
     */
    public void setAttackTime(String AttackTime) {
        this.AttackTime = AttackTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);

    }
}

