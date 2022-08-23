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
    * ID number
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Full name
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
    * Alarm codes
-9103 Alarm for photographed certificate
-9102 Alarm for photocopied certificate
-9106 Alarm for covered certificate
-9107 Alarm for blurry image
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
    * This is an extended field, 
with the confidence of a field recognition result returned in the following format.
{
  Field name:{
    Confidence:0.9999
  }
}
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * Certificate type
MyKad  ID card
MyPR    Permanent resident card
MyTentera   Military identity card
MyKAS    Temporary ID card
POLIS  Police card
IKAD   Work permit
MyKid   Kid card
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Date of birth. This field is available only for work permits (i-Kad) and ID cards (MyKad).
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
     * Get ID number 
     * @return ID ID number
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set ID number
     * @param ID ID number
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Full name 
     * @return Name Full name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Full name
     * @param Name Full name
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
     * Get Alarm codes
-9103 Alarm for photographed certificate
-9102 Alarm for photocopied certificate
-9106 Alarm for covered certificate
-9107 Alarm for blurry image 
     * @return Warn Alarm codes
-9103 Alarm for photographed certificate
-9102 Alarm for photocopied certificate
-9106 Alarm for covered certificate
-9107 Alarm for blurry image
     */
    public Long [] getWarn() {
        return this.Warn;
    }

    /**
     * Set Alarm codes
-9103 Alarm for photographed certificate
-9102 Alarm for photocopied certificate
-9106 Alarm for covered certificate
-9107 Alarm for blurry image
     * @param Warn Alarm codes
-9103 Alarm for photographed certificate
-9102 Alarm for photocopied certificate
-9106 Alarm for covered certificate
-9107 Alarm for blurry image
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
     * Get This is an extended field, 
with the confidence of a field recognition result returned in the following format.
{
  Field name:{
    Confidence:0.9999
  }
} 
     * @return AdvancedInfo This is an extended field, 
with the confidence of a field recognition result returned in the following format.
{
  Field name:{
    Confidence:0.9999
  }
}
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set This is an extended field, 
with the confidence of a field recognition result returned in the following format.
{
  Field name:{
    Confidence:0.9999
  }
}
     * @param AdvancedInfo This is an extended field, 
with the confidence of a field recognition result returned in the following format.
{
  Field name:{
    Confidence:0.9999
  }
}
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get Certificate type
MyKad  ID card
MyPR    Permanent resident card
MyTentera   Military identity card
MyKAS    Temporary ID card
POLIS  Police card
IKAD   Work permit
MyKid   Kid card 
     * @return Type Certificate type
MyKad  ID card
MyPR    Permanent resident card
MyTentera   Military identity card
MyKAS    Temporary ID card
POLIS  Police card
IKAD   Work permit
MyKid   Kid card
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Certificate type
MyKad  ID card
MyPR    Permanent resident card
MyTentera   Military identity card
MyKAS    Temporary ID card
POLIS  Police card
IKAD   Work permit
MyKid   Kid card
     * @param Type Certificate type
MyKad  ID card
MyPR    Permanent resident card
MyTentera   Military identity card
MyKAS    Temporary ID card
POLIS  Police card
IKAD   Work permit
MyKid   Kid card
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Date of birth. This field is available only for work permits (i-Kad) and ID cards (MyKad). 
     * @return Birthday Date of birth. This field is available only for work permits (i-Kad) and ID cards (MyKad).
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth. This field is available only for work permits (i-Kad) and ID cards (MyKad).
     * @param Birthday Date of birth. This field is available only for work permits (i-Kad) and ID cards (MyKad).
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

    public MLIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MLIDCardOCRResponse(MLIDCardOCRResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Warn != null) {
            this.Warn = new Long[source.Warn.length];
            for (int i = 0; i < source.Warn.length; i++) {
                this.Warn[i] = new Long(source.Warn[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
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

