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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskFaceResultItem extends AbstractModel {

    /**
    * Unique identification ID of a person.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Library type of the figure, which indicates which figure library the recognized figure comes from:
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
    * Result set of segments where the person appears.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskFaceSegmentItem [] SegmentSet;

    /**
     * Get Unique identification ID of a person. 
     * @return Id Unique identification ID of a person.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique identification ID of a person.
     * @param Id Unique identification ID of a person.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Library type of the figure, which indicates which figure library the recognized figure comes from:
<li>Default: default figure library;</li>
<li>UserDefine: user-defined character library.</li> 
     * @return Type Library type of the figure, which indicates which figure library the recognized figure comes from:
<li>Default: default figure library;</li>
<li>UserDefine: user-defined character library.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Library type of the figure, which indicates which figure library the recognized figure comes from:
<li>Default: default figure library;</li>
<li>UserDefine: user-defined character library.</li>
     * @param Type Library type of the figure, which indicates which figure library the recognized figure comes from:
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
     * Get Result set of segments where the person appears. 
     * @return SegmentSet Result set of segments where the person appears.
     */
    public AiRecognitionTaskFaceSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Result set of segments where the person appears.
     * @param SegmentSet Result set of segments where the person appears.
     */
    public void setSegmentSet(AiRecognitionTaskFaceSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

