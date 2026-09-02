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

public class File3D extends AbstractModel {

    /**
    * <p>File type: OBJ / GLB / FBX / STL / USDZ</p><p>Enumeration values:</p><ul><li>OBJ: common 3D exchange format</li><li>GLB: glTF 2.0 binary ("the JPEG of the 3D world")</li><li>FBX: Autodesk film/gaming industry standard</li><li>STL: 3D print/CAD triangle mesh</li><li>USDZ: Pixar/Apple packaged scenario description</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>File download URL (temporary signature, general TTL 24h)</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Preview image URL (if it exists)</p>
    */
    @SerializedName("PreviewImageUrl")
    @Expose
    private String PreviewImageUrl;

    /**
     * Get <p>File type: OBJ / GLB / FBX / STL / USDZ</p><p>Enumeration values:</p><ul><li>OBJ: common 3D exchange format</li><li>GLB: glTF 2.0 binary ("the JPEG of the 3D world")</li><li>FBX: Autodesk film/gaming industry standard</li><li>STL: 3D print/CAD triangle mesh</li><li>USDZ: Pixar/Apple packaged scenario description</li></ul> 
     * @return Type <p>File type: OBJ / GLB / FBX / STL / USDZ</p><p>Enumeration values:</p><ul><li>OBJ: common 3D exchange format</li><li>GLB: glTF 2.0 binary ("the JPEG of the 3D world")</li><li>FBX: Autodesk film/gaming industry standard</li><li>STL: 3D print/CAD triangle mesh</li><li>USDZ: Pixar/Apple packaged scenario description</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>File type: OBJ / GLB / FBX / STL / USDZ</p><p>Enumeration values:</p><ul><li>OBJ: common 3D exchange format</li><li>GLB: glTF 2.0 binary ("the JPEG of the 3D world")</li><li>FBX: Autodesk film/gaming industry standard</li><li>STL: 3D print/CAD triangle mesh</li><li>USDZ: Pixar/Apple packaged scenario description</li></ul>
     * @param Type <p>File type: OBJ / GLB / FBX / STL / USDZ</p><p>Enumeration values:</p><ul><li>OBJ: common 3D exchange format</li><li>GLB: glTF 2.0 binary ("the JPEG of the 3D world")</li><li>FBX: Autodesk film/gaming industry standard</li><li>STL: 3D print/CAD triangle mesh</li><li>USDZ: Pixar/Apple packaged scenario description</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>File download URL (temporary signature, general TTL 24h)</p> 
     * @return Url <p>File download URL (temporary signature, general TTL 24h)</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>File download URL (temporary signature, general TTL 24h)</p>
     * @param Url <p>File download URL (temporary signature, general TTL 24h)</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Preview image URL (if it exists)</p> 
     * @return PreviewImageUrl <p>Preview image URL (if it exists)</p>
     */
    public String getPreviewImageUrl() {
        return this.PreviewImageUrl;
    }

    /**
     * Set <p>Preview image URL (if it exists)</p>
     * @param PreviewImageUrl <p>Preview image URL (if it exists)</p>
     */
    public void setPreviewImageUrl(String PreviewImageUrl) {
        this.PreviewImageUrl = PreviewImageUrl;
    }

    public File3D() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public File3D(File3D source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PreviewImageUrl != null) {
            this.PreviewImageUrl = new String(source.PreviewImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PreviewImageUrl", this.PreviewImageUrl);

    }
}

