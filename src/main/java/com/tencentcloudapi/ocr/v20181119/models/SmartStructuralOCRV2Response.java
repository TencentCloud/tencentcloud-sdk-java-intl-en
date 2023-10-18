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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartStructuralOCRV2Response extends AbstractModel {

    /**
    * The rotation angle (degrees) of the text on the image. 0: The text is horizontal. Positive value: The text is rotated clockwise. Negative value: The text is rotated counterclockwise.
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * The structural information (key-value).
    */
    @SerializedName("StructuralList")
    @Expose
    private GroupInfo [] StructuralList;

    /**
    * The recognized text information.
    */
    @SerializedName("WordList")
    @Expose
    private WordItem [] WordList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The rotation angle (degrees) of the text on the image. 0: The text is horizontal. Positive value: The text is rotated clockwise. Negative value: The text is rotated counterclockwise. 
     * @return Angle The rotation angle (degrees) of the text on the image. 0: The text is horizontal. Positive value: The text is rotated clockwise. Negative value: The text is rotated counterclockwise.
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set The rotation angle (degrees) of the text on the image. 0: The text is horizontal. Positive value: The text is rotated clockwise. Negative value: The text is rotated counterclockwise.
     * @param Angle The rotation angle (degrees) of the text on the image. 0: The text is horizontal. Positive value: The text is rotated clockwise. Negative value: The text is rotated counterclockwise.
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get The structural information (key-value). 
     * @return StructuralList The structural information (key-value).
     */
    public GroupInfo [] getStructuralList() {
        return this.StructuralList;
    }

    /**
     * Set The structural information (key-value).
     * @param StructuralList The structural information (key-value).
     */
    public void setStructuralList(GroupInfo [] StructuralList) {
        this.StructuralList = StructuralList;
    }

    /**
     * Get The recognized text information. 
     * @return WordList The recognized text information.
     */
    public WordItem [] getWordList() {
        return this.WordList;
    }

    /**
     * Set The recognized text information.
     * @param WordList The recognized text information.
     */
    public void setWordList(WordItem [] WordList) {
        this.WordList = WordList;
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

    public SmartStructuralOCRV2Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartStructuralOCRV2Response(SmartStructuralOCRV2Response source) {
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.StructuralList != null) {
            this.StructuralList = new GroupInfo[source.StructuralList.length];
            for (int i = 0; i < source.StructuralList.length; i++) {
                this.StructuralList[i] = new GroupInfo(source.StructuralList[i]);
            }
        }
        if (source.WordList != null) {
            this.WordList = new WordItem[source.WordList.length];
            for (int i = 0; i < source.WordList.length; i++) {
                this.WordList[i] = new WordItem(source.WordList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "StructuralList.", this.StructuralList);
        this.setParamArrayObj(map, prefix + "WordList.", this.WordList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

