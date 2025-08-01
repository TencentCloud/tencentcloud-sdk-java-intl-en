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

public class PhilippinesTinID extends AbstractModel {

    /**
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Full name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
     * Get License number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseNumber License number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set License number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseNumber License number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Full name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName Full name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Full name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName Full name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Birthday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthday Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthday Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Date of issue
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssueDate Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssueDate Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    public PhilippinesTinID() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhilippinesTinID(PhilippinesTinID source) {
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);

    }
}

