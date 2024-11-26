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

public class ModifyDReadableRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Operation type. Valid values: enable - enabling the read-only mode of the replica server; disable - disabling the read-only mode of the replica server
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Replica server network ID, which will be consistent with the primary instance by default if left blank
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Replica server subnet ID, which will be consistent with the primary instance by default if left blank
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Specified replica server read-only VIP, which will be assigned automatically if left blank
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Operation type. Valid values: enable - enabling the read-only mode of the replica server; disable - disabling the read-only mode of the replica server 
     * @return Type Operation type. Valid values: enable - enabling the read-only mode of the replica server; disable - disabling the read-only mode of the replica server
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Operation type. Valid values: enable - enabling the read-only mode of the replica server; disable - disabling the read-only mode of the replica server
     * @param Type Operation type. Valid values: enable - enabling the read-only mode of the replica server; disable - disabling the read-only mode of the replica server
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Replica server network ID, which will be consistent with the primary instance by default if left blank 
     * @return VpcId Replica server network ID, which will be consistent with the primary instance by default if left blank
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Replica server network ID, which will be consistent with the primary instance by default if left blank
     * @param VpcId Replica server network ID, which will be consistent with the primary instance by default if left blank
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Replica server subnet ID, which will be consistent with the primary instance by default if left blank 
     * @return SubnetId Replica server subnet ID, which will be consistent with the primary instance by default if left blank
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Replica server subnet ID, which will be consistent with the primary instance by default if left blank
     * @param SubnetId Replica server subnet ID, which will be consistent with the primary instance by default if left blank
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Specified replica server read-only VIP, which will be assigned automatically if left blank 
     * @return Vip Specified replica server read-only VIP, which will be assigned automatically if left blank
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Specified replica server read-only VIP, which will be assigned automatically if left blank
     * @param Vip Specified replica server read-only VIP, which will be assigned automatically if left blank
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public ModifyDReadableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDReadableRequest(ModifyDReadableRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

