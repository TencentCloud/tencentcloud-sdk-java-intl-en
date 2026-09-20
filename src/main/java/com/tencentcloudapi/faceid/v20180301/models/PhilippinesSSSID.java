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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhilippinesSSSID extends AbstractModel {

    /**
    * No.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Name
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Birthday
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
     * Get No. 
     * @return LicenseNumber No.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set No.
     * @param LicenseNumber No.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Name 
     * @return FullName Name
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Name
     * @param FullName Name
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Birthday 
     * @return Birthday Birthday
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday
     * @param Birthday Birthday
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public PhilippinesSSSID() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhilippinesSSSID(PhilippinesSSSID source) {
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);

    }
}

