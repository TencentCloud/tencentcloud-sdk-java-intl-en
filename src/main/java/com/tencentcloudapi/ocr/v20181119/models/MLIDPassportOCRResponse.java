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

public class MLIDPassportOCRResponse extends AbstractModel{

    /**
    * Passport ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Date of birth
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * Gender (F: female, M: male)
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Expiration date
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * Issuing country
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * Nationality
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Alarm code
-9103 Alarm for spoofed card
-9102 Alarm for photocopied card
-9106 Alarm for covered card
    */
    @SerializedName("Warn")
    @Expose
    private Long [] Warn;

    /**
    * Identity photo
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Extended field:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
}
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Passport ID 
     * @return ID Passport ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Passport ID
     * @param ID Passport ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Date of birth 
     * @return DateOfBirth Date of birth
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set Date of birth
     * @param DateOfBirth Date of birth
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get Gender (F: female, M: male) 
     * @return Sex Gender (F: female, M: male)
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender (F: female, M: male)
     * @param Sex Gender (F: female, M: male)
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Expiration date 
     * @return DateOfExpiration Expiration date
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set Expiration date
     * @param DateOfExpiration Expiration date
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get Issuing country 
     * @return IssuingCountry Issuing country
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set Issuing country
     * @param IssuingCountry Issuing country
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get Nationality 
     * @return Nationality Nationality
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Nationality
     * @param Nationality Nationality
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Alarm code
-9103 Alarm for spoofed card
-9102 Alarm for photocopied card
-9106 Alarm for covered card 
     * @return Warn Alarm code
-9103 Alarm for spoofed card
-9102 Alarm for photocopied card
-9106 Alarm for covered card
     */
    public Long [] getWarn() {
        return this.Warn;
    }

    /**
     * Set Alarm code
-9103 Alarm for spoofed card
-9102 Alarm for photocopied card
-9106 Alarm for covered card
     * @param Warn Alarm code
-9103 Alarm for spoofed card
-9102 Alarm for photocopied card
-9106 Alarm for covered card
     */
    public void setWarn(Long [] Warn) {
        this.Warn = Warn;
    }

    /**
     * Get Identity photo 
     * @return Image Identity photo
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Identity photo
     * @param Image Identity photo
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Extended field:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
} 
     * @return AdvancedInfo Extended field:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
}
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set Extended field:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
}
     * @param AdvancedInfo Extended field:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
}
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "DateOfExpiration", this.DateOfExpiration);
        this.setParamSimple(map, prefix + "IssuingCountry", this.IssuingCountry);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamArraySimple(map, prefix + "Warn.", this.Warn);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

