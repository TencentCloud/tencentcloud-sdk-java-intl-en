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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassicLinkInstance extends AbstractModel {

    /**
    * VPC instance ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The unique ID of the CVM instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
     * Get The unique ID of the CVM instance 
     * @return InstanceId The unique ID of the CVM instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The unique ID of the CVM instance
     * @param InstanceId The unique ID of the CVM instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ClassicLinkInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassicLinkInstance(ClassicLinkInstance source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

