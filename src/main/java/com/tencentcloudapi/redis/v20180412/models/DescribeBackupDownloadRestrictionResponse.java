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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDownloadRestrictionResponse extends AbstractModel {

    /**
    * Type of the network restrictions for downloading backup files. Valid values:

- `NoLimit`: Backup files can be downloaded over both public and private networks.
- `LimitOnlyIntranet`: Backup files can be downloaded only at private network addresses auto-assigned by Tencent Cloud.
- `Customize`: Backup files can be downloaded only in the customized VPC.
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
    * Only `In` can be passed in for this parameter, indicating that backup files can be downloaded in the custom `LimitVpc`.
    */
    @SerializedName("VpcComparisonSymbol")
    @Expose
    private String VpcComparisonSymbol;

    /**
    * Whether backups can be downloaded at the custom `LimitIp` address.

- `In`: Download is allowed for the custom IP.
- `NotIn`: Download is not allowed for the custom IP.
    */
    @SerializedName("IpComparisonSymbol")
    @Expose
    private String IpComparisonSymbol;

    /**
    * VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`.
    */
    @SerializedName("LimitVpc")
    @Expose
    private BackupLimitVpcItem [] LimitVpc;

    /**
    * VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`.
    */
    @SerializedName("LimitIp")
    @Expose
    private String [] LimitIp;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Type of the network restrictions for downloading backup files. Valid values:

- `NoLimit`: Backup files can be downloaded over both public and private networks.
- `LimitOnlyIntranet`: Backup files can be downloaded only at private network addresses auto-assigned by Tencent Cloud.
- `Customize`: Backup files can be downloaded only in the customized VPC. 
     * @return LimitType Type of the network restrictions for downloading backup files. Valid values:

- `NoLimit`: Backup files can be downloaded over both public and private networks.
- `LimitOnlyIntranet`: Backup files can be downloaded only at private network addresses auto-assigned by Tencent Cloud.
- `Customize`: Backup files can be downloaded only in the customized VPC.
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set Type of the network restrictions for downloading backup files. Valid values:

- `NoLimit`: Backup files can be downloaded over both public and private networks.
- `LimitOnlyIntranet`: Backup files can be downloaded only at private network addresses auto-assigned by Tencent Cloud.
- `Customize`: Backup files can be downloaded only in the customized VPC.
     * @param LimitType Type of the network restrictions for downloading backup files. Valid values:

- `NoLimit`: Backup files can be downloaded over both public and private networks.
- `LimitOnlyIntranet`: Backup files can be downloaded only at private network addresses auto-assigned by Tencent Cloud.
- `Customize`: Backup files can be downloaded only in the customized VPC.
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    /**
     * Get Only `In` can be passed in for this parameter, indicating that backup files can be downloaded in the custom `LimitVpc`. 
     * @return VpcComparisonSymbol Only `In` can be passed in for this parameter, indicating that backup files can be downloaded in the custom `LimitVpc`.
     */
    public String getVpcComparisonSymbol() {
        return this.VpcComparisonSymbol;
    }

    /**
     * Set Only `In` can be passed in for this parameter, indicating that backup files can be downloaded in the custom `LimitVpc`.
     * @param VpcComparisonSymbol Only `In` can be passed in for this parameter, indicating that backup files can be downloaded in the custom `LimitVpc`.
     */
    public void setVpcComparisonSymbol(String VpcComparisonSymbol) {
        this.VpcComparisonSymbol = VpcComparisonSymbol;
    }

    /**
     * Get Whether backups can be downloaded at the custom `LimitIp` address.

- `In`: Download is allowed for the custom IP.
- `NotIn`: Download is not allowed for the custom IP. 
     * @return IpComparisonSymbol Whether backups can be downloaded at the custom `LimitIp` address.

- `In`: Download is allowed for the custom IP.
- `NotIn`: Download is not allowed for the custom IP.
     */
    public String getIpComparisonSymbol() {
        return this.IpComparisonSymbol;
    }

    /**
     * Set Whether backups can be downloaded at the custom `LimitIp` address.

- `In`: Download is allowed for the custom IP.
- `NotIn`: Download is not allowed for the custom IP.
     * @param IpComparisonSymbol Whether backups can be downloaded at the custom `LimitIp` address.

- `In`: Download is allowed for the custom IP.
- `NotIn`: Download is not allowed for the custom IP.
     */
    public void setIpComparisonSymbol(String IpComparisonSymbol) {
        this.IpComparisonSymbol = IpComparisonSymbol;
    }

    /**
     * Get VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`. 
     * @return LimitVpc VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`.
     */
    public BackupLimitVpcItem [] getLimitVpc() {
        return this.LimitVpc;
    }

    /**
     * Set VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`.
     * @param LimitVpc VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`.
     */
    public void setLimitVpc(BackupLimitVpcItem [] LimitVpc) {
        this.LimitVpc = LimitVpc;
    }

    /**
     * Get VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`. 
     * @return LimitIp VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`.
     */
    public String [] getLimitIp() {
        return this.LimitIp;
    }

    /**
     * Set VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`.
     * @param LimitIp VPC ID of the custom backup file download address, which will be displayed if `LimitType` is `Customize`.
     */
    public void setLimitIp(String [] LimitIp) {
        this.LimitIp = LimitIp;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupDownloadRestrictionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDownloadRestrictionResponse(DescribeBackupDownloadRestrictionResponse source) {
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

