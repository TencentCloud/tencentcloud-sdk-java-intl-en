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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskFaceResultItem extends AbstractModel {

    /**
    * Unique ID of a figure.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: Default figure library;</li>
<li>UserDefine: Custom figure library.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Name of a figure.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Result set of segments that contain a figure.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskFaceSegmentItem [] SegmentSet;

    /**
    * The person’s gender.
<li>Male</li>
<li>Female</li>
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * The person’s birth date.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * The person’s job or job title.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * The college the person graduated from.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchoolOfGraduation")
    @Expose
    private String SchoolOfGraduation;

    /**
    * The person’s profile.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
    * The person’s place of birth.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PlaceOfBirth")
    @Expose
    private String PlaceOfBirth;

    /**
    * Whether the person is a politician or artist.
<li>Politician</li>
<li>Artist</li>
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PersonType")
    @Expose
    private String PersonType;

    /**
    * Sensitivity
<li>Normal</li>
<li>Sensitive</li>
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The screenshot URL.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Unique ID of a figure. 
     * @return Id Unique ID of a figure.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of a figure.
     * @param Id Unique ID of a figure.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: Default figure library;</li>
<li>UserDefine: Custom figure library.</li> 
     * @return Type Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: Default figure library;</li>
<li>UserDefine: Custom figure library.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: Default figure library;</li>
<li>UserDefine: Custom figure library.</li>
     * @param Type Figure library type, indicating to which figure library the recognized figure belongs:
<li>Default: Default figure library;</li>
<li>UserDefine: Custom figure library.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Name of a figure. 
     * @return Name Name of a figure.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a figure.
     * @param Name Name of a figure.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Result set of segments that contain a figure. 
     * @return SegmentSet Result set of segments that contain a figure.
     */
    public AiRecognitionTaskFaceSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Result set of segments that contain a figure.
     * @param SegmentSet Result set of segments that contain a figure.
     */
    public void setSegmentSet(AiRecognitionTaskFaceSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get The person’s gender.
<li>Male</li>
<li>Female</li>
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Gender The person’s gender.
<li>Male</li>
<li>Female</li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set The person’s gender.
<li>Male</li>
<li>Female</li>
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Gender The person’s gender.
<li>Male</li>
<li>Female</li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get The person’s birth date.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Birthday The person’s birth date.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set The person’s birth date.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Birthday The person’s birth date.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get The person’s job or job title.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Profession The person’s job or job title.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set The person’s job or job title.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Profession The person’s job or job title.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get The college the person graduated from.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchoolOfGraduation The college the person graduated from.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchoolOfGraduation() {
        return this.SchoolOfGraduation;
    }

    /**
     * Set The college the person graduated from.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchoolOfGraduation The college the person graduated from.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchoolOfGraduation(String SchoolOfGraduation) {
        this.SchoolOfGraduation = SchoolOfGraduation;
    }

    /**
     * Get The person’s profile.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Abstract The person’s profile.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * Set The person’s profile.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Abstract The person’s profile.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * Get The person’s place of birth.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PlaceOfBirth The person’s place of birth.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPlaceOfBirth() {
        return this.PlaceOfBirth;
    }

    /**
     * Set The person’s place of birth.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PlaceOfBirth The person’s place of birth.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

    /**
     * Get Whether the person is a politician or artist.
<li>Politician</li>
<li>Artist</li>
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PersonType Whether the person is a politician or artist.
<li>Politician</li>
<li>Artist</li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPersonType() {
        return this.PersonType;
    }

    /**
     * Set Whether the person is a politician or artist.
<li>Politician</li>
<li>Artist</li>
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PersonType Whether the person is a politician or artist.
<li>Politician</li>
<li>Artist</li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPersonType(String PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Get Sensitivity
<li>Normal</li>
<li>Sensitive</li>
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Remark Sensitivity
<li>Normal</li>
<li>Sensitive</li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sensitivity
<li>Normal</li>
<li>Sensitive</li>
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Remark Sensitivity
<li>Normal</li>
<li>Sensitive</li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get The screenshot URL.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Url The screenshot URL.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The screenshot URL.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Url The screenshot URL.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public AiRecognitionTaskFaceResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskFaceResultItem(AiRecognitionTaskFaceResultItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskFaceSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskFaceSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Profession != null) {
            this.Profession = new String(source.Profession);
        }
        if (source.SchoolOfGraduation != null) {
            this.SchoolOfGraduation = new String(source.SchoolOfGraduation);
        }
        if (source.Abstract != null) {
            this.Abstract = new String(source.Abstract);
        }
        if (source.PlaceOfBirth != null) {
            this.PlaceOfBirth = new String(source.PlaceOfBirth);
        }
        if (source.PersonType != null) {
            this.PersonType = new String(source.PersonType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Profession", this.Profession);
        this.setParamSimple(map, prefix + "SchoolOfGraduation", this.SchoolOfGraduation);
        this.setParamSimple(map, prefix + "Abstract", this.Abstract);
        this.setParamSimple(map, prefix + "PlaceOfBirth", this.PlaceOfBirth);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

