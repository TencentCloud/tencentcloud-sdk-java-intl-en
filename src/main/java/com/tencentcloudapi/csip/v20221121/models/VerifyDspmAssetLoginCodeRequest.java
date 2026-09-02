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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyDspmAssetLoginCodeRequest extends AbstractModel {

    /**
    * Individual ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Database asset id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Verification code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Host. Default value: '%'
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get Individual ID 
     * @return PersonId Individual ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Individual ID
     * @param PersonId Individual ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Database asset id 
     * @return AssetId Database asset id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Database asset id
     * @param AssetId Database asset id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Verification code 
     * @return Code Verification code
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Verification code
     * @param Code Verification code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Host. Default value: '%' 
     * @return Host Host. Default value: '%'
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host. Default value: '%'
     * @param Host Host. Default value: '%'
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public VerifyDspmAssetLoginCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDspmAssetLoginCodeRequest(VerifyDspmAssetLoginCodeRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

