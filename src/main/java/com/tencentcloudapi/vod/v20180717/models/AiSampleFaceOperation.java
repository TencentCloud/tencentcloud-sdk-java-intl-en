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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSampleFaceOperation extends AbstractModel {

    /**
    * Operation type. Valid values: add, delete, reset. The `reset` operation will clear the existing face data of a figure and add `FaceContents` as the specified face data.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Face ID set, which is required if `Type` is `delete`.
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
    * Face image [Base64](https://tools.ietf.org/html/rfc4648) Encoded string collection, only supports jpeg and png image formats. 
<li>When Type is add or reset, this field is required;</li>
<li>Array length limit: 5 pictures. </li>
Note: The picture must be a clear frontal photo of a single person, with a pixel size of no less than 200*200.
    */
    @SerializedName("FaceContents")
    @Expose
    private String [] FaceContents;

    /**
     * Get Operation type. Valid values: add, delete, reset. The `reset` operation will clear the existing face data of a figure and add `FaceContents` as the specified face data. 
     * @return Type Operation type. Valid values: add, delete, reset. The `reset` operation will clear the existing face data of a figure and add `FaceContents` as the specified face data.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Operation type. Valid values: add, delete, reset. The `reset` operation will clear the existing face data of a figure and add `FaceContents` as the specified face data.
     * @param Type Operation type. Valid values: add, delete, reset. The `reset` operation will clear the existing face data of a figure and add `FaceContents` as the specified face data.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Face ID set, which is required if `Type` is `delete`. 
     * @return FaceIds Face ID set, which is required if `Type` is `delete`.
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set Face ID set, which is required if `Type` is `delete`.
     * @param FaceIds Face ID set, which is required if `Type` is `delete`.
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
    }

    /**
     * Get Face image [Base64](https://tools.ietf.org/html/rfc4648) Encoded string collection, only supports jpeg and png image formats. 
<li>When Type is add or reset, this field is required;</li>
<li>Array length limit: 5 pictures. </li>
Note: The picture must be a clear frontal photo of a single person, with a pixel size of no less than 200*200. 
     * @return FaceContents Face image [Base64](https://tools.ietf.org/html/rfc4648) Encoded string collection, only supports jpeg and png image formats. 
<li>When Type is add or reset, this field is required;</li>
<li>Array length limit: 5 pictures. </li>
Note: The picture must be a clear frontal photo of a single person, with a pixel size of no less than 200*200.
     */
    public String [] getFaceContents() {
        return this.FaceContents;
    }

    /**
     * Set Face image [Base64](https://tools.ietf.org/html/rfc4648) Encoded string collection, only supports jpeg and png image formats. 
<li>When Type is add or reset, this field is required;</li>
<li>Array length limit: 5 pictures. </li>
Note: The picture must be a clear frontal photo of a single person, with a pixel size of no less than 200*200.
     * @param FaceContents Face image [Base64](https://tools.ietf.org/html/rfc4648) Encoded string collection, only supports jpeg and png image formats. 
<li>When Type is add or reset, this field is required;</li>
<li>Array length limit: 5 pictures. </li>
Note: The picture must be a clear frontal photo of a single person, with a pixel size of no less than 200*200.
     */
    public void setFaceContents(String [] FaceContents) {
        this.FaceContents = FaceContents;
    }

    public AiSampleFaceOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSampleFaceOperation(AiSampleFaceOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FaceIds != null) {
            this.FaceIds = new String[source.FaceIds.length];
            for (int i = 0; i < source.FaceIds.length; i++) {
                this.FaceIds[i] = new String(source.FaceIds[i]);
            }
        }
        if (source.FaceContents != null) {
            this.FaceContents = new String[source.FaceContents.length];
            for (int i = 0; i < source.FaceContents.length; i++) {
                this.FaceContents[i] = new String(source.FaceContents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);
        this.setParamArraySimple(map, prefix + "FaceContents.", this.FaceContents);

    }
}

