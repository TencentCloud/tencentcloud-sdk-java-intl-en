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

public class SealInfo extends AbstractModel{

    /**
    * Seal body information
    */
    @SerializedName("SealBody")
    @Expose
    private String SealBody;

    /**
    * Seal coordinates
    */
    @SerializedName("Location")
    @Expose
    private Rect Location;

    /**
    * Other text content
    */
    @SerializedName("OtherTexts")
    @Expose
    private String [] OtherTexts;

    /**
    * Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle
    */
    @SerializedName("SealShape")
    @Expose
    private String SealShape;

    /**
     * Get Seal body information 
     * @return SealBody Seal body information
     */
    public String getSealBody() {
        return this.SealBody;
    }

    /**
     * Set Seal body information
     * @param SealBody Seal body information
     */
    public void setSealBody(String SealBody) {
        this.SealBody = SealBody;
    }

    /**
     * Get Seal coordinates 
     * @return Location Seal coordinates
     */
    public Rect getLocation() {
        return this.Location;
    }

    /**
     * Set Seal coordinates
     * @param Location Seal coordinates
     */
    public void setLocation(Rect Location) {
        this.Location = Location;
    }

    /**
     * Get Other text content 
     * @return OtherTexts Other text content
     */
    public String [] getOtherTexts() {
        return this.OtherTexts;
    }

    /**
     * Set Other text content
     * @param OtherTexts Other text content
     */
    public void setOtherTexts(String [] OtherTexts) {
        this.OtherTexts = OtherTexts;
    }

    /**
     * Get Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle 
     * @return SealShape Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle
     */
    public String getSealShape() {
        return this.SealShape;
    }

    /**
     * Set Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle
     * @param SealShape Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle
     */
    public void setSealShape(String SealShape) {
        this.SealShape = SealShape;
    }

    public SealInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SealInfo(SealInfo source) {
        if (source.SealBody != null) {
            this.SealBody = new String(source.SealBody);
        }
        if (source.Location != null) {
            this.Location = new Rect(source.Location);
        }
        if (source.OtherTexts != null) {
            this.OtherTexts = new String[source.OtherTexts.length];
            for (int i = 0; i < source.OtherTexts.length; i++) {
                this.OtherTexts[i] = new String(source.OtherTexts[i]);
            }
        }
        if (source.SealShape != null) {
            this.SealShape = new String(source.SealShape);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SealBody", this.SealBody);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamArraySimple(map, prefix + "OtherTexts.", this.OtherTexts);
        this.setParamSimple(map, prefix + "SealShape", this.SealShape);

    }
}

