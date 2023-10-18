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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressAttributeRequest extends AbstractModel {

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * Unique EIP ID, such as `eip-11112222`.
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * New EIP name, which can contain up to 20 characters.
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * Whether "direct access" is enabled for the EIP. TRUE: yes. FALSE: no. Note that this parameter is available only to users who have activated the EIP direct access feature.
    */
    @SerializedName("EipDirectConnection")
    @Expose
    private String EipDirectConnection;

    /**
     * Get ECM region 
     * @return EcmRegion ECM region
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region
     * @param EcmRegion ECM region
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get Unique EIP ID, such as `eip-11112222`. 
     * @return AddressId Unique EIP ID, such as `eip-11112222`.
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set Unique EIP ID, such as `eip-11112222`.
     * @param AddressId Unique EIP ID, such as `eip-11112222`.
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get New EIP name, which can contain up to 20 characters. 
     * @return AddressName New EIP name, which can contain up to 20 characters.
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set New EIP name, which can contain up to 20 characters.
     * @param AddressName New EIP name, which can contain up to 20 characters.
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get Whether "direct access" is enabled for the EIP. TRUE: yes. FALSE: no. Note that this parameter is available only to users who have activated the EIP direct access feature. 
     * @return EipDirectConnection Whether "direct access" is enabled for the EIP. TRUE: yes. FALSE: no. Note that this parameter is available only to users who have activated the EIP direct access feature.
     */
    public String getEipDirectConnection() {
        return this.EipDirectConnection;
    }

    /**
     * Set Whether "direct access" is enabled for the EIP. TRUE: yes. FALSE: no. Note that this parameter is available only to users who have activated the EIP direct access feature.
     * @param EipDirectConnection Whether "direct access" is enabled for the EIP. TRUE: yes. FALSE: no. Note that this parameter is available only to users who have activated the EIP direct access feature.
     */
    public void setEipDirectConnection(String EipDirectConnection) {
        this.EipDirectConnection = EipDirectConnection;
    }

    public ModifyAddressAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressAttributeRequest(ModifyAddressAttributeRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.EipDirectConnection != null) {
            this.EipDirectConnection = new String(source.EipDirectConnection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "EipDirectConnection", this.EipDirectConnection);

    }
}

