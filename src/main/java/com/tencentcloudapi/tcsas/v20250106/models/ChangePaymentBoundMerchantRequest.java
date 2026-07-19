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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangePaymentBoundMerchantRequest extends AbstractModel {

    /**
    * <p>Platform ID.</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Mini program appid.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Merchant ID.</p>
    */
    @SerializedName("MerchantID")
    @Expose
    private String MerchantID;

    /**
    * <p>Merchant name.</p>
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
     * Get <p>Platform ID.</p> 
     * @return PlatformId <p>Platform ID.</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID.</p>
     * @param PlatformId <p>Platform ID.</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Mini program appid.</p> 
     * @return TeamId <p>Mini program appid.</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Mini program appid.</p>
     * @param TeamId <p>Mini program appid.</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>Merchant ID.</p> 
     * @return MerchantID <p>Merchant ID.</p>
     */
    public String getMerchantID() {
        return this.MerchantID;
    }

    /**
     * Set <p>Merchant ID.</p>
     * @param MerchantID <p>Merchant ID.</p>
     */
    public void setMerchantID(String MerchantID) {
        this.MerchantID = MerchantID;
    }

    /**
     * Get <p>Merchant name.</p> 
     * @return MerchantName <p>Merchant name.</p>
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set <p>Merchant name.</p>
     * @param MerchantName <p>Merchant name.</p>
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    public ChangePaymentBoundMerchantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangePaymentBoundMerchantRequest(ChangePaymentBoundMerchantRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.MerchantID != null) {
            this.MerchantID = new String(source.MerchantID);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "MerchantID", this.MerchantID);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);

    }
}

