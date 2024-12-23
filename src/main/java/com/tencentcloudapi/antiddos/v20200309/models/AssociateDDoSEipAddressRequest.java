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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateDDoSEipAddressRequest extends AbstractModel {

    /**
    * Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * EIP of the Anti-DDoS instance ID.
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * Instance ID to bind. For example, `ins-11112222`. It can be queried in the console or obtained from `InstanceId` returned by `DescribeInstances`.
    */
    @SerializedName("CvmInstanceID")
    @Expose
    private String CvmInstanceID;

    /**
    * Region of the CVM instance. For example, `ap-hongkong`.
    */
    @SerializedName("CvmRegion")
    @Expose
    private String CvmRegion;

    /**
     * Get Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`. 
     * @return InstanceId Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`.
     * @param InstanceId Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get EIP of the Anti-DDoS instance ID. 
     * @return Eip EIP of the Anti-DDoS instance ID.
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set EIP of the Anti-DDoS instance ID.
     * @param Eip EIP of the Anti-DDoS instance ID.
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get Instance ID to bind. For example, `ins-11112222`. It can be queried in the console or obtained from `InstanceId` returned by `DescribeInstances`. 
     * @return CvmInstanceID Instance ID to bind. For example, `ins-11112222`. It can be queried in the console or obtained from `InstanceId` returned by `DescribeInstances`.
     */
    public String getCvmInstanceID() {
        return this.CvmInstanceID;
    }

    /**
     * Set Instance ID to bind. For example, `ins-11112222`. It can be queried in the console or obtained from `InstanceId` returned by `DescribeInstances`.
     * @param CvmInstanceID Instance ID to bind. For example, `ins-11112222`. It can be queried in the console or obtained from `InstanceId` returned by `DescribeInstances`.
     */
    public void setCvmInstanceID(String CvmInstanceID) {
        this.CvmInstanceID = CvmInstanceID;
    }

    /**
     * Get Region of the CVM instance. For example, `ap-hongkong`. 
     * @return CvmRegion Region of the CVM instance. For example, `ap-hongkong`.
     */
    public String getCvmRegion() {
        return this.CvmRegion;
    }

    /**
     * Set Region of the CVM instance. For example, `ap-hongkong`.
     * @param CvmRegion Region of the CVM instance. For example, `ap-hongkong`.
     */
    public void setCvmRegion(String CvmRegion) {
        this.CvmRegion = CvmRegion;
    }

    public AssociateDDoSEipAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateDDoSEipAddressRequest(AssociateDDoSEipAddressRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
        if (source.CvmInstanceID != null) {
            this.CvmInstanceID = new String(source.CvmInstanceID);
        }
        if (source.CvmRegion != null) {
            this.CvmRegion = new String(source.CvmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Eip", this.Eip);
        this.setParamSimple(map, prefix + "CvmInstanceID", this.CvmInstanceID);
        this.setParamSimple(map, prefix + "CvmRegion", this.CvmRegion);

    }
}

