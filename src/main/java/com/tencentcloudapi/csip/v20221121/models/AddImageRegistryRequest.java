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

public class AddImageRegistryRequest extends AbstractModel {

    /**
    * <p>Mirror repository name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Image repository account</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>Image repository password</p>
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
    * <p>Image repository type</p><p>Enumeration values:</p><ul><li>tcr: TCR repository</li><li>ccr: CCR repository</li><li>harbor: Harbor repository</li><li>jfrog: JFrog repository</li><li>quay: Quay repository</li><li>aws: AWS repository</li><li>azure: Azure repository</li></ul>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>Network type</p><p>Enumeration values:</p><ul><li>public: public network</li><li>Empty: private network, default value</li></ul>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>api version</p>
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * <p>region where the mirror repository is located</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>Access throttling value</p>
    */
    @SerializedName("SpeedLimit")
    @Expose
    private Long SpeedLimit;

    /**
    * <p>Whether to ignore the cert</p><p>Enumeration values:</p><ul><li>0: Verify the certificate</li><li>1: Ignore the cert</li></ul>
    */
    @SerializedName("Insecure")
    @Expose
    private Long Insecure;

    /**
    * <p>Sync now or not</p>
    */
    @SerializedName("NeedScan")
    @Expose
    private Boolean NeedScan;

    /**
    * <p>Synchronization mode. 0: full synchronization</p>
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
    * <p>Scan link configuration used</p>
    */
    @SerializedName("ConnectivityDetectConfig")
    @Expose
    private ConnectivityDetectConfig [] ConnectivityDetectConfig;

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
     * Get <p>Image repository account</p> 
     * @return Username <p>Image repository account</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>Image repository account</p>
     * @param Username <p>Image repository account</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>Image repository password</p> 
     * @return Password <p>Image repository password</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Image repository password</p>
     * @param Password <p>Image repository password</p>
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
     * Get <p>Image repository type</p><p>Enumeration values:</p><ul><li>tcr: TCR repository</li><li>ccr: CCR repository</li><li>harbor: Harbor repository</li><li>jfrog: JFrog repository</li><li>quay: Quay repository</li><li>aws: AWS repository</li><li>azure: Azure repository</li></ul> 
     * @return RegistryType <p>Image repository type</p><p>Enumeration values:</p><ul><li>tcr: TCR repository</li><li>ccr: CCR repository</li><li>harbor: Harbor repository</li><li>jfrog: JFrog repository</li><li>quay: Quay repository</li><li>aws: AWS repository</li><li>azure: Azure repository</li></ul>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>Image repository type</p><p>Enumeration values:</p><ul><li>tcr: TCR repository</li><li>ccr: CCR repository</li><li>harbor: Harbor repository</li><li>jfrog: JFrog repository</li><li>quay: Quay repository</li><li>aws: AWS repository</li><li>azure: Azure repository</li></ul>
     * @param RegistryType <p>Image repository type</p><p>Enumeration values:</p><ul><li>tcr: TCR repository</li><li>ccr: CCR repository</li><li>harbor: Harbor repository</li><li>jfrog: JFrog repository</li><li>quay: Quay repository</li><li>aws: AWS repository</li><li>azure: Azure repository</li></ul>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>Network type</p><p>Enumeration values:</p><ul><li>public: public network</li><li>Empty: private network, default value</li></ul> 
     * @return NetType <p>Network type</p><p>Enumeration values:</p><ul><li>public: public network</li><li>Empty: private network, default value</li></ul>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Network type</p><p>Enumeration values:</p><ul><li>public: public network</li><li>Empty: private network, default value</li></ul>
     * @param NetType <p>Network type</p><p>Enumeration values:</p><ul><li>public: public network</li><li>Empty: private network, default value</li></ul>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>api version</p> 
     * @return RegistryVersion <p>api version</p>
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set <p>api version</p>
     * @param RegistryVersion <p>api version</p>
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get <p>region where the mirror repository is located</p> 
     * @return RegistryRegion <p>region where the mirror repository is located</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>region where the mirror repository is located</p>
     * @param RegistryRegion <p>region where the mirror repository is located</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>Access throttling value</p> 
     * @return SpeedLimit <p>Access throttling value</p>
     */
    public Long getSpeedLimit() {
        return this.SpeedLimit;
    }

    /**
     * Set <p>Access throttling value</p>
     * @param SpeedLimit <p>Access throttling value</p>
     */
    public void setSpeedLimit(Long SpeedLimit) {
        this.SpeedLimit = SpeedLimit;
    }

    /**
     * Get <p>Whether to ignore the cert</p><p>Enumeration values:</p><ul><li>0: Verify the certificate</li><li>1: Ignore the cert</li></ul> 
     * @return Insecure <p>Whether to ignore the cert</p><p>Enumeration values:</p><ul><li>0: Verify the certificate</li><li>1: Ignore the cert</li></ul>
     */
    public Long getInsecure() {
        return this.Insecure;
    }

    /**
     * Set <p>Whether to ignore the cert</p><p>Enumeration values:</p><ul><li>0: Verify the certificate</li><li>1: Ignore the cert</li></ul>
     * @param Insecure <p>Whether to ignore the cert</p><p>Enumeration values:</p><ul><li>0: Verify the certificate</li><li>1: Ignore the cert</li></ul>
     */
    public void setInsecure(Long Insecure) {
        this.Insecure = Insecure;
    }

    /**
     * Get <p>Sync now or not</p> 
     * @return NeedScan <p>Sync now or not</p>
     */
    public Boolean getNeedScan() {
        return this.NeedScan;
    }

    /**
     * Set <p>Sync now or not</p>
     * @param NeedScan <p>Sync now or not</p>
     */
    public void setNeedScan(Boolean NeedScan) {
        this.NeedScan = NeedScan;
    }

    /**
     * Get <p>Synchronization mode. 0: full synchronization</p> 
     * @return SyncMode <p>Synchronization mode. 0: full synchronization</p>
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set <p>Synchronization mode. 0: full synchronization</p>
     * @param SyncMode <p>Synchronization mode. 0: full synchronization</p>
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
     * Get <p>Scan link configuration used</p> 
     * @return ConnectivityDetectConfig <p>Scan link configuration used</p>
     */
    public ConnectivityDetectConfig [] getConnectivityDetectConfig() {
        return this.ConnectivityDetectConfig;
    }

    /**
     * Set <p>Scan link configuration used</p>
     * @param ConnectivityDetectConfig <p>Scan link configuration used</p>
     */
    public void setConnectivityDetectConfig(ConnectivityDetectConfig [] ConnectivityDetectConfig) {
        this.ConnectivityDetectConfig = ConnectivityDetectConfig;
    }

    public AddImageRegistryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddImageRegistryRequest(AddImageRegistryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
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

    }
}

