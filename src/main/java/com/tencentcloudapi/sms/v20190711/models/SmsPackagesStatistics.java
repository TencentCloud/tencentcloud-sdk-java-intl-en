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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatistics extends AbstractModel {

    /**
    * Package creation time in standard time format, such as 2019-10-08 17:18:37.
    */
    @SerializedName("PackageCreateTime")
    @Expose
    private String PackageCreateTime;

    /**
    * Package creation time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("PackageCreateUnixTime")
    @Expose
    private Long PackageCreateUnixTime;

    /**
    * Package effective time in standard time format, such as 2019-10-08 17:18:37.
    */
    @SerializedName("PackageEffectiveTime")
    @Expose
    private String PackageEffectiveTime;

    /**
    * Package effective time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("PackageEffectiveUnixTime")
    @Expose
    private Long PackageEffectiveUnixTime;

    /**
    * Package expiration time in standard time format, such as 2019-10-08 17:18:37.
    */
    @SerializedName("PackageExpiredTime")
    @Expose
    private String PackageExpiredTime;

    /**
    * Package expiration time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("PackageExpiredUnixTime")
    @Expose
    private Long PackageExpiredUnixTime;

    /**
    * Number of SMS messages in package.
    */
    @SerializedName("AmountOfPackage")
    @Expose
    private Long AmountOfPackage;

    /**
    * 0: gifted package. 1: purchased package.
    */
    @SerializedName("TypeOfPackage")
    @Expose
    private Long TypeOfPackage;

    /**
    * Package ID.
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * Current usage.
    */
    @SerializedName("CurrentUsage")
    @Expose
    private Long CurrentUsage;

    /**
     * Get Package creation time in standard time format, such as 2019-10-08 17:18:37. 
     * @return PackageCreateTime Package creation time in standard time format, such as 2019-10-08 17:18:37.
     */
    public String getPackageCreateTime() {
        return this.PackageCreateTime;
    }

    /**
     * Set Package creation time in standard time format, such as 2019-10-08 17:18:37.
     * @param PackageCreateTime Package creation time in standard time format, such as 2019-10-08 17:18:37.
     */
    public void setPackageCreateTime(String PackageCreateTime) {
        this.PackageCreateTime = PackageCreateTime;
    }

    /**
     * Get Package creation time in seconds in the format of UNIX timestamp. 
     * @return PackageCreateUnixTime Package creation time in seconds in the format of UNIX timestamp.
     */
    public Long getPackageCreateUnixTime() {
        return this.PackageCreateUnixTime;
    }

    /**
     * Set Package creation time in seconds in the format of UNIX timestamp.
     * @param PackageCreateUnixTime Package creation time in seconds in the format of UNIX timestamp.
     */
    public void setPackageCreateUnixTime(Long PackageCreateUnixTime) {
        this.PackageCreateUnixTime = PackageCreateUnixTime;
    }

    /**
     * Get Package effective time in standard time format, such as 2019-10-08 17:18:37. 
     * @return PackageEffectiveTime Package effective time in standard time format, such as 2019-10-08 17:18:37.
     */
    public String getPackageEffectiveTime() {
        return this.PackageEffectiveTime;
    }

    /**
     * Set Package effective time in standard time format, such as 2019-10-08 17:18:37.
     * @param PackageEffectiveTime Package effective time in standard time format, such as 2019-10-08 17:18:37.
     */
    public void setPackageEffectiveTime(String PackageEffectiveTime) {
        this.PackageEffectiveTime = PackageEffectiveTime;
    }

    /**
     * Get Package effective time in seconds in the format of UNIX timestamp. 
     * @return PackageEffectiveUnixTime Package effective time in seconds in the format of UNIX timestamp.
     */
    public Long getPackageEffectiveUnixTime() {
        return this.PackageEffectiveUnixTime;
    }

    /**
     * Set Package effective time in seconds in the format of UNIX timestamp.
     * @param PackageEffectiveUnixTime Package effective time in seconds in the format of UNIX timestamp.
     */
    public void setPackageEffectiveUnixTime(Long PackageEffectiveUnixTime) {
        this.PackageEffectiveUnixTime = PackageEffectiveUnixTime;
    }

    /**
     * Get Package expiration time in standard time format, such as 2019-10-08 17:18:37. 
     * @return PackageExpiredTime Package expiration time in standard time format, such as 2019-10-08 17:18:37.
     */
    public String getPackageExpiredTime() {
        return this.PackageExpiredTime;
    }

    /**
     * Set Package expiration time in standard time format, such as 2019-10-08 17:18:37.
     * @param PackageExpiredTime Package expiration time in standard time format, such as 2019-10-08 17:18:37.
     */
    public void setPackageExpiredTime(String PackageExpiredTime) {
        this.PackageExpiredTime = PackageExpiredTime;
    }

    /**
     * Get Package expiration time in seconds in the format of UNIX timestamp. 
     * @return PackageExpiredUnixTime Package expiration time in seconds in the format of UNIX timestamp.
     */
    public Long getPackageExpiredUnixTime() {
        return this.PackageExpiredUnixTime;
    }

    /**
     * Set Package expiration time in seconds in the format of UNIX timestamp.
     * @param PackageExpiredUnixTime Package expiration time in seconds in the format of UNIX timestamp.
     */
    public void setPackageExpiredUnixTime(Long PackageExpiredUnixTime) {
        this.PackageExpiredUnixTime = PackageExpiredUnixTime;
    }

    /**
     * Get Number of SMS messages in package. 
     * @return AmountOfPackage Number of SMS messages in package.
     */
    public Long getAmountOfPackage() {
        return this.AmountOfPackage;
    }

    /**
     * Set Number of SMS messages in package.
     * @param AmountOfPackage Number of SMS messages in package.
     */
    public void setAmountOfPackage(Long AmountOfPackage) {
        this.AmountOfPackage = AmountOfPackage;
    }

    /**
     * Get 0: gifted package. 1: purchased package. 
     * @return TypeOfPackage 0: gifted package. 1: purchased package.
     */
    public Long getTypeOfPackage() {
        return this.TypeOfPackage;
    }

    /**
     * Set 0: gifted package. 1: purchased package.
     * @param TypeOfPackage 0: gifted package. 1: purchased package.
     */
    public void setTypeOfPackage(Long TypeOfPackage) {
        this.TypeOfPackage = TypeOfPackage;
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
     * Get Current usage. 
     * @return CurrentUsage Current usage.
     */
    public Long getCurrentUsage() {
        return this.CurrentUsage;
    }

    /**
     * Set Current usage.
     * @param CurrentUsage Current usage.
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
            this.PackageCreateTime = new String(source.PackageCreateTime);
        }
        if (source.PackageCreateUnixTime != null) {
            this.PackageCreateUnixTime = new Long(source.PackageCreateUnixTime);
        }
        if (source.PackageEffectiveTime != null) {
            this.PackageEffectiveTime = new String(source.PackageEffectiveTime);
        }
        if (source.PackageEffectiveUnixTime != null) {
            this.PackageEffectiveUnixTime = new Long(source.PackageEffectiveUnixTime);
        }
        if (source.PackageExpiredTime != null) {
            this.PackageExpiredTime = new String(source.PackageExpiredTime);
        }
        if (source.PackageExpiredUnixTime != null) {
            this.PackageExpiredUnixTime = new Long(source.PackageExpiredUnixTime);
        }
        if (source.AmountOfPackage != null) {
            this.AmountOfPackage = new Long(source.AmountOfPackage);
        }
        if (source.TypeOfPackage != null) {
            this.TypeOfPackage = new Long(source.TypeOfPackage);
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
        this.setParamSimple(map, prefix + "PackageCreateUnixTime", this.PackageCreateUnixTime);
        this.setParamSimple(map, prefix + "PackageEffectiveTime", this.PackageEffectiveTime);
        this.setParamSimple(map, prefix + "PackageEffectiveUnixTime", this.PackageEffectiveUnixTime);
        this.setParamSimple(map, prefix + "PackageExpiredTime", this.PackageExpiredTime);
        this.setParamSimple(map, prefix + "PackageExpiredUnixTime", this.PackageExpiredUnixTime);
        this.setParamSimple(map, prefix + "AmountOfPackage", this.AmountOfPackage);
        this.setParamSimple(map, prefix + "TypeOfPackage", this.TypeOfPackage);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "CurrentUsage", this.CurrentUsage);

    }
}

