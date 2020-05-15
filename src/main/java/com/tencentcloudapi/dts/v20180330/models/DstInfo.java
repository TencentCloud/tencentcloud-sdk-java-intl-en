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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DstInfo extends AbstractModel{

    /**
    * Target instance ID, such as cdb-jd92ijd8
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Target instance region, such as ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Target instance VIP, which has been disused and does not need to be entered
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Target instance Vport, which has been disused and does not need to be entered
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Only valid for MySQL currently. For instance-level migration, the value range is: 1 (read-only), 0 (read/write)
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * Target database account
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Target database password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Target instance ID, such as cdb-jd92ijd8 
     * @return InstanceId Target instance ID, such as cdb-jd92ijd8
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Target instance ID, such as cdb-jd92ijd8
     * @param InstanceId Target instance ID, such as cdb-jd92ijd8
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Target instance region, such as ap-guangzhou 
     * @return Region Target instance region, such as ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Target instance region, such as ap-guangzhou
     * @param Region Target instance region, such as ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Target instance VIP, which has been disused and does not need to be entered 
     * @return Ip Target instance VIP, which has been disused and does not need to be entered
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Target instance VIP, which has been disused and does not need to be entered
     * @param Ip Target instance VIP, which has been disused and does not need to be entered
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Target instance Vport, which has been disused and does not need to be entered 
     * @return Port Target instance Vport, which has been disused and does not need to be entered
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Target instance Vport, which has been disused and does not need to be entered
     * @param Port Target instance Vport, which has been disused and does not need to be entered
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Only valid for MySQL currently. For instance-level migration, the value range is: 1 (read-only), 0 (read/write) 
     * @return ReadOnly Only valid for MySQL currently. For instance-level migration, the value range is: 1 (read-only), 0 (read/write)
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Only valid for MySQL currently. For instance-level migration, the value range is: 1 (read-only), 0 (read/write)
     * @param ReadOnly Only valid for MySQL currently. For instance-level migration, the value range is: 1 (read-only), 0 (read/write)
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Target database account 
     * @return User Target database account
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Target database account
     * @param User Target database account
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Target database password 
     * @return Password Target database password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Target database password
     * @param Password Target database password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

