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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayerVersionInfo extends AbstractModel{

    /**
    * Runtime applicable to a version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompatibleRuntimes")
    @Expose
    private String [] CompatibleRuntimes;

    /**
    * Creation time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Version description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * License information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseInfo")
    @Expose
    private String LicenseInfo;

    /**
    * Version number
    */
    @SerializedName("LayerVersion")
    @Expose
    private Long LayerVersion;

    /**
    * Layer name
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * Current status of a layer. Valid values:
publishing
available
unavailable
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Runtime applicable to a version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompatibleRuntimes Runtime applicable to a version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCompatibleRuntimes() {
        return this.CompatibleRuntimes;
    }

    /**
     * Set Runtime applicable to a version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompatibleRuntimes Runtime applicable to a version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompatibleRuntimes(String [] CompatibleRuntimes) {
        this.CompatibleRuntimes = CompatibleRuntimes;
    }

    /**
     * Get Creation time 
     * @return AddTime Creation time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time
     * @param AddTime Creation time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Version description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Version description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Version description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Version description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get License information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseInfo License information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseInfo() {
        return this.LicenseInfo;
    }

    /**
     * Set License information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseInfo License information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseInfo(String LicenseInfo) {
        this.LicenseInfo = LicenseInfo;
    }

    /**
     * Get Version number 
     * @return LayerVersion Version number
     */
    public Long getLayerVersion() {
        return this.LayerVersion;
    }

    /**
     * Set Version number
     * @param LayerVersion Version number
     */
    public void setLayerVersion(Long LayerVersion) {
        this.LayerVersion = LayerVersion;
    }

    /**
     * Get Layer name 
     * @return LayerName Layer name
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set Layer name
     * @param LayerName Layer name
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get Current status of a layer. Valid values:
publishing
available
unavailable 
     * @return Status Current status of a layer. Valid values:
publishing
available
unavailable
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current status of a layer. Valid values:
publishing
available
unavailable
     * @param Status Current status of a layer. Valid values:
publishing
available
unavailable
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CompatibleRuntimes.", this.CompatibleRuntimes);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LicenseInfo", this.LicenseInfo);
        this.setParamSimple(map, prefix + "LayerVersion", this.LayerVersion);
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

