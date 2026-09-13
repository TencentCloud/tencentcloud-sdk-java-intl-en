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

public class App extends AbstractModel {

    /**
    * <p>The operating system your application is running on</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>The operating system version  your application is running on</p>
    */
    @SerializedName("OSVersion")
    @Expose
    private String OSVersion;

    /**
    * <p>The manufacturer of  the device your application is running on</p>
    */
    @SerializedName("DeviceManufacturer")
    @Expose
    private String DeviceManufacturer;

    /**
    * <p>The model of the device your application is running on</p>
    */
    @SerializedName("DeviceModel")
    @Expose
    private String DeviceModel;

    /**
    * <p>The ID of the device your application is running on</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>The name of your application</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>The version of your application</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>The language of your application</p>
    */
    @SerializedName("ClientLanguage")
    @Expose
    private String ClientLanguage;

    /**
     * Get <p>The operating system your application is running on</p> 
     * @return OS <p>The operating system your application is running on</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>The operating system your application is running on</p>
     * @param OS <p>The operating system your application is running on</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>The operating system version  your application is running on</p> 
     * @return OSVersion <p>The operating system version  your application is running on</p>
     */
    public String getOSVersion() {
        return this.OSVersion;
    }

    /**
     * Set <p>The operating system version  your application is running on</p>
     * @param OSVersion <p>The operating system version  your application is running on</p>
     */
    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
    }

    /**
     * Get <p>The manufacturer of  the device your application is running on</p> 
     * @return DeviceManufacturer <p>The manufacturer of  the device your application is running on</p>
     */
    public String getDeviceManufacturer() {
        return this.DeviceManufacturer;
    }

    /**
     * Set <p>The manufacturer of  the device your application is running on</p>
     * @param DeviceManufacturer <p>The manufacturer of  the device your application is running on</p>
     */
    public void setDeviceManufacturer(String DeviceManufacturer) {
        this.DeviceManufacturer = DeviceManufacturer;
    }

    /**
     * Get <p>The model of the device your application is running on</p> 
     * @return DeviceModel <p>The model of the device your application is running on</p>
     */
    public String getDeviceModel() {
        return this.DeviceModel;
    }

    /**
     * Set <p>The model of the device your application is running on</p>
     * @param DeviceModel <p>The model of the device your application is running on</p>
     */
    public void setDeviceModel(String DeviceModel) {
        this.DeviceModel = DeviceModel;
    }

    /**
     * Get <p>The ID of the device your application is running on</p> 
     * @return DeviceId <p>The ID of the device your application is running on</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>The ID of the device your application is running on</p>
     * @param DeviceId <p>The ID of the device your application is running on</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>The name of your application</p> 
     * @return AppName <p>The name of your application</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>The name of your application</p>
     * @param AppName <p>The name of your application</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>The version of your application</p> 
     * @return AppVersion <p>The version of your application</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>The version of your application</p>
     * @param AppVersion <p>The version of your application</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>The language of your application</p> 
     * @return ClientLanguage <p>The language of your application</p>
     */
    public String getClientLanguage() {
        return this.ClientLanguage;
    }

    /**
     * Set <p>The language of your application</p>
     * @param ClientLanguage <p>The language of your application</p>
     */
    public void setClientLanguage(String ClientLanguage) {
        this.ClientLanguage = ClientLanguage;
    }

    public App() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public App(App source) {
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.OSVersion != null) {
            this.OSVersion = new String(source.OSVersion);
        }
        if (source.DeviceManufacturer != null) {
            this.DeviceManufacturer = new String(source.DeviceManufacturer);
        }
        if (source.DeviceModel != null) {
            this.DeviceModel = new String(source.DeviceModel);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.ClientLanguage != null) {
            this.ClientLanguage = new String(source.ClientLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "OSVersion", this.OSVersion);
        this.setParamSimple(map, prefix + "DeviceManufacturer", this.DeviceManufacturer);
        this.setParamSimple(map, prefix + "DeviceModel", this.DeviceModel);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "ClientLanguage", this.ClientLanguage);

    }
}

