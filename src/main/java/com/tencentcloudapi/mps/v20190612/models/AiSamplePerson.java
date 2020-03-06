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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSamplePerson extends AbstractModel{

    /**
    * Figure ID.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Name of a figure.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Figure description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Face information.
    */
    @SerializedName("FaceInfoSet")
    @Expose
    private AiSampleFaceInfo [] FaceInfoSet;

    /**
    * Figure tag.
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * Use case.
    */
    @SerializedName("UsageSet")
    @Expose
    private String [] UsageSet;

    /**
    * Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Figure ID. 
     * @return PersonId Figure ID.
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Figure ID.
     * @param PersonId Figure ID.
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
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
     * Get Figure description. 
     * @return Description Figure description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Figure description.
     * @param Description Figure description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Face information. 
     * @return FaceInfoSet Face information.
     */
    public AiSampleFaceInfo [] getFaceInfoSet() {
        return this.FaceInfoSet;
    }

    /**
     * Set Face information.
     * @param FaceInfoSet Face information.
     */
    public void setFaceInfoSet(AiSampleFaceInfo [] FaceInfoSet) {
        this.FaceInfoSet = FaceInfoSet;
    }

    /**
     * Get Figure tag. 
     * @return TagSet Figure tag.
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Figure tag.
     * @param TagSet Figure tag.
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Use case. 
     * @return UsageSet Use case.
     */
    public String [] getUsageSet() {
        return this.UsageSet;
    }

    /**
     * Set Use case.
     * @param UsageSet Use case.
     */
    public void setUsageSet(String [] UsageSet) {
        this.UsageSet = UsageSet;
    }

    /**
     * Get Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return CreateTime Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param CreateTime Creation time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return UpdateTime Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param UpdateTime Last modified time in [ISO date format](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "FaceInfoSet.", this.FaceInfoSet);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamArraySimple(map, prefix + "UsageSet.", this.UsageSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

