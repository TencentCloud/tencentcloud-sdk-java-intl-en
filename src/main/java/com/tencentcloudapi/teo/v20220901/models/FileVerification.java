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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileVerification extends AbstractModel {

    /**
    * The EdgeOne backend server will get the file verification information via http://{Host}{URL Path} (for example, http://www.example.com/.well-known/teo-verification/z12h416twn.txt). This field is the URL Path part you need to create, and Host is the current accelerated domain.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Verify the content of the file. You need to fill in the content of this field into the txt file returned by the Path field.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get The EdgeOne backend server will get the file verification information via http://{Host}{URL Path} (for example, http://www.example.com/.well-known/teo-verification/z12h416twn.txt). This field is the URL Path part you need to create, and Host is the current accelerated domain. 
     * @return Path The EdgeOne backend server will get the file verification information via http://{Host}{URL Path} (for example, http://www.example.com/.well-known/teo-verification/z12h416twn.txt). This field is the URL Path part you need to create, and Host is the current accelerated domain.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set The EdgeOne backend server will get the file verification information via http://{Host}{URL Path} (for example, http://www.example.com/.well-known/teo-verification/z12h416twn.txt). This field is the URL Path part you need to create, and Host is the current accelerated domain.
     * @param Path The EdgeOne backend server will get the file verification information via http://{Host}{URL Path} (for example, http://www.example.com/.well-known/teo-verification/z12h416twn.txt). This field is the URL Path part you need to create, and Host is the current accelerated domain.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Verify the content of the file. You need to fill in the content of this field into the txt file returned by the Path field. 
     * @return Content Verify the content of the file. You need to fill in the content of this field into the txt file returned by the Path field.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Verify the content of the file. You need to fill in the content of this field into the txt file returned by the Path field.
     * @param Content Verify the content of the file. You need to fill in the content of this field into the txt file returned by the Path field.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public FileVerification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileVerification(FileVerification source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

