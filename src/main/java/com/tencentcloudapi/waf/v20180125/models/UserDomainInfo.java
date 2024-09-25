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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDomainInfo extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * WAF type
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Version

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Switch for Specified Domain Access Log Fields

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WriteConfig")
    @Expose
    private String WriteConfig;

    /**
    * Whether to Write the CLS Switch for the Specified Domain 1: Yes, 0: No

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
    * Marks if it is hybrid cloud access. Hybrid indicates a hybrid cloud access domain

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * CLB WAF type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * Bot detection enabling status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * API enabling status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
     * Get User ID 
     * @return Appid User ID
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set User ID
     * @param Appid User ID
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain ID 
     * @return DomainId Domain ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID
     * @param DomainId Domain ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get WAF type 
     * @return Edition WAF type
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF type
     * @param Edition WAF type
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Version

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Version

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Version

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Version

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Switch for Specified Domain Access Log Fields

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WriteConfig Switch for Specified Domain Access Log Fields

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWriteConfig() {
        return this.WriteConfig;
    }

    /**
     * Set Switch for Specified Domain Access Log Fields

Note: This field may return null, indicating that no valid values can be obtained.
     * @param WriteConfig Switch for Specified Domain Access Log Fields

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWriteConfig(String WriteConfig) {
        this.WriteConfig = WriteConfig;
    }

    /**
     * Get Whether to Write the CLS Switch for the Specified Domain 1: Yes, 0: No

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cls Whether to Write the CLS Switch for the Specified Domain 1: Yes, 0: No

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set Whether to Write the CLS Switch for the Specified Domain 1: Yes, 0: No

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cls Whether to Write the CLS Switch for the Specified Domain 1: Yes, 0: No

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    /**
     * Get Marks if it is hybrid cloud access. Hybrid indicates a hybrid cloud access domain

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudType Marks if it is hybrid cloud access. Hybrid indicates a hybrid cloud access domain

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Marks if it is hybrid cloud access. Hybrid indicates a hybrid cloud access domain

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudType Marks if it is hybrid cloud access. Hybrid indicates a hybrid cloud access domain

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get CLB WAF type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlbType CLB WAF type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set CLB WAF type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlbType CLB WAF type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get Bot detection enabling status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BotStatus Bot detection enabling status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set Bot detection enabling status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BotStatus Bot detection enabling status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get API enabling status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiStatus API enabling status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set API enabling status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiStatus API enabling status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    public UserDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDomainInfo(UserDomainInfo source) {
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.WriteConfig != null) {
            this.WriteConfig = new String(source.WriteConfig);
        }
        if (source.Cls != null) {
            this.Cls = new Long(source.Cls);
        }
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.BotStatus != null) {
            this.BotStatus = new Long(source.BotStatus);
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long(source.ApiStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "WriteConfig", this.WriteConfig);
        this.setParamSimple(map, prefix + "Cls", this.Cls);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamSimple(map, prefix + "BotStatus", this.BotStatus);
        this.setParamSimple(map, prefix + "ApiStatus", this.ApiStatus);

    }
}

