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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupDownloadRestrictionRequest extends AbstractModel{

    /**
    * Type of the network restrictions for downloading a backup file. Valid values: `NONE` (backups can be downloaded over both private and public networks), `INTRANET` (backups can only be downloaded over the private network), `CUSTOMIZE` (backups can be downloaded over specified VPCs or at specified IPs).
    */
    @SerializedName("RestrictionType")
    @Expose
    private String RestrictionType;

    /**
    * Whether VPC is allowed. Valid values: `ALLOW` (allow), `DENY` (deny).
    */
    @SerializedName("VpcRestrictionEffect")
    @Expose
    private String VpcRestrictionEffect;

    /**
    * Whether it is allowed to download the VPC ID list of the backup files.
    */
    @SerializedName("VpcIdSet")
    @Expose
    private String [] VpcIdSet;

    /**
    * Whether IP is allowed. Valid values: `ALLOW` (allow), `DENY` (deny).
    */
    @SerializedName("IpRestrictionEffect")
    @Expose
    private String IpRestrictionEffect;

    /**
    * Whether it is allowed to download the IP list of the backup files.
    */
    @SerializedName("IpSet")
    @Expose
    private String [] IpSet;

    /**
     * Get Type of the network restrictions for downloading a backup file. Valid values: `NONE` (backups can be downloaded over both private and public networks), `INTRANET` (backups can only be downloaded over the private network), `CUSTOMIZE` (backups can be downloaded over specified VPCs or at specified IPs). 
     * @return RestrictionType Type of the network restrictions for downloading a backup file. Valid values: `NONE` (backups can be downloaded over both private and public networks), `INTRANET` (backups can only be downloaded over the private network), `CUSTOMIZE` (backups can be downloaded over specified VPCs or at specified IPs).
     */
    public String getRestrictionType() {
        return this.RestrictionType;
    }

    /**
     * Set Type of the network restrictions for downloading a backup file. Valid values: `NONE` (backups can be downloaded over both private and public networks), `INTRANET` (backups can only be downloaded over the private network), `CUSTOMIZE` (backups can be downloaded over specified VPCs or at specified IPs).
     * @param RestrictionType Type of the network restrictions for downloading a backup file. Valid values: `NONE` (backups can be downloaded over both private and public networks), `INTRANET` (backups can only be downloaded over the private network), `CUSTOMIZE` (backups can be downloaded over specified VPCs or at specified IPs).
     */
    public void setRestrictionType(String RestrictionType) {
        this.RestrictionType = RestrictionType;
    }

    /**
     * Get Whether VPC is allowed. Valid values: `ALLOW` (allow), `DENY` (deny). 
     * @return VpcRestrictionEffect Whether VPC is allowed. Valid values: `ALLOW` (allow), `DENY` (deny).
     */
    public String getVpcRestrictionEffect() {
        return this.VpcRestrictionEffect;
    }

    /**
     * Set Whether VPC is allowed. Valid values: `ALLOW` (allow), `DENY` (deny).
     * @param VpcRestrictionEffect Whether VPC is allowed. Valid values: `ALLOW` (allow), `DENY` (deny).
     */
    public void setVpcRestrictionEffect(String VpcRestrictionEffect) {
        this.VpcRestrictionEffect = VpcRestrictionEffect;
    }

    /**
     * Get Whether it is allowed to download the VPC ID list of the backup files. 
     * @return VpcIdSet Whether it is allowed to download the VPC ID list of the backup files.
     */
    public String [] getVpcIdSet() {
        return this.VpcIdSet;
    }

    /**
     * Set Whether it is allowed to download the VPC ID list of the backup files.
     * @param VpcIdSet Whether it is allowed to download the VPC ID list of the backup files.
     */
    public void setVpcIdSet(String [] VpcIdSet) {
        this.VpcIdSet = VpcIdSet;
    }

    /**
     * Get Whether IP is allowed. Valid values: `ALLOW` (allow), `DENY` (deny). 
     * @return IpRestrictionEffect Whether IP is allowed. Valid values: `ALLOW` (allow), `DENY` (deny).
     */
    public String getIpRestrictionEffect() {
        return this.IpRestrictionEffect;
    }

    /**
     * Set Whether IP is allowed. Valid values: `ALLOW` (allow), `DENY` (deny).
     * @param IpRestrictionEffect Whether IP is allowed. Valid values: `ALLOW` (allow), `DENY` (deny).
     */
    public void setIpRestrictionEffect(String IpRestrictionEffect) {
        this.IpRestrictionEffect = IpRestrictionEffect;
    }

    /**
     * Get Whether it is allowed to download the IP list of the backup files. 
     * @return IpSet Whether it is allowed to download the IP list of the backup files.
     */
    public String [] getIpSet() {
        return this.IpSet;
    }

    /**
     * Set Whether it is allowed to download the IP list of the backup files.
     * @param IpSet Whether it is allowed to download the IP list of the backup files.
     */
    public void setIpSet(String [] IpSet) {
        this.IpSet = IpSet;
    }

    public ModifyBackupDownloadRestrictionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupDownloadRestrictionRequest(ModifyBackupDownloadRestrictionRequest source) {
        if (source.RestrictionType != null) {
            this.RestrictionType = new String(source.RestrictionType);
        }
        if (source.VpcRestrictionEffect != null) {
            this.VpcRestrictionEffect = new String(source.VpcRestrictionEffect);
        }
        if (source.VpcIdSet != null) {
            this.VpcIdSet = new String[source.VpcIdSet.length];
            for (int i = 0; i < source.VpcIdSet.length; i++) {
                this.VpcIdSet[i] = new String(source.VpcIdSet[i]);
            }
        }
        if (source.IpRestrictionEffect != null) {
            this.IpRestrictionEffect = new String(source.IpRestrictionEffect);
        }
        if (source.IpSet != null) {
            this.IpSet = new String[source.IpSet.length];
            for (int i = 0; i < source.IpSet.length; i++) {
                this.IpSet[i] = new String(source.IpSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RestrictionType", this.RestrictionType);
        this.setParamSimple(map, prefix + "VpcRestrictionEffect", this.VpcRestrictionEffect);
        this.setParamArraySimple(map, prefix + "VpcIdSet.", this.VpcIdSet);
        this.setParamSimple(map, prefix + "IpRestrictionEffect", this.IpRestrictionEffect);
        this.setParamArraySimple(map, prefix + "IpSet.", this.IpSet);

    }
}

