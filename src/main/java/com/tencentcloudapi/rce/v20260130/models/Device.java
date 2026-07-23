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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel {

    /**
    * <p>The unique id of device returned by RCE</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>The version of the application</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>Device brand</p>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * <p>Client IP address</p>
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * <p>Device model</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>Network type of the device</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>The package name of the application</p>
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * <p>Device platform</p><p>Enumeration value:</p><ul><li>2: Android</li><li>3: IOS</li><li>4: H5</li><li>5: WeChat Mini Program</li></ul>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>Device system version</p>
    */
    @SerializedName("SystemVersion")
    @Expose
    private String SystemVersion;

    /**
    * <p>The build version of SDK</p>
    */
    @SerializedName("SdkBuildVersion")
    @Expose
    private String SdkBuildVersion;

    /**
     * Get <p>The unique id of device returned by RCE</p> 
     * @return DeviceId <p>The unique id of device returned by RCE</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>The unique id of device returned by RCE</p>
     * @param DeviceId <p>The unique id of device returned by RCE</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>The version of the application</p> 
     * @return AppVersion <p>The version of the application</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>The version of the application</p>
     * @param AppVersion <p>The version of the application</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>Device brand</p> 
     * @return Brand <p>Device brand</p>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set <p>Device brand</p>
     * @param Brand <p>Device brand</p>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get <p>Client IP address</p> 
     * @return ClientIp <p>Client IP address</p>
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set <p>Client IP address</p>
     * @param ClientIp <p>Client IP address</p>
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get <p>Device model</p> 
     * @return Model <p>Device model</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Device model</p>
     * @param Model <p>Device model</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>Network type of the device</p> 
     * @return NetworkType <p>Network type of the device</p>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>Network type of the device</p>
     * @param NetworkType <p>Network type of the device</p>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>The package name of the application</p> 
     * @return PackageName <p>The package name of the application</p>
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>The package name of the application</p>
     * @param PackageName <p>The package name of the application</p>
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get <p>Device platform</p><p>Enumeration value:</p><ul><li>2: Android</li><li>3: IOS</li><li>4: H5</li><li>5: WeChat Mini Program</li></ul> 
     * @return Platform <p>Device platform</p><p>Enumeration value:</p><ul><li>2: Android</li><li>3: IOS</li><li>4: H5</li><li>5: WeChat Mini Program</li></ul>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>Device platform</p><p>Enumeration value:</p><ul><li>2: Android</li><li>3: IOS</li><li>4: H5</li><li>5: WeChat Mini Program</li></ul>
     * @param Platform <p>Device platform</p><p>Enumeration value:</p><ul><li>2: Android</li><li>3: IOS</li><li>4: H5</li><li>5: WeChat Mini Program</li></ul>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>Device system version</p> 
     * @return SystemVersion <p>Device system version</p>
     */
    public String getSystemVersion() {
        return this.SystemVersion;
    }

    /**
     * Set <p>Device system version</p>
     * @param SystemVersion <p>Device system version</p>
     */
    public void setSystemVersion(String SystemVersion) {
        this.SystemVersion = SystemVersion;
    }

    /**
     * Get <p>The build version of SDK</p> 
     * @return SdkBuildVersion <p>The build version of SDK</p>
     */
    public String getSdkBuildVersion() {
        return this.SdkBuildVersion;
    }

    /**
     * Set <p>The build version of SDK</p>
     * @param SdkBuildVersion <p>The build version of SDK</p>
     */
    public void setSdkBuildVersion(String SdkBuildVersion) {
        this.SdkBuildVersion = SdkBuildVersion;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.SystemVersion != null) {
            this.SystemVersion = new String(source.SystemVersion);
        }
        if (source.SdkBuildVersion != null) {
            this.SdkBuildVersion = new String(source.SdkBuildVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SystemVersion", this.SystemVersion);
        this.setParamSimple(map, prefix + "SdkBuildVersion", this.SdkBuildVersion);

    }
}

