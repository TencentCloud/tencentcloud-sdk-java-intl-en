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

public class CosBucketInfo extends AbstractModel {

    /**
    * App ID information
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Bucket name.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Region information
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Region code value
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * Remarks.
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
     * Get App ID information 
     * @return AppId App ID information
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID information
     * @param AppId App ID information
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Bucket name. 
     * @return BucketName Bucket name.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket name.
     * @param BucketName Bucket name.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Region information 
     * @return BucketRegion Region information
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set Region information
     * @param BucketRegion Region information
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Region code value 
     * @return BucketRegionCode Region code value
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set Region code value
     * @param BucketRegionCode Region code value
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get Remarks. 
     * @return BucketMarker Remarks.
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set Remarks.
     * @param BucketMarker Remarks.
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    public CosBucketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketInfo(CosBucketInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketRegionCode != null) {
            this.BucketRegionCode = new String(source.BucketRegionCode);
        }
        if (source.BucketMarker != null) {
            this.BucketMarker = new String(source.BucketMarker);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketRegionCode", this.BucketRegionCode);
        this.setParamSimple(map, prefix + "BucketMarker", this.BucketMarker);

    }
}

