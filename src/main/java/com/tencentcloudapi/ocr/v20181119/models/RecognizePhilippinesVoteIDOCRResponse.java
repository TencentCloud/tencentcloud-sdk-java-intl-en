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

public class RecognizePhilippinesVoteIDOCRResponse extends AbstractModel {

    /**
    * The Base64-encoded identity photo.
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * The voter's identification number (VIN).
    */
    @SerializedName("VIN")
    @Expose
    private TextDetectionResult VIN;

    /**
    * The first name.
    */
    @SerializedName("FirstName")
    @Expose
    private TextDetectionResult FirstName;

    /**
    * The last name.
    */
    @SerializedName("LastName")
    @Expose
    private TextDetectionResult LastName;

    /**
    * The date of birth.
    */
    @SerializedName("Birthday")
    @Expose
    private TextDetectionResult Birthday;

    /**
    * The civil status.
    */
    @SerializedName("CivilStatus")
    @Expose
    private TextDetectionResult CivilStatus;

    /**
    * The citizenship.
    */
    @SerializedName("Citizenship")
    @Expose
    private TextDetectionResult Citizenship;

    /**
    * The address.
    */
    @SerializedName("Address")
    @Expose
    private TextDetectionResult Address;

    /**
    * The precinct.
    */
    @SerializedName("PrecinctNo")
    @Expose
    private TextDetectionResult PrecinctNo;

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
     * Get The voter's identification number (VIN). 
     * @return VIN The voter's identification number (VIN).
     */
    public TextDetectionResult getVIN() {
        return this.VIN;
    }

    /**
     * Set The voter's identification number (VIN).
     * @param VIN The voter's identification number (VIN).
     */
    public void setVIN(TextDetectionResult VIN) {
        this.VIN = VIN;
    }

    /**
     * Get The first name. 
     * @return FirstName The first name.
     */
    public TextDetectionResult getFirstName() {
        return this.FirstName;
    }

    /**
     * Set The first name.
     * @param FirstName The first name.
     */
    public void setFirstName(TextDetectionResult FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get The last name. 
     * @return LastName The last name.
     */
    public TextDetectionResult getLastName() {
        return this.LastName;
    }

    /**
     * Set The last name.
     * @param LastName The last name.
     */
    public void setLastName(TextDetectionResult LastName) {
        this.LastName = LastName;
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
     * Get The civil status. 
     * @return CivilStatus The civil status.
     */
    public TextDetectionResult getCivilStatus() {
        return this.CivilStatus;
    }

    /**
     * Set The civil status.
     * @param CivilStatus The civil status.
     */
    public void setCivilStatus(TextDetectionResult CivilStatus) {
        this.CivilStatus = CivilStatus;
    }

    /**
     * Get The citizenship. 
     * @return Citizenship The citizenship.
     */
    public TextDetectionResult getCitizenship() {
        return this.Citizenship;
    }

    /**
     * Set The citizenship.
     * @param Citizenship The citizenship.
     */
    public void setCitizenship(TextDetectionResult Citizenship) {
        this.Citizenship = Citizenship;
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
     * Get The precinct. 
     * @return PrecinctNo The precinct.
     */
    public TextDetectionResult getPrecinctNo() {
        return this.PrecinctNo;
    }

    /**
     * Set The precinct.
     * @param PrecinctNo The precinct.
     */
    public void setPrecinctNo(TextDetectionResult PrecinctNo) {
        this.PrecinctNo = PrecinctNo;
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

    public RecognizePhilippinesVoteIDOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesVoteIDOCRResponse(RecognizePhilippinesVoteIDOCRResponse source) {
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.VIN != null) {
            this.VIN = new TextDetectionResult(source.VIN);
        }
        if (source.FirstName != null) {
            this.FirstName = new TextDetectionResult(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new TextDetectionResult(source.LastName);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
        }
        if (source.CivilStatus != null) {
            this.CivilStatus = new TextDetectionResult(source.CivilStatus);
        }
        if (source.Citizenship != null) {
            this.Citizenship = new TextDetectionResult(source.Citizenship);
        }
        if (source.Address != null) {
            this.Address = new TextDetectionResult(source.Address);
        }
        if (source.PrecinctNo != null) {
            this.PrecinctNo = new TextDetectionResult(source.PrecinctNo);
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
        this.setParamObj(map, prefix + "VIN.", this.VIN);
        this.setParamObj(map, prefix + "FirstName.", this.FirstName);
        this.setParamObj(map, prefix + "LastName.", this.LastName);
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamObj(map, prefix + "CivilStatus.", this.CivilStatus);
        this.setParamObj(map, prefix + "Citizenship.", this.Citizenship);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "PrecinctNo.", this.PrecinctNo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

