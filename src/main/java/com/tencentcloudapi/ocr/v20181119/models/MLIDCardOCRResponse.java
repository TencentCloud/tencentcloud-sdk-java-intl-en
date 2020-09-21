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

public class MLIDCardOCRResponse extends AbstractModel{

    /**
    * Identity card number
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
    * Address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Gender
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Alarm code
-9103	Alarm for photographed document
-9102	Alarm for photocopied document
-9106       Alarm for covered card
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
    * Certificate types
MyKad: Malaysian Identity Card
MyPR: Malaysia Permanent Resident Identity Card
MyTentera: Malaysian Armed Forces Identity Card
MyKAS: Malaysian Temporary Resident Identity Card
POLIS: Royal Malaysia Police Identity Card
IKAD: Malaysia Temporary Employment Visit Pass
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Date of birth (currently, this field is only supported for IKAD).
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Identity card number 
     * @return ID Identity card number
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Identity card number
     * @param ID Identity card number
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
     * Get Gender 
     * @return Sex Gender
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender
     * @param Sex Gender
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Alarm code
-9103	Alarm for photographed document
-9102	Alarm for photocopied document
-9106       Alarm for covered card 
     * @return Warn Alarm code
-9103	Alarm for photographed document
-9102	Alarm for photocopied document
-9106       Alarm for covered card
     */
    public Long [] getWarn() {
        return this.Warn;
    }

    /**
     * Set Alarm code
-9103	Alarm for photographed document
-9102	Alarm for photocopied document
-9106       Alarm for covered card
     * @param Warn Alarm code
-9103	Alarm for photographed document
-9102	Alarm for photocopied document
-9106       Alarm for covered card
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
     * Get Certificate types
MyKad: Malaysian Identity Card
MyPR: Malaysia Permanent Resident Identity Card
MyTentera: Malaysian Armed Forces Identity Card
MyKAS: Malaysian Temporary Resident Identity Card
POLIS: Royal Malaysia Police Identity Card
IKAD: Malaysia Temporary Employment Visit Pass 
     * @return Type Certificate types
MyKad: Malaysian Identity Card
MyPR: Malaysia Permanent Resident Identity Card
MyTentera: Malaysian Armed Forces Identity Card
MyKAS: Malaysian Temporary Resident Identity Card
POLIS: Royal Malaysia Police Identity Card
IKAD: Malaysia Temporary Employment Visit Pass
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Certificate types
MyKad: Malaysian Identity Card
MyPR: Malaysia Permanent Resident Identity Card
MyTentera: Malaysian Armed Forces Identity Card
MyKAS: Malaysian Temporary Resident Identity Card
POLIS: Royal Malaysia Police Identity Card
IKAD: Malaysia Temporary Employment Visit Pass
     * @param Type Certificate types
MyKad: Malaysian Identity Card
MyPR: Malaysia Permanent Resident Identity Card
MyTentera: Malaysian Armed Forces Identity Card
MyKAS: Malaysian Temporary Resident Identity Card
POLIS: Royal Malaysia Police Identity Card
IKAD: Malaysia Temporary Employment Visit Pass
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Date of birth (currently, this field is only supported for IKAD). 
     * @return Birthday Date of birth (currently, this field is only supported for IKAD).
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth (currently, this field is only supported for IKAD).
     * @param Birthday Date of birth (currently, this field is only supported for IKAD).
     */
    public void setBirthday(String Birthday) {
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamArraySimple(map, prefix + "Warn.", this.Warn);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

