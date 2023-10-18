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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupDownloadRestrictionRequest extends AbstractModel {

    /**
    * Valid values: `NoLimit` (backups can be downloaded over both private and public networks with any IPs), `LimitOnlyIntranet` (backups can be downloaded over the private network with any private IPs), `Customize` (backups can be downloaded over specified VPCs with specified IPs). The `LimitVpc` and `LimitIp` parameters are valid only when this parameter is set to `Customize`.
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
    * Valid value: `In` (backups can only be downloaded over the VPCs specified in `LimitVpc`). Default value: `In`.
    */
    @SerializedName("VpcComparisonSymbol")
    @Expose
    private String VpcComparisonSymbol;

    /**
    * Valid values: `In` (backups can only be downloaded with the IPs specified in `LimitIp`), `NotIn` (backups cannot be downloaded with the IPs specified in `LimitIp`). Default value: `In`.
    */
    @SerializedName("IpComparisonSymbol")
    @Expose
    private String IpComparisonSymbol;

    /**
    * VPCs used to restrict backup download.
    */
    @SerializedName("LimitVpc")
    @Expose
    private BackupLimitVpcItem [] LimitVpc;

    /**
    * IPs used to restrict backup download.
    */
    @SerializedName("LimitIp")
    @Expose
    private String [] LimitIp;

    /**
     * Get Valid values: `NoLimit` (backups can be downloaded over both private and public networks with any IPs), `LimitOnlyIntranet` (backups can be downloaded over the private network with any private IPs), `Customize` (backups can be downloaded over specified VPCs with specified IPs). The `LimitVpc` and `LimitIp` parameters are valid only when this parameter is set to `Customize`. 
     * @return LimitType Valid values: `NoLimit` (backups can be downloaded over both private and public networks with any IPs), `LimitOnlyIntranet` (backups can be downloaded over the private network with any private IPs), `Customize` (backups can be downloaded over specified VPCs with specified IPs). The `LimitVpc` and `LimitIp` parameters are valid only when this parameter is set to `Customize`.
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set Valid values: `NoLimit` (backups can be downloaded over both private and public networks with any IPs), `LimitOnlyIntranet` (backups can be downloaded over the private network with any private IPs), `Customize` (backups can be downloaded over specified VPCs with specified IPs). The `LimitVpc` and `LimitIp` parameters are valid only when this parameter is set to `Customize`.
     * @param LimitType Valid values: `NoLimit` (backups can be downloaded over both private and public networks with any IPs), `LimitOnlyIntranet` (backups can be downloaded over the private network with any private IPs), `Customize` (backups can be downloaded over specified VPCs with specified IPs). The `LimitVpc` and `LimitIp` parameters are valid only when this parameter is set to `Customize`.
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    /**
     * Get Valid value: `In` (backups can only be downloaded over the VPCs specified in `LimitVpc`). Default value: `In`. 
     * @return VpcComparisonSymbol Valid value: `In` (backups can only be downloaded over the VPCs specified in `LimitVpc`). Default value: `In`.
     */
    public String getVpcComparisonSymbol() {
        return this.VpcComparisonSymbol;
    }

    /**
     * Set Valid value: `In` (backups can only be downloaded over the VPCs specified in `LimitVpc`). Default value: `In`.
     * @param VpcComparisonSymbol Valid value: `In` (backups can only be downloaded over the VPCs specified in `LimitVpc`). Default value: `In`.
     */
    public void setVpcComparisonSymbol(String VpcComparisonSymbol) {
        this.VpcComparisonSymbol = VpcComparisonSymbol;
    }

    /**
     * Get Valid values: `In` (backups can only be downloaded with the IPs specified in `LimitIp`), `NotIn` (backups cannot be downloaded with the IPs specified in `LimitIp`). Default value: `In`. 
     * @return IpComparisonSymbol Valid values: `In` (backups can only be downloaded with the IPs specified in `LimitIp`), `NotIn` (backups cannot be downloaded with the IPs specified in `LimitIp`). Default value: `In`.
     */
    public String getIpComparisonSymbol() {
        return this.IpComparisonSymbol;
    }

    /**
     * Set Valid values: `In` (backups can only be downloaded with the IPs specified in `LimitIp`), `NotIn` (backups cannot be downloaded with the IPs specified in `LimitIp`). Default value: `In`.
     * @param IpComparisonSymbol Valid values: `In` (backups can only be downloaded with the IPs specified in `LimitIp`), `NotIn` (backups cannot be downloaded with the IPs specified in `LimitIp`). Default value: `In`.
     */
    public void setIpComparisonSymbol(String IpComparisonSymbol) {
        this.IpComparisonSymbol = IpComparisonSymbol;
    }

    /**
     * Get VPCs used to restrict backup download. 
     * @return LimitVpc VPCs used to restrict backup download.
     */
    public BackupLimitVpcItem [] getLimitVpc() {
        return this.LimitVpc;
    }

    /**
     * Set VPCs used to restrict backup download.
     * @param LimitVpc VPCs used to restrict backup download.
     */
    public void setLimitVpc(BackupLimitVpcItem [] LimitVpc) {
        this.LimitVpc = LimitVpc;
    }

    /**
     * Get IPs used to restrict backup download. 
     * @return LimitIp IPs used to restrict backup download.
     */
    public String [] getLimitIp() {
        return this.LimitIp;
    }

    /**
     * Set IPs used to restrict backup download.
     * @param LimitIp IPs used to restrict backup download.
     */
    public void setLimitIp(String [] LimitIp) {
        this.LimitIp = LimitIp;
    }

    public ModifyBackupDownloadRestrictionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupDownloadRestrictionRequest(ModifyBackupDownloadRestrictionRequest source) {
        if (source.LimitType != null) {
            this.LimitType = new String(source.LimitType);
        }
        if (source.VpcComparisonSymbol != null) {
            this.VpcComparisonSymbol = new String(source.VpcComparisonSymbol);
        }
        if (source.IpComparisonSymbol != null) {
            this.IpComparisonSymbol = new String(source.IpComparisonSymbol);
        }
        if (source.LimitVpc != null) {
            this.LimitVpc = new BackupLimitVpcItem[source.LimitVpc.length];
            for (int i = 0; i < source.LimitVpc.length; i++) {
                this.LimitVpc[i] = new BackupLimitVpcItem(source.LimitVpc[i]);
            }
        }
        if (source.LimitIp != null) {
            this.LimitIp = new String[source.LimitIp.length];
            for (int i = 0; i < source.LimitIp.length; i++) {
                this.LimitIp[i] = new String(source.LimitIp[i]);
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
        this.setParamArrayObj(map, prefix + "LimitVpc.", this.LimitVpc);
        this.setParamArraySimple(map, prefix + "LimitIp.", this.LimitIp);

    }
}

