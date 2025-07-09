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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosDetailSets extends AbstractModel {

    /**
    * Bucket name
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * The start time of the usage
    */
    @SerializedName("DosageBeginTime")
    @Expose
    private String DosageBeginTime;

    /**
    * The end time of the usage
    */
    @SerializedName("DosageEndTime")
    @Expose
    private String DosageEndTime;

    /**
    * Subproduct name
    */
    @SerializedName("SubProductCodeName")
    @Expose
    private String SubProductCodeName;

    /**
    * Billable item name
    */
    @SerializedName("BillingItemCodeName")
    @Expose
    private String BillingItemCodeName;

    /**
    * Usage
    */
    @SerializedName("DosageValue")
    @Expose
    private String DosageValue;

    /**
    * Unit of the billable item
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get Bucket name 
     * @return BucketName Bucket name
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket name
     * @param BucketName Bucket name
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get The start time of the usage 
     * @return DosageBeginTime The start time of the usage
     */
    public String getDosageBeginTime() {
        return this.DosageBeginTime;
    }

    /**
     * Set The start time of the usage
     * @param DosageBeginTime The start time of the usage
     */
    public void setDosageBeginTime(String DosageBeginTime) {
        this.DosageBeginTime = DosageBeginTime;
    }

    /**
     * Get The end time of the usage 
     * @return DosageEndTime The end time of the usage
     */
    public String getDosageEndTime() {
        return this.DosageEndTime;
    }

    /**
     * Set The end time of the usage
     * @param DosageEndTime The end time of the usage
     */
    public void setDosageEndTime(String DosageEndTime) {
        this.DosageEndTime = DosageEndTime;
    }

    /**
     * Get Subproduct name 
     * @return SubProductCodeName Subproduct name
     */
    public String getSubProductCodeName() {
        return this.SubProductCodeName;
    }

    /**
     * Set Subproduct name
     * @param SubProductCodeName Subproduct name
     */
    public void setSubProductCodeName(String SubProductCodeName) {
        this.SubProductCodeName = SubProductCodeName;
    }

    /**
     * Get Billable item name 
     * @return BillingItemCodeName Billable item name
     */
    public String getBillingItemCodeName() {
        return this.BillingItemCodeName;
    }

    /**
     * Set Billable item name
     * @param BillingItemCodeName Billable item name
     */
    public void setBillingItemCodeName(String BillingItemCodeName) {
        this.BillingItemCodeName = BillingItemCodeName;
    }

    /**
     * Get Usage 
     * @return DosageValue Usage
     */
    public String getDosageValue() {
        return this.DosageValue;
    }

    /**
     * Set Usage
     * @param DosageValue Usage
     */
    public void setDosageValue(String DosageValue) {
        this.DosageValue = DosageValue;
    }

    /**
     * Get Unit of the billable item 
     * @return Unit Unit of the billable item
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit of the billable item
     * @param Unit Unit of the billable item
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public CosDetailSets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosDetailSets(CosDetailSets source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.DosageBeginTime != null) {
            this.DosageBeginTime = new String(source.DosageBeginTime);
        }
        if (source.DosageEndTime != null) {
            this.DosageEndTime = new String(source.DosageEndTime);
        }
        if (source.SubProductCodeName != null) {
            this.SubProductCodeName = new String(source.SubProductCodeName);
        }
        if (source.BillingItemCodeName != null) {
            this.BillingItemCodeName = new String(source.BillingItemCodeName);
        }
        if (source.DosageValue != null) {
            this.DosageValue = new String(source.DosageValue);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "DosageBeginTime", this.DosageBeginTime);
        this.setParamSimple(map, prefix + "DosageEndTime", this.DosageEndTime);
        this.setParamSimple(map, prefix + "SubProductCodeName", this.SubProductCodeName);
        this.setParamSimple(map, prefix + "BillingItemCodeName", this.BillingItemCodeName);
        this.setParamSimple(map, prefix + "DosageValue", this.DosageValue);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

