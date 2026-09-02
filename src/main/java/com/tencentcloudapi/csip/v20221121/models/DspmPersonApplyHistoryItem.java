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

public class DspmPersonApplyHistoryItem extends AbstractModel {

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Name
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * Mobile number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Access permission effective time.
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * Access privilege expiration time.
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * Access permission validity period. In milliseconds.
    */
    @SerializedName("ValidatePeriod")
    @Expose
    private Long ValidatePeriod;

    /**
    * Permission information.
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * Whether it is valid. 0: invalid; 1: valid.
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Name 
     * @return PersonName Name
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set Name
     * @param PersonName Name
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get Mobile number. 
     * @return Phone Mobile number.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Mobile number.
     * @param Phone Mobile number.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Access permission effective time. 
     * @return ValidateFrom Access permission effective time.
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set Access permission effective time.
     * @param ValidateFrom Access permission effective time.
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get Access privilege expiration time. 
     * @return ValidateTo Access privilege expiration time.
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set Access privilege expiration time.
     * @param ValidateTo Access privilege expiration time.
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get Access permission validity period. In milliseconds. 
     * @return ValidatePeriod Access permission validity period. In milliseconds.
     */
    public Long getValidatePeriod() {
        return this.ValidatePeriod;
    }

    /**
     * Set Access permission validity period. In milliseconds.
     * @param ValidatePeriod Access permission validity period. In milliseconds.
     */
    public void setValidatePeriod(Long ValidatePeriod) {
        this.ValidatePeriod = ValidatePeriod;
    }

    /**
     * Get Permission information. 
     * @return Privilege Permission information.
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Permission information.
     * @param Privilege Permission information.
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Whether it is valid. 0: invalid; 1: valid. 
     * @return ValidStatus Whether it is valid. 0: invalid; 1: valid.
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set Whether it is valid. 0: invalid; 1: valid.
     * @param ValidStatus Whether it is valid. 0: invalid; 1: valid.
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    public DspmPersonApplyHistoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmPersonApplyHistoryItem(DspmPersonApplyHistoryItem source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.ValidateFrom != null) {
            this.ValidateFrom = new String(source.ValidateFrom);
        }
        if (source.ValidateTo != null) {
            this.ValidateTo = new String(source.ValidateTo);
        }
        if (source.ValidatePeriod != null) {
            this.ValidatePeriod = new Long(source.ValidatePeriod);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamSimple(map, prefix + "ValidatePeriod", this.ValidatePeriod);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);

    }
}

