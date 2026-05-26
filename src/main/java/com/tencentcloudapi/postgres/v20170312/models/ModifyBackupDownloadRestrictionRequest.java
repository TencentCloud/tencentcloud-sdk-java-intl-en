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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupDownloadRestrictionRequest extends AbstractModel {

    /**
    * Backup file download restriction type. valid values: NONE (unlimited, allows download from both private and public networks), INTRANET (only allows private network download), CUSTOMIZE (custom limits for download by vpc or ip). when the parameter value is CUSTOMIZE, at least one item must be filled in for vpc restriction and ip restriction.
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
    * Specifies the vpc id list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
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
    * Specifies the ip list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
    */
    @SerializedName("IpSet")
    @Expose
    private String [] IpSet;

    /**
     * Get Backup file download restriction type. valid values: NONE (unlimited, allows download from both private and public networks), INTRANET (only allows private network download), CUSTOMIZE (custom limits for download by vpc or ip). when the parameter value is CUSTOMIZE, at least one item must be filled in for vpc restriction and ip restriction. 
     * @return RestrictionType Backup file download restriction type. valid values: NONE (unlimited, allows download from both private and public networks), INTRANET (only allows private network download), CUSTOMIZE (custom limits for download by vpc or ip). when the parameter value is CUSTOMIZE, at least one item must be filled in for vpc restriction and ip restriction.
     */
    public String getRestrictionType() {
        return this.RestrictionType;
    }

    /**
     * Set Backup file download restriction type. valid values: NONE (unlimited, allows download from both private and public networks), INTRANET (only allows private network download), CUSTOMIZE (custom limits for download by vpc or ip). when the parameter value is CUSTOMIZE, at least one item must be filled in for vpc restriction and ip restriction.
     * @param RestrictionType Backup file download restriction type. valid values: NONE (unlimited, allows download from both private and public networks), INTRANET (only allows private network download), CUSTOMIZE (custom limits for download by vpc or ip). when the parameter value is CUSTOMIZE, at least one item must be filled in for vpc restriction and ip restriction.
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
     * Get Specifies the vpc id list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections. 
     * @return VpcIdSet Specifies the vpc id list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     */
    public String [] getVpcIdSet() {
        return this.VpcIdSet;
    }

    /**
     * Set Specifies the vpc id list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     * @param VpcIdSet Specifies the vpc id list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
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
     * Get Specifies the ip list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections. 
     * @return IpSet Specifies the ip list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     */
    public String [] getIpSet() {
        return this.IpSet;
    }

    /**
     * Set Specifies the ip list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     * @param IpSet Specifies the ip list to allow or deny downloading backup files.
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
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

