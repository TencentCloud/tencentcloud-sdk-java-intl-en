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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentInstallCommandRequest extends AbstractModel {

    /**
    * Whether Tencent Cloud
    */
    @SerializedName("IsCloud")
    @Expose
    private Boolean IsCloud;

    /**
    * Network type: basic - basic network; private - VPC; public - public network; direct - direct connect
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Region identifier, required when NetType=direct
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * VpcId, required when NetType=direct
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Tag ID list, effective only when IsCloud=false
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * Command validity period, required for non-Tencent Cloud instances
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * VIP Accessed via Proxy Mode
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get Whether Tencent Cloud 
     * @return IsCloud Whether Tencent Cloud
     */
    public Boolean getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set Whether Tencent Cloud
     * @param IsCloud Whether Tencent Cloud
     */
    public void setIsCloud(Boolean IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get Network type: basic - basic network; private - VPC; public - public network; direct - direct connect 
     * @return NetType Network type: basic - basic network; private - VPC; public - public network; direct - direct connect
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type: basic - basic network; private - VPC; public - public network; direct - direct connect
     * @param NetType Network type: basic - basic network; private - VPC; public - public network; direct - direct connect
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Region identifier, required when NetType=direct 
     * @return RegionCode Region identifier, required when NetType=direct
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region identifier, required when NetType=direct
     * @param RegionCode Region identifier, required when NetType=direct
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get VpcId, required when NetType=direct 
     * @return VpcId VpcId, required when NetType=direct
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcId, required when NetType=direct
     * @param VpcId VpcId, required when NetType=direct
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Tag ID list, effective only when IsCloud=false 
     * @return TagIds Tag ID list, effective only when IsCloud=false
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set Tag ID list, effective only when IsCloud=false
     * @param TagIds Tag ID list, effective only when IsCloud=false
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get Command validity period, required for non-Tencent Cloud instances 
     * @return ExpireDate Command validity period, required for non-Tencent Cloud instances
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set Command validity period, required for non-Tencent Cloud instances
     * @param ExpireDate Command validity period, required for non-Tencent Cloud instances
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get VIP Accessed via Proxy Mode 
     * @return Vip VIP Accessed via Proxy Mode
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP Accessed via Proxy Mode
     * @param Vip VIP Accessed via Proxy Mode
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public DescribeAgentInstallCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentInstallCommandRequest(DescribeAgentInstallCommandRequest source) {
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
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
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
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

