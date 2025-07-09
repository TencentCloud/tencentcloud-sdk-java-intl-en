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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizePhilippinesUMIDOCRResponse extends AbstractModel {

    /**
    * The surname.
    */
    @SerializedName("Surname")
    @Expose
    private TextDetectionResult Surname;

    /**
    * The middle name.
    */
    @SerializedName("MiddleName")
    @Expose
    private TextDetectionResult MiddleName;

    /**
    * The given name.
    */
    @SerializedName("GivenName")
    @Expose
    private TextDetectionResult GivenName;

    /**
    * The address.
    */
    @SerializedName("Address")
    @Expose
    private TextDetectionResult Address;

    /**
    * The date of birth.
    */
    @SerializedName("Birthday")
    @Expose
    private TextDetectionResult Birthday;

    /**
    * The common reference number (CRN).
    */
    @SerializedName("CRN")
    @Expose
    private TextDetectionResult CRN;

    /**
    * The gender.
    */
    @SerializedName("Sex")
    @Expose
    private TextDetectionResult Sex;

    /**
    * The Base64-encoded identity photo.
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The surname. 
     * @return Surname The surname.
     */
    public TextDetectionResult getSurname() {
        return this.Surname;
    }

    /**
     * Set The surname.
     * @param Surname The surname.
     */
    public void setSurname(TextDetectionResult Surname) {
        this.Surname = Surname;
    }

    /**
     * Get The middle name. 
     * @return MiddleName The middle name.
     */
    public TextDetectionResult getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set The middle name.
     * @param MiddleName The middle name.
     */
    public void setMiddleName(TextDetectionResult MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get The given name. 
     * @return GivenName The given name.
     */
    public TextDetectionResult getGivenName() {
        return this.GivenName;
    }

    /**
     * Set The given name.
     * @param GivenName The given name.
     */
    public void setGivenName(TextDetectionResult GivenName) {
        this.GivenName = GivenName;
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
     * Get The common reference number (CRN). 
     * @return CRN The common reference number (CRN).
     */
    public TextDetectionResult getCRN() {
        return this.CRN;
    }

    /**
     * Set The common reference number (CRN).
     * @param CRN The common reference number (CRN).
     */
    public void setCRN(TextDetectionResult CRN) {
        this.CRN = CRN;
    }

    /**
     * Get The gender. 
     * @return Sex The gender.
     */
    public TextDetectionResult getSex() {
        return this.Sex;
    }

    /**
     * Set The gender.
     * @param Sex The gender.
     */
    public void setSex(TextDetectionResult Sex) {
        this.Sex = Sex;
    }

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

    public RecognizePhilippinesUMIDOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesUMIDOCRResponse(RecognizePhilippinesUMIDOCRResponse source) {
        if (source.Surname != null) {
            this.Surname = new TextDetectionResult(source.Surname);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new TextDetectionResult(source.MiddleName);
        }
        if (source.GivenName != null) {
            this.GivenName = new TextDetectionResult(source.GivenName);
        }
        if (source.Address != null) {
            this.Address = new TextDetectionResult(source.Address);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
        }
        if (source.CRN != null) {
            this.CRN = new TextDetectionResult(source.CRN);
        }
        if (source.Sex != null) {
            this.Sex = new TextDetectionResult(source.Sex);
        }
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Surname.", this.Surname);
        this.setParamObj(map, prefix + "MiddleName.", this.MiddleName);
        this.setParamObj(map, prefix + "GivenName.", this.GivenName);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamObj(map, prefix + "CRN.", this.CRN);
        this.setParamObj(map, prefix + "Sex.", this.Sex);
        this.setParamObj(map, prefix + "HeadPortrait.", this.HeadPortrait);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

