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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceTokenRequest extends AbstractModel {

    /**
    * ID of the long-term access credential of the instance
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Whether to enable the long-term access credential of the instance
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Access credential description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Valid values: 1: Modify the description; 2: Enable/Disable. Default value: 2.
    */
    @SerializedName("ModifyFlag")
    @Expose
    private Long ModifyFlag;

    /**
     * Get ID of the long-term access credential of the instance 
     * @return TokenId ID of the long-term access credential of the instance
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set ID of the long-term access credential of the instance
     * @param TokenId ID of the long-term access credential of the instance
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Whether to enable the long-term access credential of the instance 
     * @return Enable Whether to enable the long-term access credential of the instance
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable the long-term access credential of the instance
     * @param Enable Whether to enable the long-term access credential of the instance
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Access credential description 
     * @return Desc Access credential description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Access credential description
     * @param Desc Access credential description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Valid values: 1: Modify the description; 2: Enable/Disable. Default value: 2. 
     * @return ModifyFlag Valid values: 1: Modify the description; 2: Enable/Disable. Default value: 2.
     */
    public Long getModifyFlag() {
        return this.ModifyFlag;
    }

    /**
     * Set Valid values: 1: Modify the description; 2: Enable/Disable. Default value: 2.
     * @param ModifyFlag Valid values: 1: Modify the description; 2: Enable/Disable. Default value: 2.
     */
    public void setModifyFlag(Long ModifyFlag) {
        this.ModifyFlag = ModifyFlag;
    }

    public ModifyInstanceTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceTokenRequest(ModifyInstanceTokenRequest source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ModifyFlag != null) {
            this.ModifyFlag = new Long(source.ModifyFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ModifyFlag", this.ModifyFlag);

    }
}

