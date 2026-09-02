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

public class ModifyImageRegistryRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Mirror repository name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Account</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>Password</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Mirror repository url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Image repository type</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>Network type</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>Mirror repository version</p>
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * <p>region to which the mirror repository belongs</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>Speed limit value</p>
    */
    @SerializedName("SpeedLimit")
    @Expose
    private Long SpeedLimit;

    /**
    * <p>Security mode (certificate verification)</p><p>Enumeration values:</p><ul><li>0: Security mode</li><li>1: Non-secure mode</li></ul>
    */
    @SerializedName("Insecure")
    @Expose
    private Long Insecure;

    /**
    * <p>Whether to auto-scan</p>
    */
    @SerializedName("NeedScan")
    @Expose
    private Boolean NeedScan;

    /**
    * <p>Synchronization method</p><p>Enumeration values:</p><ul><li>0: full synchronization</li><li>1: incremental synchronization</li></ul>
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
    * <p>Mirror repository instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Connectivity detection configuration</p>
    */
    @SerializedName("ConnectivityDetectConfig")
    @Expose
    private ConnectivityDetectConfig [] ConnectivityDetectConfig;

    /**
    * <p>Mirror repository id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Mirror repository name</p> 
     * @return Name <p>Mirror repository name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Mirror repository name</p>
     * @param Name <p>Mirror repository name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Account</p> 
     * @return Username <p>Account</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>Account</p>
     * @param Username <p>Account</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>Password</p> 
     * @return Password <p>Password</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Password</p>
     * @param Password <p>Password</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Mirror repository url</p> 
     * @return Url <p>Mirror repository url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Mirror repository url</p>
     * @param Url <p>Mirror repository url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Image repository type</p> 
     * @return RegistryType <p>Image repository type</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>Image repository type</p>
     * @param RegistryType <p>Image repository type</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>Network type</p> 
     * @return NetType <p>Network type</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Network type</p>
     * @param NetType <p>Network type</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>Mirror repository version</p> 
     * @return RegistryVersion <p>Mirror repository version</p>
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set <p>Mirror repository version</p>
     * @param RegistryVersion <p>Mirror repository version</p>
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get <p>region to which the mirror repository belongs</p> 
     * @return RegistryRegion <p>region to which the mirror repository belongs</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>region to which the mirror repository belongs</p>
     * @param RegistryRegion <p>region to which the mirror repository belongs</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>Speed limit value</p> 
     * @return SpeedLimit <p>Speed limit value</p>
     */
    public Long getSpeedLimit() {
        return this.SpeedLimit;
    }

    /**
     * Set <p>Speed limit value</p>
     * @param SpeedLimit <p>Speed limit value</p>
     */
    public void setSpeedLimit(Long SpeedLimit) {
        this.SpeedLimit = SpeedLimit;
    }

    /**
     * Get <p>Security mode (certificate verification)</p><p>Enumeration values:</p><ul><li>0: Security mode</li><li>1: Non-secure mode</li></ul> 
     * @return Insecure <p>Security mode (certificate verification)</p><p>Enumeration values:</p><ul><li>0: Security mode</li><li>1: Non-secure mode</li></ul>
     */
    public Long getInsecure() {
        return this.Insecure;
    }

    /**
     * Set <p>Security mode (certificate verification)</p><p>Enumeration values:</p><ul><li>0: Security mode</li><li>1: Non-secure mode</li></ul>
     * @param Insecure <p>Security mode (certificate verification)</p><p>Enumeration values:</p><ul><li>0: Security mode</li><li>1: Non-secure mode</li></ul>
     */
    public void setInsecure(Long Insecure) {
        this.Insecure = Insecure;
    }

    /**
     * Get <p>Whether to auto-scan</p> 
     * @return NeedScan <p>Whether to auto-scan</p>
     */
    public Boolean getNeedScan() {
        return this.NeedScan;
    }

    /**
     * Set <p>Whether to auto-scan</p>
     * @param NeedScan <p>Whether to auto-scan</p>
     */
    public void setNeedScan(Boolean NeedScan) {
        this.NeedScan = NeedScan;
    }

    /**
     * Get <p>Synchronization method</p><p>Enumeration values:</p><ul><li>0: full synchronization</li><li>1: incremental synchronization</li></ul> 
     * @return SyncMode <p>Synchronization method</p><p>Enumeration values:</p><ul><li>0: full synchronization</li><li>1: incremental synchronization</li></ul>
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set <p>Synchronization method</p><p>Enumeration values:</p><ul><li>0: full synchronization</li><li>1: incremental synchronization</li></ul>
     * @param SyncMode <p>Synchronization method</p><p>Enumeration values:</p><ul><li>0: full synchronization</li><li>1: incremental synchronization</li></ul>
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get <p>Mirror repository instance id</p> 
     * @return InstanceId <p>Mirror repository instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Mirror repository instance id</p>
     * @param InstanceId <p>Mirror repository instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Connectivity detection configuration</p> 
     * @return ConnectivityDetectConfig <p>Connectivity detection configuration</p>
     */
    public ConnectivityDetectConfig [] getConnectivityDetectConfig() {
        return this.ConnectivityDetectConfig;
    }

    /**
     * Set <p>Connectivity detection configuration</p>
     * @param ConnectivityDetectConfig <p>Connectivity detection configuration</p>
     */
    public void setConnectivityDetectConfig(ConnectivityDetectConfig [] ConnectivityDetectConfig) {
        this.ConnectivityDetectConfig = ConnectivityDetectConfig;
    }

    /**
     * Get <p>Mirror repository id</p> 
     * @return Id <p>Mirror repository id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Mirror repository id</p>
     * @param Id <p>Mirror repository id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public ModifyImageRegistryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageRegistryRequest(ModifyImageRegistryRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
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
        if (source.NeedScan != null) {
            this.NeedScan = new Boolean(source.NeedScan);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConnectivityDetectConfig != null) {
            this.ConnectivityDetectConfig = new ConnectivityDetectConfig[source.ConnectivityDetectConfig.length];
            for (int i = 0; i < source.ConnectivityDetectConfig.length; i++) {
                this.ConnectivityDetectConfig[i] = new ConnectivityDetectConfig(source.ConnectivityDetectConfig[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
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
        this.setParamSimple(map, prefix + "NeedScan", this.NeedScan);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ConnectivityDetectConfig.", this.ConnectivityDetectConfig);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

