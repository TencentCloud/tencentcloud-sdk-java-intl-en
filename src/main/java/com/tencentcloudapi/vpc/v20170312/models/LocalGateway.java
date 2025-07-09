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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalGateway extends AbstractModel {

    /**
    * CDC instance ID
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * VPC instance ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Local gateway instance ID
    */
    @SerializedName("UniqLocalGwId")
    @Expose
    private String UniqLocalGwId;

    /**
    * Local gateway name
    */
    @SerializedName("LocalGatewayName")
    @Expose
    private String LocalGatewayName;

    /**
    * Local gateway IP
    */
    @SerializedName("LocalGwIp")
    @Expose
    private String LocalGwIp;

    /**
    * Creation time of the local gateway
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get CDC instance ID 
     * @return CdcId CDC instance ID
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC instance ID
     * @param CdcId CDC instance ID
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get VPC instance ID 
     * @return VpcId VPC instance ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID
     * @param VpcId VPC instance ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Local gateway instance ID 
     * @return UniqLocalGwId Local gateway instance ID
     */
    public String getUniqLocalGwId() {
        return this.UniqLocalGwId;
    }

    /**
     * Set Local gateway instance ID
     * @param UniqLocalGwId Local gateway instance ID
     */
    public void setUniqLocalGwId(String UniqLocalGwId) {
        this.UniqLocalGwId = UniqLocalGwId;
    }

    /**
     * Get Local gateway name 
     * @return LocalGatewayName Local gateway name
     */
    public String getLocalGatewayName() {
        return this.LocalGatewayName;
    }

    /**
     * Set Local gateway name
     * @param LocalGatewayName Local gateway name
     */
    public void setLocalGatewayName(String LocalGatewayName) {
        this.LocalGatewayName = LocalGatewayName;
    }

    /**
     * Get Local gateway IP 
     * @return LocalGwIp Local gateway IP
     */
    public String getLocalGwIp() {
        return this.LocalGwIp;
    }

    /**
     * Set Local gateway IP
     * @param LocalGwIp Local gateway IP
     */
    public void setLocalGwIp(String LocalGwIp) {
        this.LocalGwIp = LocalGwIp;
    }

    /**
     * Get Creation time of the local gateway 
     * @return CreateTime Creation time of the local gateway
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the local gateway
     * @param CreateTime Creation time of the local gateway
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LocalGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalGateway(LocalGateway source) {
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.UniqLocalGwId != null) {
            this.UniqLocalGwId = new String(source.UniqLocalGwId);
        }
        if (source.LocalGatewayName != null) {
            this.LocalGatewayName = new String(source.LocalGatewayName);
        }
        if (source.LocalGwIp != null) {
            this.LocalGwIp = new String(source.LocalGwIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "UniqLocalGwId", this.UniqLocalGwId);
        this.setParamSimple(map, prefix + "LocalGatewayName", this.LocalGatewayName);
        this.setParamSimple(map, prefix + "LocalGwIp", this.LocalGwIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

