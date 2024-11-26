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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrReadableInfo extends AbstractModel {

    /**
    * Replica server status. Valid values: enable - running; disable - unavailable
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveStatus")
    @Expose
    private String SlaveStatus;

    /**
    * Replica server readable status. Valid values: enable - enabled; disable - disabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadableStatus")
    @Expose
    private String ReadableStatus;

    /**
    * Replica server read-only VIP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Replica server read-only port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Replica server VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Replica server VPC subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
     * Get Replica server status. Valid values: enable - running; disable - unavailable
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaveStatus Replica server status. Valid values: enable - running; disable - unavailable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSlaveStatus() {
        return this.SlaveStatus;
    }

    /**
     * Set Replica server status. Valid values: enable - running; disable - unavailable
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaveStatus Replica server status. Valid values: enable - running; disable - unavailable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaveStatus(String SlaveStatus) {
        this.SlaveStatus = SlaveStatus;
    }

    /**
     * Get Replica server readable status. Valid values: enable - enabled; disable - disabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReadableStatus Replica server readable status. Valid values: enable - enabled; disable - disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReadableStatus() {
        return this.ReadableStatus;
    }

    /**
     * Set Replica server readable status. Valid values: enable - enabled; disable - disabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReadableStatus Replica server readable status. Valid values: enable - enabled; disable - disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReadableStatus(String ReadableStatus) {
        this.ReadableStatus = ReadableStatus;
    }

    /**
     * Get Replica server read-only VIP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip Replica server read-only VIP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Replica server read-only VIP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip Replica server read-only VIP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Replica server read-only port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VPort Replica server read-only port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Replica server read-only port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VPort Replica server read-only port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Replica server VPC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqVpcId Replica server VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Replica server VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqVpcId Replica server VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Replica server VPC subnet ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqSubnetId Replica server VPC subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Replica server VPC subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqSubnetId Replica server VPC subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    public DrReadableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrReadableInfo(DrReadableInfo source) {
        if (source.SlaveStatus != null) {
            this.SlaveStatus = new String(source.SlaveStatus);
        }
        if (source.ReadableStatus != null) {
            this.ReadableStatus = new String(source.ReadableStatus);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SlaveStatus", this.SlaveStatus);
        this.setParamSimple(map, prefix + "ReadableStatus", this.ReadableStatus);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);

    }
}

