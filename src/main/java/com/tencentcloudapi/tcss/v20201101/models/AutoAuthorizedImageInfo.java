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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoAuthorizedImageInfo extends AbstractModel{

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Licensing time
    */
    @SerializedName("AuthorizedTime")
    @Expose
    private String AuthorizedTime;

    /**
    * Licensing result. Valid values: `SUCCESS` (success); `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether it is licensed. Valid values: `1` (yes); `0` (no).
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
     * Get Image ID 
     * @return ImageId Image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
     * @param ImageId Image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Licensing time 
     * @return AuthorizedTime Licensing time
     */
    public String getAuthorizedTime() {
        return this.AuthorizedTime;
    }

    /**
     * Set Licensing time
     * @param AuthorizedTime Licensing time
     */
    public void setAuthorizedTime(String AuthorizedTime) {
        this.AuthorizedTime = AuthorizedTime;
    }

    /**
     * Get Licensing result. Valid values: `SUCCESS` (success); `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses). 
     * @return Status Licensing result. Valid values: `SUCCESS` (success); `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Licensing result. Valid values: `SUCCESS` (success); `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses).
     * @param Status Licensing result. Valid values: `SUCCESS` (success); `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether it is licensed. Valid values: `1` (yes); `0` (no). 
     * @return IsAuthorized Whether it is licensed. Valid values: `1` (yes); `0` (no).
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set Whether it is licensed. Valid values: `1` (yes); `0` (no).
     * @param IsAuthorized Whether it is licensed. Valid values: `1` (yes); `0` (no).
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    public AutoAuthorizedImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoAuthorizedImageInfo(AutoAuthorizedImageInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.AuthorizedTime != null) {
            this.AuthorizedTime = new String(source.AuthorizedTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "AuthorizedTime", this.AuthorizedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);

    }
}

