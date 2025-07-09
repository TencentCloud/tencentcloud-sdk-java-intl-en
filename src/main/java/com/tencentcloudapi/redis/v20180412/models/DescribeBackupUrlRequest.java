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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupUrlRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup ID, which can be obtained through the `RedisBackupSet` parameter returned by the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API.
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * Limit type of the network from which you can download backup files. If this parameter is not configured, the user-defined configuration will be used.
- NoLimit: There is no limit. Backup files can be downloaded from both Tencent Cloud private and public networks.
- LimitOnlyIntranet: Backup files can be downloaded 
 only from the private IP address automatically assigned by Tencent Cloud.
- Customize: Backup files can be downloaded from the user-defined VPC.
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
    * Whether backup files can be downloaded from the custom IP address specified by LimitIp.
- In: yes. This is the default value.
- NotIn: no.
    */
    @SerializedName("IpComparisonSymbol")
    @Expose
    private String IpComparisonSymbol;

    /**
    * VPC ID of the custom backup file download address, which is required if `LimitType` is `Customize`.
    */
    @SerializedName("LimitVpc")
    @Expose
    private BackupLimitVpcItem [] LimitVpc;

    /**
    * VPC IP of the custom backup file download address, which is required if `LimitType` is `Customize`.
    */
    @SerializedName("LimitIp")
    @Expose
    private String [] LimitIp;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup ID, which can be obtained through the `RedisBackupSet` parameter returned by the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API. 
     * @return BackupId Backup ID, which can be obtained through the `RedisBackupSet` parameter returned by the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API.
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup ID, which can be obtained through the `RedisBackupSet` parameter returned by the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API.
     * @param BackupId Backup ID, which can be obtained through the `RedisBackupSet` parameter returned by the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API.
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Limit type of the network from which you can download backup files. If this parameter is not configured, the user-defined configuration will be used.
- NoLimit: There is no limit. Backup files can be downloaded from both Tencent Cloud private and public networks.
- LimitOnlyIntranet: Backup files can be downloaded 
 only from the private IP address automatically assigned by Tencent Cloud.
- Customize: Backup files can be downloaded from the user-defined VPC. 
     * @return LimitType Limit type of the network from which you can download backup files. If this parameter is not configured, the user-defined configuration will be used.
- NoLimit: There is no limit. Backup files can be downloaded from both Tencent Cloud private and public networks.
- LimitOnlyIntranet: Backup files can be downloaded 
 only from the private IP address automatically assigned by Tencent Cloud.
- Customize: Backup files can be downloaded from the user-defined VPC.
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set Limit type of the network from which you can download backup files. If this parameter is not configured, the user-defined configuration will be used.
- NoLimit: There is no limit. Backup files can be downloaded from both Tencent Cloud private and public networks.
- LimitOnlyIntranet: Backup files can be downloaded 
 only from the private IP address automatically assigned by Tencent Cloud.
- Customize: Backup files can be downloaded from the user-defined VPC.
     * @param LimitType Limit type of the network from which you can download backup files. If this parameter is not configured, the user-defined configuration will be used.
- NoLimit: There is no limit. Backup files can be downloaded from both Tencent Cloud private and public networks.
- LimitOnlyIntranet: Backup files can be downloaded 
 only from the private IP address automatically assigned by Tencent Cloud.
- Customize: Backup files can be downloaded from the user-defined VPC.
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
     * Get Whether backup files can be downloaded from the custom IP address specified by LimitIp.
- In: yes. This is the default value.
- NotIn: no. 
     * @return IpComparisonSymbol Whether backup files can be downloaded from the custom IP address specified by LimitIp.
- In: yes. This is the default value.
- NotIn: no.
     */
    public String getIpComparisonSymbol() {
        return this.IpComparisonSymbol;
    }

    /**
     * Set Whether backup files can be downloaded from the custom IP address specified by LimitIp.
- In: yes. This is the default value.
- NotIn: no.
     * @param IpComparisonSymbol Whether backup files can be downloaded from the custom IP address specified by LimitIp.
- In: yes. This is the default value.
- NotIn: no.
     */
    public void setIpComparisonSymbol(String IpComparisonSymbol) {
        this.IpComparisonSymbol = IpComparisonSymbol;
    }

    /**
     * Get VPC ID of the custom backup file download address, which is required if `LimitType` is `Customize`. 
     * @return LimitVpc VPC ID of the custom backup file download address, which is required if `LimitType` is `Customize`.
     */
    public BackupLimitVpcItem [] getLimitVpc() {
        return this.LimitVpc;
    }

    /**
     * Set VPC ID of the custom backup file download address, which is required if `LimitType` is `Customize`.
     * @param LimitVpc VPC ID of the custom backup file download address, which is required if `LimitType` is `Customize`.
     */
    public void setLimitVpc(BackupLimitVpcItem [] LimitVpc) {
        this.LimitVpc = LimitVpc;
    }

    /**
     * Get VPC IP of the custom backup file download address, which is required if `LimitType` is `Customize`. 
     * @return LimitIp VPC IP of the custom backup file download address, which is required if `LimitType` is `Customize`.
     */
    public String [] getLimitIp() {
        return this.LimitIp;
    }

    /**
     * Set VPC IP of the custom backup file download address, which is required if `LimitType` is `Customize`.
     * @param LimitIp VPC IP of the custom backup file download address, which is required if `LimitType` is `Customize`.
     */
    public void setLimitIp(String [] LimitIp) {
        this.LimitIp = LimitIp;
    }

    public DescribeBackupUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupUrlRequest(DescribeBackupUrlRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);
        this.setParamSimple(map, prefix + "VpcComparisonSymbol", this.VpcComparisonSymbol);
        this.setParamSimple(map, prefix + "IpComparisonSymbol", this.IpComparisonSymbol);
        this.setParamArrayObj(map, prefix + "LimitVpc.", this.LimitVpc);
        this.setParamArraySimple(map, prefix + "LimitIp.", this.LimitIp);

    }
}

