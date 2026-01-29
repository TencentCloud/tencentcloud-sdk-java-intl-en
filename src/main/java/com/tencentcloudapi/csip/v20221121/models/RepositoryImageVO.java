/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepositoryImageVO extends AbstractModel {

    /**
    * User appid.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Nickname.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Mirror id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Image name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Image creation time.
    */
    @SerializedName("InstanceCreateTime")
    @Expose
    private String InstanceCreateTime;

    /**
    * Image Size with Unit
    */
    @SerializedName("InstanceSize")
    @Expose
    private String InstanceSize;

    /**
    * Build times.
    */
    @SerializedName("BuildCount")
    @Expose
    private Long BuildCount;

    /**
    * Image type.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Authorization status.
    */
    @SerializedName("AuthStatus")
    @Expose
    private Long AuthStatus;

    /**
    * Mirror version.
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Repository address.
    */
    @SerializedName("RepositoryUrl")
    @Expose
    private String RepositoryUrl;

    /**
    * Repository name.
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * Core or Not
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * Vulnerability risk.
    */
    @SerializedName("VulRisk")
    @Expose
    private Long VulRisk;

    /**
    * Check task.
    */
    @SerializedName("CheckCount")
    @Expose
    private Long CheckCount;

    /**
    * Health Checkup Time
    */
    @SerializedName("CheckTime")
    @Expose
    private String CheckTime;

    /**
    * New Asset or Not. 1: New
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
     * Get User appid. 
     * @return AppId User appid.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid.
     * @param AppId User appid.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN 
     * @return Uin User UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
     * @param Uin User UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Nickname. 
     * @return NickName Nickname.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Nickname.
     * @param NickName Nickname.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Mirror id. 
     * @return InstanceId Mirror id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Mirror id.
     * @param InstanceId Mirror id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Image name. 
     * @return InstanceName Image name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Image name.
     * @param InstanceName Image name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Image creation time. 
     * @return InstanceCreateTime Image creation time.
     */
    public String getInstanceCreateTime() {
        return this.InstanceCreateTime;
    }

    /**
     * Set Image creation time.
     * @param InstanceCreateTime Image creation time.
     */
    public void setInstanceCreateTime(String InstanceCreateTime) {
        this.InstanceCreateTime = InstanceCreateTime;
    }

    /**
     * Get Image Size with Unit 
     * @return InstanceSize Image Size with Unit
     */
    public String getInstanceSize() {
        return this.InstanceSize;
    }

    /**
     * Set Image Size with Unit
     * @param InstanceSize Image Size with Unit
     */
    public void setInstanceSize(String InstanceSize) {
        this.InstanceSize = InstanceSize;
    }

    /**
     * Get Build times. 
     * @return BuildCount Build times.
     */
    public Long getBuildCount() {
        return this.BuildCount;
    }

    /**
     * Set Build times.
     * @param BuildCount Build times.
     */
    public void setBuildCount(Long BuildCount) {
        this.BuildCount = BuildCount;
    }

    /**
     * Get Image type. 
     * @return InstanceType Image type.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Image type.
     * @param InstanceType Image type.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Authorization status. 
     * @return AuthStatus Authorization status.
     */
    public Long getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set Authorization status.
     * @param AuthStatus Authorization status.
     */
    public void setAuthStatus(Long AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get Mirror version. 
     * @return InstanceVersion Mirror version.
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set Mirror version.
     * @param InstanceVersion Mirror version.
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Repository address. 
     * @return RepositoryUrl Repository address.
     */
    public String getRepositoryUrl() {
        return this.RepositoryUrl;
    }

    /**
     * Set Repository address.
     * @param RepositoryUrl Repository address.
     */
    public void setRepositoryUrl(String RepositoryUrl) {
        this.RepositoryUrl = RepositoryUrl;
    }

    /**
     * Get Repository name. 
     * @return RepositoryName Repository name.
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set Repository name.
     * @param RepositoryName Repository name.
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get Core or Not 
     * @return IsCore Core or Not
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Core or Not
     * @param IsCore Core or Not
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get Vulnerability risk. 
     * @return VulRisk Vulnerability risk.
     */
    public Long getVulRisk() {
        return this.VulRisk;
    }

    /**
     * Set Vulnerability risk.
     * @param VulRisk Vulnerability risk.
     */
    public void setVulRisk(Long VulRisk) {
        this.VulRisk = VulRisk;
    }

    /**
     * Get Check task. 
     * @return CheckCount Check task.
     */
    public Long getCheckCount() {
        return this.CheckCount;
    }

    /**
     * Set Check task.
     * @param CheckCount Check task.
     */
    public void setCheckCount(Long CheckCount) {
        this.CheckCount = CheckCount;
    }

    /**
     * Get Health Checkup Time 
     * @return CheckTime Health Checkup Time
     */
    public String getCheckTime() {
        return this.CheckTime;
    }

    /**
     * Set Health Checkup Time
     * @param CheckTime Health Checkup Time
     */
    public void setCheckTime(String CheckTime) {
        this.CheckTime = CheckTime;
    }

    /**
     * Get New Asset or Not. 1: New 
     * @return IsNewAsset New Asset or Not. 1: New
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set New Asset or Not. 1: New
     * @param IsNewAsset New Asset or Not. 1: New
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    public RepositoryImageVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepositoryImageVO(RepositoryImageVO source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceCreateTime != null) {
            this.InstanceCreateTime = new String(source.InstanceCreateTime);
        }
        if (source.InstanceSize != null) {
            this.InstanceSize = new String(source.InstanceSize);
        }
        if (source.BuildCount != null) {
            this.BuildCount = new Long(source.BuildCount);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new Long(source.AuthStatus);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RepositoryUrl != null) {
            this.RepositoryUrl = new String(source.RepositoryUrl);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.VulRisk != null) {
            this.VulRisk = new Long(source.VulRisk);
        }
        if (source.CheckCount != null) {
            this.CheckCount = new Long(source.CheckCount);
        }
        if (source.CheckTime != null) {
            this.CheckTime = new String(source.CheckTime);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceCreateTime", this.InstanceCreateTime);
        this.setParamSimple(map, prefix + "InstanceSize", this.InstanceSize);
        this.setParamSimple(map, prefix + "BuildCount", this.BuildCount);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RepositoryUrl", this.RepositoryUrl);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "VulRisk", this.VulRisk);
        this.setParamSimple(map, prefix + "CheckCount", this.CheckCount);
        this.setParamSimple(map, prefix + "CheckTime", this.CheckTime);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);

    }
}

