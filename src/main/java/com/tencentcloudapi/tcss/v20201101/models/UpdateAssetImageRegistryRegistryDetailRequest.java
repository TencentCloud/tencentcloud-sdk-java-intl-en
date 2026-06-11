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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAssetImageRegistryRegistryDetailRequest extends AbstractModel {

    /**
    * Repository name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Username
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Repository URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Repository type, which can be `harbor`.
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Network type, which can be `public` (public network).
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Repository version
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * Region. Default value: `default`.
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * Speed limit
    */
    @SerializedName("SpeedLimit")
    @Expose
    private Long SpeedLimit;

    /**
    * Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
    */
    @SerializedName("Insecure")
    @Expose
    private Long Insecure;

    /**
    * 
    */
    @SerializedName("ConnDetectConfig")
    @Expose
    private ConnDetectConfig [] ConnDetectConfig;

    /**
    * Repository unique id
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * Synchronization method. 0: full synchronization; 1: incremental synchronization.
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
    * Whether to perform authorization and scanning automatically. This parameter is valid for incremental synchronization, which involves all new images.
    */
    @SerializedName("NeedScan")
    @Expose
    private Boolean NeedScan;

    /**
    * TCR instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Repository name 
     * @return Name Repository name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Repository name
     * @param Name Repository name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Username 
     * @return Username Username
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
     * @param Username Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
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
     * Get Repository URL 
     * @return Url Repository URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Repository URL
     * @param Url Repository URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Repository type, which can be `harbor`. 
     * @return RegistryType Repository type, which can be `harbor`.
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Repository type, which can be `harbor`.
     * @param RegistryType Repository type, which can be `harbor`.
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Network type, which can be `public` (public network). 
     * @return NetType Network type, which can be `public` (public network).
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type, which can be `public` (public network).
     * @param NetType Network type, which can be `public` (public network).
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Repository version 
     * @return RegistryVersion Repository version
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set Repository version
     * @param RegistryVersion Repository version
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get Region. Default value: `default`. 
     * @return RegistryRegion Region. Default value: `default`.
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set Region. Default value: `default`.
     * @param RegistryRegion Region. Default value: `default`.
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get Speed limit 
     * @return SpeedLimit Speed limit
     */
    public Long getSpeedLimit() {
        return this.SpeedLimit;
    }

    /**
     * Set Speed limit
     * @param SpeedLimit Speed limit
     */
    public void setSpeedLimit(Long SpeedLimit) {
        this.SpeedLimit = SpeedLimit;
    }

    /**
     * Get Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification). 
     * @return Insecure Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
     */
    public Long getInsecure() {
        return this.Insecure;
    }

    /**
     * Set Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
     * @param Insecure Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
     */
    public void setInsecure(Long Insecure) {
        this.Insecure = Insecure;
    }

    /**
     * Get  
     * @return ConnDetectConfig 
     */
    public ConnDetectConfig [] getConnDetectConfig() {
        return this.ConnDetectConfig;
    }

    /**
     * Set 
     * @param ConnDetectConfig 
     */
    public void setConnDetectConfig(ConnDetectConfig [] ConnDetectConfig) {
        this.ConnDetectConfig = ConnDetectConfig;
    }

    /**
     * Get Repository unique id 
     * @return RegistryId Repository unique id
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Repository unique id
     * @param RegistryId Repository unique id
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Synchronization method. 0: full synchronization; 1: incremental synchronization. 
     * @return SyncMode Synchronization method. 0: full synchronization; 1: incremental synchronization.
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set Synchronization method. 0: full synchronization; 1: incremental synchronization.
     * @param SyncMode Synchronization method. 0: full synchronization; 1: incremental synchronization.
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get Whether to perform authorization and scanning automatically. This parameter is valid for incremental synchronization, which involves all new images. 
     * @return NeedScan Whether to perform authorization and scanning automatically. This parameter is valid for incremental synchronization, which involves all new images.
     */
    public Boolean getNeedScan() {
        return this.NeedScan;
    }

    /**
     * Set Whether to perform authorization and scanning automatically. This parameter is valid for incremental synchronization, which involves all new images.
     * @param NeedScan Whether to perform authorization and scanning automatically. This parameter is valid for incremental synchronization, which involves all new images.
     */
    public void setNeedScan(Boolean NeedScan) {
        this.NeedScan = NeedScan;
    }

    /**
     * Get TCR instance ID. 
     * @return InstanceId TCR instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TCR instance ID.
     * @param InstanceId TCR instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public UpdateAssetImageRegistryRegistryDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAssetImageRegistryRegistryDetailRequest(UpdateAssetImageRegistryRegistryDetailRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegistryVersion != null) {
            this.RegistryVersion = new String(source.RegistryVersion);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.SpeedLimit != null) {
            this.SpeedLimit = new Long(source.SpeedLimit);
        }
        if (source.Insecure != null) {
            this.Insecure = new Long(source.Insecure);
        }
        if (source.ConnDetectConfig != null) {
            this.ConnDetectConfig = new ConnDetectConfig[source.ConnDetectConfig.length];
            for (int i = 0; i < source.ConnDetectConfig.length; i++) {
                this.ConnDetectConfig[i] = new ConnDetectConfig(source.ConnDetectConfig[i]);
            }
        }
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
        }
        if (source.NeedScan != null) {
            this.NeedScan = new Boolean(source.NeedScan);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegistryVersion", this.RegistryVersion);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "SpeedLimit", this.SpeedLimit);
        this.setParamSimple(map, prefix + "Insecure", this.Insecure);
        this.setParamArrayObj(map, prefix + "ConnDetectConfig.", this.ConnDetectConfig);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "NeedScan", this.NeedScan);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

