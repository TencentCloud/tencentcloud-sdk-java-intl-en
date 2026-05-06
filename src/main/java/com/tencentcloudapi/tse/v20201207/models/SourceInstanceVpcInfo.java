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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceInstanceVpcInfo extends AbstractModel {

    /**
    * VPC information of the microservice engine
    */
    @SerializedName("VpcID")
    @Expose
    private String VpcID;

    /**
    * Microservice engine subnet info
    */
    @SerializedName("SubnetID")
    @Expose
    private String SubnetID;

    /**
     * Get VPC information of the microservice engine 
     * @return VpcID VPC information of the microservice engine
     */
    public String getVpcID() {
        return this.VpcID;
    }

    /**
     * Set VPC information of the microservice engine
     * @param VpcID VPC information of the microservice engine
     */
    public void setVpcID(String VpcID) {
        this.VpcID = VpcID;
    }

    /**
     * Get Microservice engine subnet info 
     * @return SubnetID Microservice engine subnet info
     */
    public String getSubnetID() {
        return this.SubnetID;
    }

    /**
     * Set Microservice engine subnet info
     * @param SubnetID Microservice engine subnet info
     */
    public void setSubnetID(String SubnetID) {
        this.SubnetID = SubnetID;
    }

    public SourceInstanceVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInstanceVpcInfo(SourceInstanceVpcInfo source) {
        if (source.VpcID != null) {
            this.VpcID = new String(source.VpcID);
        }
        if (source.SubnetID != null) {
            this.SubnetID = new String(source.SubnetID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcID", this.VpcID);
        this.setParamSimple(map, prefix + "SubnetID", this.SubnetID);

    }
}

