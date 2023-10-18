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

public class RecognizeThaiIDCardOCRResponse extends AbstractModel {

    /**
    * ID card number
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Name in Thai
    */
    @SerializedName("ThaiName")
    @Expose
    private String ThaiName;

    /**
    * Name in English
    */
    @SerializedName("EnFirstName")
    @Expose
    private String EnFirstName;

    /**
    * Address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Date of issue
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * Expiration date
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * Name in English
    */
    @SerializedName("EnLastName")
    @Expose
    private String EnLastName;

    /**
    * Identity photo
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID card number 
     * @return ID ID card number
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set ID card number
     * @param ID ID card number
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Name in Thai 
     * @return ThaiName Name in Thai
     */
    public String getThaiName() {
        return this.ThaiName;
    }

    /**
     * Set Name in Thai
     * @param ThaiName Name in Thai
     */
    public void setThaiName(String ThaiName) {
        this.ThaiName = ThaiName;
    }

    /**
     * Get Name in English 
     * @return EnFirstName Name in English
     */
    public String getEnFirstName() {
        return this.EnFirstName;
    }

    /**
     * Set Name in English
     * @param EnFirstName Name in English
     */
    public void setEnFirstName(String EnFirstName) {
        this.EnFirstName = EnFirstName;
    }

    /**
     * Get Address 
     * @return Address Address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
     * @param Address Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Date of birth 
     * @return Birthday Date of birth
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth
     * @param Birthday Date of birth
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Date of issue 
     * @return IssueDate Date of issue
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set Date of issue
     * @param IssueDate Date of issue
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get Expiration date 
     * @return ExpirationDate Expiration date
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration date
     * @param ExpirationDate Expiration date
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get Name in English 
     * @return EnLastName Name in English
     */
    public String getEnLastName() {
        return this.EnLastName;
    }

    /**
     * Set Name in English
     * @param EnLastName Name in English
     */
    public void setEnLastName(String EnLastName) {
        this.EnLastName = EnLastName;
    }

    /**
     * Get Identity photo 
     * @return PortraitImage Identity photo
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set Identity photo
     * @param PortraitImage Identity photo
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
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

    public RecognizeThaiIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeThaiIDCardOCRResponse(RecognizeThaiIDCardOCRResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ThaiName != null) {
            this.ThaiName = new String(source.ThaiName);
        }
        if (source.EnFirstName != null) {
            this.EnFirstName = new String(source.EnFirstName);
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
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.EnLastName != null) {
            this.EnLastName = new String(source.EnLastName);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ThaiName", this.ThaiName);
        this.setParamSimple(map, prefix + "EnFirstName", this.EnFirstName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "EnLastName", this.EnLastName);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

