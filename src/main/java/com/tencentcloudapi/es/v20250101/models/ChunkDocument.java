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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChunkDocument extends AbstractModel {

    /**
    * File type, supports MD and TXT formats.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Text original, use string format input.
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
     * Get File type, supports MD and TXT formats. 
     * @return FileType File type, supports MD and TXT formats.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type, supports MD and TXT formats.
     * @param FileType File type, supports MD and TXT formats.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Text original, use string format input. 
     * @return FileContent Text original, use string format input.
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set Text original, use string format input.
     * @param FileContent Text original, use string format input.
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    public ChunkDocument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkDocument(ChunkDocument source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);

    }
}

