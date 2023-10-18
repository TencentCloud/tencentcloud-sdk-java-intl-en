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

public class CreateRoInstanceIpResponse extends AbstractModel {

    /**
    * VPC ID of the read-only instance.
    */
    @SerializedName("RoVpcId")
    @Expose
    private Long RoVpcId;

    /**
    * Subnet ID of the read-only instance.
    */
    @SerializedName("RoSubnetId")
    @Expose
    private Long RoSubnetId;

    /**
    * Private IP address of the read-only instance.
    */
    @SerializedName("RoVip")
    @Expose
    private String RoVip;

    /**
    * Private port number of the read-only instance.
    */
    @SerializedName("RoVport")
    @Expose
    private Long RoVport;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get VPC ID of the read-only instance. 
     * @return RoVpcId VPC ID of the read-only instance.
     */
    public Long getRoVpcId() {
        return this.RoVpcId;
    }

    /**
     * Set VPC ID of the read-only instance.
     * @param RoVpcId VPC ID of the read-only instance.
     */
    public void setRoVpcId(Long RoVpcId) {
        this.RoVpcId = RoVpcId;
    }

    /**
     * Get Subnet ID of the read-only instance. 
     * @return RoSubnetId Subnet ID of the read-only instance.
     */
    public Long getRoSubnetId() {
        return this.RoSubnetId;
    }

    /**
     * Set Subnet ID of the read-only instance.
     * @param RoSubnetId Subnet ID of the read-only instance.
     */
    public void setRoSubnetId(Long RoSubnetId) {
        this.RoSubnetId = RoSubnetId;
    }

    /**
     * Get Private IP address of the read-only instance. 
     * @return RoVip Private IP address of the read-only instance.
     */
    public String getRoVip() {
        return this.RoVip;
    }

    /**
     * Set Private IP address of the read-only instance.
     * @param RoVip Private IP address of the read-only instance.
     */
    public void setRoVip(String RoVip) {
        this.RoVip = RoVip;
    }

    /**
     * Get Private port number of the read-only instance. 
     * @return RoVport Private port number of the read-only instance.
     */
    public Long getRoVport() {
        return this.RoVport;
    }

    /**
     * Set Private port number of the read-only instance.
     * @param RoVport Private port number of the read-only instance.
     */
    public void setRoVport(Long RoVport) {
        this.RoVport = RoVport;
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

    public CreateRoInstanceIpResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoInstanceIpResponse(CreateRoInstanceIpResponse source) {
        if (source.RoVpcId != null) {
            this.RoVpcId = new Long(source.RoVpcId);
        }
        if (source.RoSubnetId != null) {
            this.RoSubnetId = new Long(source.RoSubnetId);
        }
        if (source.RoVip != null) {
            this.RoVip = new String(source.RoVip);
        }
        if (source.RoVport != null) {
            this.RoVport = new Long(source.RoVport);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoVpcId", this.RoVpcId);
        this.setParamSimple(map, prefix + "RoSubnetId", this.RoSubnetId);
        this.setParamSimple(map, prefix + "RoVip", this.RoVip);
        this.setParamSimple(map, prefix + "RoVport", this.RoVport);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

