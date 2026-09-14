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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocToVideoWatermarkInfo extends AbstractModel {

    /**
    * <p>Watermark image URL for video generation.</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>Watermark image location.</p><p>Enumeration values:</p><ul><li>top-left: top-left corner</li><li>top-right: top-right corner</li><li>bottom-left: bottom-left corner</li><li>bottom-right: bottom-right corner</li></ul>
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
     * Get <p>Watermark image URL for video generation.</p> 
     * @return ImageUrl <p>Watermark image URL for video generation.</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>Watermark image URL for video generation.</p>
     * @param ImageUrl <p>Watermark image URL for video generation.</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>Watermark image location.</p><p>Enumeration values:</p><ul><li>top-left: top-left corner</li><li>top-right: top-right corner</li><li>bottom-left: bottom-left corner</li><li>bottom-right: bottom-right corner</li></ul> 
     * @return Position <p>Watermark image location.</p><p>Enumeration values:</p><ul><li>top-left: top-left corner</li><li>top-right: top-right corner</li><li>bottom-left: bottom-left corner</li><li>bottom-right: bottom-right corner</li></ul>
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set <p>Watermark image location.</p><p>Enumeration values:</p><ul><li>top-left: top-left corner</li><li>top-right: top-right corner</li><li>bottom-left: bottom-left corner</li><li>bottom-right: bottom-right corner</li></ul>
     * @param Position <p>Watermark image location.</p><p>Enumeration values:</p><ul><li>top-left: top-left corner</li><li>top-right: top-right corner</li><li>bottom-left: bottom-left corner</li><li>bottom-right: bottom-right corner</li></ul>
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    public DocToVideoWatermarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocToVideoWatermarkInfo(DocToVideoWatermarkInfo source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Position", this.Position);

    }
}

