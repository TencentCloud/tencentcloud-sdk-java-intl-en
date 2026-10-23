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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupDownloadUserRestrictionRequest extends AbstractModel {

    /**
    * Download limit type. NoLimit: unlimited. LimitOnlyIntranet: restricted to private network. Customize: custom.
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
    * This parameter only supports In, which means the vpc specified by LimitVpc can be downloaded. The default is In.
    */
    @SerializedName("VpcComparisonSymbol")
    @Expose
    private String VpcComparisonSymbol;

    /**
    * In: download allowed for the specified ip; NotIn: download not allowed for the specified ip
    */
    @SerializedName("IpComparisonSymbol")
    @Expose
    private String IpComparisonSymbol;

    /**
    * vpc settings for download restriction
    */
    @SerializedName("LimitVpcs")
    @Expose
    private BackupLimitVpcItem [] LimitVpcs;

    /**
    * ip settings for download restrictions
    */
    @SerializedName("LimitIps")
    @Expose
    private String [] LimitIps;

    /**
     * Get Download limit type. NoLimit: unlimited. LimitOnlyIntranet: restricted to private network. Customize: custom. 
     * @return LimitType Download limit type. NoLimit: unlimited. LimitOnlyIntranet: restricted to private network. Customize: custom.
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set Download limit type. NoLimit: unlimited. LimitOnlyIntranet: restricted to private network. Customize: custom.
     * @param LimitType Download limit type. NoLimit: unlimited. LimitOnlyIntranet: restricted to private network. Customize: custom.
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    /**
     * Get This parameter only supports In, which means the vpc specified by LimitVpc can be downloaded. The default is In. 
     * @return VpcComparisonSymbol This parameter only supports In, which means the vpc specified by LimitVpc can be downloaded. The default is In.
     */
    public String getVpcComparisonSymbol() {
        return this.VpcComparisonSymbol;
    }

    /**
     * Set This parameter only supports In, which means the vpc specified by LimitVpc can be downloaded. The default is In.
     * @param VpcComparisonSymbol This parameter only supports In, which means the vpc specified by LimitVpc can be downloaded. The default is In.
     */
    public void setVpcComparisonSymbol(String VpcComparisonSymbol) {
        this.VpcComparisonSymbol = VpcComparisonSymbol;
    }

    /**
     * Get In: download allowed for the specified ip; NotIn: download not allowed for the specified ip 
     * @return IpComparisonSymbol In: download allowed for the specified ip; NotIn: download not allowed for the specified ip
     */
    public String getIpComparisonSymbol() {
        return this.IpComparisonSymbol;
    }

    /**
     * Set In: download allowed for the specified ip; NotIn: download not allowed for the specified ip
     * @param IpComparisonSymbol In: download allowed for the specified ip; NotIn: download not allowed for the specified ip
     */
    public void setIpComparisonSymbol(String IpComparisonSymbol) {
        this.IpComparisonSymbol = IpComparisonSymbol;
    }

    /**
     * Get vpc settings for download restriction 
     * @return LimitVpcs vpc settings for download restriction
     */
    public BackupLimitVpcItem [] getLimitVpcs() {
        return this.LimitVpcs;
    }

    /**
     * Set vpc settings for download restriction
     * @param LimitVpcs vpc settings for download restriction
     */
    public void setLimitVpcs(BackupLimitVpcItem [] LimitVpcs) {
        this.LimitVpcs = LimitVpcs;
    }

    /**
     * Get ip settings for download restrictions 
     * @return LimitIps ip settings for download restrictions
     */
    public String [] getLimitIps() {
        return this.LimitIps;
    }

    /**
     * Set ip settings for download restrictions
     * @param LimitIps ip settings for download restrictions
     */
    public void setLimitIps(String [] LimitIps) {
        this.LimitIps = LimitIps;
    }

    public ModifyBackupDownloadUserRestrictionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupDownloadUserRestrictionRequest(ModifyBackupDownloadUserRestrictionRequest source) {
        if (source.LimitType != null) {
            this.LimitType = new String(source.LimitType);
        }
        if (source.VpcComparisonSymbol != null) {
            this.VpcComparisonSymbol = new String(source.VpcComparisonSymbol);
        }
        if (source.IpComparisonSymbol != null) {
            this.IpComparisonSymbol = new String(source.IpComparisonSymbol);
        }
        if (source.LimitVpcs != null) {
            this.LimitVpcs = new BackupLimitVpcItem[source.LimitVpcs.length];
            for (int i = 0; i < source.LimitVpcs.length; i++) {
                this.LimitVpcs[i] = new BackupLimitVpcItem(source.LimitVpcs[i]);
            }
        }
        if (source.LimitIps != null) {
            this.LimitIps = new String[source.LimitIps.length];
            for (int i = 0; i < source.LimitIps.length; i++) {
                this.LimitIps[i] = new String(source.LimitIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);
        this.setParamSimple(map, prefix + "VpcComparisonSymbol", this.VpcComparisonSymbol);
        this.setParamSimple(map, prefix + "IpComparisonSymbol", this.IpComparisonSymbol);
        this.setParamArrayObj(map, prefix + "LimitVpcs.", this.LimitVpcs);
        this.setParamArraySimple(map, prefix + "LimitIps.", this.LimitIps);

    }
}

