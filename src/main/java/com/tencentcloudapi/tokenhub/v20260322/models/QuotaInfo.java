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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotaInfo extends AbstractModel {

    /**
    * Quota package ID.
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * Package status. Value: 1 (normal), 3 (exhausted), 4 (terminated).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Quota period. Value: d (by day), m (monthly), lifetime (total quota, no reset).
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * Dimensional quota total amount (number of tokens). Use string to avoid precision loss.
    */
    @SerializedName("CycleCredits")
    @Expose
    private String CycleCredits;

    /**
    * Dimensional used amount (number of tokens). Use string literal to avoid precision loss.
    */
    @SerializedName("CycleUsed")
    @Expose
    private String CycleUsed;

    /**
    * Quota effective start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Quota expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Quota package ID. 
     * @return PkgId Quota package ID.
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set Quota package ID.
     * @param PkgId Quota package ID.
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get Package status. Value: 1 (normal), 3 (exhausted), 4 (terminated). 
     * @return Status Package status. Value: 1 (normal), 3 (exhausted), 4 (terminated).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Package status. Value: 1 (normal), 3 (exhausted), 4 (terminated).
     * @param Status Package status. Value: 1 (normal), 3 (exhausted), 4 (terminated).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Quota period. Value: d (by day), m (monthly), lifetime (total quota, no reset). 
     * @return CycleUnit Quota period. Value: d (by day), m (monthly), lifetime (total quota, no reset).
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Quota period. Value: d (by day), m (monthly), lifetime (total quota, no reset).
     * @param CycleUnit Quota period. Value: d (by day), m (monthly), lifetime (total quota, no reset).
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get Dimensional quota total amount (number of tokens). Use string to avoid precision loss. 
     * @return CycleCredits Dimensional quota total amount (number of tokens). Use string to avoid precision loss.
     */
    public String getCycleCredits() {
        return this.CycleCredits;
    }

    /**
     * Set Dimensional quota total amount (number of tokens). Use string to avoid precision loss.
     * @param CycleCredits Dimensional quota total amount (number of tokens). Use string to avoid precision loss.
     */
    public void setCycleCredits(String CycleCredits) {
        this.CycleCredits = CycleCredits;
    }

    /**
     * Get Dimensional used amount (number of tokens). Use string literal to avoid precision loss. 
     * @return CycleUsed Dimensional used amount (number of tokens). Use string literal to avoid precision loss.
     */
    public String getCycleUsed() {
        return this.CycleUsed;
    }

    /**
     * Set Dimensional used amount (number of tokens). Use string literal to avoid precision loss.
     * @param CycleUsed Dimensional used amount (number of tokens). Use string literal to avoid precision loss.
     */
    public void setCycleUsed(String CycleUsed) {
        this.CycleUsed = CycleUsed;
    }

    /**
     * Get Quota effective start time. 
     * @return StartTime Quota effective start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Quota effective start time.
     * @param StartTime Quota effective start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Quota expiration time. 
     * @return ExpireTime Quota expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Quota expiration time.
     * @param ExpireTime Quota expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public QuotaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaInfo(QuotaInfo source) {
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.CycleCredits != null) {
            this.CycleCredits = new String(source.CycleCredits);
        }
        if (source.CycleUsed != null) {
            this.CycleUsed = new String(source.CycleUsed);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "CycleCredits", this.CycleCredits);
        this.setParamSimple(map, prefix + "CycleUsed", this.CycleUsed);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

