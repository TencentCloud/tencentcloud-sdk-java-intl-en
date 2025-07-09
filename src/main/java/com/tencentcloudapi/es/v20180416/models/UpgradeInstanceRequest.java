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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Target ES version. Valid values: 6.4.3, 6.8.2, 7.5.1
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * Whether to check for upgrade only. Default value: false
    */
    @SerializedName("CheckOnly")
    @Expose
    private Boolean CheckOnly;

    /**
    * Target X-Pack edition: <li>OSS: Open-source Edition </li><li>basic: Basic Edition </li>Currently only used for v5.6.4 to v6.x upgrade. Default value: basic
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * Upgrade mode. <li>scale: blue/green deployment</li><li>restart: rolling restart</li>Default value: scale
    */
    @SerializedName("UpgradeMode")
    @Expose
    private String UpgradeMode;

    /**
    * Whether to back up the cluster before version upgrade (no backup by default)
    */
    @SerializedName("CosBackup")
    @Expose
    private Boolean CosBackup;

    /**
    * Whether to skip the check and perform a force restart in the rolling mode. Default value: `false`.
    */
    @SerializedName("SkipCheckForceRestart")
    @Expose
    private Boolean SkipCheckForceRestart;

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
     * Get Target ES version. Valid values: 6.4.3, 6.8.2, 7.5.1 
     * @return EsVersion Target ES version. Valid values: 6.4.3, 6.8.2, 7.5.1
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set Target ES version. Valid values: 6.4.3, 6.8.2, 7.5.1
     * @param EsVersion Target ES version. Valid values: 6.4.3, 6.8.2, 7.5.1
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get Whether to check for upgrade only. Default value: false 
     * @return CheckOnly Whether to check for upgrade only. Default value: false
     */
    public Boolean getCheckOnly() {
        return this.CheckOnly;
    }

    /**
     * Set Whether to check for upgrade only. Default value: false
     * @param CheckOnly Whether to check for upgrade only. Default value: false
     */
    public void setCheckOnly(Boolean CheckOnly) {
        this.CheckOnly = CheckOnly;
    }

    /**
     * Get Target X-Pack edition: <li>OSS: Open-source Edition </li><li>basic: Basic Edition </li>Currently only used for v5.6.4 to v6.x upgrade. Default value: basic 
     * @return LicenseType Target X-Pack edition: <li>OSS: Open-source Edition </li><li>basic: Basic Edition </li>Currently only used for v5.6.4 to v6.x upgrade. Default value: basic
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Target X-Pack edition: <li>OSS: Open-source Edition </li><li>basic: Basic Edition </li>Currently only used for v5.6.4 to v6.x upgrade. Default value: basic
     * @param LicenseType Target X-Pack edition: <li>OSS: Open-source Edition </li><li>basic: Basic Edition </li>Currently only used for v5.6.4 to v6.x upgrade. Default value: basic
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li> 
     * @return BasicSecurityType Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
     * @param BasicSecurityType Whether to enable X-Pack security authentication in Basic Edition 6.8 (and above) <li>1: disabled </li><li>2: enabled</li>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get Upgrade mode. <li>scale: blue/green deployment</li><li>restart: rolling restart</li>Default value: scale 
     * @return UpgradeMode Upgrade mode. <li>scale: blue/green deployment</li><li>restart: rolling restart</li>Default value: scale
     */
    public String getUpgradeMode() {
        return this.UpgradeMode;
    }

    /**
     * Set Upgrade mode. <li>scale: blue/green deployment</li><li>restart: rolling restart</li>Default value: scale
     * @param UpgradeMode Upgrade mode. <li>scale: blue/green deployment</li><li>restart: rolling restart</li>Default value: scale
     */
    public void setUpgradeMode(String UpgradeMode) {
        this.UpgradeMode = UpgradeMode;
    }

    /**
     * Get Whether to back up the cluster before version upgrade (no backup by default) 
     * @return CosBackup Whether to back up the cluster before version upgrade (no backup by default)
     */
    public Boolean getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set Whether to back up the cluster before version upgrade (no backup by default)
     * @param CosBackup Whether to back up the cluster before version upgrade (no backup by default)
     */
    public void setCosBackup(Boolean CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get Whether to skip the check and perform a force restart in the rolling mode. Default value: `false`. 
     * @return SkipCheckForceRestart Whether to skip the check and perform a force restart in the rolling mode. Default value: `false`.
     */
    public Boolean getSkipCheckForceRestart() {
        return this.SkipCheckForceRestart;
    }

    /**
     * Set Whether to skip the check and perform a force restart in the rolling mode. Default value: `false`.
     * @param SkipCheckForceRestart Whether to skip the check and perform a force restart in the rolling mode. Default value: `false`.
     */
    public void setSkipCheckForceRestart(Boolean SkipCheckForceRestart) {
        this.SkipCheckForceRestart = SkipCheckForceRestart;
    }

    public UpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceRequest(UpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EsVersion != null) {
            this.EsVersion = new String(source.EsVersion);
        }
        if (source.CheckOnly != null) {
            this.CheckOnly = new Boolean(source.CheckOnly);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.BasicSecurityType != null) {
            this.BasicSecurityType = new Long(source.BasicSecurityType);
        }
        if (source.UpgradeMode != null) {
            this.UpgradeMode = new String(source.UpgradeMode);
        }
        if (source.CosBackup != null) {
            this.CosBackup = new Boolean(source.CosBackup);
        }
        if (source.SkipCheckForceRestart != null) {
            this.SkipCheckForceRestart = new Boolean(source.SkipCheckForceRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "CheckOnly", this.CheckOnly);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "BasicSecurityType", this.BasicSecurityType);
        this.setParamSimple(map, prefix + "UpgradeMode", this.UpgradeMode);
        this.setParamSimple(map, prefix + "CosBackup", this.CosBackup);
        this.setParamSimple(map, prefix + "SkipCheckForceRestart", this.SkipCheckForceRestart);

    }
}

