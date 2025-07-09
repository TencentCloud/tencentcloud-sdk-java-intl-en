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

public class IPSECOptionsSpecification extends AbstractModel {

    /**
    * Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBC-192`, `AES-CBC-256`, `DES-CBC`, `SM4`, and `NULL`; default value: `AES-CBC-128`.
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `SHA1`.
    */
    @SerializedName("IntegrityAlgorith")
    @Expose
    private String IntegrityAlgorith;

    /**
    * IPsec SA lifetime (in sec). Value range: 180-604800
    */
    @SerializedName("IPSECSaLifetimeSeconds")
    @Expose
    private Long IPSECSaLifetimeSeconds;

    /**
    * PFS. Available value: 'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', and 'DH-GROUP24'. Default is NULL.
    */
    @SerializedName("PfsDhGroup")
    @Expose
    private String PfsDhGroup;

    /**
    * IPsec SA lifetime (in KB). Value range: 2560-604800
    */
    @SerializedName("IPSECSaLifetimeTraffic")
    @Expose
    private Long IPSECSaLifetimeTraffic;

    /**
     * Get Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBC-192`, `AES-CBC-256`, `DES-CBC`, `SM4`, and `NULL`; default value: `AES-CBC-128`. 
     * @return EncryptAlgorithm Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBC-192`, `AES-CBC-256`, `DES-CBC`, `SM4`, and `NULL`; default value: `AES-CBC-128`.
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBC-192`, `AES-CBC-256`, `DES-CBC`, `SM4`, and `NULL`; default value: `AES-CBC-128`.
     * @param EncryptAlgorithm Encryption algorithm. Valid values: `3DES-CBC`, `AES-CBC-128`, `AES-CBC-192`, `AES-CBC-256`, `DES-CBC`, `SM4`, and `NULL`; default value: `AES-CBC-128`.
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `SHA1`. 
     * @return IntegrityAlgorith Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `SHA1`.
     * @deprecated
     */
    @Deprecated
    public String getIntegrityAlgorith() {
        return this.IntegrityAlgorith;
    }

    /**
     * Set Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `SHA1`.
     * @param IntegrityAlgorith Authentication algorithm. Valid values: `MD5`, `SHA1` and `SHA-256`; default value: `SHA1`.
     * @deprecated
     */
    @Deprecated
    public void setIntegrityAlgorith(String IntegrityAlgorith) {
        this.IntegrityAlgorith = IntegrityAlgorith;
    }

    /**
     * Get IPsec SA lifetime (in sec). Value range: 180-604800 
     * @return IPSECSaLifetimeSeconds IPsec SA lifetime (in sec). Value range: 180-604800
     */
    public Long getIPSECSaLifetimeSeconds() {
        return this.IPSECSaLifetimeSeconds;
    }

    /**
     * Set IPsec SA lifetime (in sec). Value range: 180-604800
     * @param IPSECSaLifetimeSeconds IPsec SA lifetime (in sec). Value range: 180-604800
     */
    public void setIPSECSaLifetimeSeconds(Long IPSECSaLifetimeSeconds) {
        this.IPSECSaLifetimeSeconds = IPSECSaLifetimeSeconds;
    }

    /**
     * Get PFS. Available value: 'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', and 'DH-GROUP24'. Default is NULL. 
     * @return PfsDhGroup PFS. Available value: 'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', and 'DH-GROUP24'. Default is NULL.
     */
    public String getPfsDhGroup() {
        return this.PfsDhGroup;
    }

    /**
     * Set PFS. Available value: 'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', and 'DH-GROUP24'. Default is NULL.
     * @param PfsDhGroup PFS. Available value: 'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', and 'DH-GROUP24'. Default is NULL.
     */
    public void setPfsDhGroup(String PfsDhGroup) {
        this.PfsDhGroup = PfsDhGroup;
    }

    /**
     * Get IPsec SA lifetime (in KB). Value range: 2560-604800 
     * @return IPSECSaLifetimeTraffic IPsec SA lifetime (in KB). Value range: 2560-604800
     */
    public Long getIPSECSaLifetimeTraffic() {
        return this.IPSECSaLifetimeTraffic;
    }

    /**
     * Set IPsec SA lifetime (in KB). Value range: 2560-604800
     * @param IPSECSaLifetimeTraffic IPsec SA lifetime (in KB). Value range: 2560-604800
     */
    public void setIPSECSaLifetimeTraffic(Long IPSECSaLifetimeTraffic) {
        this.IPSECSaLifetimeTraffic = IPSECSaLifetimeTraffic;
    }

    public IPSECOptionsSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPSECOptionsSpecification(IPSECOptionsSpecification source) {
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.IntegrityAlgorith != null) {
            this.IntegrityAlgorith = new String(source.IntegrityAlgorith);
        }
        if (source.IPSECSaLifetimeSeconds != null) {
            this.IPSECSaLifetimeSeconds = new Long(source.IPSECSaLifetimeSeconds);
        }
        if (source.PfsDhGroup != null) {
            this.PfsDhGroup = new String(source.PfsDhGroup);
        }
        if (source.IPSECSaLifetimeTraffic != null) {
            this.IPSECSaLifetimeTraffic = new Long(source.IPSECSaLifetimeTraffic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamSimple(map, prefix + "IntegrityAlgorith", this.IntegrityAlgorith);
        this.setParamSimple(map, prefix + "IPSECSaLifetimeSeconds", this.IPSECSaLifetimeSeconds);
        this.setParamSimple(map, prefix + "PfsDhGroup", this.PfsDhGroup);
        this.setParamSimple(map, prefix + "IPSECSaLifetimeTraffic", this.IPSECSaLifetimeTraffic);

    }
}

