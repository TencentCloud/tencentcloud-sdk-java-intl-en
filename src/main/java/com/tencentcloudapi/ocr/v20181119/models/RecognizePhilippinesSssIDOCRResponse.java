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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizePhilippinesSssIDOCRResponse extends AbstractModel {

    /**
    * The Base64-encoded identity photo.
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * The common reference number (CRN).
    */
    @SerializedName("LicenseNumber")
    @Expose
    private TextDetectionResult LicenseNumber;

    /**
    * The full name.
    */
    @SerializedName("FullName")
    @Expose
    private TextDetectionResult FullName;

    /**
    * The date of birth.
    */
    @SerializedName("Birthday")
    @Expose
    private TextDetectionResult Birthday;

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
     * Get The common reference number (CRN). 
     * @return LicenseNumber The common reference number (CRN).
     */
    public TextDetectionResult getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set The common reference number (CRN).
     * @param LicenseNumber The common reference number (CRN).
     */
    public void setLicenseNumber(TextDetectionResult LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get The full name. 
     * @return FullName The full name.
     */
    public TextDetectionResult getFullName() {
        return this.FullName;
    }

    /**
     * Set The full name.
     * @param FullName The full name.
     */
    public void setFullName(TextDetectionResult FullName) {
        this.FullName = FullName;
    }

    /**
     * Get The date of birth. 
     * @return Birthday The date of birth.
     */
    public TextDetectionResult getBirthday() {
        return this.Birthday;
    }

    /**
     * Set The date of birth.
     * @param Birthday The date of birth.
     */
    public void setBirthday(TextDetectionResult Birthday) {
        this.Birthday = Birthday;
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

    public RecognizePhilippinesSssIDOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesSssIDOCRResponse(RecognizePhilippinesSssIDOCRResponse source) {
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new TextDetectionResult(source.LicenseNumber);
        }
        if (source.FullName != null) {
            this.FullName = new TextDetectionResult(source.FullName);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
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
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

