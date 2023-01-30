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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentDaemonSetCmdRequest extends AbstractModel{

    /**
    * Whether it is from Tencent Cloud
    */
    @SerializedName("IsCloud")
    @Expose
    private Boolean IsCloud;

    /**
    * Network type. Valid values: `basic` (classic network); `private` (VPC); `public` (public network); `direct` (Direct Connect).
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Region, which is required when `NetType` is `direct`.
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * VpcId, which is required when `NetType` is `direct`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Command validity, which is required for non-Tencent Cloud instances.
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
     * Get Whether it is from Tencent Cloud 
     * @return IsCloud Whether it is from Tencent Cloud
     */
    public Boolean getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set Whether it is from Tencent Cloud
     * @param IsCloud Whether it is from Tencent Cloud
     */
    public void setIsCloud(Boolean IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get Network type. Valid values: `basic` (classic network); `private` (VPC); `public` (public network); `direct` (Direct Connect). 
     * @return NetType Network type. Valid values: `basic` (classic network); `private` (VPC); `public` (public network); `direct` (Direct Connect).
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type. Valid values: `basic` (classic network); `private` (VPC); `public` (public network); `direct` (Direct Connect).
     * @param NetType Network type. Valid values: `basic` (classic network); `private` (VPC); `public` (public network); `direct` (Direct Connect).
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Region, which is required when `NetType` is `direct`. 
     * @return RegionCode Region, which is required when `NetType` is `direct`.
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region, which is required when `NetType` is `direct`.
     * @param RegionCode Region, which is required when `NetType` is `direct`.
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get VpcId, which is required when `NetType` is `direct`. 
     * @return VpcId VpcId, which is required when `NetType` is `direct`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcId, which is required when `NetType` is `direct`.
     * @param VpcId VpcId, which is required when `NetType` is `direct`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Command validity, which is required for non-Tencent Cloud instances. 
     * @return ExpireDate Command validity, which is required for non-Tencent Cloud instances.
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set Command validity, which is required for non-Tencent Cloud instances.
     * @param ExpireDate Command validity, which is required for non-Tencent Cloud instances.
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    public DescribeAgentDaemonSetCmdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentDaemonSetCmdRequest(DescribeAgentDaemonSetCmdRequest source) {
        if (source.IsCloud != null) {
            this.IsCloud = new Boolean(source.IsCloud);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);

    }
}

