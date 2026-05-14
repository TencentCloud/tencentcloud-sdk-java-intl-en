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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Position extends AbstractModel {

    /**
    * Node horizontal coordinate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * Node vertical coordinate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
     * Get Node horizontal coordinate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return X Node horizontal coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set Node horizontal coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param X Node horizontal coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get Node vertical coordinate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Y Node vertical coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set Node vertical coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Y Node vertical coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    public Position() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Position(Position source) {
        if (source.X != null) {
            this.X = new Float(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

