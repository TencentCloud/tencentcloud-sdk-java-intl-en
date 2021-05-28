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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatistics extends AbstractModel{

    /**
    * The creation time of the package in seconds in the format of UNIX timestamp.
    */
    @SerializedName("PackageCreateTime")
    @Expose
    private Long PackageCreateTime;

    /**
    * The effective time of the package in seconds in the format of UNIX timestamp.
    */
    @SerializedName("PackageEffectiveTime")
    @Expose
    private Long PackageEffectiveTime;

    /**
    * The expiration time of the package in seconds in the format of UNIX timestamp.
    */
    @SerializedName("PackageExpiredTime")
    @Expose
    private Long PackageExpiredTime;

    /**
    * Number of SMS messages in the package
    */
    @SerializedName("PackageAmount")
    @Expose
    private Long PackageAmount;

    /**
    * Package type. 0: gifted package; 1: purchased package.
    */
    @SerializedName("PackageType")
    @Expose
    private Long PackageType;

    /**
    * Package ID.
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * Current number of used messages in the package.
    */
    @SerializedName("CurrentUsage")
    @Expose
    private Long CurrentUsage;

    /**
     * Get The creation time of the package in seconds in the format of UNIX timestamp. 
     * @return PackageCreateTime The creation time of the package in seconds in the format of UNIX timestamp.
     */
    public Long getPackageCreateTime() {
        return this.PackageCreateTime;
    }

    /**
     * Set The creation time of the package in seconds in the format of UNIX timestamp.
     * @param PackageCreateTime The creation time of the package in seconds in the format of UNIX timestamp.
     */
    public void setPackageCreateTime(Long PackageCreateTime) {
        this.PackageCreateTime = PackageCreateTime;
    }

    /**
     * Get The effective time of the package in seconds in the format of UNIX timestamp. 
     * @return PackageEffectiveTime The effective time of the package in seconds in the format of UNIX timestamp.
     */
    public Long getPackageEffectiveTime() {
        return this.PackageEffectiveTime;
    }

    /**
     * Set The effective time of the package in seconds in the format of UNIX timestamp.
     * @param PackageEffectiveTime The effective time of the package in seconds in the format of UNIX timestamp.
     */
    public void setPackageEffectiveTime(Long PackageEffectiveTime) {
        this.PackageEffectiveTime = PackageEffectiveTime;
    }

    /**
     * Get The expiration time of the package in seconds in the format of UNIX timestamp. 
     * @return PackageExpiredTime The expiration time of the package in seconds in the format of UNIX timestamp.
     */
    public Long getPackageExpiredTime() {
        return this.PackageExpiredTime;
    }

    /**
     * Set The expiration time of the package in seconds in the format of UNIX timestamp.
     * @param PackageExpiredTime The expiration time of the package in seconds in the format of UNIX timestamp.
     */
    public void setPackageExpiredTime(Long PackageExpiredTime) {
        this.PackageExpiredTime = PackageExpiredTime;
    }

    /**
     * Get Number of SMS messages in the package 
     * @return PackageAmount Number of SMS messages in the package
     */
    public Long getPackageAmount() {
        return this.PackageAmount;
    }

    /**
     * Set Number of SMS messages in the package
     * @param PackageAmount Number of SMS messages in the package
     */
    public void setPackageAmount(Long PackageAmount) {
        this.PackageAmount = PackageAmount;
    }

    /**
     * Get Package type. 0: gifted package; 1: purchased package. 
     * @return PackageType Package type. 0: gifted package; 1: purchased package.
     */
    public Long getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Package type. 0: gifted package; 1: purchased package.
     * @param PackageType Package type. 0: gifted package; 1: purchased package.
     */
    public void setPackageType(Long PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Package ID. 
     * @return PackageId Package ID.
     */
    public Long getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Package ID.
     * @param PackageId Package ID.
     */
    public void setPackageId(Long PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Current number of used messages in the package. 
     * @return CurrentUsage Current number of used messages in the package.
     */
    public Long getCurrentUsage() {
        return this.CurrentUsage;
    }

    /**
     * Set Current number of used messages in the package.
     * @param CurrentUsage Current number of used messages in the package.
     */
    public void setCurrentUsage(Long CurrentUsage) {
        this.CurrentUsage = CurrentUsage;
    }

    public SmsPackagesStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsPackagesStatistics(SmsPackagesStatistics source) {
        if (source.PackageCreateTime != null) {
            this.PackageCreateTime = new Long(source.PackageCreateTime);
        }
        if (source.PackageEffectiveTime != null) {
            this.PackageEffectiveTime = new Long(source.PackageEffectiveTime);
        }
        if (source.PackageExpiredTime != null) {
            this.PackageExpiredTime = new Long(source.PackageExpiredTime);
        }
        if (source.PackageAmount != null) {
            this.PackageAmount = new Long(source.PackageAmount);
        }
        if (source.PackageType != null) {
            this.PackageType = new Long(source.PackageType);
        }
        if (source.PackageId != null) {
            this.PackageId = new Long(source.PackageId);
        }
        if (source.CurrentUsage != null) {
            this.CurrentUsage = new Long(source.CurrentUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageCreateTime", this.PackageCreateTime);
        this.setParamSimple(map, prefix + "PackageEffectiveTime", this.PackageEffectiveTime);
        this.setParamSimple(map, prefix + "PackageExpiredTime", this.PackageExpiredTime);
        this.setParamSimple(map, prefix + "PackageAmount", this.PackageAmount);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "CurrentUsage", this.CurrentUsage);

    }
}

