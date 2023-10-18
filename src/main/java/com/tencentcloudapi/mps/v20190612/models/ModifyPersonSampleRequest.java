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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonSampleRequest extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Name. Length limit: 128 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description. Length limit: 1,024 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Image usage. Valid values:
1. Recognition: used for content recognition; equivalent to `Recognition.Face`
2. Review: used for inappropriate information recognition; equivalent to `Review.Face`
3. All: used for content recognition and inappropriate information recognition; equivalent to 1+2
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * Information of operations on facial features
    */
    @SerializedName("FaceOperationInfo")
    @Expose
    private AiSampleFaceOperation FaceOperationInfo;

    /**
    * Tag operation information.
    */
    @SerializedName("TagOperationInfo")
    @Expose
    private AiSampleTagOperation TagOperationInfo;

    /**
     * Get Image ID 
     * @return PersonId Image ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Image ID
     * @param PersonId Image ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Name. Length limit: 128 characters. 
     * @return Name Name. Length limit: 128 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name. Length limit: 128 characters.
     * @param Name Name. Length limit: 128 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description. Length limit: 1,024 characters. 
     * @return Description Description. Length limit: 1,024 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description. Length limit: 1,024 characters.
     * @param Description Description. Length limit: 1,024 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Image usage. Valid values:
1. Recognition: used for content recognition; equivalent to `Recognition.Face`
2. Review: used for inappropriate information recognition; equivalent to `Review.Face`
3. All: used for content recognition and inappropriate information recognition; equivalent to 1+2 
     * @return Usages Image usage. Valid values:
1. Recognition: used for content recognition; equivalent to `Recognition.Face`
2. Review: used for inappropriate information recognition; equivalent to `Review.Face`
3. All: used for content recognition and inappropriate information recognition; equivalent to 1+2
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set Image usage. Valid values:
1. Recognition: used for content recognition; equivalent to `Recognition.Face`
2. Review: used for inappropriate information recognition; equivalent to `Review.Face`
3. All: used for content recognition and inappropriate information recognition; equivalent to 1+2
     * @param Usages Image usage. Valid values:
1. Recognition: used for content recognition; equivalent to `Recognition.Face`
2. Review: used for inappropriate information recognition; equivalent to `Review.Face`
3. All: used for content recognition and inappropriate information recognition; equivalent to 1+2
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get Information of operations on facial features 
     * @return FaceOperationInfo Information of operations on facial features
     */
    public AiSampleFaceOperation getFaceOperationInfo() {
        return this.FaceOperationInfo;
    }

    /**
     * Set Information of operations on facial features
     * @param FaceOperationInfo Information of operations on facial features
     */
    public void setFaceOperationInfo(AiSampleFaceOperation FaceOperationInfo) {
        this.FaceOperationInfo = FaceOperationInfo;
    }

    /**
     * Get Tag operation information. 
     * @return TagOperationInfo Tag operation information.
     */
    public AiSampleTagOperation getTagOperationInfo() {
        return this.TagOperationInfo;
    }

    /**
     * Set Tag operation information.
     * @param TagOperationInfo Tag operation information.
     */
    public void setTagOperationInfo(AiSampleTagOperation TagOperationInfo) {
        this.TagOperationInfo = TagOperationInfo;
    }

    public ModifyPersonSampleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPersonSampleRequest(ModifyPersonSampleRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Usages != null) {
            this.Usages = new String[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new String(source.Usages[i]);
            }
        }
        if (source.FaceOperationInfo != null) {
            this.FaceOperationInfo = new AiSampleFaceOperation(source.FaceOperationInfo);
        }
        if (source.TagOperationInfo != null) {
            this.TagOperationInfo = new AiSampleTagOperation(source.TagOperationInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamObj(map, prefix + "FaceOperationInfo.", this.FaceOperationInfo);
        this.setParamObj(map, prefix + "TagOperationInfo.", this.TagOperationInfo);

    }
}

