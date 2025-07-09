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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IKEOptionsSpecification extends AbstractModel {

    /**
    * Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBS-192`, `AES-CBC-256`, `DES-CBC`, and `SM4`; default value: `3DES-CBC`.
    */
    @SerializedName("PropoEncryAlgorithm")
    @Expose
    private String PropoEncryAlgorithm;

    /**
    * Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `MD5`.
    */
    @SerializedName("PropoAuthenAlgorithm")
    @Expose
    private String PropoAuthenAlgorithm;

    /**
    * Negotiation mode. Available values: 'AGGRESSIVE' and 'MAIN'. Default is MAIN.
    */
    @SerializedName("ExchangeMode")
    @Expose
    private String ExchangeMode;

    /**
    * Type of local identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS.
    */
    @SerializedName("LocalIdentity")
    @Expose
    private String LocalIdentity;

    /**
    * Type of remote identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS.
    */
    @SerializedName("RemoteIdentity")
    @Expose
    private String RemoteIdentity;

    /**
    * Local identity. When ADDRESS is selected for LocalIdentity, LocalAddress is required. The default LocalAddress is the public IP of the VPN gateway.
    */
    @SerializedName("LocalAddress")
    @Expose
    private String LocalAddress;

    /**
    * Remote identity. When ADDRESS is selected for RemoteIdentity, RemoteAddress is required.
    */
    @SerializedName("RemoteAddress")
    @Expose
    private String RemoteAddress;

    /**
    * Local identity. When FQDN is selected for LocalIdentity, LocalFqdnName is required.
    */
    @SerializedName("LocalFqdnName")
    @Expose
    private String LocalFqdnName;

    /**
    * Remote identity. When FQDN is selected for RemoteIdentity, RemoteFqdnName is required.
    */
    @SerializedName("RemoteFqdnName")
    @Expose
    private String RemoteFqdnName;

    /**
    * DH group. Specify the DH group used for exchanging the key via IKE. Available values: 'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', and 'GROUP24'.
    */
    @SerializedName("DhGroupName")
    @Expose
    private String DhGroupName;

    /**
    * IKE SA lifetime (in sec). Value range: 60-604800
    */
    @SerializedName("IKESaLifetimeSeconds")
    @Expose
    private Long IKESaLifetimeSeconds;

    /**
    * IKE version
    */
    @SerializedName("IKEVersion")
    @Expose
    private String IKEVersion;

    /**
     * Get Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBS-192`, `AES-CBC-256`, `DES-CBC`, and `SM4`; default value: `3DES-CBC`. 
     * @return PropoEncryAlgorithm Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBS-192`, `AES-CBC-256`, `DES-CBC`, and `SM4`; default value: `3DES-CBC`.
     */
    public String getPropoEncryAlgorithm() {
        return this.PropoEncryAlgorithm;
    }

    /**
     * Set Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBS-192`, `AES-CBC-256`, `DES-CBC`, and `SM4`; default value: `3DES-CBC`.
     * @param PropoEncryAlgorithm Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBS-192`, `AES-CBC-256`, `DES-CBC`, and `SM4`; default value: `3DES-CBC`.
     */
    public void setPropoEncryAlgorithm(String PropoEncryAlgorithm) {
        this.PropoEncryAlgorithm = PropoEncryAlgorithm;
    }

    /**
     * Get Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `MD5`. 
     * @return PropoAuthenAlgorithm Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `MD5`.
     */
    public String getPropoAuthenAlgorithm() {
        return this.PropoAuthenAlgorithm;
    }

    /**
     * Set Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `MD5`.
     * @param PropoAuthenAlgorithm Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `MD5`.
     */
    public void setPropoAuthenAlgorithm(String PropoAuthenAlgorithm) {
        this.PropoAuthenAlgorithm = PropoAuthenAlgorithm;
    }

    /**
     * Get Negotiation mode. Available values: 'AGGRESSIVE' and 'MAIN'. Default is MAIN. 
     * @return ExchangeMode Negotiation mode. Available values: 'AGGRESSIVE' and 'MAIN'. Default is MAIN.
     */
    public String getExchangeMode() {
        return this.ExchangeMode;
    }

    /**
     * Set Negotiation mode. Available values: 'AGGRESSIVE' and 'MAIN'. Default is MAIN.
     * @param ExchangeMode Negotiation mode. Available values: 'AGGRESSIVE' and 'MAIN'. Default is MAIN.
     */
    public void setExchangeMode(String ExchangeMode) {
        this.ExchangeMode = ExchangeMode;
    }

    /**
     * Get Type of local identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS. 
     * @return LocalIdentity Type of local identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS.
     */
    public String getLocalIdentity() {
        return this.LocalIdentity;
    }

    /**
     * Set Type of local identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS.
     * @param LocalIdentity Type of local identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS.
     */
    public void setLocalIdentity(String LocalIdentity) {
        this.LocalIdentity = LocalIdentity;
    }

    /**
     * Get Type of remote identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS. 
     * @return RemoteIdentity Type of remote identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS.
     */
    public String getRemoteIdentity() {
        return this.RemoteIdentity;
    }

    /**
     * Set Type of remote identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS.
     * @param RemoteIdentity Type of remote identity. Available values: 'ADDRESS' and 'FQDN'. Default is ADDRESS.
     */
    public void setRemoteIdentity(String RemoteIdentity) {
        this.RemoteIdentity = RemoteIdentity;
    }

    /**
     * Get Local identity. When ADDRESS is selected for LocalIdentity, LocalAddress is required. The default LocalAddress is the public IP of the VPN gateway. 
     * @return LocalAddress Local identity. When ADDRESS is selected for LocalIdentity, LocalAddress is required. The default LocalAddress is the public IP of the VPN gateway.
     */
    public String getLocalAddress() {
        return this.LocalAddress;
    }

    /**
     * Set Local identity. When ADDRESS is selected for LocalIdentity, LocalAddress is required. The default LocalAddress is the public IP of the VPN gateway.
     * @param LocalAddress Local identity. When ADDRESS is selected for LocalIdentity, LocalAddress is required. The default LocalAddress is the public IP of the VPN gateway.
     */
    public void setLocalAddress(String LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    /**
     * Get Remote identity. When ADDRESS is selected for RemoteIdentity, RemoteAddress is required. 
     * @return RemoteAddress Remote identity. When ADDRESS is selected for RemoteIdentity, RemoteAddress is required.
     */
    public String getRemoteAddress() {
        return this.RemoteAddress;
    }

    /**
     * Set Remote identity. When ADDRESS is selected for RemoteIdentity, RemoteAddress is required.
     * @param RemoteAddress Remote identity. When ADDRESS is selected for RemoteIdentity, RemoteAddress is required.
     */
    public void setRemoteAddress(String RemoteAddress) {
        this.RemoteAddress = RemoteAddress;
    }

    /**
     * Get Local identity. When FQDN is selected for LocalIdentity, LocalFqdnName is required. 
     * @return LocalFqdnName Local identity. When FQDN is selected for LocalIdentity, LocalFqdnName is required.
     */
    public String getLocalFqdnName() {
        return this.LocalFqdnName;
    }

    /**
     * Set Local identity. When FQDN is selected for LocalIdentity, LocalFqdnName is required.
     * @param LocalFqdnName Local identity. When FQDN is selected for LocalIdentity, LocalFqdnName is required.
     */
    public void setLocalFqdnName(String LocalFqdnName) {
        this.LocalFqdnName = LocalFqdnName;
    }

    /**
     * Get Remote identity. When FQDN is selected for RemoteIdentity, RemoteFqdnName is required. 
     * @return RemoteFqdnName Remote identity. When FQDN is selected for RemoteIdentity, RemoteFqdnName is required.
     */
    public String getRemoteFqdnName() {
        return this.RemoteFqdnName;
    }

    /**
     * Set Remote identity. When FQDN is selected for RemoteIdentity, RemoteFqdnName is required.
     * @param RemoteFqdnName Remote identity. When FQDN is selected for RemoteIdentity, RemoteFqdnName is required.
     */
    public void setRemoteFqdnName(String RemoteFqdnName) {
        this.RemoteFqdnName = RemoteFqdnName;
    }

    /**
     * Get DH group. Specify the DH group used for exchanging the key via IKE. Available values: 'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', and 'GROUP24'. 
     * @return DhGroupName DH group. Specify the DH group used for exchanging the key via IKE. Available values: 'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', and 'GROUP24'.
     */
    public String getDhGroupName() {
        return this.DhGroupName;
    }

    /**
     * Set DH group. Specify the DH group used for exchanging the key via IKE. Available values: 'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', and 'GROUP24'.
     * @param DhGroupName DH group. Specify the DH group used for exchanging the key via IKE. Available values: 'GROUP1', 'GROUP2', 'GROUP5', 'GROUP14', and 'GROUP24'.
     */
    public void setDhGroupName(String DhGroupName) {
        this.DhGroupName = DhGroupName;
    }

    /**
     * Get IKE SA lifetime (in sec). Value range: 60-604800 
     * @return IKESaLifetimeSeconds IKE SA lifetime (in sec). Value range: 60-604800
     */
    public Long getIKESaLifetimeSeconds() {
        return this.IKESaLifetimeSeconds;
    }

    /**
     * Set IKE SA lifetime (in sec). Value range: 60-604800
     * @param IKESaLifetimeSeconds IKE SA lifetime (in sec). Value range: 60-604800
     */
    public void setIKESaLifetimeSeconds(Long IKESaLifetimeSeconds) {
        this.IKESaLifetimeSeconds = IKESaLifetimeSeconds;
    }

    /**
     * Get IKE version 
     * @return IKEVersion IKE version
     */
    public String getIKEVersion() {
        return this.IKEVersion;
    }

    /**
     * Set IKE version
     * @param IKEVersion IKE version
     */
    public void setIKEVersion(String IKEVersion) {
        this.IKEVersion = IKEVersion;
    }

    public IKEOptionsSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IKEOptionsSpecification(IKEOptionsSpecification source) {
        if (source.PropoEncryAlgorithm != null) {
            this.PropoEncryAlgorithm = new String(source.PropoEncryAlgorithm);
        }
        if (source.PropoAuthenAlgorithm != null) {
            this.PropoAuthenAlgorithm = new String(source.PropoAuthenAlgorithm);
        }
        if (source.ExchangeMode != null) {
            this.ExchangeMode = new String(source.ExchangeMode);
        }
        if (source.LocalIdentity != null) {
            this.LocalIdentity = new String(source.LocalIdentity);
        }
        if (source.RemoteIdentity != null) {
            this.RemoteIdentity = new String(source.RemoteIdentity);
        }
        if (source.LocalAddress != null) {
            this.LocalAddress = new String(source.LocalAddress);
        }
        if (source.RemoteAddress != null) {
            this.RemoteAddress = new String(source.RemoteAddress);
        }
        if (source.LocalFqdnName != null) {
            this.LocalFqdnName = new String(source.LocalFqdnName);
        }
        if (source.RemoteFqdnName != null) {
            this.RemoteFqdnName = new String(source.RemoteFqdnName);
        }
        if (source.DhGroupName != null) {
            this.DhGroupName = new String(source.DhGroupName);
        }
        if (source.IKESaLifetimeSeconds != null) {
            this.IKESaLifetimeSeconds = new Long(source.IKESaLifetimeSeconds);
        }
        if (source.IKEVersion != null) {
            this.IKEVersion = new String(source.IKEVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropoEncryAlgorithm", this.PropoEncryAlgorithm);
        this.setParamSimple(map, prefix + "PropoAuthenAlgorithm", this.PropoAuthenAlgorithm);
        this.setParamSimple(map, prefix + "ExchangeMode", this.ExchangeMode);
        this.setParamSimple(map, prefix + "LocalIdentity", this.LocalIdentity);
        this.setParamSimple(map, prefix + "RemoteIdentity", this.RemoteIdentity);
        this.setParamSimple(map, prefix + "LocalAddress", this.LocalAddress);
        this.setParamSimple(map, prefix + "RemoteAddress", this.RemoteAddress);
        this.setParamSimple(map, prefix + "LocalFqdnName", this.LocalFqdnName);
        this.setParamSimple(map, prefix + "RemoteFqdnName", this.RemoteFqdnName);
        this.setParamSimple(map, prefix + "DhGroupName", this.DhGroupName);
        this.setParamSimple(map, prefix + "IKESaLifetimeSeconds", this.IKESaLifetimeSeconds);
        this.setParamSimple(map, prefix + "IKEVersion", this.IKEVersion);

    }
}

