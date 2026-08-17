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
    * Unique identification ID of the figure.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Figure library type, indicates which figure library the recognized figure comes from.
<li>Default: default figure library;</li>
<li>UserDefine: user-defined character library.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Figure name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Result set of segments that contain people.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskFaceSegmentItem [] SegmentSet;

    /**
    * Gender
<li>Male: man</li>
<li>Female: woman.</li>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * Date of birth of a person.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Occupation or position.
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * Graduation institution of the person.
    */
    @SerializedName("SchoolOfGraduation")
    @Expose
    private String SchoolOfGraduation;

    /**
    * Figure description.
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
    * Birthplace or place of origin of a person.
    */
    @SerializedName("PlaceOfBirth")
    @Expose
    private String PlaceOfBirth;

    /**
    * Person type:
<li>Politician: official.</li>
<li>Artist: artist.</li>
    */
    @SerializedName("PersonType")
    @Expose
    private String PersonType;

    /**
    * Sensitivity labeling:
<li>NORMAL: Normal;</li>
<li>Sensitive: sensitive.</li>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Screenshot link
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Unique identification ID of the figure. 
     * @return Id Unique identification ID of the figure.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique identification ID of the figure.
     * @param Id Unique identification ID of the figure.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Figure library type, indicates which figure library the recognized figure comes from.
<li>Default: default figure library;</li>
<li>UserDefine: user-defined character library.</li> 
     * @return Type Figure library type, indicates which figure library the recognized figure comes from.
<li>Default: default figure library;</li>
<li>UserDefine: user-defined character library.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Figure library type, indicates which figure library the recognized figure comes from.
<li>Default: default figure library;</li>
<li>UserDefine: user-defined character library.</li>
     * @param Type Figure library type, indicates which figure library the recognized figure comes from.
<li>Default: default figure library;</li>
<li>UserDefine: user-defined character library.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Figure name. 
     * @return Name Figure name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Figure name.
     * @param Name Figure name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Result set of segments that contain people. 
     * @return SegmentSet Result set of segments that contain people.
     */
    public AiRecognitionTaskFaceSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Result set of segments that contain people.
     * @param SegmentSet Result set of segments that contain people.
     */
    public void setSegmentSet(AiRecognitionTaskFaceSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get Gender
<li>Male: man</li>
<li>Female: woman.</li> 
     * @return Gender Gender
<li>Male: man</li>
<li>Female: woman.</li>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set Gender
<li>Male: man</li>
<li>Female: woman.</li>
     * @param Gender Gender
<li>Male: man</li>
<li>Female: woman.</li>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get Date of birth of a person. 
     * @return Birthday Date of birth of a person.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth of a person.
     * @param Birthday Date of birth of a person.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Occupation or position. 
     * @return Profession Occupation or position.
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set Occupation or position.
     * @param Profession Occupation or position.
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get Graduation institution of the person. 
     * @return SchoolOfGraduation Graduation institution of the person.
     */
    public String getSchoolOfGraduation() {
        return this.SchoolOfGraduation;
    }

    /**
     * Set Graduation institution of the person.
     * @param SchoolOfGraduation Graduation institution of the person.
     */
    public void setSchoolOfGraduation(String SchoolOfGraduation) {
        this.SchoolOfGraduation = SchoolOfGraduation;
    }

    /**
     * Get Figure description. 
     * @return Abstract Figure description.
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * Set Figure description.
     * @param Abstract Figure description.
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * Get Birthplace or place of origin of a person. 
     * @return PlaceOfBirth Birthplace or place of origin of a person.
     */
    public String getPlaceOfBirth() {
        return this.PlaceOfBirth;
    }

    /**
     * Set Birthplace or place of origin of a person.
     * @param PlaceOfBirth Birthplace or place of origin of a person.
     */
    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

    /**
     * Get Person type:
<li>Politician: official.</li>
<li>Artist: artist.</li> 
     * @return PersonType Person type:
<li>Politician: official.</li>
<li>Artist: artist.</li>
     */
    public String getPersonType() {
        return this.PersonType;
    }

    /**
     * Set Person type:
<li>Politician: official.</li>
<li>Artist: artist.</li>
     * @param PersonType Person type:
<li>Politician: official.</li>
<li>Artist: artist.</li>
     */
    public void setPersonType(String PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Get Sensitivity labeling:
<li>NORMAL: Normal;</li>
<li>Sensitive: sensitive.</li> 
     * @return Remark Sensitivity labeling:
<li>NORMAL: Normal;</li>
<li>Sensitive: sensitive.</li>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sensitivity labeling:
<li>NORMAL: Normal;</li>
<li>Sensitive: sensitive.</li>
     * @param Remark Sensitivity labeling:
<li>NORMAL: Normal;</li>
<li>Sensitive: sensitive.</li>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Screenshot link 
     * @return Url Screenshot link
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Screenshot link
     * @param Url Screenshot link
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

