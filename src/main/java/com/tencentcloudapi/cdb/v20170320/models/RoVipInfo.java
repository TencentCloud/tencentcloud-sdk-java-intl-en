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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoVipInfo extends AbstractModel {

    /**
    * VIP status of the read-only instance
    */
    @SerializedName("RoVipStatus")
    @Expose
    private Long RoVipStatus;

    /**
    * VPC subnet of the read-only instance
    */
    @SerializedName("RoSubnetId")
    @Expose
    private Long RoSubnetId;

    /**
    * VPC of the read-only instance
    */
    @SerializedName("RoVpcId")
    @Expose
    private Long RoVpcId;

    /**
    * VIP port number of the read-only instance
    */
    @SerializedName("RoVport")
    @Expose
    private Long RoVport;

    /**
    * VIP of the read-only instance
    */
    @SerializedName("RoVip")
    @Expose
    private String RoVip;

    /**
     * Get VIP status of the read-only instance 
     * @return RoVipStatus VIP status of the read-only instance
     */
    public Long getRoVipStatus() {
        return this.RoVipStatus;
    }

    /**
     * Set VIP status of the read-only instance
     * @param RoVipStatus VIP status of the read-only instance
     */
    public void setRoVipStatus(Long RoVipStatus) {
        this.RoVipStatus = RoVipStatus;
    }

    /**
     * Get VPC subnet of the read-only instance 
     * @return RoSubnetId VPC subnet of the read-only instance
     */
    public Long getRoSubnetId() {
        return this.RoSubnetId;
    }

    /**
     * Set VPC subnet of the read-only instance
     * @param RoSubnetId VPC subnet of the read-only instance
     */
    public void setRoSubnetId(Long RoSubnetId) {
        this.RoSubnetId = RoSubnetId;
    }

    /**
     * Get VPC of the read-only instance 
     * @return RoVpcId VPC of the read-only instance
     */
    public Long getRoVpcId() {
        return this.RoVpcId;
    }

    /**
     * Set VPC of the read-only instance
     * @param RoVpcId VPC of the read-only instance
     */
    public void setRoVpcId(Long RoVpcId) {
        this.RoVpcId = RoVpcId;
    }

    /**
     * Get VIP port number of the read-only instance 
     * @return RoVport VIP port number of the read-only instance
     */
    public Long getRoVport() {
        return this.RoVport;
    }

    /**
     * Set VIP port number of the read-only instance
     * @param RoVport VIP port number of the read-only instance
     */
    public void setRoVport(Long RoVport) {
        this.RoVport = RoVport;
    }

    /**
     * Get VIP of the read-only instance 
     * @return RoVip VIP of the read-only instance
     */
    public String getRoVip() {
        return this.RoVip;
    }

    /**
     * Set VIP of the read-only instance
     * @param RoVip VIP of the read-only instance
     */
    public void setRoVip(String RoVip) {
        this.RoVip = RoVip;
    }

    public RoVipInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoVipInfo(RoVipInfo source) {
        if (source.RoVipStatus != null) {
            this.RoVipStatus = new Long(source.RoVipStatus);
        }
        if (source.RoSubnetId != null) {
            this.RoSubnetId = new Long(source.RoSubnetId);
        }
        if (source.RoVpcId != null) {
            this.RoVpcId = new Long(source.RoVpcId);
        }
        if (source.RoVport != null) {
            this.RoVport = new Long(source.RoVport);
        }
        if (source.RoVip != null) {
            this.RoVip = new String(source.RoVip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoVipStatus", this.RoVipStatus);
        this.setParamSimple(map, prefix + "RoSubnetId", this.RoSubnetId);
        this.setParamSimple(map, prefix + "RoVpcId", this.RoVpcId);
        this.setParamSimple(map, prefix + "RoVport", this.RoVport);
        this.setParamSimple(map, prefix + "RoVip", this.RoVip);

    }
}

