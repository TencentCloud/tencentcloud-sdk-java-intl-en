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
    * Gender of the person.
<Li>Male: man.</li>.
<Li>Female: specifies the woman.</li>.
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * Date of birth.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Occupation or position of a person.
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * Specifies the graduation institution of the person.
    */
    @SerializedName("SchoolOfGraduation")
    @Expose
    private String SchoolOfGraduation;

    /**
    * Description of the person.
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
    * Specifies the birthplace or place of origin.
    */
    @SerializedName("PlaceOfBirth")
    @Expose
    private String PlaceOfBirth;

    /**
    * Person type.
<Li>Politician: specifies the official.</li>.
<Li>Artist: specifies the artist.</li>.
    */
    @SerializedName("PersonType")
    @Expose
    private String PersonType;

    /**
    * Sensitivity labeling.
<Li>Normal: specifies the scaling group is normal.</li>.
<Li>Sensitive: specifies sensitivity.</li>.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Specifies the screenshot link.
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
     * Get Gender of the person.
<Li>Male: man.</li>.
<Li>Female: specifies the woman.</li>. 
     * @return Gender Gender of the person.
<Li>Male: man.</li>.
<Li>Female: specifies the woman.</li>.
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set Gender of the person.
<Li>Male: man.</li>.
<Li>Female: specifies the woman.</li>.
     * @param Gender Gender of the person.
<Li>Male: man.</li>.
<Li>Female: specifies the woman.</li>.
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get Date of birth. 
     * @return Birthday Date of birth.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth.
     * @param Birthday Date of birth.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Occupation or position of a person. 
     * @return Profession Occupation or position of a person.
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set Occupation or position of a person.
     * @param Profession Occupation or position of a person.
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get Specifies the graduation institution of the person. 
     * @return SchoolOfGraduation Specifies the graduation institution of the person.
     */
    public String getSchoolOfGraduation() {
        return this.SchoolOfGraduation;
    }

    /**
     * Set Specifies the graduation institution of the person.
     * @param SchoolOfGraduation Specifies the graduation institution of the person.
     */
    public void setSchoolOfGraduation(String SchoolOfGraduation) {
        this.SchoolOfGraduation = SchoolOfGraduation;
    }

    /**
     * Get Description of the person. 
     * @return Abstract Description of the person.
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * Set Description of the person.
     * @param Abstract Description of the person.
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * Get Specifies the birthplace or place of origin. 
     * @return PlaceOfBirth Specifies the birthplace or place of origin.
     */
    public String getPlaceOfBirth() {
        return this.PlaceOfBirth;
    }

    /**
     * Set Specifies the birthplace or place of origin.
     * @param PlaceOfBirth Specifies the birthplace or place of origin.
     */
    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

    /**
     * Get Person type.
<Li>Politician: specifies the official.</li>.
<Li>Artist: specifies the artist.</li>. 
     * @return PersonType Person type.
<Li>Politician: specifies the official.</li>.
<Li>Artist: specifies the artist.</li>.
     */
    public String getPersonType() {
        return this.PersonType;
    }

    /**
     * Set Person type.
<Li>Politician: specifies the official.</li>.
<Li>Artist: specifies the artist.</li>.
     * @param PersonType Person type.
<Li>Politician: specifies the official.</li>.
<Li>Artist: specifies the artist.</li>.
     */
    public void setPersonType(String PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Get Sensitivity labeling.
<Li>Normal: specifies the scaling group is normal.</li>.
<Li>Sensitive: specifies sensitivity.</li>. 
     * @return Remark Sensitivity labeling.
<Li>Normal: specifies the scaling group is normal.</li>.
<Li>Sensitive: specifies sensitivity.</li>.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sensitivity labeling.
<Li>Normal: specifies the scaling group is normal.</li>.
<Li>Sensitive: specifies sensitivity.</li>.
     * @param Remark Sensitivity labeling.
<Li>Normal: specifies the scaling group is normal.</li>.
<Li>Sensitive: specifies sensitivity.</li>.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Specifies the screenshot link. 
     * @return Url Specifies the screenshot link.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Specifies the screenshot link.
     * @param Url Specifies the screenshot link.
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

