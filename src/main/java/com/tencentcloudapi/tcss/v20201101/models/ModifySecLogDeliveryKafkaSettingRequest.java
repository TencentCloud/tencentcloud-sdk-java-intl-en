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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecLogDeliveryKafkaSettingRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * List of log types
    */
    @SerializedName("LogTypeList")
    @Expose
    private SecLogDeliveryKafkaSettingInfo [] LogTypeList;

    /**
    * Access type
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * Kafka version number
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * Region ID
    */
    @SerializedName("RegionID")
    @Expose
    private String RegionID;

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Username 
     * @return User Username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username
     * @param User Username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Password 
     * @return Password Password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password
     * @param Password Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get List of log types 
     * @return LogTypeList List of log types
     */
    public SecLogDeliveryKafkaSettingInfo [] getLogTypeList() {
        return this.LogTypeList;
    }

    /**
     * Set List of log types
     * @param LogTypeList List of log types
     */
    public void setLogTypeList(SecLogDeliveryKafkaSettingInfo [] LogTypeList) {
        this.LogTypeList = LogTypeList;
    }

    /**
     * Get Access type 
     * @return AccessType Access type
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Access type
     * @param AccessType Access type
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Kafka version number 
     * @return KafkaVersion Kafka version number
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set Kafka version number
     * @param KafkaVersion Kafka version number
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get Region ID 
     * @return RegionID Region ID
     */
    public String getRegionID() {
        return this.RegionID;
    }

    /**
     * Set Region ID
     * @param RegionID Region ID
     */
    public void setRegionID(String RegionID) {
        this.RegionID = RegionID;
    }

    public ModifySecLogDeliveryKafkaSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecLogDeliveryKafkaSettingRequest(ModifySecLogDeliveryKafkaSettingRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.LogTypeList != null) {
            this.LogTypeList = new SecLogDeliveryKafkaSettingInfo[source.LogTypeList.length];
            for (int i = 0; i < source.LogTypeList.length; i++) {
                this.LogTypeList[i] = new SecLogDeliveryKafkaSettingInfo(source.LogTypeList[i]);
            }
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.RegionID != null) {
            this.RegionID = new String(source.RegionID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "LogTypeList.", this.LogTypeList);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);

    }
}

