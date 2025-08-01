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

public class DeleteLocalGatewayRequest extends AbstractModel {

    /**
    * Local gateway instance ID
    */
    @SerializedName("LocalGatewayId")
    @Expose
    private String LocalGatewayId;

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
     * Get Local gateway instance ID 
     * @return LocalGatewayId Local gateway instance ID
     */
    public String getLocalGatewayId() {
        return this.LocalGatewayId;
    }

    /**
     * Set Local gateway instance ID
     * @param LocalGatewayId Local gateway instance ID
     */
    public void setLocalGatewayId(String LocalGatewayId) {
        this.LocalGatewayId = LocalGatewayId;
    }

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

    public DeleteLocalGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLocalGatewayRequest(DeleteLocalGatewayRequest source) {
        if (source.LocalGatewayId != null) {
            this.LocalGatewayId = new String(source.LocalGatewayId);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalGatewayId", this.LocalGatewayId);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

