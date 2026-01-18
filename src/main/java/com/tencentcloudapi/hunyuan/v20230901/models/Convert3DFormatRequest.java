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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Convert3DFormatRequest extends AbstractModel {

    /**
    * 3D file url address. model file size ≤60 mb. supports fbx, obj, and glb format 3d file input.
    */
    @SerializedName("File3D")
    @Expose
    private String File3D;

    /**
    * Returns the 3D file format. valid values: STL, USDZ, FBX, MP4, GIF.
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format.
Example value: STL.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 3D file url address. model file size ≤60 mb. supports fbx, obj, and glb format 3d file input. 
     * @return File3D 3D file url address. model file size ≤60 mb. supports fbx, obj, and glb format 3d file input.
     */
    public String getFile3D() {
        return this.File3D;
    }

    /**
     * Set 3D file url address. model file size ≤60 mb. supports fbx, obj, and glb format 3d file input.
     * @param File3D 3D file url address. model file size ≤60 mb. supports fbx, obj, and glb format 3d file input.
     */
    public void setFile3D(String File3D) {
        this.File3D = File3D;
    }

    /**
     * Get Returns the 3D file format. valid values: STL, USDZ, FBX, MP4, GIF.
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format.
Example value: STL. 
     * @return Format Returns the 3D file format. valid values: STL, USDZ, FBX, MP4, GIF.
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format.
Example value: STL.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Returns the 3D file format. valid values: STL, USDZ, FBX, MP4, GIF.
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format.
Example value: STL.
     * @param Format Returns the 3D file format. valid values: STL, USDZ, FBX, MP4, GIF.
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format.
Example value: STL.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public Convert3DFormatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Convert3DFormatRequest(Convert3DFormatRequest source) {
        if (source.File3D != null) {
            this.File3D = new String(source.File3D);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "File3D", this.File3D);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

