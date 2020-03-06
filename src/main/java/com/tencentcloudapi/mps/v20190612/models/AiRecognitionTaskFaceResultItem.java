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

public class AiRecognitionTaskFaceResultItem extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

