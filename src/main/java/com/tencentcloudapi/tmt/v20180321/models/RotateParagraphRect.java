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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RotateParagraphRect extends AbstractModel {

    /**
    * Paragraph text coordinates
    */
    @SerializedName("Coord")
    @Expose
    private Coord [] Coord;

    /**
    * Rotation angle
    */
    @SerializedName("TiltAngle")
    @Expose
    private Float TiltAngle;

    /**
    * Whether the paragraph text information is valid
    */
    @SerializedName("Valid")
    @Expose
    private Boolean Valid;

    /**
     * Get Paragraph text coordinates 
     * @return Coord Paragraph text coordinates
     */
    public Coord [] getCoord() {
        return this.Coord;
    }

    /**
     * Set Paragraph text coordinates
     * @param Coord Paragraph text coordinates
     */
    public void setCoord(Coord [] Coord) {
        this.Coord = Coord;
    }

    /**
     * Get Rotation angle 
     * @return TiltAngle Rotation angle
     */
    public Float getTiltAngle() {
        return this.TiltAngle;
    }

    /**
     * Set Rotation angle
     * @param TiltAngle Rotation angle
     */
    public void setTiltAngle(Float TiltAngle) {
        this.TiltAngle = TiltAngle;
    }

    /**
     * Get Whether the paragraph text information is valid 
     * @return Valid Whether the paragraph text information is valid
     */
    public Boolean getValid() {
        return this.Valid;
    }

    /**
     * Set Whether the paragraph text information is valid
     * @param Valid Whether the paragraph text information is valid
     */
    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public RotateParagraphRect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RotateParagraphRect(RotateParagraphRect source) {
        if (source.Coord != null) {
            this.Coord = new Coord[source.Coord.length];
            for (int i = 0; i < source.Coord.length; i++) {
                this.Coord[i] = new Coord(source.Coord[i]);
            }
        }
        if (source.TiltAngle != null) {
            this.TiltAngle = new Float(source.TiltAngle);
        }
        if (source.Valid != null) {
            this.Valid = new Boolean(source.Valid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Coord.", this.Coord);
        this.setParamSimple(map, prefix + "TiltAngle", this.TiltAngle);
        this.setParamSimple(map, prefix + "Valid", this.Valid);

    }
}

