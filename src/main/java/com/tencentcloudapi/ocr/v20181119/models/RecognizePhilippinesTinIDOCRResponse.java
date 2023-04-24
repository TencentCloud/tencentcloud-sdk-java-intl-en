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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizePhilippinesTinIDOCRResponse extends AbstractModel{

    /**
    * The Base64-encoded identity photo.
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * The tax identification number (TIN).
    */
    @SerializedName("LicenseNumber")
    @Expose
    private TextDetectionResult LicenseNumber;

    /**
    * The name.
    */
    @SerializedName("FullName")
    @Expose
    private TextDetectionResult FullName;

    /**
    * The address.
    */
    @SerializedName("Address")
    @Expose
    private TextDetectionResult Address;

    /**
    * The birth date.
    */
    @SerializedName("Birthday")
    @Expose
    private TextDetectionResult Birthday;

    /**
    * The issue date.
    */
    @SerializedName("IssueDate")
    @Expose
    private TextDetectionResult IssueDate;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The Base64-encoded identity photo. 
     * @return HeadPortrait The Base64-encoded identity photo.
     */
    public TextDetectionResult getHeadPortrait() {
        return this.HeadPortrait;
    }

    /**
     * Set The Base64-encoded identity photo.
     * @param HeadPortrait The Base64-encoded identity photo.
     */
    public void setHeadPortrait(TextDetectionResult HeadPortrait) {
        this.HeadPortrait = HeadPortrait;
    }

    /**
     * Get The tax identification number (TIN). 
     * @return LicenseNumber The tax identification number (TIN).
     */
    public TextDetectionResult getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set The tax identification number (TIN).
     * @param LicenseNumber The tax identification number (TIN).
     */
    public void setLicenseNumber(TextDetectionResult LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get The name. 
     * @return FullName The name.
     */
    public TextDetectionResult getFullName() {
        return this.FullName;
    }

    /**
     * Set The name.
     * @param FullName The name.
     */
    public void setFullName(TextDetectionResult FullName) {
        this.FullName = FullName;
    }

    /**
     * Get The address. 
     * @return Address The address.
     */
    public TextDetectionResult getAddress() {
        return this.Address;
    }

    /**
     * Set The address.
     * @param Address The address.
     */
    public void setAddress(TextDetectionResult Address) {
        this.Address = Address;
    }

    /**
     * Get The birth date. 
     * @return Birthday The birth date.
     */
    public TextDetectionResult getBirthday() {
        return this.Birthday;
    }

    /**
     * Set The birth date.
     * @param Birthday The birth date.
     */
    public void setBirthday(TextDetectionResult Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get The issue date. 
     * @return IssueDate The issue date.
     */
    public TextDetectionResult getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set The issue date.
     * @param IssueDate The issue date.
     */
    public void setIssueDate(TextDetectionResult IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizePhilippinesTinIDOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesTinIDOCRResponse(RecognizePhilippinesTinIDOCRResponse source) {
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new TextDetectionResult(source.LicenseNumber);
        }
        if (source.FullName != null) {
            this.FullName = new TextDetectionResult(source.FullName);
        }
        if (source.Address != null) {
            this.Address = new TextDetectionResult(source.Address);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new TextDetectionResult(source.IssueDate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeadPortrait.", this.HeadPortrait);
        this.setParamObj(map, prefix + "LicenseNumber.", this.LicenseNumber);
        this.setParamObj(map, prefix + "FullName.", this.FullName);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamObj(map, prefix + "IssueDate.", this.IssueDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

