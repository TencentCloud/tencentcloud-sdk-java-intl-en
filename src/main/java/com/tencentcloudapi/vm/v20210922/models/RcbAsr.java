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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RcbAsr extends AbstractModel {

    /**
    * This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * This field is used to return the creation time of the queried task in ISO 8601 format.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Text This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Text This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get This field is used to return the creation time of the queried task in ISO 8601 format.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt This field is used to return the creation time of the queried task in ISO 8601 format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set This field is used to return the creation time of the queried task in ISO 8601 format.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt This field is used to return the creation time of the queried task in ISO 8601 format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public RcbAsr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RcbAsr(RcbAsr source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

