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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceHairAttributesInfo extends AbstractModel {

    /**
    * 0: shaved head, 1: short hair, 2: medium hair, 3: long hair, 4: braid
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 0: with bangs, 1: no bangs
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bang")
    @Expose
    private Long Bang;

    /**
    * 0: black, 1: golden, 2: brown, 3: gray
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Color")
    @Expose
    private Long Color;

    /**
     * Get 0: shaved head, 1: short hair, 2: medium hair, 3: long hair, 4: braid
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Length 0: shaved head, 1: short hair, 2: medium hair, 3: long hair, 4: braid
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 0: shaved head, 1: short hair, 2: medium hair, 3: long hair, 4: braid
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Length 0: shaved head, 1: short hair, 2: medium hair, 3: long hair, 4: braid
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 0: with bangs, 1: no bangs
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Bang 0: with bangs, 1: no bangs
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBang() {
        return this.Bang;
    }

    /**
     * Set 0: with bangs, 1: no bangs
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Bang 0: with bangs, 1: no bangs
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBang(Long Bang) {
        this.Bang = Bang;
    }

    /**
     * Get 0: black, 1: golden, 2: brown, 3: gray
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Color 0: black, 1: golden, 2: brown, 3: gray
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getColor() {
        return this.Color;
    }

    /**
     * Set 0: black, 1: golden, 2: brown, 3: gray
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Color 0: black, 1: golden, 2: brown, 3: gray
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setColor(Long Color) {
        this.Color = Color;
    }

    public FaceHairAttributesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceHairAttributesInfo(FaceHairAttributesInfo source) {
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.Bang != null) {
            this.Bang = new Long(source.Bang);
        }
        if (source.Color != null) {
            this.Color = new Long(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Bang", this.Bang);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

