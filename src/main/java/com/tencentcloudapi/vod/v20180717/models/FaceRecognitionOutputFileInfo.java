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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceRecognitionOutputFileInfo extends AbstractModel {

    /**
    * <p>Face recognition output file type</p><p>Enumeration value:</p><ul><li>Output: Result output of task generation. The file corresponds to the result in the face recognition task return and is generated in JSON format.</li></ul>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>File URL of face recognition output</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>Face recognition output file type</p><p>Enumeration value:</p><ul><li>Output: Result output of task generation. The file corresponds to the result in the face recognition task return and is generated in JSON format.</li></ul> 
     * @return FileType <p>Face recognition output file type</p><p>Enumeration value:</p><ul><li>Output: Result output of task generation. The file corresponds to the result in the face recognition task return and is generated in JSON format.</li></ul>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>Face recognition output file type</p><p>Enumeration value:</p><ul><li>Output: Result output of task generation. The file corresponds to the result in the face recognition task return and is generated in JSON format.</li></ul>
     * @param FileType <p>Face recognition output file type</p><p>Enumeration value:</p><ul><li>Output: Result output of task generation. The file corresponds to the result in the face recognition task return and is generated in JSON format.</li></ul>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>File URL of face recognition output</p> 
     * @return Url <p>File URL of face recognition output</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>File URL of face recognition output</p>
     * @param Url <p>File URL of face recognition output</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public FaceRecognitionOutputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceRecognitionOutputFileInfo(FaceRecognitionOutputFileInfo source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

